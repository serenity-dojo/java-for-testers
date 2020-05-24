package com.serenitydojo.banking;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<InterestBearing> accounts = new ArrayList<>();

    public void add(InterestBearing account) {
        accounts.add(account);
    }

    public double calculateMonthlyInterest() {
        double sum = 0.0;
        for(InterestBearing account : accounts) {
            sum = sum + account.calculateMonthlyInterest();
        }
        return sum;
    }
}
