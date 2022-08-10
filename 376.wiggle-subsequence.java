import java.lang.reflect.Array;

/*
 * @lc app=leetcode id=376 lang=java
 *
 * [376] Wiggle Subsequence
 */

import java.util.*;

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int[] up = new int[n], down = new int[n];

        up[0] = 1;
        down[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                // S.L
                up[i] = down[i - 1] + 1;
                down[i] = down[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                // L.S
                up[i] = up[i - 1];
                down[i] = up[i - 1] + 1;
            } else {
                // E.E
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }

        return Math.max(up[n - 1], down[n - 1]);
    }
}
// @lc code=end

/*
 * - length >= 1, num >= 0
 * - S.L.S.L || L.S.L.S
 * - O(n)
 * 1 2 4 3 1
 * + +
 */
