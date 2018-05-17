import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> file = new ArrayList<>();
        int counter = 0;
        boolean notEmptyString = true;
        while (notEmptyString){
            String line = reader.nextLine();
            if (line.isEmpty()){
                reader.close();
                break;
            }
            counter++;
            System.out.println(counter+" "+line);
        }
        for (String line:file) {
            System.out.println(line);
        }
    }
}
