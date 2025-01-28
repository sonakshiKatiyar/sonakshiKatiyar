package LeetPractices.array;

public class LongestSubArrayOf1sAfterDeletingOneElement {
    /**
     * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
     * Problem 1493, Medium
     * 2 pointer approach where end keeps on traversing to increase 0s count and when
     * zeros > 1 we move start pointer to exclude extra 0s
     * */
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    }

    public static int longestSubarray(int[] nums) {
        int start = 0, zeros = 0, res = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0)
                zeros++;
            while (zeros > 1) {
                if (nums[start] == 0)
                    zeros--;
                start++;
            }
            res = Math.max(res, end - start);
        }
        return res;
    }
}
