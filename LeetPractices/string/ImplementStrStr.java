package org.com.sonakshi.string;

public class ImplementStrStr {
    /*
        https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
        Problem No.: 28, Easy
        Using sliding window technique
    * */

    public static void main(String[] args) {
        strStr("sadbutsad", "but");
    }

    public static int strStr(String haystack, String needle) {
        int left = 0, right = 0, i = 0;
        while (right < haystack.length()) {
            if (haystack.charAt(right) == needle.charAt(i)) {
                if (needle.length() - 1 == i) {
                    System.out.println("result: " + left);
                    return left;
                }
                right++;
                i++;
            } else {
                left++;
                i = 0;
                right = left;
            }
        }
        System.out.println("result: -1");
        return haystack.indexOf(needle);
    }
}
