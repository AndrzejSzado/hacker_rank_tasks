import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here
        scan.close();

        String[] afterSplit = s.trim().split("[\\s| !,?._'@]+");

        if (afterSplit.length > 0 && afterSplit[0].length()==0){
            afterSplit = new String[0];
        }
        System.out.println(afterSplit.length);

        for (int i = 0; i < afterSplit.length; i++){
            System.out.println(afterSplit[i]);
        }
    }
}
