package LeetPractices.array2d;

import java.util.Arrays;

public class RankTeamsByVotes {
    /**
    * https://leetcode.com/problems/rank-teams-by-votes/description/
     * Problem : 1366, Medium
     * trick : 2D array to maintain the rank and team, custom compare for ordering
    * */
    public static void main(String[] args) {
        System.out.println(rankTeams(new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"}));
    }

    public static String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        /**
         * create a 2D array of votes[0] length
         * where each row will define team A,B,C...
         * and column will define Ranks 0,1,2...
         * */
        int a = votes[0].length();
        int[][] rank = new int[26][a + 1];
        /**
         * add the char's alphabetical position at last column of 2D arr
         * */
        for (int i = 0; i < 26; i++)
            rank[i][a] = i;
        /**
         * Now 2D array will look like below:
         * ranks---> 0 1 2 3
         * teams A   0 0 0 0
         *   |   B   0 0 0 1
         *  \/   C   0 0 0 2
         *       .   . . . .
         *       .   . . . .
         *       Z   0 0 0 25
         *
         *   Now we just need to iterate through each vote
         *   and find the location as per team and ranking and increase it by 1
         * */
        for (int i = 0; i < votes.length; i++) { //iterate through each vote
            for (int j = 0; j < a; j++) { //iterate through each vote rank
                String s = votes[i];  // ith round of vote's given ranking
                rank[s.charAt(j) - 'A'][j]++; //find the location and ++
            }
        }
        /**
         * the rank now
         * 5 0 0 0
         * 0 2 3 1
         * 0 3 2 2
         * 0 0 0 3
         * 0 0 0 4
         * .
         * .
         * 0 0 0 25
         *
         * Now we just need to compare the column by column by column and return last column
         * */
        Arrays.sort(rank, (x,y) -> { //here in x and y it will whole row
            for (int k = 0; k < a; k++) {
                    if(x[k]!=y[k])
                        return Integer.compare(y[k],x[k]); //comparing in descending order as higher value should come first 
            }
                return Integer.compare(x[a],y[a]); //comparing in ascending order as lower value means lexically lower value should come first
        });
        
        /**
         * rank now
         * 5 0 0 0 --> A
         * 0 3 2 2 --> C
         * 0 2 3 1 --> B
         * 0 0 0 3
         * 0 0 0 4
         * .
         * .
         * 0 0 0 25
         * 
         * return the last column of array
         * */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++)
            sb.append((char) (rank[i][a]+'A')); // be mindful of converting the number into char

        return sb.toString();
    }
}
