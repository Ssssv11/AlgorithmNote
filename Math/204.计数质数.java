package Math;
/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

import java.util.Arrays;

// @lc code=start

/*
 * 暴力枚举，超时
 */
// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if(isPrime(i)) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     private boolean isPrime(int x) {
//         for (int i = 2; i * i <= x; i++) {
//             if(x % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

/*
 * 埃氏筛
 * 1. 先初始化一个数组，全部为质数
 * 2. 从 2 开始，将所有质数的 x 倍标记为合数
 * 3. 用乘法因子的对称性优化外层 for 循环
 */
class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < isPrime.length; i++) {
            count += isPrime[i] ? 1 : 0;
        }
        return count;
    }
}
// @lc code=end

