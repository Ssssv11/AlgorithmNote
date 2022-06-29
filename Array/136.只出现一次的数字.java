package Array;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
/*
 * 与217题类比，同样可以通过哈希表找重复的元素
 * 当存入相同元素时将该元素删除，到最后哈希表中只剩下只出现一次的数字
 */
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) {
            if(!set.add(x)){
                set.remove(x);
            }
        }
        return set.iterator().next();
    }
}

/*
 * 一个数和它本身做异或运算结果为 0，
 * 即 a ^ a = 0；一个数和0做异或运算的结果为它本身，即 a ^ 0 = a。
 * 只需要把所有数字进行异或，成对的数字就会变成0
 * 落单的数字和0做异或还是它本身
 * 所以最后异或的结果就是只出现一次的元素。
 */
// class Solution {
//     public int singleNumber(int[] nums) {
//         int res = 0;
//         for (int n : nums) {
//             res ^= n;
//         }
//         return res;
//     }
// }
// @lc code=end

