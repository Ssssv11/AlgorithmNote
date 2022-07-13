/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start

/*
 * 快速排序
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        sort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    private static void sort(int[] nums, int lo, int hi) {
        if(lo >= hi) {
            return;
        }
        // 对 nums[lo..hi] 进行切分
        // 使得 nums[lo..p-1] <= nums[p] < nums[p+1..hi]
        int p = partition(nums, lo, hi);

        sort(nums, lo, p - 1);
        sort(nums, p + 1, hi);
    }

    private static int partition(int[] nums, int lo, int hi) {
        int pivot = nums[lo];
        // 这里把 i, j 定义为开区间，同时定义：
        // [lo, i) <= pivot；(j, hi] > pivot
        int i = lo + 1, j = hi;
        // 当 i > j 时结束循环，以保证区间 [lo, hi] 都被覆盖
        while(i <= j) {
            while (i < hi && nums[i] <= pivot) {
                i++;
                // 此 while 结束时恰好 nums[i] > pivot
            }
            while (j > lo && nums[j] > pivot) {
                j--;
                // 此 while 结束时恰好 nums[j] <= pivot
            }
            if (i >= j) {
                break;
            }
            // 此时 [lo, i) <= pivot && (j, hi] > pivot
            // 交换 nums[j] 和 nums[i]
            swap(nums, i, j);
            // 此时 [lo, i] <= pivot && [j, hi] > pivot
        }
        // 最后将 pivot 放到合适的位置，即 pivot 左边元素较小，右边元素较大
        swap(nums, lo, j);
        return j;
    }

    // 洗牌算法，将输入的数组随机打乱
    private static void shuffle(int[] nums) {
        Random rand = new Random();
        int n = nums.length;
        for (int i = 0 ; i < n; i++) {
            // 生成 [i, n - 1] 的随机数
            int r = i + rand.nextInt(n - i);
            swap(nums, i, r);
        }
    }

    // 原地交换数组中的两个元素
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
 * 二叉堆
 */
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         // 小顶堆，堆顶是最小元素
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int e : nums) {
//             // 每个元素都要过一遍二叉堆
//             pq.offer(e);
//             // 堆中元素多于 k 个时，删除堆顶元素
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         // pq 中剩下的是 nums 中 k 个最大元素，
//         // 堆顶是最小的那个，即第 k 个最大元素
//         return pq.peek();
//     }
// }
// @lc code=end

