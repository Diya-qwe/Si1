
package com.example;

public class SimpleInterest {

    public double calculateSimpleInterest(
            double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();

        double result = si.calculateSimpleInterest(10000, 5, 2);

        System.out.println("Simple Interest: " + result);
    }
}
