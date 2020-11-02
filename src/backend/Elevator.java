/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Random;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


import backend.enums.ElevatorDirection;
import backend.enums.ElevatorStatus;
//import oomproject.Initiate;
        
import oomproject.Initiate;

/**
 *
 * @author HP
 */
public class Elevator extends ElevatorControl {
    protected String doorStatus = "Open";
    protected Double weight = 0.0;
    protected int people = 0;
    protected int totalFloors = 15;
//    Initiate obj;
    
//    private final Integer id;
    private Integer currentFloor;
    /*
    Sorted in Asc for up movement
     */
    private TreeSet<Integer> upDestinationFloors;
    private TreeSet<Integer> downDestinationFloors;
    private ElevatorStatus elevatorStatus;
    ElevatorDirection direction;
    ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
    
    
    public Elevator() {
        
        
//        exec.scheduleAtFixedRate(move,0,2,TimeUnit.SECONDS);
        Timer timer = new Timer();
        timer.schedule(new move(), 0, 1000);
//        this.id = id;
        this.currentFloor = 0;
        this.upDestinationFloors = new TreeSet<Integer>();
        this.downDestinationFloors = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
//        this.elevatorStatus = ElevatorStatus.ELEVATOR_FUNCTIONAL;
        direction = ElevatorDirection.ELEVATOR_NONE;
    }
    
//    public boolean updateStatus(ElevatorStatus elevatorStatus){
//        /*
//        Cannot update status for an elevator which is actively serving requests
//         */
//        if(getTotalRequests() > 0){
//            return false;
//        }
//        this.elevatorStatus = elevatorStatus;
//        return true;
//    }
    
    public ElevatorDirection getElevatorDirection(){
        return direction;
    }
    
    public ElevatorStatus getElevatorStatus(){
        return this.elevatorStatus;
    }

//    public int getId(){
//        return this.id;
//    }

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

    public void addNewDestination(Integer destination) {
        if(destination > currentFloor){
            upDestinationFloors.add(destination);
        }else{
            downDestinationFloors.add(destination);
        }
    }
    
//    class floorUp extends TimerTask {
//        public void run() {
//            currentFloor++;
//        }
//    }
//    
//    class floorDown extends TimerTask {
//        public void run() {
//            currentFloor--;
//        }
//    }
    
    
    
    public void floorUp()
    {
//        try{
//            TimeUnit.SECONDS.sleep(1);
//        }catch (InterruptedException e) {
//            System.err.format("IOException: %s%n", e);
//        }
        
        currentFloor++;
    }
    
    public void floorDown()
    {
//        try{
//            TimeUnit.SECONDS.sleep(1);
//        }catch (InterruptedException e) {
//            System.err.format("IOException: %s%n", e);
//        }
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
        if (upDestinationFloors.size() == 0) {
            direction = ElevatorDirection.ELEVATOR_NONE;
        }
        return true;
    }

    private boolean popDownDestionation() {
        downDestinationFloors.remove(downDestinationFloors.first());
        if(downDestinationFloors.size() == 0){
            direction = ElevatorDirection.ELEVATOR_NONE;
        }
        return true;
    }

//    public int getTotalRequests(){
//        return upDestinationFloors.size() + downDestinationFloors.size();
//    }
    
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
//        Integer newFloor;
        addNewDestination(newFloor);
//        moveAndCheckIfServed();
////        System.out.println(getCurrentFloor());
//        int cnt = 0;
//        while(getNextDestionationFloor()!=-1)
//        {
//            cnt ++;
////            if(cnt == 8)
////            {
////                System.out.println("cnt: "+cnt);
////                addNewDestination(5);
////            }
//            System.out.println(getCurrentFloor());
//            boolean whathapnd = moveAndCheckIfServed();
//            if(whathapnd)
//            {
//                direction();
//            }
//        }
        
    }
    
//    ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
//    exec.scheduleAtFixedRate(new Runnable() {
//        @Override
//        public void run() {
//          // do stuff
//        }
//      }, 0, 5, TimeUnit.SECONDS);
      
      class move extends TimerTask{
        @Override
        public void run() {
//            moveAndCheckIfServed();
//            System.out.println(getCurrentFloor());
            boolean whathapnd = moveAndCheckIfServed();
            if(whathapnd)
            {
                direction();
            }
        }
    };
    
    public static void main(String args[])
    {
        Elevator e = new Elevator();
        System.out.println(e.getCurrentFloor());
        e.getNewFloor();
//        System.out.println(e.getCurrentFloor());
        e.getNewFloor();
//        System.out.println(e.getCurrentFloor());
        e.getNewFloor();
//        System.out.println(e.getCurrentFloor());
    }
}
