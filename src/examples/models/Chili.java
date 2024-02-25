package examples.models;

public class Chili implements Measurable {
    private String name;
    private double scoville;

    public Chili(String name, double scoville) {
        this.name = name;
        this.scoville = scoville;
    }

    @Override
    public double measure() {
        return scoville;
    }

    @Override
    public String getName() {
        return name;
    }
}
