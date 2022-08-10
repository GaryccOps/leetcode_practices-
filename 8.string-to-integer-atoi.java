/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0)
            return 0;
        int sign = 1;
        int ans = 0, i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length()) {
            int digit = s.charAt(i) - '0';
            if (digit < 0 || digit > 9)
                break;

            if (Integer.MAX_VALUE / 10 < ans || Integer.MAX_VALUE / 10 == ans && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = 10 * ans + digit;
            i++;
        }

        return ans * sign;
    }
}
// @lc code=end
