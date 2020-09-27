import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {
    var doubleValue = 10_000_000.53;

    var numF = NumberFormat.getNumberInstance();

    System.out.println("Number : " + numF.format(doubleValue));

    var intF = NumberFormat.getIntegerInstance();
    System.out.println("Integer : " + intF.format(doubleValue));

    var locale = Locale.getDefault();
    var localeFormater = NumberFormat.getIntegerInstance(locale);

    System.out.println("Number - local : " + localeFormater.format(doubleValue));

    var nLocale = new Locale("En", "SG");

    var nLocaleFormater = NumberFormat.getCurrencyInstance(nLocale);
    System.out.println("Number - SG : " + nLocaleFormater.format(doubleValue));

    var currencyF = NumberFormat.getCurrencyInstance(nLocale);

    System.out.println("Currency Format : " + currencyF.format(doubleValue));


    // Custom Formating - 0 or # can be use

    var df = new DecimalFormat("SGD #0,00.00");
    System.out.println("Currency Format : " + df.format(doubleValue));

  }
}
