/*
 * @lc app=leetcode.cn id=315 lang=java
 *
 * [315] 计算右侧小于当前元素的个数
 */

// @lc code=start
class Solution {
    private class Pair {
        int val, index;
        Pair(int val, int index) {
            // 记录数组的元素值
            this.val = val;
            // 记录元素在数组中的原始索引
            this.index = index;
        }
    }

    // 归并排序所用的辅助数组
    private Pair[] temp;
    // 记录每个元素后面比自己小的元素个数
    private int[] count;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        temp = new Pair[n];

        Pair[] arr = new Pair[n];
        // 记录元素原始的索引位置，以便在 count 数组中更新结果
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }
        
        // 执行归并排序，结果被记录在 count 数组中
        sort(arr, 0, n - 1);
        List<Integer> res = new LinkedList<>();
        for (int c : count) {
            res.add(c);
        }
        return res;
    }

    // 归并排序
    private void sort(Pair[] arr, int lo, int hi) {
        if (lo == hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    // 合并两个有序数组
    private void merge(Pair[] arr, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            temp[i] = arr[i];
        }
        int i = lo, j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if(i == mid + 1) {
                arr[k] = temp[j++];
            } else if(j == hi + 1) {
                arr[k] = temp[i++];
                // 更新 count 数组
                count[arr[k].index] += j - mid - 1;
            } else if(temp[i].val > temp[j].val) {
                arr[k] = temp[j++];
            } else {
                arr[k] = temp[i++];
                // 更新 count 数组
                count[arr[k].index] += j - mid - 1;
            }
        }
    }
}
// @lc code=end

