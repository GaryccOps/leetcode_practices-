import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);

        Arrays.asList(nums1).stream().forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;

        int insertIndex = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[insertIndex] = nums1[i--];
                } else {
                    nums1[insertIndex] = nums2[j--];
                }
            } else if (i < 0) {
                nums1[insertIndex] = nums2[j--];
            } else if (j < 0) {
                nums1[insertIndex] = nums1[i--];
            }
            insertIndex--;
        }
    }
}
// @lc code=end
