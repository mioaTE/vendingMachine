package com.techelevator;

import javax.swing.table.TableStringConverter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

        //TODO ADD LOGS FOR DISPENSING STUFFED ANIMALS AND FOR GIVING CHANGE
public class TransactionLog {
    //PROPERTIES


    List<String> logs = new ArrayList<>();

    //GETTERS AND SETTERS


    public List<String> getLogs(){
        return logs;
    }
    public void setLogs(List<String> logs){
        this.logs = logs;
    }
    //CONSTRUCTOR


    public TransactionLog(){
        List<String> logs;
    }
    //METHODS

    public void addItem(String logs){
        this.logs.add(LocalDateTime.now() + " " + logs);
    }
    public void makeFile() throws FileNotFoundException {

        String path = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team2\\Log.txt";
        File file = new File(path);

        try (PrintWriter writer = new PrintWriter(file)) {
            if(file.exists()){
                file.delete();
            }
            boolean run = true;
            while(run){
                for(String log : logs){
                    writer.println(log);
                } run = false;
            }
        }

    }
}
