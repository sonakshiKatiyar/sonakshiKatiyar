package LeetPractices.array;

import java.util.HashMap;

public class MaximumErasureValue {

    /**
     * https://leetcode.com/problems/maximum-erasure-value/description/
     * Problem : 1695, Medium
     * used sliding window to track the subarray and hashtable to maintain the uniqueness
     * TC: O(n)
     * SC: O(n)
     * */
    public static void main(String[] args) {
        maximumUniqueSubarray(new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5});
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int maxSum = 0;
        int start = 0;
        int[] prefixSum = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int end = 0; end < nums.length; end++) {
            if (end == 0) {
                prefixSum[end] = nums[end];
            } else {
                prefixSum[end] = prefixSum[end - 1] + nums[end];
            }
            if(map.containsKey(nums[end])){
                start = Math.max(start,map.get(nums[end])+1);
            }
            map.put(nums[end],end);
            maxSum=Math.max(maxSum,prefixSum[end]- ((start>0)?prefixSum[start-1]:0));
            System.out.println("MaxSum until index "+end+" is: "+maxSum);
        }
        return maxSum;
    }
}
