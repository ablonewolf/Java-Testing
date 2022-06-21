package com.arka99.bankaccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;


    @org.junit.jupiter.api.BeforeEach
    public void Setup() {
        account = new Account("Arka Bhuiyan",1000,Account.CHECKING);
        System.out.println("Running a test");
    }
    @org.junit.jupiter.api.Test
    public void deposit() {
       double balance = account.deposit(400,true);
       assertEquals(1600.00,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    public void getName() {
        fail("This test yet to be implemented.");
    }

    @org.junit.jupiter.api.Test
    public void getBalance_deposit() {
        account.deposit(500,true);
        assertEquals(2500,account.getBalance());
    }
    @org.junit.jupiter.api.Test
    public void getBalance_withdraw() {
        account.withdraw(500,true);
        assertEquals(2000,account.getBalance());
    }

    @Test
    public void isChecking_true() {
        assertTrue(account.isChecking(), "The account is not a checking account");
    }
    @org.junit.jupiter.api.Test
    public void dummyTest() {
        assertEquals(20,30);
    }

}