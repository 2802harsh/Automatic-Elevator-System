/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import oomproject.Initiate;

/**
 *
 * @author HP
 */
public class Elevator extends ElevatorControl {
    protected String doorStatus = "Open";
    protected Double weight = 0.0;
    protected int people = 0;
    
    
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
}
