package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VendingMachineTest {

    @Test
    public void feed_money_adds_to_balance(){
        //Arrange
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.FeedMoney();
        //ACT
        double expectedBalance = 1.0;
        double realBalance = vendingMachine.getBalanceInserted();
        //ASSERT
        Assert.assertEquals(expectedBalance, realBalance, 0.05);
    }
    @Test
    public void buying_stuffy_reduces_balance(){
        //Arrange
        VendingMachine vendingMachine = new VendingMachine();
        Cat cat = new Cat("C1", "Black Cat", 2.25, "Cat");
        vendingMachine.FeedMoney();
        vendingMachine.FeedMoney();
        vendingMachine.FeedMoney();
        //ACT
        double expectedBalance = 0.75;
        double realBalance = 3.0 - cat.getPrice();
        //ASSERT
        Assert.assertEquals(expectedBalance, realBalance, 0.05);
    }






}
