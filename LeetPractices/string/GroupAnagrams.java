package LeetPractices.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    /**
     * https://leetcode.com/problems/group-anagrams/description/
     * Problem: 49, Medium
     * this can be solved using hashmaps where we can group the same words having same chars.
     * There are 2 approaches for identifying the grouping or key of hashmap
     *  1. we can sort the input string, but that has TC (nlogn)
     *  2. we can create a hash-key having frequency of each char eg eat-> e1a1t1 this has TC(n)
     *  so total TC will be O(NK) where N : avg size of strings, K : size of String array
     * */
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s:strs) {
            String key = getFrequencString(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private static String getFrequencString(String s) {
        int[] frq = new int[26];
        StringBuilder sb = new StringBuilder();
        /**
         * to count the freq we have taken a array not we will put the freq of each char as per its index
         * ascii value of a: 97, b: 98...e: 101,..t: 116,...., z: 122
         * index calculation of eat :
         * for e: frq[101-97] => frq[4]++
         * for a frq[97-97] => frq[0]++
         * for t frq[116-97] => frq[19]++
         * */
        for (Character ch:s.toCharArray()) {
            frq[ch-'a']++;
        }
        for (int i=0;i<26;i++) {
            if(frq[i]>0){
                sb.append((char)('a'+i)).append(frq[i]);
            }
        }
        return sb.toString();
    }
}
