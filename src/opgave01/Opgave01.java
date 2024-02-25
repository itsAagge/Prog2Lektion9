package opgave01;

import opgave01.models.IntegerVault;

public class Opgave01 {
    public static void main(String[] args) {
        IntegerVault integerVault = new IntegerVault(42, "My password");
        System.out.println(integerVault.getSecret("My password"));
    }
}
