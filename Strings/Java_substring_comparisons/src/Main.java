import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        for (int i = 0; i <= s.length()-k; i++){
            String sub = s.substring(i,k+i);
            if(largest.compareTo(sub) < 0){
                largest = sub;
            }
            if (smallest.compareTo(sub) > 0){
                smallest = sub;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
