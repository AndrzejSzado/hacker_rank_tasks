import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BigInteger a = new BigInteger(reader.nextLine());
        BigInteger b = new BigInteger(reader.nextLine());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
