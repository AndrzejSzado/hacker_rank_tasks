import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        List<List<Integer>> allValues = new ArrayList<>();

        while (n-- > 0){
            int d = reader.nextInt();
            List<Integer> valuesInOneLine = new ArrayList<>();
            while (d-- > 0){
                valuesInOneLine.add(reader.nextInt());
            }
            allValues.add(valuesInOneLine);
        }
        int q = reader.nextInt();
        while (q-- >0){
            int y = reader.nextInt();
            int x = reader.nextInt();
            try {
                System.out.println(allValues.get(y-1).get(x-1));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
