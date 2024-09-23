package org.com.sonakshi.array2d;

import java.util.Arrays;

public class DiagonalTraverse {

    /*public static void main(String[] args) {
        findDiagonalOrder(new int[][]{{6, 9, 7, 8}, {1, 5, 4, 3}, {9, 4, 3, 2}, {5, 7, 6, 0}});
    }*/

    public static int[] findDiagonalOrder(int[][] mat) {
        /* 1. first or last row then column+1
         *  2. first or last column then row+1
         * */


        int row = mat.length;
        int col = mat[0].length;
        int r = 0, c = 0, i = 0;
        int[] result = new int[row * col];
        if (row == 0 || col == 0) {
            return new int[0];
        }

        while (i < result.length) {
            result[i++] = mat[r][c];
            if ((r + c) % 2 == 0) { //upward
                if (r > 0 && c < col - 1) {
                    c++;
                    r--;
                } else if (c < col - 1 && r == 0) {
                    c++;
                } else {
                    r++;
                }
            } else {
                if (r < row - 1 && c > 0) {
                    c--;
                    r++;
                } else if (r < row - 1 && c == 0) {
                    r++;
                } else {
                    c++;
                }
            }
        }
        Arrays.stream(result).forEach(e -> System.out.print(e + ","));
        return result;
    }
}
