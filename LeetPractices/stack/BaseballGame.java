package LeetPractices.stack;

import java.util.Stack;

public class BaseballGame {
    /**
     * https://leetcode.com/problems/baseball-game/description/
     * Problem No.: 682, Easy
     * Using Stack as top two digits are required.
     * */

    public static void main(String[] args) {
        calPoints(new String[]{"5","-2","4","C","D","9","+","+"});
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> result = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int a = result.pop();
                    int b = result.pop();
                    result.push(b);
                    result.push(a);
                    result.push(a + b);
                }
                case "D" -> {
                    int c = result.pop();
                    result.push(c);
                    result.push(2 * c);
                }
                case "C" -> result.pop();
                default -> result.push(Integer.valueOf(operation));
            }
        }
        int output=0;
        while(!result.isEmpty()) {
            output = output + result.pop();
            System.out.println(output);
        }
        return output;
    }
}
