/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;

        int ref;
        int i = 0;
        while (zero < nums.length && i < nums.length) {
            if (nums[zero] != 0) {
                zero++;
                continue;
            }

            if (nums[i] == 0) {
                i++;
                continue;
            }

            if (zero < i) {
                ref = nums[i];
                nums[i] = nums[zero];
                nums[zero] = ref;
                i++;
                zero++;
            } else {
                i++;
            }
        }
    }
}
// @lc code=end
