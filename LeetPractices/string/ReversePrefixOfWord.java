package org.com.sonakshi.string;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println( new ReversePrefixOfWord().reversePrefix("abcdefd",'d'));
    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index==-1){
            return word;
        }

        StringBuilder sb = new StringBuilder();
        for (int i =index; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
       return sb.append(word.substring(index+1)).toString();
    }
}
