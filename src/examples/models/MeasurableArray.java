package examples.models;

public class MeasurableArray {
    private Measurable[] measurables;

    public MeasurableArray(Measurable[] measurables) {
        this.measurables = measurables;
    }

    public Measurable max() {
        if (measurables.length == 0) {
            return null;
        }
        Measurable max = measurables[0];
        for (Measurable measurable : measurables) {
            if (measurable.measure() > max.measure()) {
                max = measurable;
            }
        }
        return max;
    }
}
