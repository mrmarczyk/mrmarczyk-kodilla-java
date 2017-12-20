package com.kodilla.spring.calculator.anotherversion;

import com.kodilla.spring.calculator.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Div implements Calculation {
    @Autowired
    private Display display;

    public double makeCalculation(double a, double b) {
        display.displayValue(a - b);
        return a - b;
    }
}