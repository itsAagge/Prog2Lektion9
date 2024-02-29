package opgave01;

import opgave01.models.GenericVault;
import opgave01.models.IntegerVault;
import opgave01.models.StringVault;

public class Opgave01 {
    public static void main(String[] args) {
        IntegerVault integerVault = new IntegerVault(42, "My password");
        System.out.println(integerVault.getSecret("My password"));

        StringVault stringVault = new StringVault("Test secret", "My password");
        System.out.println(stringVault.getSecret("My password"));

        GenericVault<Integer> genericVault1 = new GenericVault<>(42, "My password");
        System.out.println(genericVault1.getSecret("My password"));

        GenericVault<String> genericVault2 = new GenericVault<>("Test secret", "My password");
        System.out.println(genericVault2.getSecret("My password"));
    }
}
