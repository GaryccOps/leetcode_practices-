/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int low = 0, high = n;
        int mid;
        while (true) {
            if (low + 1 >= high)
                return high;

            mid = low + (high - low) / 2;
            if (isBadVersion(mid) == false) {
                low = mid;
            } else {
                high = mid;
            }
        }
    }
}
// @lc code=end
