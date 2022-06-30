package Array;

/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
/*
 * 前缀和问题思想
 * 此处不允许使用除法，因此采用前缀积与后缀积实现
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // preProduct[]存放前i个数的乘积，sufProduct[]存放后length-i个数的乘积
        int[] preProduct = new int[nums.length + 1], sufProduct = new int[nums.length + 1];

        // 将preProduct首位初始化置1，sufProduct末位初始化置1
        preProduct[0] = 1;
        // sufProduct[sufProduct.length - 1] = 1;
        sufProduct[0] = 1;

        // 计算前缀积
        for (int i = 0; i < nums.length; i++) {
            preProduct[i + 1] = preProduct[i] * nums[i];
        }

        // 计算后缀积，sufProduct是从后往前存放，因此计算结果时也需要反转
        for (int i = nums.length - 1; i >= 0; i--) {
            // sufProduct[i] = sufProduct[i + 1] * nums[i];
            sufProduct[sufProduct.length - i - 1] = sufProduct[sufProduct.length - i - 2] * nums[i];

        }

        // 计算productExceptSelf：i之前的乘积乘i之后的乘积
        for (int i = 0; i < nums.length; i++) {
            // nums[i] = preProduct[i] * sufProduct[sufProduct.length - nums.length + i];
            nums[i] = preProduct[i] * sufProduct[nums.length - i - 1];
        }
        return nums;
    }
}
// @lc code=end

