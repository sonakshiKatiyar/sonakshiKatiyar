package DataStructures.recursion;

public class Fibonacci {
    /**
     * ITs the example of liner recursion
     */

    public static void main(String[] args) {
        System.out.println("Answer is : " + fibonacciOf(6));
    }

    static int fibonacciOf(int n) {
        if (n <2) { //base condition
            return n;
        }

        return fibonacciOf(n - 1) + fibonacciOf(n - 2); // recurrence relation

    }
}
