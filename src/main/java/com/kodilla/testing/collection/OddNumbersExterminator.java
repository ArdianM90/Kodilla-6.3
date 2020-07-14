package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> numbersWithoutOdds = new ArrayList<Integer>();
        for(Integer entry :numbers) {
            if(entry % 2 == 0) {
                numbersWithoutOdds.add(entry);
            }
        }
        return (ArrayList<Integer>)numbersWithoutOdds;
    }
}
