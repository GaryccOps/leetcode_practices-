// import java.util.ArrayList;

// /*
// * @lc app=leetcode id=228 lang=java
// *
// * [228] Summary Ranges
// */

// import java.util.List;

// // @lc code=start
// class Solution {
// public static List<String> summaryRanges(int[] nums) {

// List<String> ans = new ArrayList<String>();
// if (nums.length == 0)
// return ans;
// else if (nums.length == 1) {
// addRes(ans, nums[0], nums[0]);
// }

// int start = nums[0];
// int end = start;
// for (int i = 1; i < nums.length; ++i) {

// if (end + 1 == nums[i]) {
// end++;
// if (i + 1 >= nums.length)
// addRes(ans, start, end);
// continue;
// } else {
// addRes(ans, start, end);
// start = nums[i];
// end = start;

// if (i + 1 >= nums.length)
// addRes(ans, start, end);
// }
// }

// return ans;
// }

// private static void addRes(List<String> ans, int start, int end) {
// String res;
// if (start == end) {
// res = String.valueOf(end);
// } else {
// res = String.format("%d->%d", start, end);
// }
// ans.add(res);
// }
// }
// // @lc code=end
