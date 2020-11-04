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
//    protected static Double weights[];
    protected static List<Double> weights = new ArrayList<Double>(); 
//    protected List<Integer> floors = new ArrayList<Integer>();  
    Set<Integer> floors = new HashSet<>(); 
    
    public Input(int enter, int exit, int totalFloors)
    {
        this.enter = enter;
        this.exit = exit;
        this.totalFloors = totalFloors;
        
        newRandomInput();
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
    
    public static void main(String args[])
    {
        Input it = new Input(2,0,5);
        Input it2 = new Input(0,1,5);
        for(int i=0;i<1;i++)
        {
            System.out.println(Input.weights.get(i));
        }
        System.out.println(it.floors);
        System.out.println("it 2 starts");
        System.out.println(it2.floors);
    }
    
}
