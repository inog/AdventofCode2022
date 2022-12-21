package de.ingoreschke;

public class Day2 {

    private static int A, X = 1; // Rock
    private static int B, Y = 2; // Paper
    private static int C, Z = 3; // Scissor
    private static int won = 6;
    private static int draw = 3;
    private static int lost = 0;


    public static void main(String[] args) {

    }

    public int calcRound(String input) {
        String[] s = input.split(" ");

        int totalofRound = 0;

        if (s[0].equals("A") && s[1].equals("X")){
            totalofRound = draw + X;
        } else if (s[0].equals("A") && s[1].equals("Y")) {
            totalofRound = won + Y;
        }
        return totalofRound;
    }


}
