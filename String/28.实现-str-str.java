package String;
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start

/*
 * 枚举原串 ss 中的每个字符作为「发起点」，每次从原串的「发起点」和匹配串的「首位」开始尝试匹配：
 * 匹配成功：返回本次匹配的原串「发起点」。
 * 匹配失败：枚举原串的下一个「发起点」，重新尝试匹配。
 */
class Solution {
    // public int strStr(String haystack, String needle) {
    //     // 调用 api 直接返回
    //     // return haystack.indexOf(needle);
    //     int m = haystack.length(), n = needle.length();
    //     char[] hay = haystack.toCharArray(), ne = needle.toCharArray();
    //     // 枚举原串的「发起点」
    //     for (int i = 0; i <= m - n; i++) {
    //         // 从原串的「发起点」和匹配串的「首位」开始，尝试匹配
    //         int a = i, b = 0;
    //         while(b < n && hay[a] == ne[b]) {
    //             a++;
    //             b++;
    //         }
    //         // 如果能够完全匹配，返回原串的「发起点」下标
    //         if(b == n) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    
    public int strStr(String haystack, String needle) {
        KMP kmp = new KMP(needle);
        return kmp.search(haystack);
    }
}

class KMP {
    private int[][] dp;
    private String pat;

    public KMP(String pat) {
        this.pat = pat;
        int M = pat.length();
        // dp[状态][字符] = 下个状态
        dp = new int[M][256];
        // base case
        dp[0][pat.charAt(0)] = 1;
        // 影子状态 X 初始为 0
        int X = 0;
        // 构建状态转移图
        for (int j = 1; j < M; j++) {
            for (int c = 0; c < 256; c++)
                dp[j][c] = dp[X][c];
            dp[j][pat.charAt(j)] = j + 1;
            // 更新影子状态
            X = dp[X][pat.charAt(j)];
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        // pat 的初始态为 0
        int j = 0;
        for (int i = 0; i < N; i++) {
            // 计算 pat 的下一个状态
            j = dp[j][txt.charAt(i)];
            // 到达终止态，返回结果
            if (j == M) return i - M + 1;
        }
        // 没到达终止态，匹配失败
        return -1;
    }
}

// @lc code=end

