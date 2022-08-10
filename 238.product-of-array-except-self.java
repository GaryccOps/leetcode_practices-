// /*
// * @lc app=leetcode id=238 lang=java
// *
// * [238] Product of Array Except Self
// */

// // @lc code=start
// class Solution {
// public static int[] productExceptSelf(int[] nums) {
// int n = nums.length;

// int productOfAllNums = 1;
// int zeroCount = 0;
// for (int i = 0; i < n; ++i) {
// if (nums[i] != 0) {
// productOfAllNums *= nums[i];
// } else {
// zeroCount += 1;
// }

// }

// for (int i = 0; i < n; ++i) {
// if (zeroCount > 1) {
// nums[i] = 0;
// } else if (zeroCount == 1) {
// if (nums[i] == 0) {
// nums[i] = productOfAllNums;
// } else {
// nums[i] = 0;
// }
// } else {
// nums[i] = productOfAllNums / nums[i];
// }
// }

// return nums;
// }
// }
// // @lc code=end

// /*
// * answer of the num_i == product of all other nums except num_i itself
// * answer(num_i) == product of all number / num_i
// *
// * edge case: if contain 1 zero - except 0 has answer, others will all be zero
// * if contain > 1 zero - all 0
// */