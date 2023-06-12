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

    // getters and setters
    public double getBalanceInserted(){
        return balanceInserted;
    }
    public void setBalanceInserted(double balanceInserted){
        this.balanceInserted = balanceInserted;
    }


    // cons1
    // tructor
    public VendingMachine()  {
        balanceInserted = 0.0;
    }

   // method

    public void FeedMoney (){
         balanceInserted++;
    }





}

