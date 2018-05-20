import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        //input
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //write your code here
        String[] smallerArray = new String[n];
        for (int i=0; i < smallerArray.length; i++){
            smallerArray[i] = s[i];
        }
        s = smallerArray;
        Arrays.sort(s,Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a,String b){
                BigDecimal bigDecimalA = new BigDecimal(a);
                BigDecimal bigDecimalB = new BigDecimal(b);
                return bigDecimalA.compareTo(bigDecimalB);
            }
        }));

        for(int i=0;i < n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
