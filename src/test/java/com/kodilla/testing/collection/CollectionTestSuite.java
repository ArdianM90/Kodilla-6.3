package com.kodilla.testing.collection;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        Boolean noOdds = true;
        ArrayList<Integer> entryData = new ArrayList<Integer>();
        OddNumbersExterminator oddsExterminator = new OddNumbersExterminator();
        oddsExterminator.exterminate(entryData);
        for(Integer entry: oddsExterminator.exterminate(entryData)) {
            if(entry % 2 != 0) {
                noOdds = false;
            }
        }
        if (noOdds) {
            System.out.println("Test OK");
        } else {
            System.out.println("OddsExterminator ERROR");
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        Boolean noOdds = true;
        ArrayList<Integer> entryData = new ArrayList<Integer>();
        Random rnd = new Random();
        for(int i = 1; i < 100; i++) {
            entryData.add(rnd.nextInt(100));
        }
        OddNumbersExterminator oddsExterminator = new OddNumbersExterminator();
        oddsExterminator.exterminate(entryData);
        for(Integer entry: oddsExterminator.exterminate(entryData)) {
            if(entry % 2 != 0) {
                noOdds = false;
            }
        }
        if (noOdds) {
            System.out.println("Test OK");
        } else {
            System.out.println("OddsExterminator ERROR");
        }
    }
}
