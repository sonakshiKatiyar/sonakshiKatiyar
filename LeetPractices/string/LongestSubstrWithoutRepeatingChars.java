package LeetPractices.string;

import java.util.HashMap;

public class LongestSubstrWithoutRepeatingChars {
/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Problem No.: 3, Medium
 * Using Sliding Window and hashmap to keep track of index of char
 * */
    public static void main(String[] args) {
        lengthOfLongestSubstring("wqrwyw");
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxChars = 0;
        int start=0;
        for(int end=0;end<s.length();end++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end))+1);
            }
            map.put(s.charAt(end),end);
            maxChars = Math.max(maxChars,end-start+1);
        }
        System.out.println(maxChars);
        return maxChars;
    }
}
