/*
 * @lc app=leetcode id=53 lang=java
 * 
 * [53] Maximum Subarray
 */

// @lc code=start
// import java.util.*;

// class Solution {
// public static void main(String[] args) {
// int[] nums = { -1, 1, 1, 3, -3, 2, -3, -1 };
// System.out.println(maxSubArray(nums));
// }

// public static int maxSubArray(int[] nums) {
// int len = nums.length;
// int[] dp = new int[len];
// dp[0] = nums[0];
// int sum = dp[0];

// for (int i = 1; i < len; ++i) {
// dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
// }

// sum = dp[0];
// for (int i = 1; i < len; ++i) {
// if(dp[i] > sum) sum = dp[i];
// }

// return sum;
// }
// }
// @lc code=end

/*
 *
 */