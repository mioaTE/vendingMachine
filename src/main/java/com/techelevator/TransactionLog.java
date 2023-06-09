package com.techelevator;

import javax.swing.table.TableStringConverter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TransactionLog {
    //PROPERTIES


    List<String> logs;

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

    public void addItem(String Logs){
        logs.add(Logs);
    }
    public void makeFile() throws FileNotFoundException {

        String path = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team2\\Log.txt";
        File file = new File(path);

        try (PrintWriter writer = new PrintWriter(file)) {
            while(file.canWrite()){
                for(String log : logs){
                    writer.println(log);
                }
            }
        }

    }
}
