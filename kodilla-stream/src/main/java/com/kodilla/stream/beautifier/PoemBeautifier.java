package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (final String string, final PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(string));
    };
}
