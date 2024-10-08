package org.com.sonakshi.string;

public class AddBinary {

    /*
    * https://leetcode.com/problems/add-binary/description/
    * Problem No.: 67, Easy
    * Using StringBuilder as the binary number needs to be added in a loop.
    * */
    public static void main(String[] args) {
        addBinary("1101","1111");
    }
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0,sum=0;
        StringBuilder sb = new StringBuilder();
        while (i>=0 || j >=0){
            sum=carry;
            if(i>=0){
                sum = sum+a.charAt(i--)-'0'; // -'0' is added if a.chatAt(i) is not present
            }
            if(j>=0){
                sum = sum+b.charAt(j--)-'0';
            }
            sb.append(sum%2);
            carry = sum > 1 ? 1 : 0;
        }
        if (carry>0){
            sb.append(carry%2);
        }
        System.out.println(sb);
        return sb.reverse().toString();
    }
}
