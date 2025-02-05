package LeetPractices.Sorting;

import java.util.Arrays;

public class MinimumSumOf4DigitNumber {
    /**
     * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
     * Problem No.: 2160, Easy
     * changed the int number to array of int
     * */
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
    public static int minimumSum(int num) {
        int[] digit = new int[4];
        int i = 0;
        while (num > 0) {
            digit[i++] = num % 10;
            num = num / 10;
        }
        Arrays.sort(digit);
        return (digit[0]*10+digit[2])+(digit[1]*10+digit[3]);

    }
}
