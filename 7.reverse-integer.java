/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int sign = x > 0 ? 1 : -1;

        x = Math.abs(x);

        long ans = 0;
        while (x > 0) {
            ans = ans * 10 + ((x % 10));
            if (ans > Integer.MAX_VALUE)
                return 0;
            if (ans < Integer.MIN_VALUE)
                return 0;
            x /= 10;
        }

        ans = ans * sign;
        return (int) ans;
    }
}
// @lc code=end
