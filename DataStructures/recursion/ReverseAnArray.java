package DataStructures.recursion;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class ReverseAnArray {
    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3, 2, 4, 5});
    }

    public static int[] reverseArray(int[] arr) {
        // recursiveReverse(arr,0,arr.length-1);
        recursiveReverse(arr, 0);
        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(joining(",")));
        return arr;
    }

    private static void recursiveReverse(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        swap(arr, i, n - 1 - i);
        recursiveReverse(arr, i + 1);

    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    /**
     * Trick : Recursion using 2 pointers
     public static void recursiveReverse(int[ ] arr,int start, int end){ //f(0,4) ->f(1,3)
     if(start>=end){
     return ;
     }
     swap(arr,start,end);
     recursiveReverse(arr, start+1, end-1);
     }*/
}
