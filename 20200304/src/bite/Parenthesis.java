package bite;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Parenthesis {
    public boolean chkParenthesis(Scanner A, int n) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s == null || s.length() == 0 || s.length() % 2 != 0) {
                return false;
            }
            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);
            if (start == '}' || start == ')' || start == ']') {
                return false;
            }
            if (end == '{' || end == '(' || end == '[') {
                return false;
            }
            Deque<Character> stack = new ArrayDeque<Character>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '{' || ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == '}' || ch == ')' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char peek = stack.peek();
                        if (isMatch(peek, ch)) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private boolean isMatch(char peek, char ch) {
        return peek == '{' && ch == '}' || peek == '(' && ch == ')' || peek == '[' && ch == ']';
    }
}
