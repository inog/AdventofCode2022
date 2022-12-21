package de.ingoreschke;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {

    private Day2 cut;
    @BeforeEach
    void init () {
        cut = new Day2();
    }


    @Test
    void calcRound() {

        assertEquals(8, cut.calcRound("A Y"));
        assertEquals(1, cut.calcRound("B X"));
        assertEquals(6, cut.calcRound("C Z"));
    }

    /**
     * example Input A Y, B X, C Z total score of 15 (8 + 1 +6)
     */    @Test
    void calcTotal() {
        List<String> input = Arrays.asList("A Y", "B X", "C Z");
        assertEquals(15, cut.calTotal(input));
    }
}