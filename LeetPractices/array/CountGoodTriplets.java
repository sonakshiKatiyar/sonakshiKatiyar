package LeetPractices.array;

public class CountGoodTriplets {
    /**
     * https://leetcode.com/problems/count-good-triplets/description/
     * proble : 1534, easy
     * TC : O(n^3)
     */
    public static void main(String[] args) {
        System.out.println(countGoodTriplets(new int[]{3,0,1,1,9,7},7,2,3));
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b
                                && Math.abs(arr[i] - arr[k]) <= c) {
                            System.out.println(arr[i] + "," + arr[j] + ", " + arr[k]);
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
