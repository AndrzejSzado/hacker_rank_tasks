import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] a = new int[Integer.parseInt(reader.nextLine())];
        int negativeSums= 0;

        for (int i = 0; i<a.length;i++){
            a[i] = reader.nextInt();
            int sumOfSubarray = 0;
            int counter = 0;
            for (int j = 0; j <= i; j++){
                sumOfSubarray += a[j];
                counter++;
                if (j == i){
                    j = j-counter+1;
                    counter = 0;
                    if (sumOfSubarray<0){
                        negativeSums++;
                    }
                    sumOfSubarray=0;
                }
            }
        }
        System.out.println(negativeSums);
    }

}
