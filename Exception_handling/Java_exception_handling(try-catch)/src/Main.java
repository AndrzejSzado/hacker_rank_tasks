import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int x = reader.nextInt();
            int y = reader.nextInt();
            System.out.println(x/y);
        }
        catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
