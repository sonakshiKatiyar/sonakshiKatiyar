package LeetPractices.array;

public class CountPrime {
    /**
     * https://leetcode.com/problems/count-primes/
     * Problem No.: 204, Med
     * Using Seive of Eratosthenes concept which is the most optimized approach to identify the prime number
     * */
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = i * 2; j < n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        return count;
    }
}


