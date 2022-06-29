package Array;

/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */

// @lc code=start
/*
 * 普通解法
 * sumRange被频繁调用，时间复杂度为O(N)
 */
// class NumArray {

//     private int[] nums;

//     public NumArray(int[] nums) {
//         this.nums = nums;
//     }
    
//     public int sumRange(int left, int right) {
//         int res = 0;
//         for (int i = left; i <= right; i++) {
//             res += nums[i];
//         }
//         return res;
//     }
// }

/*
 * 可以前缀和技巧实现：
 * 核心思路是用一个新的数组 preSum 记录 nums[0..i-1] 的累加和
 * 这样，sumRange 函数仅仅需要做一次减法运算
 * 避免了每次进行 for 循环调用，最坏时间复杂度为常数 O(1)。
 */
class NumArray {

    // 前缀和数组
    private int[] preSum;

    /* 输入一个数组，构造前缀和 */
    public NumArray(int[] nums) {
        // preSum[0] = 0，便于计算累加和
        preSum = new int[nums.length + 1];
        // 计算 nums 的累加和, 注意从1开始
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    /* 查询闭区间 [left, right] 的累加和 */
    public int sumRange(int left, int right) {
        // 某闭区间[left, right]的累加和等于sum[right]-sum[left]
        return preSum[right + 1] - preSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end

