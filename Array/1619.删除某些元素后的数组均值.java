package Array;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1619 lang=java
 *
 * [1619] 删除某些元素后的数组均值
 */

// @lc code=start
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = (int) (arr.length * 0.05);
        System.out.println(len);
        double sum = 0;
        for (int i = len; i < arr.length - len; i++) {
            sum += arr[i];
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(sum / (arr.length - 2 * len));
        return sum / (arr.length - 2 * len);
    }
}
// @lc code=end

