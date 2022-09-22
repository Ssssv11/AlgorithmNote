package Array;
/*
 * @lc app=leetcode.cn id=1640 lang=java
 *
 * [1640] 能否连接形成数组
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            map.put(pieces[i][0], i);
        }
        for(int j = 0; j < arr.length; ) {
            if(!map.containsKey(arr[j])) {
                return false;
            }
            for(int num : pieces[map.get(arr[j])]) {
                if(num != arr[j++]) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

