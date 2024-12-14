package LeetPractices.stack;

import java.util.Stack;

public class ValidParentheses {
    /**
     * https://leetcode.com/problems/valid-parentheses/
     * Problem : 20, Easy
     */
    public static void main(String[] args) {
        isValid("{([])}");
    }

    public static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else {
                Character close;
                if (s.charAt(i) == ')') {
                    close = '(';
                } else if (s.charAt(i) == '}') {
                    close = '{';
                } else {
                    close = '[';
                }
                if (stk.empty() || stk.peek() != close) {
                    return false;
                }
                stk.pop();
            }
        }

        return stk.empty() ? true : false;
    }
}
