package Math;

/*
 * @lc app=leetcode.cn id=372 lang=java
 *
 * [372] 超级次方
 */

// @lc code=start
class Solution {
    int base = 1337;

    private int myPow(int a, int k) {
        if (k == 0) {
            return 1;
        }
        a = a % base;

        if (k % 2 == 1) {
            return (a * myPow(a, k - 1)) % base;
        } else {
            int sub = myPow(a, k / 2);
            return (sub * sub) % base;
        }
    }

    public int superPow(int a, int[] b) {
        return superPow(a, b, b.length);
    }

    public int superPow(int a, int[] b, int len) {
        // 递归的 base case
        if (len == 0) {
            return 1;
        }

        // 取出最后一个数
        int last = b[len - 1];
        len--;

        // 将原问题化简，缩小规模递归求解
        int part1 = myPow(a, last);
        int part2 = myPow(superPow(a, b, len), 10);

        // 合并出结果
        return (part1 * part2) % base;
    }
}
// @lc code=end
