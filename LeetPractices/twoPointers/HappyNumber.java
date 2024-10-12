package LeetPractices.twoPointers;

/**
 * https://leetcode.com/problems/happy-number/description/
 *  Problem No.: 202, Easy
 *  Using 2-pointers to identify if its loop of not
 * */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        int slow=sumOfSqr(n);
        int fast=sumOfSqr(sumOfSqr(n));
        while(fast!=slow && fast!=1){
            slow=sumOfSqr(slow);
            fast=sumOfSqr(sumOfSqr(fast));
            System.out.println("Slow:"+slow);
            System.out.println("Fast:"+fast);
        }
        return fast==1;
    }

    private static int sumOfSqr(int x){
        int sum=0;
        while (x > 0) {
            int digit = x%10;
            sum = sum+digit*digit;
            x=x/10;
        }
        return sum;
    }
}
