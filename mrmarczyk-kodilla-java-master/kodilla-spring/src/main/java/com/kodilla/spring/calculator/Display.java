package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void displayValue(double val){
        System.out.print("Wynik działania matematycznego: " + val);
    }
}
