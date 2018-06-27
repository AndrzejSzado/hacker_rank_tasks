import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isCorrect(input));
        }
    }

    public static boolean isCorrect(String input){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++){
            switch (input.charAt(i)){
                case '}':
                    if (stack.empty()== false && stack.peek().equals('{')){
                        stack.pop();
                    }
                    else {
                        stack.push(input.charAt(i));
                    }
                    break;
                case ')':
                    if (stack.empty()== false && stack.peek().equals('(')){
                        stack.pop();
                    }
                    else {
                        stack.push(input.charAt(i));
                    }
                    break;
                case ']':
                    if (stack.empty()== false && stack.peek().equals('[')){
                        stack.pop();
                    }
                    else {
                        stack.push(input.charAt(i));
                    }
                    break;
                default:
                    stack.push(input.charAt(i));
            }
        }
        return stack.empty();
    }
}
