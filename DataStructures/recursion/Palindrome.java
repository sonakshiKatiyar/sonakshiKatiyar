package DataStructures.recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM", 0));
    }

    public static boolean isPalindrome(String str, int i) {
        int n = str.length();
        if (i >= n / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n - 1 - i))
            return false;
        return isPalindrome(str, i + 1);

    }
}
