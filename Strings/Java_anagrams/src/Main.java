import java.util.*;

public class Main {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character,Integer> iterationsA = new HashMap<>();
        Map<Character,Integer> iterationsB = new HashMap<>();
        String firstString = a.toLowerCase();
        String secondString = b.toLowerCase();

        if ( a.length() != b.length() )
            return false;

        for (int i = 0; i < firstString.length(); i++) {
            if (iterationsA.containsKey(firstString.charAt(i))){
                int actualValue = iterationsA.get(firstString.charAt(i));
                iterationsA.replace(firstString.charAt(i),actualValue,actualValue+1);
            }
            else {
                iterationsA.put(firstString.charAt(i),1);
            }
            if (iterationsB.containsKey(secondString.charAt(i))){
                int actualValue = iterationsB.get(secondString.charAt(i));
                iterationsB.replace(secondString.charAt(i),actualValue,actualValue+1);
            }
            else {
                iterationsB.put(secondString.charAt(i),1);
            }
        }
        if (iterationsA.equals(iterationsB)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
