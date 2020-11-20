/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

public class ElevatorControl {
    protected static int maxPeople = 5;
    protected static Double maxWeight = 800.0;
    protected static String mailId = "";
    
    public static void setMaxPeople(int people)
    {
        maxPeople = people;
    }
    public static void setMaxWeight(Double weight)
    {
        maxWeight = weight;
    }
    public static void setMailId(String id)
    {
        mailId = id;
    }
    public static int getMaxPeople()
    {
        return maxPeople;
    }
    public static Double getMaxWeight()
    {
        return maxWeight;
    }
    public static String getMailId()
    {
        return mailId;
    }
    
    public static void main(String args[])
    {
        System.out.println(getMaxPeople());
    }
}
