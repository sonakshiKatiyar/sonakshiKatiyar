package LeetPractices.sorting;

public class AlternatingDigitSum {
    /**
     * https://leetcode.com/problems/alternating-digit-sum/description/
     * Problem No.: 2544, Easy
     * here I am using the logic while adding the digits of number that the count of digit is even then last digit would always be -ve else +ve
     * */
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(10));
    }

    public static int alternateDigitSum(int n) {
        int[] digit = new int[String.valueOf(n).length()];
        int i = 0;
        while (n > 0) {
            digit[i] = (n % 10);
            n = n / 10;
            i++;
        }
        boolean isPositive = false;
        if(digit.length%2!=0){
                isPositive=true;
        }
        int result = 0;
        for (int j = 0; j < digit.length ; j++) {

            if (isPositive) {
                result += digit[j];
                isPositive=false;
            }else {
                result += digit[j]*-1;
                isPositive=true;
            }
        }
        return result;
    }
}
