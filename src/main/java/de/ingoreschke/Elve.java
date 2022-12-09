package de.ingoreschke;

import java.util.ArrayList;
import java.util.List;

class Elve{
    private List<Integer> calories = new ArrayList<>();
    int getTotalCalories(){
        return calories.stream().mapToInt(Integer::intValue).sum();
    }

    public void addCalories(int calories){
        this.calories.add(calories);
    }

    @Override
    public String toString() {
        return "Elve{" +
                "calories=" + calories +
                '}';
    }
}