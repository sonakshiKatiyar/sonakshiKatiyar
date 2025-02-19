package org.com.sonakshi.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum c = new CombinationSum();
        System.out.println(c.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, target, candidates, result, new ArrayList<>());
        return result;
    }

    public void helper(int i, int n, int[] arr, List<List<Integer>> result, List<Integer> list) {
        if (i >= arr.length) {
            if (n == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        // include
        if (arr[i]<=n) {
            list.add(arr[i]);
            helper(i, n - arr[i], arr, result, list);
            list.remove(list.size() - 1);
        }
        // exclude
        helper(i + 1, n, arr, result, list);
    }
}
