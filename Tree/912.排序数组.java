/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        // 归并排序对数组进行原地排序
        Merge.sort(nums);
        return nums;
    }
}

class Merge {
    // 用于辅助合并有序数组
    private static int[] temp;

    public static void sort(int[] nums) {
        // 先给辅助数组开辟内存空间
        temp = new int[nums.length];
        // 排序整个数组（原地修改）
        sort(nums, 0, nums.length - 1);
    }

    // 定义：将子数组 nums[lo..hi] 进行排序
    public static void sort(int[] nums, int lo, int hi) {
        if(lo == hi) {
            // 单个元素不用排序
            return;
        }
        // 防止溢出，效果等同于 (hi + lo) / 2
        int mid = lo + (hi - lo) / 2;
        // 先对左半部分数组 nums[lo..mid] 排序
        sort(nums, lo, mid);
        // 再对右半部分数组 nums[mid+1..hi] 排序
        sort(nums, mid + 1, hi);
        // 将两部分有序数组合并成一个有序数组
        merge(nums, lo, mid, hi);
    }

    // 将 nums[lo..mid] 和 nums[mid+1..hi] 这两个有序数组合并成一个有序数组
    private static void merge(int[] nums, int lo, int mid, int hi) {
        // 先把 nums[lo..hi] 复制到辅助数组中
        // 以便合并后的结果能够直接存入 nums
        for (int i = lo; i <= hi; i++) {
            temp[i] = nums[i];
        }

        // 数组双指针技巧，合并两个有序数组
        int i = lo, j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if(i == mid + 1) {
                // 左半边数组已全部被合并
                nums[k] = temp[j++];
            } else if(j == hi + 1) {
                // 右半边数组已全部被合并
                nums[k] = temp[i++]; 
            } else if(temp[i] > temp[j]) {
                nums[k] = temp[j++];
            } else {
                nums[k] = temp[i++];
            }
        }
    }
}
// @lc code=end

