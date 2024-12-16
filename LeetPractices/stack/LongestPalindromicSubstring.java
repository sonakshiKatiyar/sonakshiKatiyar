package LeetPractices.stack;

public class LongestPalindromicSubstring {
    /**
     * https://leetcode.com/problems/longest-palindromic-substring/description/
     * Problem: 5, Medium
     * Concept used: To check palindrome we need to get the middle of same
     * */
    static int start = 0, length = 0;
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
    //ba(1)ba(3)bdc(6)

        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length()-1; i++) {
            expandRange(s, i, i); // if palindrome is odd
            expandRange(s, i, i+1); // if palindrome is even
        }
        return s.substring(start, start+length);
    }

    public  static void expandRange(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        begin++;
        end--;
        if(length<(end - begin + 1)) {
            length =  end - begin + 1;
            start = begin;
        }
    }
}
