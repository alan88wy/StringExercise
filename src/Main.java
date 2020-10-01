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

    // Interpolate string with place holders

    var item = "Pants";
    var size = "L";
    var price = 95.00;
    var color = "Blue";

    // create template

    var template = "The item is : %s, size %s, color %s, price SGD $%.2f";

    var itemString = String.format(template, item, size, color, price);

    System.out.println(itemString);

    // String Comparison
    // Cannot use == for as String is an object. s1 & s2 is only reference to the object.

    String s1 = new String("Hello!");
    String s2 = new String("Hello!");

    if (s1.equals(s2)) {
      System.out.println("s1 is equal to s2!");
    } else {
      System.out.println("s1 is not equal to s2!");
    }

    // String Comparison - Ignore Case

    String s3 = new String("HELLO!");

    if (s1.equalsIgnoreCase(s3)) {
      System.out.println("s1 is equal to s3!");
    } else {
      System.out.println("s1 is not equal to s3!");
    }

    // String Method

    String s4 = "I love Durian!";

    System.out.println("Length of s4 : " + s4.length());
    System.out.println("Index of Durian : " + s4.indexOf("Durian"));

    System.out.println("Substring at location 7 : " + s4.substring(7));

    String s5 = "Welcome !    ";
    System.out.println("s5 : '" + s5 + "'");
    System.out.println("Trimmed s5 : " + s5.trim());
  }
}
