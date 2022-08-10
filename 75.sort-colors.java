/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0, 1 };
        sortColors(nums1);
    }

    public static void sortColors(int[] nums) {
        int red = 0, white = 0, blue = nums.length - 1;

        int i = 0;
        int temp;
        while (white <= blue) {
            if (nums[white] == 0) {
                temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                red++;
                white++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                temp = nums[blue];
                nums[blue] = nums[white];
                nums[white] = temp;
                blue--;
            }
        }
    }
}
// @lc code=end
