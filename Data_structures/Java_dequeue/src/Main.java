import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> unique = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            unique.add(num);

            if (deque.size() == m){
                if (max < unique.size())max=unique.size();
                int first = (int)deque.pollFirst();
                if (!deque.contains(first))unique.remove(first);
            }
        }
        System.out.println(max);
    }
}
