/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;

        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; ++i) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n - 1];
    }
}
// @lc code=end
/*
 * 
 * 1
 * 1 1
 * 
 */