package LeetPractices.string;

public class LengthOfLastWord {

    /**
     * https://leetcode.com/problems/length-of-last-word/description/
     * Problem : 58, Easy
     * */
    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;
        /**
         * TC : O(n)
         * SC : O(n)
         s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i))
                result = 0;
            else
                result++;
        }*/
        int n = s.length();
        int i=0;
        while(i<n){
            if (' ' != s.charAt(i)){
                result++;
                i++;
            }else{
                while(i<n && ' '==s.charAt(i))
                        i++;
                if(i!=n)
                    result=0;
            }
        }
        System.out.println(result);
        return result;
    }
}
