package p2;

// java.lang
import java.util.Currency;

public class Demo {
    public static void main(String[] args) {

        int res = (int) Math.sqrt(16);
        System.out.println("Res = " + res);

        Currency c = Currency.getInstance("USD");

        System.out.println(c.getCurrencyCode());
        System.out.println(c.getSymbol());

        Protection2 p2 = new Protection2();
        System.out.println("");
        OtherPackage o = new OtherPackage();
    }

}
