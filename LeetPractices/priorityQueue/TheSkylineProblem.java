package LeetPractices.priorityQueue;

import java.util.*;

public class TheSkylineProblem {
    /**
     * https://leetcode.com/problems/the-skyline-problem/description/
     * Problem 218, Hard
     *
     * */
    public static void main(String[] args) {
        getSkyline(new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}});
    }
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> points = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            points.add(new int[]{buildings[i][0], -buildings[i][2]});
            points.add(new int[]{buildings[i][1], buildings[i][2]});
        }
        Collections.sort(points, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        int prevHeight = 0;
        for (int[] p: points) {
            int h = p[1];
            if (h < 0) //starting point of building
                pq.add(-h);
            else // since it's the ending of building, we need to remove it from pq as it doesn't contribute to skyline anymore
                pq.remove(h);
            int currentHeight = pq.peek();
            if (currentHeight != prevHeight) {
                result.add(Arrays.asList(p[0], currentHeight));
                prevHeight = currentHeight;
            }
        }
        return result;
    }
}
