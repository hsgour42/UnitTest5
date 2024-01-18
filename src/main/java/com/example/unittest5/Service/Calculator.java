package com.example.unittest5.Service;

public class Calculator {
    public static int sumTwoNumber(int a  , int b){
        return a + b;
    }

    public static int multiplyTwoNumber(int a , int b){
        return a * b;
    }

    public static int sumNumbers(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
