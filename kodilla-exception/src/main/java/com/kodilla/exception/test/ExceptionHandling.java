package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]){

        SecondChallenge newChellange = new SecondChallenge();
        try {
            newChellange.probablyIWillThrowException(1 ,1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
