/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


import backend.enums.ElevatorDirection;
import backend.enums.ElevatorStatus;
        

/**
 *
 * @author HP
 */
public class Elevator extends ElevatorControl {
    
        Timer timer = new Timer();
        
    protected String doorStatus = "Open";
    protected Double weight = 0.0;
    protected int people = 0;
    protected int totalFloors = 15;
    
    protected boolean changeIncoming = false;
    protected boolean emergency = false;

    private Integer currentFloor;
    /*
    Sorted in Asc for up movement
     */
    private TreeSet<Integer> upDestinationFloors;
    private TreeSet<Integer> downDestinationFloors;
    private TreeSet<Integer> tempFloors;
    
    protected static List<Double> weights = new ArrayList<Double>();
    
    private ElevatorStatus elevatorStatus;
    ElevatorDirection direction;
    
    
    public Elevator() {
    
        timer.schedule(move, 0, 1000);
        this.currentFloor = 0;
        this.upDestinationFloors = new TreeSet<>();
        this.tempFloors = new TreeSet<>();
        this.downDestinationFloors = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        direction = ElevatorDirection.ELEVATOR_NONE;
    }
    
    public ElevatorDirection getElevatorDirection(){
        return direction;
    }
    
    public ElevatorStatus getElevatorStatus(){
        return this.elevatorStatus;
    }
    
    public int getTotalFloors()
    {
        return totalFloors;
    }
    
    public void setWeight(Double weight)
    {
        this.weight = weight;
    }
    
    public void setPeople(int enter, int exit)
    {
        people = people+enter-exit;
    }

    public int getNextDestionationFloor(){
        if(direction == ElevatorDirection.ELEVATOR_DOWN){
            return this.downDestinationFloors.first();
        }else if(direction == ElevatorDirection.ELEVATOR_UP){
            return this.upDestinationFloors.first();
        }else{
            return -1;
        }
    }

    public int getCurrentFloor(){
        return currentFloor;
    }
    
    public void setChangeIncoming(boolean change){
        changeIncoming = change;
    }
    public boolean getChangeIncoming(){
        return changeIncoming;
    }

    public void addNewDestination(Integer destination) {
        if(emergency==true && tempFloors.size()==0)
        {
            direction = ElevatorDirection.ELEVATOR_NONE;
            upDestinationFloors.forEach(fl -> {
                     tempFloors.add(fl);
                 });
            downDestinationFloors.forEach(fl -> {
                     tempFloors.add(fl);
                 });
            upDestinationFloors.clear();
            downDestinationFloors.clear();
        }
        if(destination > currentFloor){
            upDestinationFloors.add(destination);
        }else{
            downDestinationFloors.add(destination);
        }
    }
    
    public void addTempFloor(Integer temp){
        tempFloors.add(temp);
    }
    
    public void floorUp()
    {
        currentFloor++;
    }
    
    public void floorDown()
    {
        currentFloor--;
    }

    public boolean moveAndCheckIfServed() {
        direction();
        
        if(direction == ElevatorDirection.ELEVATOR_UP){
            if(upDestinationFloors.first() == currentFloor){
                return popUpDestionation();
            }else {             
                floorUp();
            }
        }else if(direction == ElevatorDirection.ELEVATOR_DOWN){
            if(downDestinationFloors.first() == currentFloor){
                return popDownDestionation();
            }else {
                floorDown();
            }
        }else{
            //Do Nothing. Elevator is not moving.
        }
        return false;
    }

    public ElevatorDirection getDirection(){
        return this.direction;
    }

    private void direction() {
        if(direction == ElevatorDirection.ELEVATOR_NONE){
            if(upDestinationFloors.size() > 0 && downDestinationFloors.size() > 0){
                if(Math.abs(currentFloor - upDestinationFloors.first()) < Math.abs(currentFloor - downDestinationFloors.first())){
                    direction = ElevatorDirection.ELEVATOR_UP;
                }else{
                    direction = ElevatorDirection.ELEVATOR_DOWN;
                }
            }else if(upDestinationFloors.size() > 0){
                direction = ElevatorDirection.ELEVATOR_UP;
            }else if(downDestinationFloors.size() > 0){
                direction = ElevatorDirection.ELEVATOR_DOWN;
            }
        }
    }

    private boolean popUpDestionation() {
        upDestinationFloors.remove(upDestinationFloors.first());
        if(emergency && upDestinationFloors.size()==0 && downDestinationFloors.size()==0)
        {
            emergency=false;
            tempFloors.forEach(fl -> {
                    addNewDestination(fl);
                 });
            tempFloors.clear();
        }
        if (upDestinationFloors.size() == 0) {
            direction = ElevatorDirection.ELEVATOR_NONE;
        }
        return true;
    }

    private boolean popDownDestionation() {
        downDestinationFloors.remove(downDestinationFloors.first());
        if(emergency && upDestinationFloors.size()==0 && downDestinationFloors.size()==0)
        {
            emergency=false;
            tempFloors.forEach(fl -> {
                    addNewDestination(fl);
                 });
            tempFloors.clear();
        }
        if(downDestinationFloors.size() == 0){
            direction = ElevatorDirection.ELEVATOR_NONE;
        }
        return true;
    }

    public int getPeople()
    {
        return people;
    }
    public Double getWeight()
    {
        return weight;
    }
    public String getDoorStatus()
    {
        return doorStatus;
    }
    
    public void getNewFloor()
    {
        Random rand = new Random();
        Integer newFloor = rand.nextInt(totalFloors);
        System.out.println("New Floor:" + newFloor);
        if(emergency==true)
            addTempFloor(newFloor);
        else if(emergency==false)
            addNewDestination(newFloor);        
    }
    
    public void getNewEmergencyFloor()
    {
        emergency=true;
        Random rand = new Random();
        Integer newFloor = rand.nextInt(totalFloors);
        System.out.println("New emergency Floor:" + newFloor);
        addNewDestination(newFloor);        
    }
    
    public void PowerCut()
    {
        upDestinationFloors.clear();
        downDestinationFloors.clear();
        if(direction == ElevatorDirection.ELEVATOR_UP)
        {
            if(currentFloor!=totalFloors-1)
            {
                addNewDestination(currentFloor+1);
            }
            else
            {
                addNewDestination(currentFloor-1);
            }
        }
        else if(direction == ElevatorDirection.ELEVATOR_DOWN)
        {
            if(currentFloor!=0)
            {
                addNewDestination(currentFloor-1);
            }
            else
            {
                addNewDestination(currentFloor+1);
            }
        }
    }
    
    public void pause() {
          this.timer.cancel();
    }


    public void resume() {
         this.timer = new Timer();
         this.timer.schedule( move, 0, 1000 );
    }
    
      TimerTask move = new TimerTask(){
        @Override
        public void run() {
            
            if (! changeIncoming) {
                boolean whathapnd = moveAndCheckIfServed();
                if(whathapnd)
                {
                    direction();
                    changeIncoming = true;
                }
            }
            
        }
    };
      
    @Override
      public void finalize()
      {
          move.cancel();
          timer.cancel();
      }
}