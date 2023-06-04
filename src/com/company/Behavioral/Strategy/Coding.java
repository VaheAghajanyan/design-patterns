package com.company.Behavioral.Strategy;

import com.company.Behavioral.State.Activity;

public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Coding ...");
    }
}
