package ru.netology.domain.MoviePostersManager.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test

    public void ShouldBeEmpty() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void ShouldAddOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void ShouldAddFourMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");

        String[] expected = {"Film1", "Film2", "Film3", "Film4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void ShouldFindLastBelowLimitMovies() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.findLast();

        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//
//    public void ShouldFindLastFiveMovies() {
//        MovieManager manager = new MovieManager(5);
//        manager.addMovie("Film1");
//        manager.addMovie("Film2");
//        manager.addMovie("Film3");
//        manager.addMovie("Film4");
//        manager.addMovie("Film5");
//        manager.addMovie("Film6");
//        manager.addMovie("Film7");
//        manager.findLast();
//
//        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3"};
//        String[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
}

