package Array;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
/*
 * 将数组排序后使用双指针遍历查找相同值
 * 注意返回值时数组的长度
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int [] num = new int[Math.max(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                num[k] = nums1[i];
                i++;
                j++;
                k++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(num, 0, k);
    }
}
// @lc code=end

