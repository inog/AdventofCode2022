package de.ingoreschke;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FReader fReader = new FReader("caloriesPuzzle.txt");
        List<String> strings = fReader.readFile();
        ElveCalc calc = new ElveCalc();
        List<Elve> elves = calc.retrieveElves(strings);
        System.out.println(elves);
        Elve elveCarryingMostCalories = calc.getElveCarryingMostCalories(elves);
        System.out.println(elveCarryingMostCalories.getTotalCalories());
    }
}
