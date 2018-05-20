import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
        if(bigInteger.isProbablePrime(3)){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
