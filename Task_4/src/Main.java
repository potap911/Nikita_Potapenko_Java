import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение с последовательностью скобок:");
        if(checkBracketSequence(scan.nextLine()))
            System.out.println("Последовательность верная!");
        else
            System.out.println("Последовательность неверная!");

    }

    public static boolean checkBracketSequence(String sequence) {
        Stack<Character> st = new Stack<>();
        for (char c : sequence.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.empty()) return false;
                if (c == ')' && st.peek().equals('(')) {
                    st.pop();
                    continue;
                }
                if (c == ']' && st.peek().equals('[')) {
                    st.pop();
                    continue;
                }
                if (c == '}' && st.peek().equals('{')) {
                    st.pop();
                    continue;
                }
                return false;
            }
        }
        return st.empty();
    }
}