package LeetPractices.array2d;

public class GridGame {
    /**
     * https://leetcode.com/problems/grid-game/description/
     * Problem No.:2017, Medium
     * add the first row and iterate thorough every column,
     * and identify if the first robot goes down from this index then what is the minimum second can collect
     * */
    public static void main(String[] args) {
        gridGame(new int[][]{{2,5,4},{1,5,1}});
    }

    public static long gridGame(int[][] grid) {
        int first=0,second=0;
        int res=Integer.MAX_VALUE;
        for(int a: grid[0]){
            first += a;
        }
        for(int i=0;i<grid[0].length;i++){
            first -= grid[0][i];
            res = Math.min(res,Math.max(first,second));
            second += grid[1][i];
        }
        return res;
    }
}
