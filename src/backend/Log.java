/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    LocalDateTime dateAndTime;
    String formatDateAndTime;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy | HH:mm:ss");
    File file = new File("src/Files/logReport.txt");
    FileWriter writer;
    public Log(int floor, int enter, int exit, Double weight, boolean emergency)
    {
        generateLog(floor, enter, exit,  weight, emergency);
    }
    public Log(boolean cut)
    {
        powerCut(cut);
    }
    private void generateLog(int floor, int enter, int exit, Double weight, boolean emergency)
    {
        dateAndTime = LocalDateTime.now();
        formatDateAndTime = format.format(dateAndTime);
        String report = formatDateAndTime + " : \t At Floor-"+floor+" \t Enter-"+enter+" \t Exit-"+exit+" \t Weight-"+weight;
        if(emergency)
        {
            report+="\t(EMERGENCY)";
        }
        report+="\n\n";
        
        try{
            file.createNewFile();
            PrintWriter pw = new PrintWriter(new FileOutputStream(file,true));
            pw.append(report);
            pw.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
        
    }
    private void powerCut(boolean cut)
    {
        dateAndTime = LocalDateTime.now();
        formatDateAndTime = format.format(dateAndTime);
        String report;
        if(cut)
           report = formatDateAndTime + " : \t POWER CUT\n\n";
        
        else
            report = formatDateAndTime + " : \t POWER BACKUP RECEIVED\n\n";
        
        try{
            file.createNewFile();
            PrintWriter pw = new PrintWriter(new FileOutputStream(file,true));
            pw.append(report);
            pw.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
