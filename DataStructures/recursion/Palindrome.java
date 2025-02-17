package DataStructures.recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrom("MADAM", 0));
    }

    public static boolean palindrom(String str, int i) {
        int n = str.length();
        if (i >= n / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n - 1 - i))
            return false;
        return palindrom(str, i + 1);

    }
}
