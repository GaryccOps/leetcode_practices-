// /*
// * @lc app=leetcode id=209 lang=java
// *
// * [209] Minimum Size Subarray Sum
// */

// // @lc code=start
// class Solution {

// public static void main(String[] args) {
// int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1 };
// System.out.println(minSubArrayLen(11, nums));
// }

// public static int minSubArrayLen(int target, int[] nums) {
// int min = Integer.MAX_VALUE;

// int n = nums.length;
// int[] dp = new int[n];

// for (int k = 0; k < n; ++k)
// dp[k] = min;

// int i = 0;
// int j = 0;
// int sum = 0;

// while (j < n) {
// sum += nums[j];

// if (sum < target) {
// dp[j++] = 0;
// continue;
// }

// while (sum >= target) {
// dp[j] = Math.min(dp[j], j - i + 1);
// sum -= nums[i++];
// }

// if (dp[j] > 0) {
// min = Math.min(dp[j], min);
// }
// j++;
// }

// return min == Integer.MAX_VALUE ? 0 : min;
// }
// }
// // @lc code=end
