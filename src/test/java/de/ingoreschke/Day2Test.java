package de.ingoreschke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {

    @Test
    void calcRound() {
        Day2 day2 = new Day2();
        assertEquals(4, day2.calcRound("A X"));
        assertEquals(8, day2.calcRound("A Y"));
    }
}