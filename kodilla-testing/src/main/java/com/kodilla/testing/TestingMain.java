package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {

    public static void main(String[] args){

        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        //Testing add() method

        int addResult = calculator.add(3, 1);

        if (addResult == 4) {
            System.out.println("Calculator adding test is OK");
        } else {
            System.out.println("Calculator has error! Result of 'Add' operation is wrong");
        }

        //Testing subtract() method

        int subResult = calculator.subtract(2, 2);

        if (subResult == 0) {
            System.out.println("Calculator subtracting test is OK");
        } else {
            System.out.println("Calculator has error! Result of 'Sub' operation is wrong");
        }
    }
}

