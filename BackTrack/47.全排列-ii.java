package BackTrack;
/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();
    // track 中的元素会被标记为 true
    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        // 先排序，让相同的元素靠在一起
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtrack(nums);
        return res;
    }

    private void backtrack(int[] nums) {
        // base case，到达叶子节点
        if(track.size() == nums.length) {
            // 收集叶子节点上的值
            res.add(new LinkedList<>(track));
            return;
        }

        // 回溯算法标准框架
        for(int i = 0; i < nums.length; i++) {
            // 已经存在 track 中的元素，不能重复选择
            if(used[i]) {
                continue;
            }
            // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            // 做选择
            used[i] = true;
            track.addLast(nums[i]);
            // 进入下一层回溯树
            backtrack(nums);
            // 撤销选择
            track.removeLast();
            used[i] = false;
        }
    }
}
// @lc code=end

