import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        List<Integer> l = new ArrayList<>();

        while (n-- > 0){
            l.add(reader.nextInt());
        }
        int q = reader.nextInt();
        while (q-- > 0){
            String command = reader.next();

            if (command.equals("Insert")){
                int x = reader.nextInt();
                int y = reader.nextInt();
                l.add(x,y);
            }
            if(command.equals("Delete")){
                int x = reader.nextInt();
                l.remove(x);
            }
        }
        for (int element: l) {
            System.out.print(element +" ");
        }
    }
}
