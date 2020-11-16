/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author HP
 */
public class Input {
    DecimalFormat df = new DecimalFormat("#.##");
    protected int enter;
    protected int exit;
    protected int totalFloors;
    protected static List<Double> weights = new ArrayList<Double>(); 
    Set<Integer> floors = new HashSet<>(); 
    
    public Input(int enter, int exit, int totalFloors)
    {
        this.enter = enter;
        this.exit = exit;
        this.totalFloors = totalFloors;
        
        newRandomInput();
        System.out.println(floors);
    }
    
    public void newRandomInput()
    {
        Random rand = new Random();
        for(int i=0;i<exit; i++)
        {
            int index = rand.nextInt(weights.size());
            weights.remove(index);
        }
        for(int i=0;i<enter;i++)
        {
            Double newWeight = 50 + 80*rand.nextDouble();
            newWeight = newWeight.parseDouble(df.format(newWeight));
            weights.add(newWeight);
            
            Integer floor = rand.nextInt(totalFloors);
            floors.add(floor);
        }
    }
    
    public Set<Integer> getFloors()
    {
        return floors;
    }
    
    public List<Double> getWeights()
    {
        return weights;
    }
      
}
