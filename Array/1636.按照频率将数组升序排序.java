package Array;
/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> resMap = new HashMap<>();
        List<Integer> numsList = new ArrayList<>();
        for (int curr : nums) {
            numsList.add(curr);
            resMap.put(curr, resMap.getOrDefault(curr, 0) + 1);
        }
        numsList.sort((a, b) -> {
            int aCount = resMap.get(a);
            int bCount = resMap.get(b);
            if (aCount == bCount) {
                return b - a;
            }
            return aCount - bCount;
        });

        return numsList.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

