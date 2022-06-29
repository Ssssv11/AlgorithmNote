package Array;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i += 1;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
// @lc code=end

