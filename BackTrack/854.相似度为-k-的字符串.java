package BackTrack;
/*
 * @lc app=leetcode.cn id=854 lang=java
 *
 * [854] 相似度为 K 的字符串
 */

// @lc code=start
class Solution {
    private int res = Integer.MAX_VALUE;

    public int kSimilarity(String s1, String s2) {
        return execute(s1.toCharArray(), s2.toCharArray(), 0, 0);
    }

    private int execute(char[] sc1, char[] sc2, int start, int current) {
        if(current >= res) {
            return res;
        }
        if(start == sc1.length - 1) {
            return res = Math.min(res, current);
        }

        for (int i = 0; i < sc1.length; i++) {
            if(sc1[i] != sc2[i]) {
                for(int j = i + 1; j < sc2.length; j++) {
                    if(sc2[j] == sc1[i] && sc2[j] != sc1[j]) {
                        swap(sc2, i, j);
                        execute(sc1, sc2, i + 1, current + 1);
                        swap(sc2, i ,j);
                        if(sc2[i] == sc1[j]) {
                            break;
                        }
                    }
                }
                return res;
            }
        }
        return res = Math.min(res, current);
    }

    private void swap(char[] sc, int i, int j) {
        char temp = sc[i];
        sc[i] = sc[j];
        sc[j] = temp;
    }
}
// @lc code=end

