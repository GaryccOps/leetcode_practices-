// /*
// * @lc app=leetcode id=152 lang=java
// *
// * [152] Maximum Product Subarray
// */

// // @lc code=start
// class Solution {
// public static void main(String[] args) {
// int[] nums = { -1, -2, -9, -6 };
// System.out.println(maxProduct(nums));
// }

// public static int maxProduct(int[] nums) {
// int n = nums.length;
// int[][] dp = new int[n][2];

// dp[0][0] = nums[0];
// dp[0][1] = nums[0];
// int ansRow1 = dp[0][0];
// int ansRow2 = dp[0][1];

// for (int i = 1; i < n; ++i) {
// if (nums[i] >= 0) {
// dp[i][0] = Math.max(nums[i], dp[i - 1][0] * nums[i]);
// dp[i][1] = Math.min(nums[i], dp[i - 1][1] * nums[i]);
// } else {
// dp[i][0] = Math.max(nums[i], dp[i - 1][1] * nums[i]);
// dp[i][1] = Math.min(nums[i], nums[i] * dp[i - 1][0]);
// }

// ansRow1 = Math.max(dp[i][0], ansRow1);
// ansRow2 = Math.max(dp[i][1], ansRow2);
// }

// return Math.max(ansRow1, ansRow2);
// }
// }
// // @lc code=end

// /*
// * dp[]
// */
