package com.statefarm;

class BankAccount {
    private double currentBalance = 0;
    private boolean overDrawn = false;


    public void deposit(double cents) {
        currentBalance += cents;
    }

    public void withdraw(double cents) {
        currentBalance -= cents;
    }

    public double balance() {
        return currentBalance;
    }

    public boolean isOverDrawn() {
        if (currentBalance < 0) {
           overDrawn = true;
        }
        return overDrawn;
    }
}


