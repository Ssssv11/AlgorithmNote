package Math;
/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

import java.util.HashSet;
import java.util.Set;

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1) {
            int temp = n, sum = 0;
            while(temp >= 10) {
                int mod = temp % 10;
                temp /= 10;
                sum += mod * mod; 
            }
            sum += temp * temp;
            if(!set.add(sum)) {
                return false;
            }
            n = sum;
        }
        return true;
    }
}
// @lc code=end

