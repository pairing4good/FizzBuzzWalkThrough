package com.pairinggood;

public class FizzBuzzPop {

    public String calculate(int value) {
        if (value % 7 == 0) {
            return "pop";
        }
        
        return Integer.toString(value);
    }
}
