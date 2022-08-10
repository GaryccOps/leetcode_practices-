/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {

        if (num1 == null || num2 == null)
            return "0";

        int[] digits = new int[num1.length() + num2.length()];

        for (int i = num2.length() - 1; i >= 0; i--) {
            int right = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0; j--) {
                int left = num1.charAt(j) - '0';

                int tempProd = left * right;

                int p1 = i + j, p2 = i + j + 1;
                int sum = tempProd + digits[p2];
                digits[p1] += sum / 10;
                digits[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            if (!(digit == 0 && sb.length() == 0))
                sb.append(digit);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
// @lc code=end
