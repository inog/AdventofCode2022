package de.ingoreschke;

import org.junit.jupiter.api.Test;

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


}