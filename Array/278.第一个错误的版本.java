/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
 * 注意到一个性质：
 * 当一个版本为正确版本，则该版本之前的所有版本均为正确版本；
 * 当一个版本为错误版本，则该版本之后的所有版本均为错误版本。
 * 可以利用这个性质进行二分查找。
 */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                // 答案在区间 [left, mid] 中
                right = mid;
            } else {
                // 答案在区间 [mid+1, right] 中
                left = mid + 1;
            }
        }
        return left;
    }
}
// @lc code=end

