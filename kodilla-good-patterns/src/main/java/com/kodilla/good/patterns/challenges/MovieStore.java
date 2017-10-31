package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieStore {

    private Map<String, List<String>> moviesTitlesWithTranslations = new HashMap<>();

    public void addMovies(String code, List<String> listOfTitlesTranslation) {

        moviesTitlesWithTranslations.putIfAbsent(code, new ArrayList<>());

        moviesTitlesWithTranslations.get(code).addAll(listOfTitlesTranslation);

    }

    public Map<String, List<String>> getMovies() {

        return moviesTitlesWithTranslations;
    }
}

