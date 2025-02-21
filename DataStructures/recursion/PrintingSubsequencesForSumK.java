package DataStructures.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequencesForSumK {
    /**
     * [1,2,1] k=2
     * subsequences: [1,1] [2]
     */

    public static void main(String[] args) {
        new PrintingSubsequencesForSumK().helper(new int[]{1, 2, 1,5,4,2}, 6, new ArrayList<>(), 0, 0);
    }

    public void helper(int[] arr, int k, List<Integer> ds, int i, int sum) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(ds);
            }
            return;
        }

        //include / take
        ds.add(arr[i]);
        helper(arr, k, ds, i + 1, sum + arr[i]);
        ds.removeLast();
        //exclude / not take
        helper(arr, k, ds, i + 1, sum);
    }
}
