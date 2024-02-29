package opgave03;

import opgave03.models.ArrayListRing;

public class Opgave03 {
    public static void main(String[] args) {
        ArrayListRing<String> stringRing = new ArrayListRing<>();
        stringRing.add("Trine");
        stringRing.add("Anne");
        stringRing.add("Inge");
        stringRing.add("Rikke");

        System.out.println("Lige nu burde currentItem være Rikke. Det er " + stringRing.getCurrentItem());
        stringRing.advance();
        System.out.println("Lige nu burde currentItem være Trine. Det er " + stringRing.getCurrentItem());
        stringRing.removeItem("Inge");
        System.out.println("Lige nu burde currentItem være Trine. Det er " + stringRing.getCurrentItem());
        System.out.println("Fjerner Trine: " + stringRing.removeCurrentItem());
        System.out.println("Lige nu burde currentItem være Anne. Det er " + stringRing.getCurrentItem());
        System.out.println("Hvad er den nuværende størrelse på ArrayListRingen? " + stringRing.size());
        System.out.println("Er ArrayListRingen tom? " + stringRing.isEmpty());
        stringRing.removeCurrentItem();
        System.out.println("Lige nu burde currentItem være Rikke. Det er " + stringRing.getCurrentItem());
        stringRing.removeCurrentItem();
        System.out.println("Lige nu burde currentItem være null. Det er " + stringRing.getCurrentItem());
        stringRing.add("Trine");
        stringRing.add("Anne");
        stringRing.add("Inge");
        stringRing.add("Rikke");
        stringRing.map(a -> a + ".");
        System.out.println("Lige nu burde currentItem være Rikke. Det er " + stringRing.getCurrentItem());
        ArrayListRing<String> newRing = stringRing.where(a -> a.startsWith("R"));
        System.out.println(newRing.size());
    }
}
