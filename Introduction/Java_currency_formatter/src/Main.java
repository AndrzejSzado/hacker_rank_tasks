
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Write your code here.
        Locale in = new Locale("en","in");

        NumberFormat nfu = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nff = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nfi = NumberFormat.getCurrencyInstance(in);

        String us = nfu.format(payment);
        String india = nfi.format(payment);
        String china = nfc.format(payment);
        String france = nff.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
