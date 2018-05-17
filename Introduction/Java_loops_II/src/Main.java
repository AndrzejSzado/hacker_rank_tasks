import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        Map<Integer, List<Integer>> finalResults = new HashMap<>();
        for(int i=0;i<t;i++){
            List<Integer> queryResult = new ArrayList<>();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int query = a;
            for (int j = 0; j < n; j++){
                query += (int) Math.pow(2, j)*b;
                queryResult.add(query);
            }
            finalResults.put(i,queryResult);
        }
        for (int i = 0; i < t; i++){
            for (int element: finalResults.get(i)) {
                System.out.print(element+ " ");
            }
            System.out.println("");
        }

        in.close();
    }
}
