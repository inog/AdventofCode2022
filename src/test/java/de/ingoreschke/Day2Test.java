package de.ingoreschke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {
    /** example Input A Y, B X, C Z total score of 15 (8 + 1 +6)
     *
     */
    @Test
    void calcRound() {
        Day2 day2 = new Day2();
        assertEquals(8, day2.calcRound("A Y"));
        assertEquals(4, day2.calcRound("A X"));
        assertEquals(6, day2.calcRound("C Z"));
    }
}