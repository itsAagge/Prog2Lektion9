package examples;

import examples.models.Chili;
import examples.models.Fruit;
import examples.models.Measurable;
import examples.models.MeasurableArray;

public class Main {
    public static void main(String[] args) {
        Measurable[] measurables = {
                new Chili("Pasilla", 5000),
                new Chili("Habanero", 250000),
                new Chili("Carolina Reaper", 1_600_000),
                new Fruit("Jordbær", 5.8),
                new Fruit("Æble", 13.3)
        };
        MeasurableArray measurableArray = new MeasurableArray(measurables);
        Measurable max = measurableArray.max();
        System.out.println(max.getName() + " " + max.measure());
    }
}
