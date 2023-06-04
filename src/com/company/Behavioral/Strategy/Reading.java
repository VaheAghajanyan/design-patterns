package com.company.Behavioral.Strategy;

import com.company.Behavioral.Strategy.Activity;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading ...");
    }
}
