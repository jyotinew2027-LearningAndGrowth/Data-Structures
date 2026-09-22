package InterviewPreparation.Stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stk.push(')');
            } else if(c == '{') {
                stk.push('}');
            }
            else if(c == '[') {
                stk.push(']');
            }
            else if (stk.isEmpty() || stk.pop() != c) {
                    return false;
                }
            }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{}(({[]}))[]";
        System.out.println("isValid :: " + isValid(s));
    }
}
