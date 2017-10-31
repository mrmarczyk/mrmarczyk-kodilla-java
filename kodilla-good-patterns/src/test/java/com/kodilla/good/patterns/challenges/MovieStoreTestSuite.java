package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreTestSuite {

    @Test
    public void movieStoreTest() {

        //Given
        MovieStore movieStore = buildMovieStore();

        //When

        Map<String, List<String>> movieStoreFullList = movieStore.getMovies();

        //Then
        Assert.assertEquals(3, movieStoreFullList.size());
    }

    @Test
    public void movieStoreTest2() {

        //Given
        MovieStore movieStore = buildMovieStore();

        //When

        String movieList = movieStore.getMovies()
                .entrySet()
                .stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.print(movieList);

        //Then

        Assert.assertEquals("Żelazny Człowiek ! Iron Man ! Mściciele ! Avengers ! Błyskawica ! Flash", movieList);
    }

    private MovieStore buildMovieStore() {
        MovieStore movieStore = new MovieStore();

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        movieStore.addMovies("IM", ironManTranslations);
        movieStore.addMovies("AV", avengersTranslations);
        movieStore.addMovies("FL", flashTranslations);
        return movieStore;
    }
}
