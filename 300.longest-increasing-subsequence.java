/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int nus = lengthOfLIS(nums);

        System.out.println(nus);
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        int ans = 0;
        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }

            ans = Math.max(dp[i], ans);
        }

        return ans + 1;
    }
}
// @lc code=end
