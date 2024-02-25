package examples.models;

public class Fruit implements Measurable{
    private String name;
    private double sugarPer100Gram;

    public Fruit(String name, double sugar) {
        this.name = name;
        this.sugarPer100Gram = sugar;
    }

    @Override
    public double measure() {
        return sugarPer100Gram;
    }

    @Override
    public String getName() {
        return name;
    }
}
