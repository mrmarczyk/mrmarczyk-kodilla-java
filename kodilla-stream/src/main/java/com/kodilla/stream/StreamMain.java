package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
/*
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
*/

public class StreamMain {
    public static void main(String[] args) {

        /*
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */

        //Zadanie 7.1: Upiększacz tekstów

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("string", (string) -> string.toUpperCase());
        poemBeautifier.beautify("string", (string) -> "*** " + string + " ***");
        poemBeautifier.beautify("string", (string) -> string.replace("r",""));

    }
}