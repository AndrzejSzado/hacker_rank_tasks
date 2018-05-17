import java.util.Scanner;

public class Main {
    private static Scanner reader= new Scanner(System.in);
    private static int B = Integer.parseInt(reader.nextLine());
    private static int H = Integer.parseInt(reader.nextLine());
    private static boolean flag = isPositive();

    public static boolean isPositive(){
        if(B > 0 && H > 0){
            return true;
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        return false;
    }
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
