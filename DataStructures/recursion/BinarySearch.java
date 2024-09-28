package DataStructures.recursion;

public class BinarySearch {
    /**
     * It's the example of divide and conquer recursion
     */
    /*public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 45, 51, 58, 62, 69, 90, 97};
        search(arr, 97, 0, arr.length - 1);
    }*/

    /**
     * start , end : should be figured out as arg variable, since either of
     * these would be changing
     * middle: middle's range is just till the function and if it is a match then this should be returned
     */
    public static int search(int[] arr, int element, int start, int end) {
        if (start > end) { //base condition
            System.out.println("Not found...!!");
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (element == arr[middle]) {
            System.out.println("at:" + middle);
            return middle;
        }
        if (element > arr[middle]) {
            start = middle + 1;
            return search(arr, element, start, end);
        }
        end = middle - 1;
        return search(arr, element, start, end);
    }
}
