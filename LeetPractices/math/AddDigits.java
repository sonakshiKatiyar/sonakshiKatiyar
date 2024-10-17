package LeetPractices.math;

public class AddDigits {
/**
 * https://leetcode.com/problems/add-digits/description/
 * Problem No.: 258, Easy
 * If u remember Digit Root concept this question is the easiest
 * */
public static void main(String[] args) {
    System.out.println(addDigits(214235));
}
public static int addDigits(int num) { //38
    if(num==0){
        return 0;
    }
    if(num%9==0){
        return 9;
    }
    return num%9;

}

}
