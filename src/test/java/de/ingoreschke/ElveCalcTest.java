package de.ingoreschke;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElveCalcTest {
    ElveCalc cut = new ElveCalc();

    @Test
    void retrieveElves() {

        List<Elve> elves = cut.retrieveElves(Arrays.asList("1", "2", "3", "", "21", "2", "", "3"));
        assertEquals(3, elves.size());

    }

    @Test
    void getElveCarryingMostCalories() {
        Elve elve = new Elve();
        elve.addCalories(12);
        elve.addCalories(10);

        Elve elve2 = new Elve();
        elve2.addCalories(100);
        elve2.addCalories(1);

        Elve elveCarryingMostCalories = cut.getElveCarryingMostCalories(Arrays.asList(elve, elve2));
        assertEquals(101, elveCarryingMostCalories.getTotalCalories());
    }

    @Test
    void getTop3EvlveCarryingMostCalories() {
        Elve elve = new Elve();
        elve.addCalories(12);
        elve.addCalories(10);

        Elve elve1 = new Elve();
        elve1.addCalories(1);
        elve1.addCalories(2);

        Elve elve2 = new Elve();
        elve2.addCalories(100);
        elve2.addCalories(1);

        Elve elve3 = new Elve();
        elve3.addCalories(100);
        elve3.addCalories(100);
        List<Elve> allElves = Arrays.asList(elve, elve1, elve2, elve3);
        //
        List<Elve> result = cut.getTop3EvlveCarryingMostCalories(allElves);
        assertEquals(3, result.size());
        assertEquals(elve3, result.get(0));
    }

}