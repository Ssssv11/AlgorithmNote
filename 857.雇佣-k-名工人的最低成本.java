import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

/*
 * @lc app=leetcode.cn id=857 lang=java
 *
 * [857] 雇佣 K 名工人的最低成本
 */

// @lc code=start
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length, sumQ = 0;
        Integer[] id = IntStream.range(0, n).boxed().toArray(Integer[]::new);
        Arrays.sort(id, (i, j) -> wage[i] * quality[j] - wage[j] * quality[i]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; ++i) {
            pq.offer(quality[id[i]]);
            sumQ += quality[id[i]];
        }
        double ans = sumQ * ((double) wage[id[k - 1]] / quality[id[k - 1]]);
        for (int i = k; i < n; ++i) {
            int q = quality[id[i]];
            if (q < pq.peek()) {
                sumQ -= pq.poll() - q;
                pq.offer(q);
                ans = Math.min(ans, sumQ * ((double) wage[id[i]] / q));
            }
        }
        return ans;
    }
}
// @lc code=end

