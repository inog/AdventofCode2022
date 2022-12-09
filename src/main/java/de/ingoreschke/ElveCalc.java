package de.ingoreschke;

import java.util.ArrayList;
import java.util.List;

public class ElveCalc {

    public List<Elve> retrieveElves(List<String> rawData){
        List<Elve> elves = new ArrayList<>();
        Elve elve = new Elve();
        for (String item : rawData){
            if(item.isEmpty()){
                elves.add(elve);
                elve = new Elve();
            }else {
                elve.addCalories(Integer.parseInt(item));
            }
        }
        elves.add(elve);
        return elves;
    }

    /**
     * Find the Elf carrying the most Calories. How many total Calories is that Elf carrying?
     *
     * @param elves
     * @return the elve which carry the most calories.
     */
    public Elve getElveCarryingMostCalories(List<Elve> elves){
        int mostTotal = 0;
        Elve strongestElve = null;
        for (Elve elve:elves) {
           if(elve.getTotalCalories() > mostTotal){
              mostTotal = elve.getTotalCalories();
              strongestElve = elve;
           }
        }
        return strongestElve;
    }

    /** Find the top three Elves carrying the most Calories. How many Calories are those Elves carrying in total? */
    public List<Elve> getTop3EvlveCarryingMostCalories(List<Elve> allElves){
        List<Elve> top3Elevs = new ArrayList<>();
        List<Elve> worklist = new ArrayList<>(allElves);
        Elve elve = null;

        for (int i = 0; i < 3; i++) {
            if (elve != null){
                worklist.remove(elve);
            }
            elve = getElveCarryingMostCalories(worklist);
            top3Elevs.add(elve);
        }



        return top3Elevs;
    }


}
