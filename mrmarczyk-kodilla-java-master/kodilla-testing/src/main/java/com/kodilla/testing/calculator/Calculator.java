package com.kodilla.testing.calculator;

/**
 * Created by marcinmarczyk on 16.07.2017.
 */

public class Calculator {

    public int add(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Wynik dodawania = " + sum);
        return sum;
    }

    public int subtract(int c, int d) {
        int sub = 0;
        sub = c - d;
        System.out.println("Wynik odejmowania = " + sub);
        return sub;
    }

    public static void main (String args[]) {

        Calculator calculator = new Calculator();

        calculator.add(1,2);
        calculator.subtract(1,2);

    }
}
