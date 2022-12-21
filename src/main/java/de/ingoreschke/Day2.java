package de.ingoreschke;

import java.security.InvalidParameterException;
import java.util.List;

/**
 * https://adventofcode.com/2022/day/2
 *
 * won=6, draw=3, lost=0,  + 1,2,3
 */
public class Day2 {

    private static int A, X = 1; // Rock
    private static int B, Y = 2; // Paper
    private static int C, Z = 3; // Scissor
    private static int won = 6;
    private static int draw = 3;
    private static int lost = 0;


    public static void main(String[] args) {
        List<String> rounds = new FReader("day2.txt").readFile();
        Day2 day2 = new Day2();
        System.out.println("Total score : " + day2.calTotal(rounds));

    }

    int calTotal(List<String> rounds) {
       return rounds.stream().mapToInt(this::calcRound).sum();
    }

    int calcRound(String input) {
        String[] s = input.split(" ");

        int totalofRound = 0;

        if (s[0].equals("A")) {
            if (s[1].equals("X")) {
                totalofRound = draw + X;
            } else if (s[1].equals("Y")) {
                totalofRound = won + Y;
            } else if (s[1].equals("Z")) {
                totalofRound = lost + Z;
            }
        } else if (s[0].equals("B")) {
            if (s[1].equals("X")) {
                totalofRound = lost + X;
            } else if (s[1].equals("Y")) {
                totalofRound = draw + Y;
            } else if (s[1].equals("Z")) {
                totalofRound = won + Z;
            }
        } else if (s[0].equals("C")) {
            if (s[1].equals("X")) {
                totalofRound = won + X;
            } else if (s[1].equals("Y")) {
                totalofRound = lost + Y;
            } else if (s[1].equals("Z")) {
                totalofRound = draw + Z;
            }
        } else {
            throw new InvalidParameterException();
        }
        return totalofRound;
    }
}
