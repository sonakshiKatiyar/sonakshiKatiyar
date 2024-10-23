package LeetPractices.string;

public class ReverseVowelsofString {

    /**
     * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
     * Problem No.: 204, Easy
     * 2 key points which did not click to my mind
     *      i. logic in isVowel()
     *      ii. converting the char[] to string
     * */
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCream"));
    }

    public static String reverseVowels(String s) {
        char[] alphas = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isVowel(alphas[left])) {
                left++;
            }

            while (left < right && !isVowel(alphas[right])) {
                right--;
            }

            char temp = alphas[left];
            alphas[left] = alphas[right];
            alphas[right] = temp;
            right--;
            left++;
        }

        return new String(alphas);
    }

    private static boolean isVowel(char alpha) {
        return "aeiouAEIOU".indexOf(alpha) != -1;
    }
}