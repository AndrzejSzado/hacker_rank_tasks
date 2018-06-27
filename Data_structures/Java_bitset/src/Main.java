import java.util.BitSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.next());
        int m = Integer.parseInt(reader.next());
        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();

        for (int i = 0; i < n; i++){
            b1.set(i,false);
            b2.set(i,false);
        }
        while (m-- > 0){
            String cmd = reader.next();
            int firstOperand = Integer.parseInt(reader.next());
            int secondOperand = Integer.parseInt(reader.next());
            switch (cmd){
                case "AND":
                    if (firstOperand == 1)b1.and(b2);
                    else b2.and(b1);
                    break;
                case "OR":
                    if (firstOperand == 1)b1.or(b2);
                    else b2.or(b1);
                    break;
                case "XOR":
                    if (firstOperand == 1)b1.xor(b2);
                    else b2.xor(b1);
                    break;
                case "FLIP":
                    if (firstOperand == 1)b1.flip(secondOperand);
                    else b2.flip(secondOperand);
                    break;
                case "SET":
                    if (firstOperand == 1)b1.set(secondOperand,true);
                    else b2.set(secondOperand,true);
                    break;
            }
            System.out.println(b1.cardinality()+" "+ b2.cardinality());
        }
    }
}
