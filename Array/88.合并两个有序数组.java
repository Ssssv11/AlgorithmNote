package Array;
/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start

/*
 * 将双指针初始化在数组的尾部，然后从后向前进行合并
 * 这样即便覆盖了 nums1 中的元素，这些元素也必然早就被用过了，不会影响答案的正确性。
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 两个指针分别初始化在两个数组的最后一个元素
        int i = m -1, j = n - 1;
        // 生成排序的结果
        int p = nums1.length - 1;
        // 从后向前生成结果数组，类似合并两个有序链表的逻辑
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }
        // 可能其中一个数组的指针走到尽头了，而另一个还没走完
        // 因为本身就是在往 nums1 中放元素，所以只需考虑 nums2 是否剩元素即可
        while(j >= 0) {
            nums1[p] = nums2[j];
            j--;
            p--;
        }
    }
}
// @lc code=end

