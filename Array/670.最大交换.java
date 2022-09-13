package Array;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=670 lang=java
 *
 * [670] 最大交换
 */

// @lc code=start
class Solution {
    public int maximumSwap(int num) {
        char[] num1 = String.valueOf(num).toCharArray();
        char[] num2 = String.valueOf(num).toCharArray();
        Arrays.sort(num2);

        Character lc = null, hc = null;
        for (int i = 0; i < num1.length; i++) {
            if(num1[i] != num2[num2.length - 1 - i]) {
                lc = num1[i];
                hc = num2[num1.length - i - 1];
                num1[i] = num2[num1.length - i - 1];
                break;
            }
        }
        if (lc != null) {
            for (int i = num1.length - 1; i >= 0; i--) {
                if (hc.equals(num1[i])) {
                    num1[i] = lc;
                    break;
                }
            }
        }

        return Integer.valueOf(new String(num1));
    }
}
// @lc code=end

