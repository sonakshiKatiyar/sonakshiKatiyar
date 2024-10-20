package LeetPractices.string;

public class ArrayStringsAreEqual {

    /**
     * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
     * Problem No.: 1662, Easy
     * Use StringBuilder instead of String
     * */
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word11 = new StringBuilder();
        StringBuilder word12 = new StringBuilder();
        for (String s : word1) {
            word11.append(s);
        }
        for (String s : word2) {
            word12.append(s);
        }
        return word11.toString().equals(word12.toString());
    }
}
