/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        int[] nus = searchRange(nums, 3);
        System.out.println(nus[0]);
        System.out.println(nus[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length;
        int lowB = -1, highB = -1;

        if (high > 0) {

            int mid;
            while (low < high) {
                mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    if (mid == 0) {
                        lowB = mid;
                        break;
                    } else if (nums[mid - 1] < nums[mid]) {
                        lowB = mid;
                        break;
                    } else if (nums[mid - 1] == nums[mid]) {
                        high = mid;
                    }
                } else if (nums[mid] > target) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            if (lowB == -1) {
                return new int[] { -1, -1 };
            } else {
                low = lowB;
            }
            high = nums.length;
            while (low < high) {
                mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    if (mid == nums.length - 1) {
                        highB = mid;
                        break;
                    } else if (nums[mid + 1] > nums[mid]) {
                        highB = mid;
                        break;
                    } else if (nums[mid + 1] == nums[mid]) {
                        low = mid + 1;
                    }
                } else if (nums[mid] > target) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return new int[] { lowB, highB };
    }
}
// @lc code=end
