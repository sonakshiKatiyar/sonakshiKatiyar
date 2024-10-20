package LeetPractices.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    /**
     * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
     * Problem No.: 1431, Easy
     * */
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
            candies[i] += extraCandies;
        }

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] >= max) {
                result.add(true);
            } else {
                result.add(false);
            }

        }
        return result;
    }
}
