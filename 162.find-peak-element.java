/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        int low = 0, high = nums.length;

        int mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (mid + 1 < nums.length && mid > 0) {

                if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1])
                    return mid;
                else if (nums[mid + 1] > nums[mid] && nums[mid - 1] < nums[mid]) {
                    low = mid;
                } else if (nums[mid + 1] < nums[mid] && nums[mid - 1] > nums[mid]) {
                    high = mid;
                } else if (nums[mid + 1] > nums[mid] && nums[mid - 1] > nums[mid]) {
                    high = mid;
                }
            } else if (mid == 0) {
                if (nums[mid + 1] < nums[mid]) {
                    return mid;
                } else {
                    low = mid;
                }
            } else if (mid == nums.length - 1) {
                if (nums[mid - 1] < nums[mid]) {
                    return mid;
                } else {
                    high = mid;
                }
            }
        }

        return low + (high - low) / 2;
    }
}
// @lc code=end
