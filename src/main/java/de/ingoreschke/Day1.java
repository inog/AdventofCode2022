package de.ingoreschke;

import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        FReader fReader = new FReader("caloriesPuzzle.txt");
        List<String> strings = fReader.readFile();
        ElveCalc calc = new ElveCalc();
        List<Elve> elves = calc.retrieveElves(strings);
        
        //System.out.println(elves);
        Elve elveCarryingMostCalories = calc.getElveCarryingMostCalories(elves);
        System.out.println(elveCarryingMostCalories.getTotalCalories());
        System.out.println("*****************");
        List<Elve> top3Elves = calc.getTop3EvlveCarryingMostCalories(elves);
        int totalCalories = top3Elves.stream().mapToInt(elve -> elve.getTotalCalories()).sum();
        System.out.println("total calories of top 3 Elves : " + totalCalories);

    }
}
