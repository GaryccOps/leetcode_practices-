import java.util.ArrayList;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

import java.util.*;

// @lc code=start
class Solution {
    /*
     * 1. counter table(hash) to count the occurence of numbers in the larger array
     * 2. Use this hashtable to check with 2nd array,
     * 1. to check if this number exist in 1st array, O(1)
     * 2. if(count > 0) --1, add to answer
     */

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums2.length > nums1.length)
            return this.intersect(nums2, nums1);

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < nums1.length; ++i) {
            Integer count = counter.get(nums1[i]);
            if (count == null) {
                counter.put(nums1[i], 1);
            } else {
                counter.put(nums1[i], count + 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums2.length; ++i) {
            Integer count = counter.get(nums2[i]);
            if (count != null) {
                if (count > 0) {
                    ans.add(nums2[i]);
                    counter.replace(nums2[i], count - 1);
                }
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();

    }

}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end
