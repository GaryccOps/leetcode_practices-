/*
 * @lc app=leetcode id=354 lang=java
 *
 * [354] Russian Doll Envelopes
 */

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.*;

// @lc code=start
class Solution1 {
    public static void main(String[] args) {
        int[][] envelopes = new int[][] { { 7, 8 }, { 12, 16 }, { 12, 5 }, { 1, 8 }, { 4, 19 },
                { 3, 15 }, { 4, 10 }, { 9, 16 }
        };

        int ans = maxEnvelopes(envelopes);
        System.out.println(ans);
    }

    public static int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, new MyComparator());

        return findLongestIncreasingSubSequence(envelopes);
    }

    private static int findLongestIncreasingSubSequence(int[][] envelopes) {
        int n = envelopes.length;
        int[] dp = new int[n];

        int ans = 0;
        // for (int i = 0; i < n; ++i) {

        // for (int j = 0; j < i; ++j) {
        // if (envelopes[i][1] > envelopes[j][1] &&
        // envelopes[i][0] > envelopes[j][0] &&
        // dp[i] < dp[j] + 1) {
        // dp[i] = dp[j] + 1;
        // }
        // }

        // ans = Math.max(dp[i], ans);

        // }
        int len = 0;
        for (int[] envelope : envelopes) {
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if (index < 0)
                index = -(index + 1);
            dp[index] = envelope[1];
            if (index == len)
                len++;
        }

        return len;
    }

    public static class MyComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] l1, int[] l2) {
            if (l1[0] == l2[0])
                return l2[1] - l1[1];
            else
                return l1[0] - l2[0];
        }
    }

}
// @lc code=end
