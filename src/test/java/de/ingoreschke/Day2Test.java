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

        assertEquals(4, cut.calcRound("A X"));  //draw 3 + 1
        assertEquals(8, cut.calcRound("A Y"));  //won rock , paper 6 + 2
        assertEquals(3, cut.calcRound("A Z"));  //rock , scissor (3) lost 0 + 3

        assertEquals(1, cut.calcRound("B X"));  //paper, rock  lost  0 + 1
        assertEquals(5, cut.calcRound("B Y"));  //paper , paper draw 3 + 2
        assertEquals(9, cut.calcRound("B Z"));  //paper , scissor (3) win 6 + 3

        assertEquals(7, cut.calcRound("C X"));  //scissor, rock  win  6 + 1
        assertEquals(2, cut.calcRound("C Y"));  //scissor, paper lost 0 + 2
        assertEquals(6, cut.calcRound("C Z"));  //scissor , scissor (3) draw 3 + 3
    }

    /**
     * example Input A Y, B X, C Z total score of 15 (8 + 1 +6)
     */
    @Test
    void calcTotal() {
        List<String> input = Arrays.asList("A Y", "B X", "C Z");
        assertEquals(15, cut.calTotal(input));
    }
}