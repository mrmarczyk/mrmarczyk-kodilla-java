package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore fullListOfFilms = new MovieStore();

        String movieList = fullListOfFilms.getMovies()
                            .entrySet()
                            .stream()
                            .flatMap(book -> book.getValue().stream())
                            .collect(Collectors.joining("!"));

        System.out.println(movieList);
    }
}
