package Array;

/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start

/*
 * 先去字符串中的标点和空
 * 再利用左右指针判断相对应位置处字符是否相同
 */
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        int left = 0, right = sb.length() - 1;
        while(left < right) {
            if(sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
 * 利用 reverse 判断
 */
// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuffer sgood = new StringBuffer();
//         int length = s.length();
//         for (int i = 0; i < length; i++) {
//             char ch = s.charAt(i);
//             if (Character.isLetterOrDigit(ch)) {
//                 sgood.append(Character.toLowerCase(ch));
//             }
//         }
//         StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
//         return sgood.toString().equals(sgood_rev.toString());
//     }
// }
// @lc code=end

