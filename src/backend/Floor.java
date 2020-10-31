/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author DELL
 */
public class Floor {
    protected int currentFloor;
    protected int targetFloor;
    protected int intmdFloor;
    
    public void setCurrentFloor(int floor)
    {
        currentFloor=floor;
    }
    public void setTargetFloor(int floor){
        targetFloor=floor;
    }
    public void setIntmdFloor(int floor){
        intmdFloor=floor;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public int getTargetFloor(){
        return targetFloor;
    }
    public int getIntmdFloor(){
        return intmdFloor;
    }
}
