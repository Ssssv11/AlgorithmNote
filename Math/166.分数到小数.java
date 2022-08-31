package Math;

import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=166 lang=java
 *
 * [166] 分数到小数
 */

// @lc code=start

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0 || denominator == 1) {
            return String.valueOf(numerator);
        }
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        StringBuilder sb = new StringBuilder();
        HashMap<Long, Integer> map = new HashMap<>();
        sb.append(n / d);
        long mo = n % d;
        if (mo != 0) {
            sb.append(".");
        }
        map.put(mo, sb.length());
        while (mo != 0) {
            sb.append(mo * 10 / d);
            mo = mo * 10 % d;
            if (map.containsKey(mo)) {
                sb.insert(map.get(mo), "(");
                sb.append(")");
                break;
            }
            map.put(mo, sb.length());
        }
        return ((numerator < 0 ^ denominator < 0) ? "-" : "") + sb.toString();
    }
}
// @lc code=end
