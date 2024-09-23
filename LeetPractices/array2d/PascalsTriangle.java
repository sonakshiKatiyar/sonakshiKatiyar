package org.com.sonakshi.array2d;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    /*public static void main(String[] args) {
        generate(5);
    }*/

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int end, start = 0;
        for (int i = 0; i < numRows; i++) {
            ArrayList tempArr = new ArrayList(i + 1);
            end = i;
            if (start == end) {
                tempArr.add(1);
            } else {
                List<Integer> prevRow = result.get(i-1);
                tempArr.add(start,1);
                for (int j = 1; j < i; j++) {
                    tempArr.add(prevRow.get(j-1) + prevRow.get(j));
                }
                tempArr.add(end,1);
            }
            result.add(tempArr);
        }
        System.out.println(result);
        return result;
    }
}
