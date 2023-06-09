package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    // properties


    private double balanceInserted;
    private double maxMoney;

    // getters and setters
    public double getBalanceInserted(){
        return balanceInserted;
    }
    public void setBalanceInserted(double balanceInserted){
        this.balanceInserted = balanceInserted;
    }

    public double getMaxMoney(){
        return maxMoney;
    }

    public void setMaxMoney(double maxMoney){
        this.maxMoney = maxMoney;
    }
    // contructor
    public VendingMachine()  {
        balanceInserted = 0.0;
        maxMoney = 100.0;
    }

   // method

    public void FeedMoney (){
         balanceInserted++;
    }



}

