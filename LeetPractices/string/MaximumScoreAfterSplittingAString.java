package LeetPractices.string;

public class MaximumScoreAfterSplittingAString {
    /**
     * https://leetcode.com/problems/maximum-score-after-splitting-a-string
     * 1422, Easy
     * Prefix sum, each iteration, i represents the final index of the left part. On each iteration, we are adding s[i] to the left part.
     * we don't iterate i over the final index since it would mean having an empty right part.
     * Approach 1: Count Left Zeros and Right Ones, traversing the string 2 times --> TC:O(n),SC:(1)
     * Approach 2: One Pass, better approach with same complexity
     *                       score = 0's at left + 1's at right
     *                       score = 0's at left + total 1's - 1's at left
     *                       score = (0's at left - 1's at left) + (total 1's)
     *                       here total 1's is constant but 0's and 1's at left are var.
     *                       Point to be note here is that both the var are dependent on left string so,
     *                       the below line is calculating (0's at left - 1's at left)
     *                       if s[i] = '1' we increment ones, otherwise s[i] = '0' and we increment zeros. Then, we update best of left with zeros - ones if it is larger.
     *                       to calculate total 1's
     *                       the 1's added so far + last char of string if it is 1
     *
     *                       we will
     *
     * */

    public static void main(String[] args) {
        System.out.println("RESULT: "+maxScore("1111"));
    }

    public static int maxScore(String s) {
        int zeros = 0, ones = 0, score = Integer.MIN_VALUE;
        /* Approach 1
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ones++;
        }

        if(ones == s.length() || ones == 0){
            return s.length()-1;
        }

        for (int j = 0; j < s.length()-1; j++) {
            if (s.charAt(j) == '1')
                ones--;
            if (s.charAt(j) == '0')
                zeros++;

            score = Math.max(score, zeros + ones);
            System.out.println(score);
        }*/

        //Approach 2
        score = Integer.MIN_VALUE; // this is required for scenarios where all digits are same like 1111
        for (int j = 0; j < s.length()-1; j++) {
            if (s.charAt(j) == '1')
                ones++;
            if (s.charAt(j) == '0')
                zeros++;

            score = Math.max(score, zeros - ones);
        }
        if(s.charAt(s.length()-1)=='1'){
            ones++;
        }

        return score+ones;
    }
}
