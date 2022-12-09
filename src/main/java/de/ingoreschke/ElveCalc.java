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
}
