package DataStructures.recursion;

import java.util.ArrayList;

public class PrintAllSubsequence {
    /**
     * below pattern is used to identify all possible solutions
     * arr [3(0),1(1),2(2)] => possible ans [],[3],[1],[2],[3,1],[3,2],[1,2],[3,1,2]
     * include or exclude pattern; either you include the current element or u exclude
     *     NOTE: also check PowerSet algorithm later
     * */
    public static void main(String[] args) {
        getSubsequence(new int[]{4,2,1});
    }

    private static void getSubsequence(int[] arr) {

        helper(0, new ArrayList<>(),arr);
    }

    private static void helper(int i, ArrayList<Integer> list, int[] arr) {
        int n = arr.length;
        if(i==n){
            System.out.println("arr: "+ list);
            return;
        }
        list.add(arr[i]);
        helper(i+1,list,arr);
        list.removeLast();
        helper(i+1,list,arr);
    }

}
