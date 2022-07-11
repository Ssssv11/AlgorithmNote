/*
 * @lc app=leetcode.cn id=327 lang=java
 *
 * [327] 区间和的个数
 */

// @lc code=start
class Solution {
    private int lower, upper;

public int countRangeSum(int[] nums, int lower, int upper) {
this.lower = lower;
    this.upper = upper;
    // 构建前缀和数组，注意 int 可能溢出，用 long 存储
    long[] preSum = new long[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
        preSum[i + 1] = (long)nums[i] + preSum[i];
    }
    // 对前缀和数组进行归并排序
    sort(preSum);
    return count;
}

private long[] temp;

public void sort(long[] nums) {
    temp = new long[nums.length];
    sort(nums, 0, nums.length - 1);
}

private void sort(long[] nums, int lo, int hi) {
    if (lo == hi) {
        return;
    }
    int mid = lo + (hi - lo) / 2;
    sort(nums, lo, mid);
    sort(nums, mid + 1, hi);
    merge(nums, lo, mid, hi);
}

private int count = 0;

private void merge(long[] nums, int lo, int mid, int hi) {
    for (int i = lo; i <= hi; i++) {
        temp[i] = nums[i];
    }
    
    // 在合并有序数组之前加点私货（这段代码会超时）
    // for (int i = lo; i <= mid; i++) {
    //     for (int j = mid + 1; j <= hi; k++) {
    //         // 寻找符合条件的 nums[j]
    //         long delta = nums[j] - nums[i];
    //         if (delta <= upper && delta >= lower) {
    //             count++;
    //         }
    //     }
    // }
    
    // 进行效率优化
    // 维护左闭右开区间 [start, end) 中的元素和 nums[i] 的差在 [lower, upper] 中
    int start = mid + 1, end = mid + 1;
    for (int i = lo; i <= mid; i++) {
        // 如果 nums[i] 对应的区间是 [start, end)，
        // 那么 nums[i+1] 对应的区间一定会整体右移，类似滑动窗口
        while (start <= hi && nums[start] - nums[i] < lower) {
            start++;
        }
        while (end <= hi && nums[end] - nums[i] <= upper) {
            end++;
        }
        count += end - start;
    }

    // 数组双指针技巧，合并两个有序数组
    int i = lo, j = mid + 1;
    for (int p = lo; p <= hi; p++) {
        if (i == mid + 1) {
            nums[p] = temp[j++];
        } else if (j == hi + 1) {
            nums[p] = temp[i++];
        } else if (temp[i] > temp[j]) {
            nums[p] = temp[j++];
        } else {
            nums[p] = temp[i++];
        }
    }
}

}
// @lc code=end

