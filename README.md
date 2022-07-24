# 前言

算法学习的记录，LeetCode 刷题中...

感谢 [Labuladong](https://github.com/labuladong/fucking-algorithm) 、[Carl](https://github.com/youngyangyang04/leetcode-master) 等大佬免费的学习资料

Github: https://github.com/Ssssv11/AlgorithmNote

Gitee : https://gitee.com/Ssssv11/AlgorithmNote

Blog : https://ssssv11.github.io/2022/07/06/算法/

</br>

# 目录

- [前言](#前言)
- [数组](#数组)
  - [前缀和、前缀积](#前缀和前缀积)
  - [差分数组](#差分数组)
  - [双指针](#双指针)
    - [快慢指针](#快慢指针)
    - [左右指针](#左右指针)
  - [二维数组的遍历问题](#二维数组的遍历问题)
  - [滑动窗口](#滑动窗口)
  - [二分查找](#二分查找)
    - [查找一个数](#查找一个数)
    - [寻找边界的二分搜索](#寻找边界的二分搜索)
    - [二分查找问题的泛化](#二分查找问题的泛化)
- [链表](#链表)
  - [双指针](#双指针-1)
    - [合并、分解链表](#合并分解链表)
    - [单链表的倒数第 k 个节点](#单链表的倒数第-k-个节点)
    - [单链表的中点](#单链表的中点)
    - [判断链表是否包含环](#判断链表是否包含环)
    - [两个链表是否相交](#两个链表是否相交)
    - [反转链表](#反转链表)
    - [回文链表](#回文链表)
- [字符串](#字符串)
- [二叉树](#二叉树)
  - [纲领](#纲领)
  - [思路](#思路)
  - [构造二叉树](#构造二叉树)
  - [序列化与反序列化](#序列化与反序列化)
  - [归并排序](#归并排序)
  - [二叉搜索树](#二叉搜索树)
    - [特性](#特性)
    - [基础操作](#基础操作)
    - [构造](#构造)
  - [快速排序](#快速排序)
  - [最近公共祖先](#最近公共祖先)
    - [寻找一个元素](#寻找一个元素)
    - [二叉树的最近公共祖先](#二叉树的最近公共祖先)
  - [完全二叉树的节点数](#完全二叉树的节点数)
- [回溯算法](#回溯算法)
  - [回溯算法核心框架](#回溯算法核心框架)
    - [全排列问题](#全排列问题)
    - [N 皇后问题](#n-皇后问题)
  - [解决排列/组合/子集问题](#解决排列组合子集问题)
    - [子集（元素无重不可复选）](#子集元素无重不可复选)
    - [组合（元素无重不可复选）](#组合元素无重不可复选)
    - [排列（元素无重不可复选）](#排列元素无重不可复选)
    - [子集/组合（元素可重不可复选）](#子集组合元素可重不可复选)
    - [排列（元素可重不可复选）](#排列元素可重不可复选)
    - [子集/组合（元素无重可复选）](#子集组合元素无重可复选)
    - [排列（元素无重可复选）](#排列元素无重可复选)
- [图](#图)
  - [图的逻辑结构和具体实现](#图的逻辑结构和具体实现)
  - [图的遍历](#图的遍历)
  - [拓扑排序](#拓扑排序)
    - [环检测算法(DFS)](#环检测算法dfs)
    - [拓扑排序算法(DFS)](#拓扑排序算法dfs)
    - [环检测算法(BFS)](#环检测算法bfs)
    - [拓扑排序(BFS)](#拓扑排序bfs)
  - [二分图判定](#二分图判定)
    - [二分图简介](#二分图简介)
    - [二分图判定思路](#二分图判定思路)
  - [并查集(UNION-FIND)算法](#并查集union-find算法)
    - [基本思路](#基本思路)
    - [平衡性优化](#平衡性优化)
    - [路径压缩](#路径压缩)
  - [Kruskal 最小生成树算法](#kruskal-最小生成树算法)
    - [最小生成树](#最小生成树)
    - [Union-Find 并查集算法](#union-find-并查集算法)
    - [Kruskal 算法](#kruskal-算法)
  - [Prim 最小生成树算法](#prim-最小生成树算法)
    - [对比 Kruskal 算法](#对比-kruskal-算法)
    - [切分定理](#切分定理)
    - [Prim 算法实现](#prim-算法实现)
  - [BFS 算法](#bfs-算法)
  - [Dijkstra 算法](#dijkstra-算法)
    - [图的抽象](#图的抽象)
    - [二叉树层级遍历和 BFS 算法](#二叉树层级遍历和-bfs-算法)
    - [Dijkstra 算法框架](#dijkstra-算法框架)
- [数据结构](#数据结构)
  - [LRU 算法](#lru-算法)
  - [LFU 算法](#lfu-算法)
  - [设计朋友圈时间线](#设计朋友圈时间线)
  - [前缀树算法](#前缀树算法)
    - [Trie 树原理](#trie-树原理)
    - [TrieMap/TrieSet API 实现](#triemaptrieset-api-实现)
  - [单调栈结构](#单调栈结构)
    - [单调栈模版](#单调栈模版)
    - [处理环形数组](#处理环形数组)
  - [单调队列](#单调队列)
    - [搭建解题框架](#搭建解题框架)
    - [实现单调队列数据结构](#实现单调队列数据结构)
    - [单调队列的通用实现](#单调队列的通用实现)
  - [二叉堆实现优先级队列](#二叉堆实现优先级队列)
    - [优先级队列](#优先级队列)
    - [实现 swim 和 sink](#实现-swim-和-sink)
    - [实现 delMax 和 insert](#实现-delmax-和-insert)
  - [队列实现栈及栈实现队列](#队列实现栈及栈实现队列)
    - [用栈实现队列](#用栈实现队列)
    - [用队列实现栈](#用队列实现栈)

</br>

# 数组

## 前缀和、前缀积

**前缀和技巧适用于快速、频繁地计算一个索引区间内的元素之和，它不会修改原始数组。**
核⼼思路是创建⼀个数组 `preSum`， `preSum[i]` 记录 `nums[0..i-1]` 的累加和(`preSum[0] = 0`)。若需要计算某个索引区间 `[i, j]` 内的元素之和，只需要计算 `preSum[j+1] - preSum[i]` 的值即可。

</br>

- [303.区域和检索-数组不可变](Array/303.区域和检索-数组不可变.java) &emsp;[🔗](https://leetcode.cn/problems/range-sum-query-immutable/)
- [304.二维区域和检索-矩阵不可变](Array/304.二维区域和检索-矩阵不可变.java) &emsp;[🔗](https://leetcode.cn/problems/range-sum-query-2d-immutable/)

> 具体解释见代码内注释

这两道基础题分别从一维和二维层面运用前缀和来解决问题。主要需要弄清楚该计算从哪儿到哪儿的和以及其中任意索引区间内的元素之和该如何表示。
若使用前缀和(积)方法且前缀和(积)数组为了方便计算而将首位置为0(或1)，则需要时刻注意其起始索引为 1。

</br>

- [238.除自身以外数组的乘积](Array/238.除自身以外数组的乘积.java) &emsp;[🔗](https://leetcode.cn/problems/product-of-array-except-self/)
- [1352.最后-k-个数的乘积](Array/1352.最后-k-个数的乘积.java) &emsp;[🔗](https://leetcode.cn/problems/product-of-the-last-k-numbers/)

与前缀和思想相似，这两道求积的问题也可以通过先求前缀积再根据具体情况考虑特殊之处。如 [#238](Array/238.除自身以外数组的乘积.java) 可以使用 *前缀积+后缀积* 的方式来实现不使用除法解答；[#1352](Array/1352.最后-k-个数的乘积.java) 需要在插入 0 后清空当前前缀积重新开始计算。

</br>

## 差分数组

**差分数组的主要适⽤场景是频繁对原始数组的某个区间的元素进⾏增减。**
若需要对数组 `nums[i..j]` 全部加 1，再给 `nums[k..l]` 全部减 2 等等一系列增减操作，最后返回增减后的数组。常规思路就是使用 for 循环对指定区间内的元素进行加减，但这样对 `nums` 的修改非常频繁且效率低下，时间复杂度为 `O(N)`。
使用差分数组与前缀和构造的 `preSum` 数组相似，可以为 `nums` 数组构造⼀个差分数组 `diff`， `diff[i]` 就是 `nums[i]` 和 `nums[i-1]` 的差：
```java
// nums[] = {5, 7, 9, 2, 3}
// diff[] = {5, 2, 2, -7, 1}
int[] diff = new int[nums.length];
// 构造差分数组
diff[0] = nums[0];
for (int i = 1; i < nums.length; i++) {
    diff[i] = nums[i] - nums[i - 1];
}
```
这样，如果需要通过 `diff` 数组构造结果数组 `nums`，只需要:
```java
int[] res = new int[diff.length];
// 根据差分数组构造结果数组
res[0] = diff[0];
for (int i = 1; i < diff.length; i++) {
    res[i] = res[i - 1] + diff[i];
}
```
通过构造差分数组 `diff` 就可以快速地对指定区间内的元素进行增减操作。如果需要将区间 `nums[i..j]` 内的元素全部加 2，那么只需要让 `diff[i] += 2`，然后再让 `diff[j+1] -= 2` 即可。
```java
// nums[] = {5, 7, 9, 2, 3}
// diff[] = {5, 4, 2, -7, -1}
                i      j
// res[] = {5, 9, 11, 4, 3}
```
这是因为 `diff[i] += 2` 后就相当于为 `nums[i..]` 的所有元素都进行了加 2 操作，`diff[j+1] -= 2` 就相当于为 `nums[j+1..]` 的所有元素进行了减 2 操作，因此这样就相当于只对区间 `nums[i..j]` 进行了加 2 操作。
只需要花费 `O(1)` 的时间修改 `diff` 数组，就给 `nums` 的整个区间做了修改。多次修改 `diff` 后再通过计算就可以得到 `nums` 修改后的结果。

---
考虑到差分数组代码的复用性，可以将其抽象为一个类：
```java
class Diff {
    private int[] diff;

    /**
     * create the diff array
     * @param nums
     */
    public Diff(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    /**
     * 
     * @param i
     * @param j
     * @param val
     */
    public void calc(int i, int j, int val) {
        diff[i] += val;
        // 若 j+1 < diff.length 则表示修改是从 i 到最后
        if(j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    /**
     * 
     * @return the result of the origin array by diff[]
     */
    public int[] result() {
        int res[] = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
```

</br>

- [370.区间加法](Array/370.区间加法.java) &emsp;[🔗](https://leetcode.cn/problems/range-addition/)

- [1109.航班预订统计](Array/1109.航班预订统计.java) &emsp;[🔗](https://leetcode.cn/problems/corporate-flight-bookings/)

- [1094.拼车](Array/1094.拼车.java) &emsp;[🔗](https://leetcode.cn/problems/car-pooling/)

这三道题都是典型的需要使用差分数组进行解答的题目，可以抽象出一个 `Diff` 差分数组工具类来提升代码的复用性。需要注意在初始化 `nums[]` 时其长度的选择：进行增减操作次数的最大值。

</br>

## 双指针

**双指针技巧主要分为两类：左右指针和快慢指针。**
- 左右指针：两个指针相向而行或者相背而行，一左一右。
- 快慢指针：两个指针同向而行，一快一慢。

在数组中并没有真正意义上的指针，但可以把索引当做数组中的指针，这样也可以在数组中施展双指针技巧。

### 快慢指针

**快慢指针常用在数组问题中要求原地修改数组。**

原地修改即不允许 `new` 新数组，只能在原数组上操作，返回一个长度，通过返回的长度和原始数组得到结果。
快慢指针通过慢指针指向需要修改的元素，快指针遍历数组，当快指针找到符合条件的元素时，将慢指针指向的元素修改为新值，然后慢指针向后移动一位，快指针向后移动一位，继续遍历。

- [26.删除有序数组中的重复项](Array/26.删除有序数组中的重复项.java) &emsp;[🔗](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
  
- [27.移除元素](Array/27.移除元素.java) &emsp;[🔗](https://leetcode.cn/problems/remove-element/)
  
- [283.移动零](Array/283.移动零.java) &emsp;[🔗](https://leetcode.cn/problems/move-zeroes/)

这三道题非常相似，都使用快慢指针来实现原地修改。

</br>

### 左右指针

**左右指针常用在有序数组和字符串问题中。**

- [5.最长回文子串](Array/5.最长回文子串.java) &emsp;[🔗](https://leetcode.cn/problems/longest-palindromic-substring/)
  
- [125.验证回文串](Array/125.验证回文串.java) &emsp;[🔗](https://leetcode.cn/problems/valid-palindrome/)
  
- [167.两数之和 II - 输入有序数组](Array/167.两数之和-ii-输入有序数组.java) &emsp;[🔗](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/)
  
- [344.反转字符串](Array/344.反转字符串.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-string/)

左右指针比较简单，根据题意进行相应操作即可。在二分查找中也有体现左右指针的特性。

</br>

## 二维数组的遍历问题

- [48.旋转图像](Array/48.旋转图像.java) &emsp;[🔗](https://leetcode.cn/problems/rotate-image/)
  
- [54.螺旋矩阵](Array/54.螺旋矩阵.java) &emsp;[🔗](https://leetcode.cn/problems/spiral-matrix/)
  
- [59.螺旋矩阵 II](Array/59.螺旋矩阵-ii.java) &emsp;[🔗](https://leetcode.cn/problems/spiral-matrix-ii/)

对于矩阵的各种遍历需要多归纳总结规律，如矩阵的逆时针旋转可以按副对角线进行镜像对称，这与 [#48](Array/48.旋转图像.java) 题相反。

</br>

## 滑动窗口

**滑动窗口常用于解决子串问题。**

滑动窗口也是利用双指针来实现的，一个用于延伸现有窗口的 `right` 指针，和一个用于收缩窗口的 `left` 指针。在任意时刻，只有一个指针运动，而另一个保持静止。

---
对于解决滑动窗口问题的代码框架：

```java
void String slidingWindow(String s) {
    HashMap<Character, Integer> window = new HashMap<>();
    
    // 左右指针
    int left = 0, right = 0;

    while(right < s.length()) {
        // 移入窗口的字符
        char ch = s.charAt(right);
        // 扩大窗口
        right++;
        // 数据操作
        ...

        // debug 输出
        System.out.println(window);

        // 判断左窗口是否需要收缩
        while(window needs shrink) {
            // 移出窗口的字符
            char c = s.charAt(left);
            // 收缩窗口
            left++;
            // 数据操作
            ...
        }
    }
}
```

其中两处 `...` 表示的更新窗口数据的地方

</br>

- [76.最小覆盖子串](Array/76.最小覆盖子串.java) &emsp;[🔗](https://leetcode.cn/problems/minimum-window-substring/)

- [438.找到字符串中所有字母异位词](Array/438.找到字符串中所有字母异位词.java) &emsp;[🔗](https://leetcode.cn/problems/find-all-anagrams-in-a-string/)

- [567.字符串的排列](Array/567.字符串的排列.java) &emsp;[🔗](https://leetcode.cn/problems/permutation-in-string/)

通过滑动窗口的代码框架可以很容易地写出这三题，思路都基本相似。主要需要考虑三个问题：
1. 什么时候应该扩大窗口？
   
2. 什么时候应该缩小窗口？
   
3. 什么时候得到一个合法的答案？

</br>

## 二分查找

二分查找也称折半查找（Binary Search），它是一种效率较高的查找方法。但是，折半查找要求线性表必须采用顺序存储结构，而且表中元素按关键字有序排列。

---
二分查找代码框架（**在有序数组中搜索指定元素**）：
```java
int binarySearch(int[] nums, int target) {
    int left = 0, right = ...;
    while(...) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            ...
        } else if(nums[mid] < target) {
            left = ...
        } else {
            right = ...
        }
    }
    return ...;
}
```

- [278.第一个错误的版本](Array/278.第一个错误的版本.java) &emsp;[🔗](https://leetcode.cn/problems/first-bad-version/)

分析二分查找的一个技巧是：不要出现 `else`，而是把所有情况用 `else if` 写清楚，这样可以清楚地展现所有细节。

其中 `...` 标记的部分，就是可能出现细节问题的地方，当见到一个二分查找的代码时，首先注意这几个地方。

**计算 `mid` 时需要防止溢出，代码中 `left + (right - left) / 2` 与 `(left + right) / 2` 等价，但是有效防止了 `left` 和 `right` 太大，直接相加导致溢出的情况。**

<br>

### 查找一个数

二分查找最普通的用法，即搜索一个数，如果存在，返回其索引，否则返回 -1。

- [704.二分查找](Array/704.二分查找.java) &emsp;[🔗](https://leetcode.cn/problems/binary-search/)

代码中的细节：

1. 为什么 while 循环的条件中是 <=，而不是 < ？

因为初始化 `right` 时赋值为 `nums.length - 1`，即最后一个元素的索引，而不是 `nums.length`。

这二者可能出现在不同功能的二分查找中，区别是：前者相当于两端都闭区间 `[left, right]`，后者相当于左闭右开区间 [`left, right)`（索引大小为 `nums.length` 越界）。

这里使用的是前者 `[left, right]` 闭区间。这个区间就是每次进行搜索的区间。

而 `while(left <= right)` 的终止条件是 `left == right + 1`，即 `[right + 1, right]`，这时区间为空。所以 while 循环终止是正确的，直接返回 -1。

`while(left < right)` 的终止条件是 `left == right`，即 `[right, right]`，区间中还有 `right`，但此时 while 循环终止了。也就是说此时区间中索引 `right` 没有被搜索，如果这时候直接返回 -1 就是错误的。

若需使用 `while(left < right)`，也可以在返回时再次搜索 `right` 处值：

```java
...
while(left < right) {
  ...
}
return nums[left] == target ? left : -1;
```

2. 为什么 `left = mid + 1`，`right = mid - 1` ？

当查到 `mid > target` 时，说明 `target` 在 `mid` 右边，所以 `left = mid + 1`，即搜索右半部分。同理，当查到 `mid < target` 时，说明 `target` 在 `mid` 左边，所以 `right = mid - 1`，即搜索左半部分。

3. 此算法的缺陷 ？

如有序数组 `nums = [1,2,2,2,3]`，`target` 为 2，此算法返回的索引为 2。但如果想得到 `target` 的左侧边界，即索引 1，或者 `target` 的右侧边界，即索引 3 的话此算法是无法处理的。

但是如果当找到一个 `target`，然后向左或向右线性搜索又难以保证二分查找对数级的复杂度。

</br>

### 寻找边界的二分搜索

对普通二分查找算法稍加改动就可以实现寻找边界的二分查找。重点是在查找到 `target` 时并不马上返回，而是继续缩小范围继续查找左边或右边是否还有 `target。`

- [34.在排序数组中查找元素的第一个和最后一个位置](Array/34.在排序数组中查找元素的第一个和最后一个位置.java) &emsp;[🔗](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/)

**二分思维的精髓就是：通过已知信息尽可能多地收缩（折半）搜索空间，从而增加穷举效率，快速找到目标。**

</br>

### 二分查找问题的泛化

什么问题可以运用二分搜索算法技巧？

首先要从题目中抽象出一个自变量 `x`，一个关于 `x` 的函数 `f(x)`，以及一个目标值 `target`。

同时，`x`, `f(x)`, `target` 还要满足以下条件：

1. `f(x)` 必须是在 `x` 上的单调函数。

2. 题目要求计算满足约束条件 `f(x) == target` 时的 `x` 的值。

---
二分查找代码框架：
```java
// 函数 f 是关于自变量 x 的单调函数
int f(int x) {
    // ...
}

// 主函数，在 f(x) == target 的约束下求 x 的最值
int solution(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = ...;
    int right = ... + 1;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (f(mid) == target) {
            ...
        } else if (f(mid) < target) {
            ...
        } else if (f(mid) > target) {
            ...
        }
    }
    return left;
}
```

其中 `...` 根据具体业务编写代码。

- [875.爱吃香蕉的珂珂](Array/875.爱吃香蕉的珂珂.java) &emsp;[🔗](https://leetcode.cn/problems/koko-eating-bananas/)

- [410.分割数组的最大值](Array/410.分割数组的最大值.java) &emsp;[🔗](https://leetcode.cn/problems/split-array-largest-sum/)

- [1011.在D天内送达包裹的能力](Array/1011.在D天内送达包裹的能力.java) &emsp;[🔗](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/)

最重要的是从题目中抽象出满足使用二分查找的自变量 `x`，以及关于 `x` 的函数 `f(x)`，以及目标值 `target`。其次是考虑如何编写 `f(x)` 以满足题目需求。

</br>

# 链表

## 双指针

### 合并、分解链表

- [21.合并两个有序链表](LinkedList/21.合并两个有序链表.java) &emsp;[🔗](https://leetcode.cn/problems/merge-two-sorted-lists/)

- [23.合并k个升序链表](LinkedList/23.合并k个升序链表.java) &emsp;[🔗](https://leetcode.cn/problems/merge-k-sorted-lists/)

主要是要弄清楚如何找到最小的节点，合并两个有序链表时可以使用双指针来对比哪个更小，合并 k 个时使用优先队列来让更小的节点先出队。

另外，代码中还用到一个链表的算法题中是很常见的**虚拟头结点技巧**，也就是 `dummy` 节点。如果不使用 `dummy` 虚拟节点，代码会复杂很多，而有了 `dummy` 节点这个占位符，可以避免处理空指针的情况，降低代码的复杂性。

- [86.分隔链表](LinkedList/86.分隔链表.java) &emsp;[🔗](https://leetcode.cn/problems/partition-list/)

</br>

### 单链表的倒数第 k 个节点

- [19.删除链表的倒数第n个结点](LinkedList/19.删除链表的倒数第-n-个结点.java) &emsp;[🔗](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/)

如何找到链表的倒数第 `k` 个节点是本题的重点，一般可以先遍历一次计算出链表的长度，第二次遍历删除第 `n - k` 个节点即可。但这样需要遍历两次链表。若使用两个指针 `p1`、`p2`，先让 `p1` 前进 `k` 步，再让 `p2` 与 `p1` 一起前进，那么当 `p1` 到达链表末端时 `p2` 所处的位置就是第 `n - k` 个节点处，即倒数第 `k` 个节点处。这样只需要一次遍历就能找到倒数第 `k` 个节点了。

<br>

### 单链表的中点

- [876.链表的中间结点](LinkedList/876.链表的中间结点.java) &emsp;[🔗](https://leetcode.cn/problems/middle-of-the-linked-list/)

常规方法是先遍历链表得到 `n`，再遍历一次得到 `n / 2` 个节点。如果想一次遍历得到中间节点，可以使用`快慢指针`。让两个指针 `slow` 和 `fast` 同时从 `head` 出发，每当慢指针 `slow` 前进一步，快指针 `fast` 就前进两步。这样，当 `fast` 到达链表末尾时，`slow` 刚好指向了链表的中点。

<br>

### 判断链表是否包含环

- [141.环形链表](LinkedList/141.环形链表.java) &emsp;[🔗](https://leetcode.cn/problems/linked-list-cycle/)

- [142.环形链表 II](LinkedList/142.环形链表-II.java) &emsp;[🔗](https://leetcode.cn/problems/linked-list-cycle-ii/)

判断链表是否有环的问题也需要使用到寻找链表中点的思想。每当慢指针 `slow` 前进一步，快指针 `fast` 就前进两步，如果 `fast` 最终为 `null`，说明链表中没有环；如果最终 `fast` 和 `slow` 相遇，说明链表中有环。

若需要计算环的起点，可以在当快慢指针相遇时，让其中任一个指针指向头节点，然后让它们以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。

> 假设指针相遇时，慢指针 `slow` 走了 `k` 步，那么快指针 `fast` 一定走了 `2k` 步。`fast` 一定比 `slow` 多走了 `k` 步，这多走的 `k` 步就是 `fast` 指针在环里转圈，所以 `k` 的值就是环长度的「整数倍」。
> 假设相遇点距环起点的距离为 `m`，那么环起点距头结点 `head` 的距离为 `k - m`，也就是说如果从 `head` 前进 `k - m` 步就能到达环起点。
> 如果从相遇点继续前进 `k - m` 步，也恰好到达环起点。因为 `fast` 指针从相遇点开始走 `k` 步可以转回到相遇点，那走 `k - m` 步肯定就走到环起点了。
> 所以，只要把快慢指针中的任一个重新指向 `head`，然后两个指针同速前进，`k - m` 步后一定会相遇，相遇之处就是环的起点了。

</br>

### 两个链表是否相交

- [160.相交链表](LinkedList/160.相交链表.java) &emsp;[🔗](https://leetcode.cn/problems/intersection-of-two-linked-lists/)

这个题直接的想法可能是用 `HashSet` 记录一个链表的所有节点，然后和另一条链表对比，但这就需要额外的空间。

若不使用额外空间而使用双指针 `p1`、`p2`，主要需要解决它们分别在两条链表上前进而不能同时走到公共节点，也就无法得到相交节点的问题，即如何让 `p1` 和 `p2` 两个指针能够同时到达相交节点。
因此可以让 `p1`、`p2` 遍历完当前链表后继续遍历对方的链表。这样就相当于两条链表在逻辑上连接在了一起，`p1`、`p2` 就可以同时进入相交节点。

---
另外，也可以使两个指针到达尾部的距离相同来保证两个指针能够同时到达相交节点：
```java
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = 0, lenB = 0;
    // 计算两条链表的长度
    for (ListNode p1 = headA; p1 != null; p1 = p1.next) {
        lenA++;
    }
    for (ListNode p2 = headB; p2 != null; p2 = p2.next) {
        lenB++;
    }
    // 让 p1 和 p2 到达尾部的距离相同
    ListNode p1 = headA, p2 = headB;
    if (lenA > lenB) {
        for (int i = 0; i < lenA - lenB; i++) {
            p1 = p1.next;
        }
    } else {
        for (int i = 0; i < lenB - lenA; i++) {
            p2 = p2.next;
        }
    }
    // 看两个指针是否会相同，p1 == p2 时有两种情况：
    // 1. 两条链表不相交，同时走到尾部空指针
    // 2. 两条链表相交，走到两条链表的相交点
    while (p1 != p2) {
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1;
}
```
</br>

### 反转链表

1. 递归反转整个链表

- [206.反转链表](LinkedList/206.反转链表.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-linked-list/)

反转单链表的迭代实现非常简单，而递归实现：

```java
// 定义：输入一个单链表头结点，将该链表反转，返回新的头结点
ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode last = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return last;
}
```

 首先 `reverse(head.next)` 执行完成后，整个链表除了头节点，其他节点都进行了反转且尾节点指向了 `null`，剩下只需要将尾节点指向头节点，头节点指向 `null` 即可。

 <br>

 2. 反转链表的前 N 个节点

若要实现如下函数：
```java
// 将链表的前 n 个节点反转（n <= 链表长度）
ListNode reverseN(ListNode head, int n)
```

解决思路和反转整个链表差不多：
```java
ListNode successor = null; // 后驱节点

// 反转以 head 为起点的 n 个节点，返回新的头结点
ListNode reverseN(ListNode head, int n) {
    if (n == 1) {
        // 记录第 n + 1 个节点
        successor = head.next;
        return head;
    }
    // 以 head.next 为起点，需要反转前 n - 1 个节点
    ListNode last = reverseN(head.next, n - 1);

    head.next.next = head;
    // 让反转之后的 head 节点和后面的节点连起来
    head.next = successor;
    return last;
}
```

刚才直接把 `head.next` 设置为 `null`，因为整个链表反转后原来的 `head` 变成了整个链表的最后一个节点。但现在 `head` 节点在递归反转之后不一定是最后一个节点了，所以要记录后驱 `successor`（第 n + 1 个节点），反转之后将 `head` 连接上。

</br>

3. 反转链表的一部分

给一个索引区间 `[m, n]`（索引从 1 开始），仅仅反转区间中的链表元素：

```java
ListNode reverseBetween(ListNode head, int m, int n)
```

如果 `m == 1`，就相当于反转链表开头的 n 个元素：

```java
ListNode reverseBetween(ListNode head, int m, int n) {
    // base case
    if (m == 1) {
        // 相当于反转前 n 个元素
        return reverseN(head, n);
    }
    // ...
}
```

如果 `m != 1`：

```java
ListNode reverseBetween(ListNode head, int m, int n) {
    // base case
    if (m == 1) {
        return reverseN(head, n);
    }
    // 前进到反转的起点触发 base case
    head.next = reverseBetween(head.next, m - 1, n - 1);
    return head;
}
```

- [92.反转链表 II](LinkedList/92.反转链表-ii.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-linked-list-ii/)

虽然迭代实现的时间复杂度与递归实现的时间复杂度相同，且递归实现的空间复杂度更高，但递归的思想很值得学习。

</br>

4. K 个一组反转链表

- [25.K 个一组反转链表](LinkedList/25.k-个一组翻转链表.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-nodes-in-k-group/)

由于对链表每次都进行 K 个一组的反转后，剩下的节点同样是一条链表，且规模较原链表小，因此递归同样适用于这个问题。先反转以 `head` 为头节点的 K 个节点，之后将第 `K + 1` 个节点作为 `head` 继续递归反转再将结果拼接即可。

迭代地反转一个区间内的节点：首先若反转整个链表：

```java
// 反转以 a 为头结点的链表
ListNode reverse(ListNode a) {
    ListNode pre, cur, nxt;
    pre = null; cur = a; nxt = a;
    while (cur != null) {
        nxt = cur.next;
        // 逐个结点反转
        cur.next = pre;
        // 更新指针位置
        pre = cur;
        cur = nxt;
    }
    // 返回反转后的头结点
    return pre;
}
```

反转以 a 为头结点的链表其实就是反转 a 到 `null` 之间的结点，同理，反转 a 到 b 之间的结点只需要：

```java
while (cur != b) {
        nxt = cur.next;
        cur.next = pre;
        pre = cur;
        cur = nxt;
    }
```

对于 `reverseKGroup` ：

```java
ListNode reverseKGroup(ListNode head, int k) {
    if (head == null) return null;
    // 区间 [a, b) 包含 k 个待反转元素
    ListNode a, b;
    a = b = head;
    for (int i = 0; i < k; i++) {
        // 不足 k 个，不需要反转，base case
        if (b == null) return head;
        b = b.next;
    }
    // 反转前 k 个元素
    ListNode newHead = reverse(a, b);
    // 递归反转后续链表并连接起来
    a.next = reverseKGroup(b, k);
    return newHead;
}
```

</br>

### 回文链表

- [234.回文链表](LinkedList/234.回文链表.java) &emsp;[🔗](https://leetcode.cn/problems/palindrome-linked-list/)

与二叉树遍历相似，链表也可以用递归的方式遍历，这里使用后序遍历就可以倒叙遍历链表，再与从头节点开始遍历比较是否相同：

```java
// 左侧指针
ListNode left;

boolean isPalindrome(ListNode head) {
    left = head;
    return traverse(head);
}

boolean traverse(ListNode right) {
    if (right == null) return true;
    boolean res = traverse(right.next);
    // 后序遍历代码
    res = res && (right.val == left.val);
    left = left.next;
    return res;
}
```

这样做的核心逻辑就是把链表节点放入一个栈，然后再拿出来，这时候元素顺序就是反的。

但是这样的空间复杂度为 `O(N)`。若要不使用额外空间，可以先通过双指针中的快慢指针找到链表的中点，再从 `slow` 开始反转后面的链表，然后进行比较。

需要注意的是，若链表长度为奇数即 `fast` 指针没有指向 `null`，`slow` 还需要再前进一步。且此方法需要修改原链表。

```java
boolean isPalindrome(ListNode head) {
    ListNode slow, fast;
    slow = fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    if (fast != null)
        slow = slow.next;
    
    ListNode left = head;
    ListNode right = reverse(slow);
    while (right != null) {
        if (left.val != right.val)
            return false;
        left = left.next;
        right = right.next;
    }
    
    return true;
}

ListNode reverse(ListNode head) {
    ListNode pre = null, cur = head;
    while (cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

</br>

# 字符串

- [7.整数反转](String/7.整数反转.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-integer/)

- [8.字符串转换整数](String/8.字符串转换整数-atoi.java) &emsp;[🔗](https://leetcode.cn/problems/string-to-integer-atoi/)

- [14.最长公共前缀](String/14.最长公共前缀.java) &emsp;[🔗](https://leetcode.cn/problems/longest-common-prefix/)

- [28.实现strStr()](String/28.实现-str-str.java) &emsp;[🔗](https://leetcode.cn/problems/implement-strstr/)

- [38.外观数列](String/38.外观数列.java) &emsp;[🔗](https://leetcode.cn/problems/count-and-say/)

- [242.有效的字母异位词](String/242.有效的字母异位词.java) &emsp;[🔗](https://leetcode.cn/problems/valid-anagram/)

- [344.反转字符串](Array/344.反转字符串.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-string/)

- [387.字符串中的第一个唯一字符](String/387.字符串中的第一个唯一字符.java) &emsp;[🔗](https://leetcode.cn/problems/first-unique-character-in-a-string/)

其中 [#242](String/242.有效的字母异位词.java) 和 [#387](String/387.字符串中的第一个唯一字符.java) 很相似，都是通过 Hash 映射比较异同，遇到这类题首先可以考虑使用 Hash。而 [#7](String/8.字符串转换整数-atoi.java) 与 [#8](String/8.字符串转换整数-atoi.java) 需要仔细考虑溢出问题。

</br>

# 二叉树

## 纲领

二叉树解题的思维模式分两类：

1. 是否可以通过遍历一遍二叉树得到答案？如果可以，用一个 `traverse` 函数配合外部变量来实现，这叫「遍历」的思维模式。

2. 是否可以定义一个递归函数，通过子问题（子树）的答案推导出原问题的答案？如果可以，写出这个递归函数的定义，并充分利用这个函数的返回值，这叫「分解问题」的思维模式。

无论使用哪种思维模式，都需要思考：

如果单独抽出一个二叉树节点，它需要做什么事情？需要在什么时候（前/中/后序位置）做？递归函数会在所有节点上执行相同的操作，因此只需考虑一个节点。

前序位置，就是刚进入一个节点（元素）的时候，后序位置就是即将离开一个节点（元素）的时候，把代码写在不同位置，代码执行的时机也不同。

**前中后序是遍历二叉树过程中处理每一个节点的三个特殊时间点**，绝不仅仅是三个顺序不同的 `List`。

**二叉树的所有问题，就是在前中后序位置注入巧妙的代码逻辑，去达到自己的目的。我们只需要单独思考每一个节点应该做什么，其他的交给二叉树遍历框架，递归会在所有节点上做相同的操作。**

- [101.对称二叉树](Tree/101.对称二叉树.java) &emsp;[🔗](https://leetcode.cn/problems/symmetric-tree/)

- [104.二叉树的最大深度](Tree/104.二叉树的最大深度.java) &emsp;[🔗](https://leetcode.cn/problems/maximum-depth-of-binary-tree/)

- [102.二叉树的层序遍历](Tree/102.二叉树的层序遍历.java) &emsp;[🔗](https://leetcode.cn/problems/binary-tree-level-order-traversal/)

如 [#104](Tree/104.二叉树的最大深度.java)，显然遍历一遍二叉树，用一个外部变量记录每个节点所在的深度，取最大值就可以得到最大深度，这就是遍历二叉树计算答案的思路。代码如下：

```java
class Solution {
    // 记录最大深度
    int depth = 0;
    // 记录遍历到的节点的深度
    int res = 0;

    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }
    // 遍历二叉树
    private void traverse(TreeNode root) {
        if(root == null) {
            return;
        }
        // 前序遍历位置
        depth++;
        // 遍历的过程中记录最大深度
        res = res < depth ? depth : res;
        traverse(root.left);
        traverse(root.right);
        // 后序遍历位置
        depth--;
    }
}
```

这个解法很好理解，但为什么需要在前序位置增加 `depth`，在后序位置减小 `depth`？

因为前序位置是进入一个节点的时候，后序位置是离开一个节点的时候，`depth` 记录当前递归到的节点深度，把 `traverse` 理解成在二叉树上游走的一个指针，所以当然要这样维护。

至于对 `res` 的更新放到前中后序位置都可以，只要保证在进入节点之后，离开节点之前（即 `depth` 自增之后，自减之前）就行了。

一棵二叉树的最大深度也可以通过子树的最大深度推导出来，这就是分解问题计算答案的思路。代码如下：

```java
// 定义：输入根节点，返回这棵二叉树的最大深度
int maxDepth(TreeNode root) {
	if (root == null) {
		return 0;
	}
	// 利用定义，计算左右子树的最大深度
	int leftMax = maxDepth(root.left);
	int rightMax = maxDepth(root.right);
	// 整棵树的最大深度等于左右子树的最大深度取最大值，
    // 然后再加上根节点自己
	int res = Math.max(leftMax, rightMax) + 1;

	return res;
}
```

只要明确递归函数的定义，这个解法也不难理解，但为什么主要的代码逻辑集中在后序位置？

因为这个思路正确的核心在于通过子树的最大深度推导出原树的深度首先需要利用递归函数的定义算出左右子树的最大深度，然后推出原树的最大深度，主要逻辑自然放在后序位置。

可以发现前序位置的代码执行是自顶向下的，而后序位置的代码执行是自底向上的。

因此，**前序位置的代码只能从函数参数中获取父节点传递来的数据，而后序位置的代码不仅可以获取参数数据，还可以获取到子树通过函数返回值传递回来的数据**。

举具体的例子，有一棵二叉树：

1. 如果把根节点看做第 1 层，如何打印出每一个节点所在的层数？

2. 如何打印出每个节点的左右子树各有多少节点？

第一个问题：

```java
// 二叉树遍历函数
void traverse(TreeNode root, int level) {
    if (root == null) {
        return;
    }
    // 前序位置
    printf("节点 %s 在第 %d 层", root, level);
    traverse(root.left, level + 1);
    traverse(root.right, level + 1);
}

// 调用
traverse(root, 1);
```

第二个问题：

```java
// 定义：输入一棵二叉树，返回这棵二叉树的节点总数
int count(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int leftCount = count(root.left);
    int rightCount = count(root.right);
    // 后序位置
    printf("节点 %s 的左子树有 %d 个节点，右子树有 %d 个节点",
            root, leftCount, rightCount);

    return leftCount + rightCount + 1;
}
```

这两个问题的根本区别在于：一个节点在第几层，从根节点遍历过来的过程就能顺带记录；而以一个节点为根的整棵子树有多少个节点，需要遍历完子树之后才能数清楚。

**一旦发现题目和子树有关，那大概率要给函数设置合理的定义和返回值，在后序位置写代码了。**

- [652.寻找重复的子树](Tree/652.寻找重复的子树.java) &emsp;[🔗](https://leetcode.cn/problems/find-duplicate-subtrees/)

<br>

## 思路

运用纲领中的二叉树解题的思维模式：

- [114.二叉树展开为链表](Tree/114.二叉树展开为链表.java) &emsp;[🔗](https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/)

- [116.填充每个节点的下一个右侧节点指针](Tree/116.填充每个节点的下一个右侧节点指针.java) &emsp;[🔗](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/)

- [226.翻转二叉树](Tree/226.翻转二叉树.java) &emsp;[🔗](https://leetcode.cn/problems/invert-binary-tree/)

每道二叉树的题都需要思考纲领中提到的：

1. 是否可以通过遍历一遍二叉树得到答案？如果可以，用一个 `traverse` 函数配合外部变量来实现，这叫「遍历」的思维模式。

2. 是否可以定义一个递归函数，通过子问题（子树）的答案推导出原问题的答案？如果可以，写出这个递归函数的定义，并充分利用这个函数的返回值，这叫「分解问题」的思维模式。

无论使用哪种思维模式，都需要思考：

如果单独抽出一个二叉树节点，它需要做什么事情？需要在什么时候（前/中/后序位置）做？递归函数会在所有节点上执行相同的操作，因此只需考虑一个节点。

对于 [#114](Tree/114.二叉树展开为链表.java) 由于函数的返回值限定为 `void`，因此无法通过简单的二叉树遍历来解决这道题。此时就应该考虑分解问题的思路。对于 [#116](Tree/116.填充每个节点的下一个右侧节点指针.java) 可以使用遍历而不能使用分解问题的思路。对于 [#226](Tree/226.翻转二叉树.java) 两种思路都可以。

</br>

## 构造二叉树

**二叉树的构造问题一般都是使用「分解问题」的思路：构造整棵树 = 根节点 + 构造左子树 + 构造右子树。**

- [654.最大二叉树](Tree/654.最大二叉树.java) &emsp;[🔗](https://leetcode-cn.com/problems/maximum-binary-tree/)

每个二叉树节点都可以认为是一棵子树的根节点，对于根节点，首先要做的是把想办法把自己先构造出来，然后想办法构造自己的左右子树。

所以需要遍历数组找到最大值 `maxVal`，从而把根节点 `root` 做出来，然后对 `maxVal` 左边的数组和右边的数组进行递归构建，作为 `root` 的左右子树。

伪码如下：

```java
TreeNode constructMaximumBinaryTree(int[] nums) {
    if (nums is empty) return null;
    // 找到数组中的最大值
    int maxVal = Integer.MIN_VALUE;
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > maxVal) {
            maxVal = nums[i];
            index = i;
        }
    }

    TreeNode root = new TreeNode(maxVal);
    // 递归调用构造左右子树
    root.left = constructMaximumBinaryTree(nums[0..index-1]);
    root.right = constructMaximumBinaryTree(nums[index+1..nums.length-1]);
    return root;
}
```

当前 `nums` 中的最大值就是根节点，然后根据索引递归调用左右数组构造左右子树即可。

</br>

- [105.从前序与中序遍历序列构造二叉树](Tree/105.从前序与中序遍历序列构造二叉树.java) &emsp;[🔗](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)

与上一题类似，需要确定根节点，然后递归构造左右子树。

根据前序遍历的特点可以很容易的找到根节点——前序遍历的第一个数字 `preorder[0]`。关键在于如何通过根节点的值，将 `preorder` 和 `inorder` 数组划分成两半，构造根节点的左右子树

即下面代码中的 `？` 应该如何确定：

```java
// 存储 inorder 中值到索引的映射
HashMap<Integer, Integer> valToIndex = new HashMap<>();

public TreeNode buildTree(int[] preorder, int[] inorder) {
    for (int i = 0; i < inorder.length; i++) {
        valToIndex.put(inorder[i], i);
    }
    return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
}

/* 
    build 函数的定义：
    若前序遍历数组为 preorder[preStart..preEnd]，
    中序遍历数组为 inorder[inStart..inEnd]，
    构造二叉树，返回该二叉树的根节点 
*/
TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    int rootVal = preorder[preStart];
    // 避免 for 循环寻找 rootVal
    int index = valToIndex.get(rootVal);

    TreeNode root = new TreeNode(rootVal);
    // 递归构造左右子树
    root.left = build(preorder, ?, ?, inorder, ?, ?);

    root.right = build(preorder, ?, ?, inorder, ?, ?);
    return root;
}
```

对于左右子树对应的 `inorder` 数组的起始索引和终止索引比较容易确定：

```java
root.left = build(preorder, ?, ?, inorder, inStart, index - 1);

root.right = build(preorder, ?, ?, inorder, index + 1, inEnd);
```

中序遍历的根节点左边就是左子树的节点值，右边就是右子树的节点值。

而对于 `preorder` 数组，可以通过左子树的节点数推导出来，假设左子树的节点数为 `leftSize`，那么可以根据 `inorder` 数组计算出 `leftSize`，而 `preStart + leftSize` 就是左子树的终止索引。

这样就可以完成代码：

```java
int leftSize = index - inStart;

root.left = build(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1);

root.right = build(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd);
```

</br>

- [106.从中序与后序遍历序列构造二叉树](Tree/106.从中序与后序遍历序列构造二叉树.java) &emsp;[🔗](https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)

与 [#105](Tree/105.从前序与中序遍历序列构造二叉树.java) 类似，可以通过后序遍历数组 `postorder` 推导出根节点的值，然后递归构造左右子树。后序遍历数组的最后一个元素就是根节点的值。

```java
// 存储 inorder 中值到索引的映射
HashMap<Integer, Integer> valToIndex = new HashMap<>();

TreeNode buildTree(int[] inorder, int[] postorder) {
    for (int i = 0; i < inorder.length; i++) {
        valToIndex.put(inorder[i], i);
    }
    return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
}

/* 
    build 函数的定义：
    后序遍历数组为 postorder[postStart..postEnd]，
    中序遍历数组为 inorder[inStart..inEnd]，
    构造二叉树，返回该二叉树的根节点 
*/
TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
    // root 节点对应的值就是后序遍历数组的最后一个元素
    int rootVal = postorder[postEnd];
    // rootVal 在中序遍历数组中的索引
    int index = valToIndex.get(rootVal);

    TreeNode root = new TreeNode(rootVal);
    // 递归构造左右子树
    root.left = build(inorder, ?, ?, postorder, ?, ?);

    root.right = build(inorder, ?, ?, postorder, ?, ?);
    return root;
}
```

首先可以确定左右子树对应的 `inorder` 数组的起始索引和终止索引：
```java
root.left = build(inorder, inStart, index - 1, postorder, ?, ?);

root.right = build(inorder, index + 1, inEnd, postorder, ?, ?);
```

同样可以通过中序遍历数组求出左子树的长度 `leftSize`，在 `postorder` 数组中左子树就从 `postStart` 到 `postStart + leftSize - 1`，而右子树就从 `postStart + leftSize` 到 `postEnd - 1` (`postEnd` 是根节点)。

这样就完成了代码：

```java
int leftSize = index - inStart;

root.left = build(inorder, inStart, index - 1, postorder, postStart, postStart + leftSize - 1);

root.right = build(inorder, index + 1, inEnd, postorder, postStart + leftSize, postEnd - 1);
```

</br>

- [889.根据前序和后序遍历构造二叉树](Tree/889.根据前序和后序遍历构造二叉树.java) &emsp;[🔗](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/)

我们可以通过一棵树的前序和中序、中序和后序遍历来唯一确定一棵原始二叉树。但通过前序后序遍历结果无法确定唯一的原始二叉树。

用前序遍历和后序遍历结果还原二叉树，解法逻辑上和 [#105](Tree/105.从前序与中序遍历序列构造二叉树.java)、[#106](Tree/106.从中序与后序遍历序列构造二叉树.java) 差别不大，也是通过控制左右子树的索引来构建：

1. 首先把前序遍历结果的第一个元素或者后序遍历结果的最后一个元素确定为根节点的值。

2. 然后把前序遍历结果的第二个元素作为左子树的根节点的值。

3. 在后序遍历结果中寻找左子树根节点的值，从而确定了左子树的索引边界，进而确定右子树的索引边界，递归构造左右子树即可。

```java
class Solution {
    // 存储 postorder 中值到索引的映射
    HashMap<Integer, Integer> valToIndex = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            valToIndex.put(postorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }

    // 定义：根据 preorder[preStart..preEnd] 和 postorder[postStart..postEnd]
    // 构建二叉树，并返回根节点。
    TreeNode build(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd) {
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }

        // root 节点对应的值就是前序遍历数组的第一个元素
        int rootVal = preorder[preStart];
        // root.left 的值是前序遍历第二个元素
        // 通过前序和后序遍历构造二叉树的关键在于通过左子树的根节点
        // 确定 preorder 和 postorder 中左右子树的元素区间
        int leftRootVal = preorder[preStart + 1];
        // leftRootVal 在后序遍历数组中的索引
        int index = valToIndex.get(leftRootVal);
        // 左子树的元素个数
        int leftSize = index - postStart + 1;

        // 先构造出当前根节点
        TreeNode root = new TreeNode(rootVal);
        // 递归构造左右子树
        // 根据左子树的根节点索引和元素个数推导左右子树的索引边界
        root.left = build(preorder, preStart + 1, preStart + leftSize, postorder, postStart, index);
        root.right = build(preorder, preStart + leftSize + 1, preEnd, postorder, index + 1, postEnd - 1);

        return root;
    }
}
```

造成前序和后序遍历构造二叉树结果不唯一的关键就在于：

```java
int leftRootVal = preorder[preStart + 1];
```

假设前序遍历的第二个元素是左子树的根节点，但实际上左子树有可能是空指针，那么这个元素就应该是右子树的根节点。由于这里无法确切进行判断，所以导致了最终答案的不唯一。

**总之，二叉树的构造问题一般都是使用「分解问题」的思路：构造整棵树 = 根节点 + 构造左子树 + 构造右子树。先找出根节点，然后根据根节点的值找到左右子树的元素，进而递归构建出左右子树。**

</br>

## 序列化与反序列化

二叉树结该是一个二维平面内的结构，而序列化出来的字符串是一个线性的一维结构。所谓的序列化就是把结构化的数据「打平」，其实是在考察二叉树的遍历方式。

- [297. 二叉树的序列化与反序列化](Tree/297.二叉树的序列化与反序列化.java) &emsp;[🔗](https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/)

```java
// 代表分隔符的字符
String SEP = ",";
// 代表 null 空指针的字符
String NULL = "#";
// 用于拼接字符串
StringBuilder sb = new StringBuilder();

/* 将二叉树打平为字符串 */
void traverse(TreeNode root, StringBuilder sb) {
    if (root == null) {
        sb.append(NULL).append(SEP);
        return;
    }

    /****** 前序遍历位置 ******/
    sb.append(root.val).append(SEP);
    /***********************/

    traverse(root.left, sb);
    traverse(root.right, sb);
}
```

`StringBuilder` 可以用于高效拼接字符串，所以也可以认为是一个列表，用 `,` 作为分隔符，用 `#` 表示空指针 `null`，调用完 `traverse` `函数后，StringBuilder` 中的字符串应该是 `1,2,#,4,#,#,3,#,#`。

若要将字符串反过来构造二叉树，可以先将字符串转为列表：

```java
String data = "1,2,#,4,#,#,3,#,#,";
String[] nodes = data.split(",");
```

这样，`nodes` 列表就是二叉树的前序遍历结果，问题转化为：如何通过二叉树的前序遍历结果还原一棵二叉树？

</br>

## 归并排序

归并排序代码框架：

```java
// 定义：排序 nums[lo..hi]
void sort(int[] nums, int lo, int hi) {
    if (lo == hi) {
        return;
    }
    int mid = (lo + hi) / 2;
    // 利用定义，排序 nums[lo..mid]
    sort(nums, lo, mid);
    // 利用定义，排序 nums[mid+1..hi]
    sort(nums, mid + 1, hi);

    // 后序位置
    // 此时两部分子数组已经被排好序
    // 合并两个有序数组，使 nums[lo..hi] 有序
    merge(nums, lo, mid, hi);
}

// 将有序数组 nums[lo..mid] 和有序数组 nums[mid+1..hi]
// 合并为有序数组 nums[lo..hi]
void merge(int[] nums, int lo, int mid, int hi);
```

归并排序就是先把左半边数组排好序，再把右半边数组排好序，然后把两半数组合并。

上述代码和二叉树的后序遍历很像：

```java
/* 二叉树遍历框架 */
void traverse(TreeNode root) {
    if (root == null) {
        return;
    }
    traverse(root.left);
    traverse(root.right);
    // 后序位置
    print(root.val);
}
```

可以看出归并排序利用的是分解问题的思路，归并排序的过程可以在逻辑上抽象成一棵二叉树，树上的每个节点的值可以认为是 nums[lo..hi]，叶子节点的值就是数组中的单个元素：

![j6jdt1.png](https://s1.ax1x.com/2022/07/11/j6jdt1.png)

然后，在每个节点的后序位置（左右子节点已经被排好序）的时候执行 `merge` 函数，合并两个子节点上的子数组：

![j6jN79.png](https://s1.ax1x.com/2022/07/11/j6jN79.png)

这个 `merge` 操作会在二叉树的每个节点上都执行一遍，执行顺序是二叉树后序遍历的顺序。

因此可以写出代码：

```java
class Merge {

    // 用于辅助合并有序数组
    private static int[] temp;

    public static void sort(int[] nums) {
        // 先给辅助数组开辟内存空间
        temp = new int[nums.length];
        // 排序整个数组（原地修改）
        sort(nums, 0, nums.length - 1);
    }

    // 定义：将子数组 nums[lo..hi] 进行排序
    private static void sort(int[] nums, int lo, int hi) {
        if (lo == hi) {
            // 单个元素不用排序
            return;
        }
        // 这样写是为了防止溢出，效果等同于 (hi + lo) / 2
        int mid = lo + (hi - lo) / 2;
        // 先对左半部分数组 nums[lo..mid] 排序
        sort(nums, lo, mid);
        // 再对右半部分数组 nums[mid+1..hi] 排序
        sort(nums, mid + 1, hi);
        // 将两部分有序数组合并成一个有序数组
        merge(nums, lo, mid, hi);
    }

    // 将 nums[lo..mid] 和 nums[mid+1..hi] 这两个有序数组合并成一个有序数组
    private static void merge(int[] nums, int lo, int mid, int hi) {
        // 先把 nums[lo..hi] 复制到辅助数组中
        // 以便合并后的结果能够直接存入 nums
        for (int i = lo; i <= hi; i++) {
            temp[i] = nums[i];
        }

        // 数组双指针技巧，合并两个有序数组
        int i = lo, j = mid + 1;
        for (int p = lo; p <= hi; p++) {
            if (i == mid + 1) {
                // 左半边数组已全部被合并
                nums[p] = temp[j++];
            } else if (j == hi + 1) {
                // 右半边数组已全部被合并
                nums[p] = temp[i++];
            } else if (temp[i] > temp[j]) {
                nums[p] = temp[j++];
            } else {
                nums[p] = temp[i++];
            }
        }
    }
}
```

`sort` 函数对 `nums[lo..mid]` 和 `nums[mid+1..hi]` 递归排序完成之后，我们没有办法原地把它们合并，所以需要 `copy` 到 `temp` 数组里面，然后通过类似于合并有序链表的双指针技巧将 `nums[lo..hi]` 合并成一个有序数组：

![j6jakR.png](https://s1.ax1x.com/2022/07/11/j6jakR.png)

注意，这里不是在 `merge` 函数执行的时候 `new` 辅助数组，而是提前把 `temp` 辅助数组 `new` 出来了，这样就避免了在递归中频繁分配和释放内存可能产生的性能问题。

- [912.排序数组](Array/912.排序数组.java) &emsp;[🔗](https://leetcode.cn/problems/sort-an-array/)

除了最基本的排序问题，归并排序还可以用来解决：

- [315.计算右侧小于当前元素的个数](Tree/315.计算右侧小于当前元素的个数.java) &emsp;[🔗](https://leetcode.cn/problems/count-of-smaller-numbers-after-self/)

![j6jt0J.png](https://s1.ax1x.com/2022/07/11/j6jt0J.png)

在使用 `merge` 函数合并两个有序数组时可以知道一个元素 `nums[i]` 后边有多少个元素比 `nums[i]` 小：

![j6jYm4.png](https://s1.ax1x.com/2022/07/11/j6jYm4.png)

此时应该把 `temp[i]` 放到 `nums[p]` 上，因为 `temp[i] < temp[j]`。

在这个场景下还可以知道：5 后面比 5 小的元素个数就是 左闭右开区间 `[mid + 1, j)` 中的元素个数，即 2 和 4 这两个元素。这是因为 `temp` 被 `mid` 划分成了两个已经排好序的数组，而在左边的数组中，`i` 的右边显然不会有比 `temp[i]` 更小的元素，因此比它小的只能在 `mid` 之后，即从 `mid + 1` 开始；又因为 `temp[i] < temp[j]`，而此时 `temp[j - 1]` 是与 `temp[i]` 比较过并放入 `nums[p]` 中的，因此在 `j` 结束且不包含 `j`。

即在对 `nuns[lo..hi]` 合并的过程中，每当执行 `nums[p] = temp[i]` 时，就可以确定 `temp[i]` 这个元素后面比它小的元素个数为 `j - mid - 1`。

这样只需要修改 `merge` 方法即可完成该题。

</br>

- [327.区间和的个数](Tree/327.区间和的个数.java) &emsp;[🔗](https://leetcode.cn/problems/count-of-range-sum/)

![j6jBp6.png](https://s1.ax1x.com/2022/07/11/j6jBp6.png)

要求计算计算元素和落在 `[lower, upper]` 中的所有子数组的个数。可以创建一个前缀和数组 `preSum` 来辅助计算区间和。

</br>

- [493.翻转对](Tree/493.翻转对.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-pairs/)

![j6jwfx.png](https://s1.ax1x.com/2022/07/11/j6jwfx.png)

与 [#315](Tree/315.计算右侧小于当前元素的个数.java) 非常相似，只是判断的条件发生了改变，这里求的是 `nums[i] > 2*nums[j]`。

所以解题思路还是要在 `merge` 函数中修改，当 `nums[lo..mid]` 和 `nums[mid+1..hi]` 两个子数组完成排序后，对于 `nums[lo..mid]` 中的每个元素 `nums[i]`，去 `nums[mid+1..hi]` 中寻找符合条件的 `nums[j]` 就可以。

**所有递归的算法，本质上都是在遍历一棵（递归）树，然后在节点（前中后序位置）上执行代码。要写递归算法，本质上就是要告诉每个节点需要做什么。**

**如归并排序算法，递归的 `sort` 函数就是二叉树的遍历函数，而 `merge` 函数就是在每个节点上做的事情。**
</br>

## 二叉搜索树

### 特性

二叉搜索树（Binary Search Tree，BST）的特点：

1. 对于 BST 的每一个节点 `node`，左子树节点的值都比 `node` 的值要小，右子树节点的值都比 `node` 的值大。

2. 对于 BST 的每一个节点 `node`，它的左侧子树和右侧子树都是 BST。

**除了它的定义，还有一个重要的性质：BST 的中序遍历结果是有序的（升序）。**

也就是说，如果输入一棵 BST，可以将 BST 中每个节点的值升序打印出来：

```java
void traverse(TreeNode root) {
    if (root == null) return;
    traverse(root.left);
    // 中序遍历代码位置
    print(root.val);
    traverse(root.right);
}
```

</br>

- [230.二叉搜索树中第K小的元素](Tree/230.二叉搜索树中第K小的元素.java) &emsp;[🔗](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/)

![jgopFK.png](https://s1.ax1x.com/2022/07/12/jgopFK.png)

利用 BST 的这个特性就可以轻松完成这道题：中序遍历 BST 升序得到结果，并获取第 `k` 个元素即可:

```java
class Solution {
    // 记录结果以及位置
    int res = 0, rank = 0;
    public int kthSmallest(TreeNode root, int k) {
        // 利用 BST 的中序遍历特性
        traverse(root, k);
        return res;
    }

    private void traverse(TreeNode root, int k) {
        if(root == null) {
            return;
        }
        traverse(root.left, k);
        // 中序遍历代码位置
        if(++rank == k) {
            // 找到第 k 小的元素
            res = root.val;
            return;
        }
        traverse(root.right, k);
    }
}
```
</br>

- [538.把二叉搜索树转换为累加树](Tree/538.把二叉搜索树转换为累加树.java) &emsp;[🔗](https://leetcode.cn/problems/convert-bst-to-greater-tree/)

- [1038.从二叉搜索树到更大和树](Tree/1038.从二叉搜索树到更大和树.java) &emsp;[🔗](https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/)

![jgo9JO.png](https://s1.ax1x.com/2022/07/12/jgo9JO.png)

这两题完全相同，需要将每个节点的值更改为大于等于该节点的值之和，对于 BST 来说，每个节点的左子树都比该节点的值小，右子树都比该节点的值大，因此可以为每个节点加上其右子树的所有值即可。同样利用 BST 中序遍历的特点，但需要降序，即从右到左遍历：
            
```java
void traverse(TreeNode root) {
    if (root == null) return;
    // 先递归遍历右子树
    traverse(root.right);
    // 中序遍历代码位置
    print(root.val);
    // 后递归遍历左子树
    traverse(root.left);
}
```

这段代码可以降序打印 BST 节点的值，如果维护一个外部累加变量 `sum`，然后把 `sum` 赋值给 BST 中的每一个节点：

```java
TreeNode convertBST(TreeNode root) {
    traverse(root);
    return root;
}

// 记录累加和
int sum = 0;
void traverse(TreeNode root) {
    if (root == null) {
        return;
    }
    traverse(root.right);
    // 维护累加和
    sum += root.val;
    // 将 BST 转化成累加树
    root.val = sum;
    traverse(root.left);
}
```

核心还是 BST 的中序遍历特性，只不过修改了递归顺序，降序遍历 BST 的元素值，从而契合题目累加树的要求。

BST 相关的问题，要么利用 BST 左小右大的特性提升算法效率，要么利用中序遍历的特性满足题目的要求。

### 基础操作

BST 的基础操作主要依赖「左小右大」的特性，可以在二叉树中做类似二分搜索的操作，寻找一个元素的效率很高。

1. 判断 BST 的合法性

- [98.验证二叉搜索树](Tree/98.验证二叉搜索树.java) &emsp;[🔗](https://leetcode.cn/problems/validate-binary-search-tree/)

![jgoiSe.png](https://s1.ax1x.com/2022/07/12/jgoiSe.png)

按照 BST 左小右大的特性，每个节点想要判断自己是否是合法的 BST 节点，比较自己和左右子树即可：

```java
public boolean isValidBST(TreeNode root) {
    if(root == null) {
        return true;
    }
    if(root.left != null && root.left.val >= root.val) {
        return false;
    }
    if(root.right != null && root.right.val <= root.val) {
        return false;
    }
    return true;
}
```

但是这样会出现问题：BST 的每个节点应该要小于右边子树的所有节点，下面这个二叉树显然不是 BST，因为节点 10 的右子树中有一个节点 6，但是我们的算法会把它判定为合法 BST：

![jgIxdx.png](https://s1.ax1x.com/2022/07/12/jgIxdx.png)

出现问题的原因在于，对于每一个节点 `root`，代码值检查了它的左右孩子节点是否符合左小右大的原则；但是根据 BST 的定义，`root` 的整个左子树都要小于 `root.val`，整个右子树都要大于 `root.val`。

```java
public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}
// 限定以 root 为根的子树节点必须满足 max.val > root.val > min.val
private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
    if(root == null) {
        return true;
    }
    // 若 root.val 不符合 max 和 min 的限制，说明不是合法 BST
    if(min != null && root.val <= min.val) {
        return false;
    }
    if(max != null && root.val >= max.val) {
        return false;
    }
    // 限定左子树的最大值是 root.val，右子树的最小值是 root.val
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
}
```

通过使用辅助函数，增加函数参数列表，在参数中携带额外信息，将这种约束传递给子树的所有节点。

</br>

1. 在 BST 中搜索元素

- [700.二叉搜索树中的搜索](Tree/700.二叉搜索树中的搜索.java) &emsp;[🔗](https://leetcode.cn/problems/search-in-a-binary-search-tree/)

![jgIzo6.png](https://s1.ax1x.com/2022/07/12/jgIzo6.png)

如果是在一棵普通的二叉树中寻找：

```java
TreeNode searchBST(TreeNode root, int val);
    if (root == null) {
        return null;
    }
    if (root.val == val) {
        return root;
    }
    // 当前节点没找到就递归地去左右子树寻找
    TreeNode left = searchBST(root.left, val);
    TreeNode right = searchBST(root.right, val);

    return left != null ? left : right;
}
```

但这段代码相当于穷举了所有节点，适用于所有二叉树。而这里题目给的是二叉搜索树，因此应该使用二叉搜索树的特点进行查找。不需要递归地搜索两边，类似二分查找思想，根据 `val` 和 `root.val` 的大小比较，就能排除一边：

```java
public TreeNode searchBST(TreeNode root, int val) {
    if(root == null) {
        return null;
    }
    // 类似二分查找
    if(root.val == val) {
        return root;
    } else if(root.val > val) {
        return searchBST(root.left, val);
    } else {
        return searchBST(root.right, val);
    }
}
```

对数据结构的操作无非遍历 + 访问，遍历就是「找」，访问就是「改」。一旦涉及「改」，就类似二叉树的构造问题，函数要返回 `TreeNode` 类型，并且要对递归调用的返回值进行接收。

```java
TreeNode insertIntoBST(TreeNode root, int val) {
    // 找到空位置插入新节点
    if (root == null) return new TreeNode(val);
    // BST 中一般不会插入已存在元素
    // if (root.val == val)
    if (root.val < val) 
        root.right = insertIntoBST(root.right, val);
    if (root.val > val) 
        root.left = insertIntoBST(root.left, val);
    return root;
}
```

</br>

1. 在 BST 中删除一个数

与插入操作类似，先「找」再「改」，代码框架：

```java
TreeNode deleteNode(TreeNode root, int key) {
    if (root.val == key) {
        // 找到进行删除
    } else if (root.val > key) {
        // 在左子树找
        root.left = deleteNode(root.left, key);
    } else if (root.val < key) {
        // 在右子树找
        root.right = deleteNode(root.right, key);
    }
    return root;
}
```

重点在于如何删除该节点且不破坏 BST 的性质。删除一个节点有三种情况：

情况 1：删除的是叶子结点，没有子树。直接删除。

![jgoCWD.png](https://s1.ax1x.com/2022/07/12/jgoCWD.png)

```java
if (root.left == null && root.right == null) {
    return null;
}
```

情况 2：删除的是只有一个子树的节点。则让其子树节点代替该节点的位置。

![jgoFQH.png](https://s1.ax1x.com/2022/07/12/jgoFQH.png)

```java
// 排除了情况 1 后
if (root.left == null) {
    return root.right;
}
if (root.right == null) {
    return root.left;
}
```

情况 3：删除的是有两个子树的节点。为了不破坏 BST 的性质，需要用左子树中最大的节点，或右子树中最小的节点来代替该节点的位置。

![jgokyd.png](https://s1.ax1x.com/2022/07/12/jgokyd.png)

```java
if (root.left != null && root.right != null) {
    // 找到右子树的最小节点
    TreeNode minNode = getMin(root.right);
    // 删除 minNode
    root.right = deleteNode(root.right, minNode.val);
    // 把 root 改成 minNode
    root.val = minNode.val;
}
```

</br>

- [450.删除二叉搜索树中的节点](Tree/450.删除二叉搜索树中的节点.java) &emsp;[🔗](https://leetcode.cn/problems/delete-node-in-a-bst/)

![jgoAOA.png](https://s1.ax1x.com/2022/07/12/jgoAOA.png)


```java
public TreeNode deleteNode(TreeNode root, int key) {
    if(root == null) {
        return null;
    }
    if(root.val == key) {
        // 处理情况1、2
        if (root.left == null && root.right == null) {
            return null;
        }
        if (root.right == null) {
            return root.left;
        }
        if (root.left == null) {
            return root.right;
        }
        // 处理情况3
        // 获取右子树最小的节点
        TreeNode minNode = getMin(root.right);
        // 删除右子树最小的节点
        root.right = deleteNode(root.right, minNode.val);
        // 用右子树最小的节点替换 root 节点
        minNode.left = root.left;
        minNode.right = root.right;
        root = minNode;
    } else if(root .val > key) {
        root.left = deleteNode(root.left, key);
    } else {
        root.right = deleteNode(root.right, key);
    }
    return root;
}

private TreeNode getMin(TreeNode root) {
    // BST 中最左边的节点就是最小的
    while(root.left != null) {
        root = root.left;
    }
    return root;
}
```

在交换 `root` 和 `minNode` 时：

```java
// 处理情况3
// 获取右子树最小的节点
TreeNode minNode = getMin(root.right);
// 删除右子树最小的节点
root.right = deleteNode(root.right, minNode.val);
// 用右子树最小的节点替换 root 节点
minNode.left = root.left;
minNode.right = root.right;
root = minNode;
```

先删除了右子树最小的节点再进行替换，避免在修改完右子树后再去删除，这样会导致超时。并且没有使用更简单的直接将 `root.val` 替换为 `minNode.val`，而是进行了一系列复杂链表操作，仅对于这道算法题来说是可以的，但一般不会通过修改节点内部的值来交换节点。因为在实际应用中，BST 节点内部的数据域是用户自定义的，可以非常复杂，而 BST 作为数据结构，其操作应该和内部存储的数据域解耦，所以更倾向于使用指针操作来交换节点而不关心内部数据。

</br>

### 构造

- [96.不同的二叉搜索树](Tree/96.不同的二叉搜索树.java) &emsp;[🔗](https://leetcode.cn/problems/unique-binary-search-trees/)

![构造1](https://files.catbox.moe/6eu9q1.png)

如输入 `n = 5`，也就是说用 `{1,2,3,4,5}` 构造 BST。 首先每个数字都可以作为根节点，假如说 3 作为根节点，左子树节点就是 `{1,2}` 的组合，右子树就是 `{4,5}` 的组合。左子树的组合数和右子树的组合数乘积就是 3 作为根节点时的 BST 个数。其他节点也用同样的方法就可以求出该题的答案。

使用递归可以写出代码：

```java
// 主函数
int numTrees(int n) {
    // 计算闭区间 [1, n] 组成的 BST 个数
    return count(1, n);
}

// 计算闭区间 [lo, hi] 组成的 BST 个数
int count(int lo, int hi) {
    // base case
    if (lo > hi) {
        return 1;
    }

    int res = 0;
    for (int i = lo; i <= hi; i++) {
        // i 的值作为根节点 root
        int left = count(lo, i - 1);
        int right = count(i + 1, hi);
        // 左右子树的组合数乘积是 BST 的总数
        res += left * right;
    }

    return res;
}
```

注意 base case，显然当 `lo > hi` 闭区间 `[lo, hi]` 肯定是个空区间，也就对应着空节点 `null`，虽然是空节点，但是也是一种情况，所以要返回 1 而不能返回 0。

但这样的时间复杂度非常高，有些已经计算过的在后面再次需要使用时仍会再次计算，因此可以加一个备忘录：

```java
// 备忘录
int[][] memo;

int numTrees(int n) {
    // 备忘录的值初始化为 0
    memo = new int[n + 1][n + 1];
    return count(1, n);
}

int count(int lo, int hi) {
    // base case
    if (lo > hi) {
        return 1;
    }
    if(memo[lo][hi] != 0) {
        // 已经计算过就直接返回
        return memo[lo][hi];
    }

    int res = 0;
    for (int i = lo; i <= hi; i++) {
        // i 的值作为根节点 root
        int left = count(lo, i - 1);
        int right = count(i + 1, hi);
        // 左右子树的组合数乘积是 BST 的总数
        res += left * right;
    }
    // 将结果存入备忘录
    memo[lo][hi] = res;

    return res;
}
```

</br>

- [95.不同的二叉搜索树 II](Tree/95.不同的二叉搜索树-ii.java) &emsp;[🔗](https://leetcode.cn/problems/unique-binary-search-trees-ii/)

![构造2](https://files.catbox.moe/dhbbub.png)

除了与 [#96](Tree/96.不同的二叉搜索树.java) 相似的需要求可以构造的 BST 数量，还要求将该树都构造出来并将它们的根节点存入一个列表返回。

思路也相似：

1. 穷举 `root` 节点的所有可能。

2. 递归构造出左右子树的所有合法 BST。

3. 给 `root` 节点穷举所有左右子树的组合。

```java
public List<TreeNode> generateTrees(int n) {
    if (n == 0) return new LinkedList<>();
    // 构造闭区间 [1, n] 组成的 BST 
    return build(1, n);
}

private List<TreeNode> build(int lo, int hi) {
    List<TreeNode> res = new LinkedList<>();
    if(lo > hi) {
        res.add(null);
        return res;
    }

    // 1.穷举 root 节点的所有可能
    for (int i = lo; i <= hi; i++) {
        // 2.递归构造出左右子树的所有合法 BST
        List<TreeNode> leftTree = build(lo, i - 1);
        List<TreeNode> rightTree = build(i + 1, hi);
        // 3.给 root 节点穷举所有左右子树的组合
        for(TreeNode left : leftTree) {
            for(TreeNode right : rightTree) {
                // i 作为根节点 root 的值
                TreeNode root = new TreeNode(i);
                root.left = left;
                root.right = right;
                res.add(root);
            }
        }
    }
    return res;
}
```

</br>

## 快速排序

快速排序代码框架：

```java
void sort(int[] nums, int lo, int hi) {
    if (lo >= hi) {
        return;
    }
    // 对 nums[lo..hi] 进行切分
    // 使得 nums[lo..p-1] <= nums[p] < nums[p+1..hi]
    int p = partition(nums, lo, hi);
    // 去左右子数组进行切分
    sort(nums, lo, p - 1);
    sort(nums, p + 1, hi);
}
```

可以发现快速排序就是一个二叉树的前序遍历：

```java
void traverse(TreeNode root) {
    if (root == null) {
        return;
    }
    // 前序位置
    print(root.val);
    traverse(root.left);
    traverse(root.right);
}
```

**快速排序是先将一个元素排好序，然后再将剩下的元素排好序。**

快速排序的核心就是 `partition` 函数， `partition` 函数的作用是在 `nums[lo..hi]` 中寻找一个分界点 `p`，通过交换元素使得 `nums[lo..p-1]` 都小于等于 `nums[p]`，且 `nums[p+1..hi]` 都大于 `nums[p]`：

![快速排序1](https://files.catbox.moe/po3nwl.png)

通过 `partition` 就可以将 `nums[p]` 放在正确的位置。再用同样的方法把 `p` 左边和右边的子数组进行递归用 `partition` 把剩下的元素也排好序。

**从二叉树的视角，我们可以把子数组 nums[lo..hi] 理解成二叉树节点上的值，sort 函数理解成二叉树的遍历函数。**

这样，根据每次排序的元素的顺序，快速排序最后形成的二叉树就是一颗二叉搜索树：

![快速排序2](https://files.catbox.moe/gcezr2.png)

但这样就需要考虑二叉搜索树不平衡的问题，在极端情况下会退化成链表，导致操作效率大幅降低。为了避免这种情况，需要引入随机性。常见的方式是在进行排序之前对整个数组执行 「洗牌算法」 进行打乱，或者在 `partition` 函数中随机选择数组元素作为分界点。

洗牌算法可以参考 [#384](Array/384.打乱数组.java)

这样就可以使用代码实现快速排序：

```java
class Quick {
    public static void sort(int[] nums) {
        // 为了避免出现耗时的极端情况，先随机打乱
        shuffle(nums);
        // 排序整个数组（原地修改）
        sort(nums, 0, nums.length - 1);
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
```

可以解决：

- [215. 数组中的第K个最大元素](Tree/215.数组中的第k个最大元素.java) &emsp;[🔗](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/)

- [912. 排序数组](Array/912.排序数组.java) &emsp;[🔗](https://leetcode-cn.com/problems/sort-an-array/)

</br>

## 最近公共祖先

`git pull` 这个命令我们经常会用，它默认是使用 `merge` 方式将远端别人的修改拉到本地；如果带上参数` git pull -r`，就会使用 `rebase` 的方式将远端修改拉到本地。

这二者最直观的区别就是：`merge` 方式合并的分支会看到很多「分叉」，而 `rebase` 方式合并的分支就是一条直线。但无论哪种方式，如果存在冲突，Git 都会检测出来并让你手动解决冲突。

Git 是如何检测两条分支是否存在冲突的呢？

以 `rebase` 命令为例，如下图的情况，在 `dev` 分支执行 `git rebase master`，`dev` 就会接到 `master` 分支之上：

![公共祖先1](https://s2.loli.net/2022/07/14/Q84MnoJvxsPpeZW.png)  

首先找到这两条分支的最近公共祖先 LCA，然后从 `master` 节点开始，重演 LCA 到 `dev` 几个 `commit` 的修改，如果这些修改和 LCA 到 `master` 的 `commit` 有冲突，就会提示你手动解决冲突，最后的结果就是把 `dev` 的分支完全接到 `master` 上面。

### 寻找一个元素

输入一棵没有重复元素的二叉树根节点 `root` 和一个目标值 `val`，写一个函数寻找树中值为 `val` 的节点：

```java
// 定义：在以 root 为根的二叉树中寻找值为 val 的节点
TreeNode find(TreeNode root, int val) {
    // base case
    if (root == null) {
        return null;
    }
    if (root.val == val) {
        return root;
    }
    // root 不是目标节点，去左子树找
    TreeNode left = find(root.left, val);
    if (left != null) {
        return left;
    }
    // 左子树找不到，去左子树找
    TreeNode right = find(root.right, val);
    if (right != null) {
        return right;
    }
    // 找不到
    return null;
}
```

基于这段代码进行修改，首先修改 `return` 的位置：

```java
TreeNode find(TreeNode root, int val) {
    if (root == null) {
        return null;
    }
    // 前序位置
    if (root.val == val) {
        return root;
    }
    // root 不是目标节点，去左右子树找
    TreeNode left = find(root.left, val);
    TreeNode right = find(root.right, val);
    
    return left != null ? left : right;
}
```

这段代码也可以达到目的，但实际运行的效率会低一些。这是因为，如果能够在左子树找到目标节点，这段代码还是会去右子树找，所以效率相对差一些。

更进一步，把对 `root.val` 的判断从前序位置移动到后序位置：

```java
TreeNode find(TreeNode root, int val) {
    if (root == null) {
        return null;
    }
    // 先去左右子树寻找
    TreeNode left = find(root.left, val);
    TreeNode right = find(root.right, val);
    // 后序位置
    if (root.val == val) {
        return root;
    }
 
    return left != null ? left : right;
}
```

这段代码相当于遍历了二叉树的所有节点，就算找到了目标值也需要先去去遍历左右子树，因此效率进一步降低。

现在若将题目修改为寻找值为 `val1` 或 `val2` 的节点：

```java
// 定义：在以 root 为根的二叉树中寻找值为 val1 或 val2 的节点
TreeNode find(TreeNode root, int val1, int val2) {
    // base case
    if (root == null) {
        return null;
    }
    // 前序位置
    if (root.val == val1 || root.val == val2) {
        return root;
    }
    // 去左右子树寻找
    TreeNode left = find(root.left, val1, val2);
    TreeNode right = find(root.right, val1, val2);
    // 后序位置，已经知道左右子树是否存在目标值

    return left != null ? left : right;
}
```

**写这个查找的目的在于：最近公共祖先系列问题的解法都是把这个函数作为框架的。**

</br>

### 二叉树的最近公共祖先

- [236.二叉树的最近公共祖先](Tree/236.二叉树的最近公共祖先.java) &emsp;[🔗](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/)

![公共祖先2](https://s2.loli.net/2022/07/14/fi5Cq8gJ9banuwZ.png)  

如图示例：

1. 如果 `p` 是节点 6，`q` 是节点 7，那么它们的 LCA 就是节点 5。
   
2. 当然，`p` 和 `q` 本身也可能是 LCA，比如 `p` 是节点 4，`q` 是节点 5， `q` 本身就是 LCA 节点。

两个节点的最近公共祖先其实就是这两个节点向根节点的「延长线」的交汇点。如果一个节点能够在它的左右子树中分别找到 `p` 和 `q`，则该节点为 LCA 节点。

因此可以使用前面实现的 `find` 方法，只需在后序位置添加一个判断逻辑，即可改造成寻找最近公共祖先的解法代码：

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return find(root, p, q);
}

// 在二叉树中寻找 p 和 q 的最近公共祖先节点
private TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null) {
        return null;
    }
    // 前序位置
    if(root.val == p.val || root.val == q.val) {
        // 遇到目标值，直接返回
        return root;
    }
    
    TreeNode left = find(root.left, p, q);
    TreeNode right = find(root.right, p, q);

    // 后序位置，已经知道左右子树是否存在目标值
    if(left != null && right != null) {
        // 当前节点是 LCA 节点
        return root;
    }
    return left != null ? left : right;
}
```

在 `find` 函数的后序位置，如果发现 `left` 和 `right` 都非空，就说明当前节点是 LCA 节点，即解决了第一种情况。

在 `find` 函数的前序位置，如果找到一个值为 `p` 或 `q` 的节点则直接返回，恰好解决了第二种情况。这是因为题目的 `p` 和 `q` 一定存在于二叉树中，所以即便遇到 `q` 就直接返回，根本没遍历到 `p`，也依然可以断定 `p` 在 `q` 底下，`q` 就是 LCA 节点。

</br>

- [1676.二叉树的最近公共祖先 IV](Tree/1676.二叉树的最近公共祖先-iv.java) &emsp;[🔗](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-iv/)

![jfM4Xt.png](https://s1.ax1x.com/2022/07/14/jfM4Xt.png)

与 [#236](Tree/236.二叉树的最近公共祖先.java) 不同的是，这道题输入的节点不止两个，而是一个节点列表（所有节点都存在于树中），要寻找列表中所有节点的最近公共祖先。

如图所示，输入 `nodes = [7,4,6]`，那么函数应该返回节点 5。

解法逻辑与上题类似，只需将 `nodes` 存入哈希集合来判断遍历到的元素是否存在于 `nodes` 中（详细见代码）。

需要注意的是，这两道题的题目都明确告诉我们这些节点必定存在于二叉树中，如果没有这个前提条件，就需要修改代码了。

</br>

- [1644.二叉树的最近公共祖先 II](Tree/1644.二叉树的最近公共祖先-ii.java) &emsp;[🔗](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-ii/)

![jflmxs.png](https://s1.ax1x.com/2022/07/14/jflmxs.png)

此时 `p` 和 `q` 可能不存在于该二叉树中，因此前面解决标准最近公共祖先问题时 `find` 方法中前序位置的判断就不可行了：
    
```java
// 前序位置
if (root.val == val1 || root.val == val2) {
    // 遇到目标值，直接返回
    return root;
}
```

对于这道题来说，`p` 和 `q` 不一定存在于树中，所以不能遇到一个目标值就直接返回，而应该对二叉树进行完全搜索（遍历每一个节点），如果发现 `p` 或 `q` 不存在于树中，那么是不存在 LCA 的。

在 [寻找一个元素](#寻找一个元素) 小节我们写了几种 `find` 方法，其中一种是对二叉树进行完整遍历：

```java
TreeNode find(TreeNode root, int val) {
    if (root == null) {
        return null;
    }
    // 先去左右子树寻找
    TreeNode left = find(root.left, val);
    TreeNode right = find(root.right, val);
    // 后序位置
    if (root.val == val) {
        return root;
    }
 
    return left != null ? left : right;
}
```

这道题的也类似，只需要将前序位置的判断放到后序位置：

```java
// 记录 p、q 是否存在于树中
private boolean foundP = false, foundQ = false;

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode res = find(root, p, q);
    if (!foundP || !foundQ) {
        return null;
    }
    // p 和 q 都存在二叉树中，才有公共祖先
    return res;
}

private TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null) {
        return null;
    }

    TreeNode left = find(root.left, p, q);
    TreeNode right = find(root.right, p, q);

    // 后序位置，判断当前节点是不是 LCA 节点
    if(left != null && right != null) {
        return root;
    }

    if(root.val == left.val || root.val == right.val) {
        if(root.val == left.val) {
            foundP = true;
        }
        if(root.val == right.val) {
            foundQ = true;
        }
        return root;
    }
    return left != null ? left : right;
}
```

对二叉树进行完全搜索，同时记录 `p` 和 `q` 是否同时存在树中，从而满足题目的要求。

</br>

- [235. 二叉搜索树的最近公共祖先](Tree/235.二叉搜索树的最近公共祖先.java) &emsp;[🔗](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/)

![jf1o0x.png](https://s1.ax1x.com/2022/07/14/jf1o0x.png)

用前面标准最近公共祖先问题的代码同样可以解决这道题，但没有用到 BST 左小右大的性质，显然不是最优解。

在标准的最近公共祖先问题中，我们要在后序位置通过左右子树的搜索结果来判断当前节点是不是 LCA：

```java
TreeNode left = find(root.left, val1, val2);
TreeNode right = find(root.right, val1, val2);

// 后序位置，判断当前节点是不是 LCA 节点
if (left != null && right != null) {
    return root;
}
```

**但对于 BST 来说，根本不需要遍历子树，由于 BST 左小右大的性质，将当前节点的值与 `val1` 和 `val2` 作对比即可判断当前节点是不是 LCA：**

假设 `val1 < val2`，那么 `val1 <= root.val <= val2` 则说明当前节点就是 LCA；若 `root.val` 比 `val1` 小，则需要去值更大的右子树寻找 LCA；若 `root.val` 比 `val2` 还，则需要去值更小的左子树寻找 LCA。

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int val1 = p.val < q.val ? p.val : q.val;
    int val2 = p.val > q.val ? p.val : q.val;
    return find(root, val1, val2);
}

// 在 BST 中寻找 val1 和 val2 的最近公共祖先节点
private TreeNode find(TreeNode root, int val1, int val2) {
    if(root == null) {
        return null;
    }
    if(root.val < val1) {
        // 当前节点太小，去右子树找
        return find(root.right, val1, val2);
    }
    if(root.val > val2) {
        // 当前节点太大，去左子树找
        return find(root.left, val1, val2);
    }
    // 此时 val1 <= root.val <= val2
    // 则该节点就是最近公共祖先
    return root;
}
```

这样就把 BST 的性质利用上了。

</br>

- [1650.二叉树的最近公共祖先 III](Tree/1650.二叉树的最近公共祖先-iii.java) &emsp;[🔗](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree-iii/)

![jf83If.png](https://s1.ax1x.com/2022/07/14/jf83If.png)

由于节点 `Node` 包含其父节点的引用，因此不需要输入根节点。这道题也就可以转化为单链表相交的问题：`parent` 就是 `next` 指针，需要返回两个节点的交点。

    
 ```java
public Node lowestCommonAncestor(Node p, Node q) {
    Node a = p, b = q;
    while(a != b) {
        if(a == null) {
            // a 走一步，如果走到根节点，转到 q 节点
            a = q;
        } else {
            a = a.parent;
        }
        if(b == null) {
            // a 走一步，如果走到根节点，转到 q 节点
            b = p;
        } else {
            b = b.parent;
        }
    }   
    return a;
}
```

关于单链表的交点问题在之前篇章已经讲过，这里不再赘述（[#链表相交问题](#两个链表是否相交)）。

</br>

## 完全二叉树的节点数

- [222.完全二叉树的节点个数](Tree/222.完全二叉树的节点个数.java) &emsp;[🔗](https://leetcode-cn.com/problems/count-complete-tree-nodes/)

![jfY2Qg.png](https://s1.ax1x.com/2022/07/14/jfY2Qg.png)

第一时间可以想到遍历整棵树来计算节点个数：

```java
public int countNodes(TreeNode root) {
    return traverse(root);
}

private int traverse(TreeNode root) {
    if(root == null) {
        return 0;
    }
    int left = traverse(root.left);
    int right = traverse(root.right);
    return left + right + 1;
}
```

但这样的时间复杂度为 `O(N)`，而且并没有利用到它是一颗完全二叉树这个前提。

首先要明确一下两个关于二叉树的名词「完全二叉树」和「满二叉树」。

完全二叉树如下图，每一层都是紧凑靠左排列的：

![jftTHA.png](https://s1.ax1x.com/2022/07/14/jftTHA.png)

满二叉树如下图，是一种特殊的完全二叉树，每层都是是满的，像一个稳定的三角形：

![jftoBd.png](https://s1.ax1x.com/2022/07/14/jftoBd.png)

若要求一颗普通的树的节点数，可以通过上面代码遍历所有节点进行统计:

```java
public int countNodes(TreeNode root) {
    if (root == null) {
        return 0;
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
}
```

而若要求一颗满二叉树的节点数，节点总数就和树的高度呈指数关系：

```java
public int countNodes(TreeNode root) {
    int h = 0;
    // 计算树的高度
    while (root != null) {
        root = root.left;
        h++;
    }
    // 节点总数就是 2^h - 1
    return (int)Math.pow(2, h) - 1;
}
```

完全二叉树比普通二叉树特殊，但又没有满二叉树那么特殊，计算它的节点总数，可以是普通二叉树和完全二叉树的结合版：

```java
public int countNodes(TreeNode root) {
    TreeNode l = root, r = root;
    // 沿最左侧和最右侧分别计算高度
    int hl = 0, hr = 0;
    while (l != null) {
        l = l.left;
        hl++;
    }
    while (r != null) {
        r = r.right;
        hr++;
    }
    // 如果左右侧计算的高度相同，则是一棵满二叉树
    if (hl == hr) {
        return (int)Math.pow(2, hl) - 1;
    }
    // 如果左右侧的高度不同，则按照普通二叉树的逻辑计算
    return 1 + countNodes(root.left) + countNodes(root.right);
}
```

分情况来选择不同的方式计算节点数，时间复杂度是 `O(logN*logN)`。

</br>

# 回溯算法

回溯算法和 DFS 算法非常类似，本质上就是一种暴力穷举算法。回溯算法和 DFS 算法的细微差别是：**回溯算法是在遍历「树枝」，DFS 算法是在遍历「节点」**。

解决一个回溯问题，实际上就是一个决策树的遍历过程，站在回溯树的一个节点上只需要思考 3 个问题：

1. 路径：已经做出的选择。

2. 选择列表：当前可以做的选择。

3. 结束条件：到达决策树底层，无法再做选择的条件。

回溯算法的代码框架：

```python
result = []
def backtrack(路径, 选择列表):
    if 满足结束条件:
        result.add(路径)
        return
    
    for 选择 in 选择列表:
        做选择
        backtrack(路径, 选择列表)
        撤销选择
```

**其核心就是 for 循环里面的递归，在递归调用之前「做选择」，在递归调用之后「撤销选择」。**

</br>

## 回溯算法核心框架
### 全排列问题

由数学中的全排列可知，`n` 个不重复的数，全排列共有 `n!` 个。比如对三个数 `[1,2,3]`穷举：

先固定第一位为 1，第二位可以是 2，那么第三位只能是 3；然后也可以把第二g固定 3，第三位只能是 2；然后只能变化第一位，变成 2，然后再穷举后两位……这就是回溯算法：

![](https://s3.bmp.ovh/imgs/2022/07/23/06afd02f6f400e9d.png)

只要从根遍历这棵树，记录路径上的数字，其实就是所有的全排列。这棵树就称为回溯算法的「决策树」。因为在每个节点上时都是在做决策。比如站在下图的红色节点上：

![](https://s3.bmp.ovh/imgs/2022/07/23/713e5292cdd9e886.png)

做决策可以选择 1 那条树枝，也可以选择 3 那条树枝。因为 2 这个树枝在身后，这个选择之前做过了，而全排列是不允许重复使用数字的。

**[2] 就是「路径」，记录已经做过的选择；[1,3] 就是「选择列表」，表示当前可以做出的选择；「结束条件」就是遍历到树的底层叶子节点，这里也就是选择列表为空的时候。**

![](https://s3.bmp.ovh/imgs/2022/07/23/a95b45eef15d405c.png)

我们定义的 `backtrack` 函数就像一个指针在这棵树上游走，同时要正确维护每个节点的属性，每当走到树的底层叶子节点，其「路径」就是一个全排列。

而遍历一颗树在上一章有详细介绍，在回溯算法中更多的是在遍历一颗多叉树：

```java
void traverse(TreeNode root) {
    for (TreeNode child : root.childern) {
        // 前序位置需要的操作
        traverse(child);
        // 后序位置需要的操作
    }
}
```

而前序遍历和后序遍历只是两个很有用的时间点：

![](https://s3.bmp.ovh/imgs/2022/07/23/2482d2c1b51f7a86.png)

前序遍历的代码在进入某一个节点之前的那个时间点执行，后序遍历代码在离开某个节点之后的那个时间点执行。

而「路径」和「选择」是每个节点的属性，函数在树上游走要正确维护节点的属性，那么就要在这两个特殊时间点操作：

![](https://s3.bmp.ovh/imgs/2022/07/23/5b31c220ef3142e6.png)

这样就能细划回溯算法代码框架：

```python
for 选择 in 选择列表:
    # 做选择
    将该选择从选择列表移除
    路径.add(选择)
    backtrack(路径, 选择列表)
    # 撤销选择
    路径.remove(选择)
    将该选择再加入选择列表
```
只要在递归之前做出选择，在递归之后撤销刚才的选择，就能正确得到每个节点的选择列表和路径。

- [46.全排列](BackTrack/46.全排列.java) &emsp;[🔗](https://leetcode.cn/problems/permutations/)

![](https://s3.bmp.ovh/imgs/2022/07/23/1093c104a33eafcc.png)

```java
List<List<Integer>> res = new LinkedList<>();

/* 主函数，输入一组不重复的数字，返回它们的全排列 */
public List<List<Integer>> permuteUnique(int[] nums) {
    // 记录「路径」
    LinkedList<Integer> track = new LinkedList<>();
    // 「路径」中的元素会被标记为 true，避免重复使用
    boolean[] used = new boolean[nums.length];

    backtrack(nums, track, used);
    // 去重
    return res;
}

// 路径：记录在 track 中
// 选择列表：nums 中不存在于 track 的那些元素（used[i] 为 false）
// 结束条件：nums 中的元素全都在 track 中出现
private void backtrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
    // 触发结束条件
    if(track.size() == nums.length) {
        res.add(new LinkedList<>(track));
        return;
    }

    for(int i = 0; i < nums.length; i++) {
        // 排除不合法的选择
        if(used[i]) {
            // nums[i] 已经在 track 中，跳过
            continue;
        }
        // 做选择
        track.add(nums[i]);
        used[i] = true;
        // 进入下一层决策树
        backtrack(nums, track, used);
        // 取消选择
        track.removeLast();
        used[i] = false;    
    }
}
```

注意，这里所讨论的全排列问题不包含重复的数字，包含重复的数字在下一节中介绍。这里稍微做了些变通，没有显式记录「选择列表」，而是通过 `used` 数组排除已经存在 `track` 中的元素，从而推导出当前的选择列表：

![](https://s3.bmp.ovh/imgs/2022/07/23/93c299e79e4bc5c8.png)

不管怎么优化，都符合回溯框架，而且时间复杂度都不可能低于 `O(N!)`，因为穷举整棵决策树是无法避免的。这也是回溯算法的一个特点，不像动态规划存在重叠子问题可以优化，回溯算法就是纯暴力穷举，复杂度一般都很高。

</br>

### N 皇后问题

- [51.N 皇后](BackTrack/51.n-皇后.java) &emsp;[🔗](https://leetcode.cn/problems/n-queens/)

![](https://s3.bmp.ovh/imgs/2022/07/23/c4c80669e8859406.png)

一个 `N×N` 的棋盘放置 `N` 个皇后，使得它们不能互相攻击。

> 皇后可以攻击同一行、同一列、左上左下右上右下四个方向的任意单位。

这个问题本质上跟全排列问题差不多，决策树的每一层表示棋盘上的每一行；每个节点可以做出的选择是：在该行的任意一列放置一个皇后。根据回溯算法代码框架：

```java
List<List<String>> res = new LinkedList<>();

/* 输入棋盘边长 n，返回所有合法的放置 */
public List<List<String>> solveNQueens(int n) {
    //新建棋盘
    List<String> board = new LinkedList<>();
    StringBuilder stringBuilder = new StringBuilder();

    //初始化棋盘 全部置空
    stringBuilder.append(".".repeat(n));
    for (int i = 0; i < n; i++) {
        board.add(stringBuilder.toString());
    }

    backTrack(0,board);
    return res;
}

// 路径：board 中小于 row 的那些行都已经成功放置了皇后
// 选择列表：第 row 行的所有列都是放置皇后的选择
// 结束条件：row 超过 board 的最后一行
void backtrack(int row, List<String> board) {
    // 触发结束条件
    if (row == board.size()) {
        res.add(new LinkedList<>(board));
        return;
    }
    
    int n = board.get(row).length();
    for (int col = 0; col < n; col++) {
        // 排除不合法选择
        if (!isValid(row, col, board)) {
            continue;
        }
        // 做选择
        String str = board.get(row).substring(0, col) + 'Q' + board.get(row).substring(col + 1);
        board.set(row, str);

        // 进入下一行决策
        backtrack(row + 1, board);

        // 撤销选择
        str = board.get(row).substring(0, col) + '.' + board.get(row).substring(col + 1);
        board.set(row, str);
    }
}
```

与全排列类似，主要是在对字符串的操作上比较复杂。`isValid` 函数的实现：

```java
private boolean isValid(int row, int col, List<String> board) {
    int n = board.size();
    // 判断列位置是否合法
    for(int i = 0; i < n; i++) {
        if(board.get(i).charAt(col) == 'Q') {
            //第 i 行第 col 列的字符
            return false;
        }
    }
    // 判断是否与右上方发生冲突
    for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if(board.get(i).charAt(j) == 'Q') {
            return false;
        }
    }
    // 判断是否与左上方发生冲突
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if(board.get(i).charAt(j) == 'Q') {
            return false;
        }
    }
    return true;
}
```

由于皇后是一行一行向下放置的，因此只需要检查上面的行是否合法。又因为每一行只放置一个皇后，因此同行不需要检查。所以只需要检查上方：左上、正上、右上三个方向。

函数 `backtrack` 像在决策树上游走的指针，通过 `row` 和 `col` 就可以表示函数遍历到的位置，通过 `isValid` 函数可以将不符合条件的情况剪枝：

![](https://s3.bmp.ovh/imgs/2022/07/23/ed93d46da13416e2.png)

`N` 行棋盘中，第一行有 `N` 个位置可能可以放皇后，第二行有 `N - 1` 个位置，第三行有 `N - 2` 个位置，以此类推，再叠加每次放皇后之前 `isValid` 函数所需的 `O(N)` 复杂度，所以总的时间复杂度上界是 `O(N! * N)`。

若不需要获得所有合法的答案，稍微修改代码：

```java
boolean backtrack(int row, List<String> board) {
    if (row == board.size()) {
        res.add(new LinkedList<>(board));
        return true;
    }
    // ...
    for (int col = 0; col < n; col++) {
        // ...
        String str = board.get(row).substring(0, col) + 'Q' + board.get(row).substring(col + 1);
        board.set(row, str);

        if(backtrack(row + 1, board)) {
            return true;
        }

        str = board.get(row).substring(0, col) + '.' + board.get(row).substring(col + 1);
        board.set(row, str);
    }
    return false;
}
```

这样修改后只要找到一个答案，for 循环的后续递归穷举都会被阻断。这样就可以在 N 皇后问题的代码框架上写出一个解数度的算法。

总之，回溯算法就是个多叉树的遍历问题，关键就是在前序遍历和后序遍历的位置做一些操作。写 `backtrack` 函数时，需要维护走过的「路径」和当前可以做的「选择列表」，当触发「结束条件」时，将「路径」记入结果集。

</br>

## 解决排列/组合/子集问题

无论是排列、组合还是子集问题，无非就是让从序列 `nums` 中以给定规则取若干元素，主要有以下几种变体：

**形式一、元素无重不可复选，即** `nums` **中的元素都是唯一的，每个元素最多只能被使用一次，这也是最基本的形式。**

以组合为例，如果输入 `nums = [2,3,6,7]`，和为 7 的组合只有 `[7]`。

**形式二、元素可重不可复选，即** `nums` **中的元素可以存在重复，每个元素最多只能被使用一次。**

以组合为例，如果输入 `nums = [2,5,2,1,2]`，和为 7 的组合有两种 `[2,2,2,1]` 和 `[5,2]`。

**形式三、元素无重可复选，即** `nums` **中的元素都是唯一的，每个元素可以被使用若干次。**

以组合为例，如果输入 `nums = [2,3,6,7]`，和为 7 的组合应该有两种 [`2,2,3]` 和 `[7]`。

当然，也可以说有第四种形式，即元素可重可复选。但既然元素可复选，就不必存在重复元素了。元素去重之后就等同于形式三。

上面用组合问题举的例子，但排列、组合、子集问题都可以有这三种基本形式，所以共有 9 种变化。

除此之外，题目也可以再添加各种限制条件，比如让求和为 `target` 且元素个数为 `k` 的组合...

无论形式怎么变化，其本质就是穷举所有解，而这些解呈现树形结构，所以合理使用回溯算法框架，稍改代码框架即可把这些问题一网打尽。

子集问题和排列问题的回溯树：

![](https://s3.bmp.ovh/imgs/2022/07/23/9fc1499ada06662a.png)

![](https://s3.bmp.ovh/imgs/2022/07/23/be308b2d4b420a08.png)

组合问题和子集问题其实是等价的。前面的三种变化形式，就是在这两棵树上剪掉或者增加一些树枝。

</br>

### 子集（元素无重不可复选）

- [78.子集](BackTrack/78.子集.java) &emsp;[🔗](https://leetcode.cn/problems/subsets/)

![](https://s3.bmp.ovh/imgs/2022/07/23/f3f3d38f762146a9.png)

在数学中寻找所有子集的方式：

首先，生成元素个数为 0 的子集，即空集 `[]`，称为 `S_0`。

然后，在 `S_0` 的基础上生成元素个数为 1 的所有子集，称为 `S_1`：

![](https://s3.bmp.ovh/imgs/2022/07/23/c941c2874f997fd8.png)

接下来可以在 `S_1` 的基础上推导出 `S_2`，即元素个数为 2 的所有子集：

![](https://s3.bmp.ovh/imgs/2022/07/23/33be48d8c43324db.png)

因为集合中的元素不用考虑顺序，`[1,2,3]` 中 2 后面只有 3，如果向前考虑 1，那么 `[2,1]` 会和之前已经生成的子集 `[1,2]` 重复。

**即通过保证元素之间的相对顺序不变来防止出现重复的子集。**

同理可以通过 `S_2` 推出 `S_3`，实际上 `S_3` 中只有一个集合 `[1,2,3]`，它是通过 `[1,2]` 推出的。

整个推导过程就是这样一棵树：

![](https://s3.bmp.ovh/imgs/2022/07/23/d8e74c4ff97b9e78.png)

注意这棵树的特性：

**如果把根节点作为第 0 层，将每个节点和根节点之间树枝上的元素作为该节点的值，那么第** `n` **层的所有节点就是大小为** `n` **的所有子集**。比如大小为 2 的子集就是 `S_2` 层节点的值。

> 本节之后所说的「节点的值」都是指节点和根节点之间树枝上的元素，且将根节点认为是第 0 层。

那么进一步若想计算所有子集，则只需遍历这棵多叉树，把所有节点的值收集起来：

```java
List<List<Integer>> res = new LinkedList<>();
// 记录回溯算法的递归路径
LinkedList<Integer> track = new LinkedList<>();

public List<List<Integer>> subsets(int[] nums) {
    backtrack(nums, 0);
    return res;
}

// 回溯算法核心函数，遍历子集问题的回溯树
private void backtrack(int[] nums, int start) {
    // 前序位置，每个节点的值都是一个子集
    res.add(new LinkedList<>(track));
    
    // 回溯算法标准框架
    for(int i = start; i < nums.length; i++) {
        // 做选择
        track.addLast(nums[i]);
        // 通过 start 参数控制树枝的遍历，避免产生重复的子集
        backtrack(nums, i + 1);
        // 撤销选择
        track.removeLast();
    }
}
```

使用 `start` 参数控制树枝的生长避免产生重复的子集，用 `track` 记录根节点到每个节点的路径的值，同时在前序位置把每个节点的路径值收集起来，完成回溯树的遍历就收集了所有子集。当 `start == nums.length` 时，叶子节点的值会被装入 `res`，但 `for` 循环不会执行，也就结束了递归。

</br>

### 组合（元素无重不可复选）

- [77.组合](BackTrack/77.组合.java) &emsp;[🔗](https://leetcode.cn/problems/combinations/)

![](https://s3.bmp.ovh/imgs/2022/07/23/091cf832094996db.png)

返回范围 `[1, n]` 中所有可能的 `k` 个数的组合，大小为 `k` 的所有组合，就是所有大小为 `k` 的子集。

所以这题等价于：输入一个数组 `nums = [1,2..,n]` 和一个正整数 `k`，请生成所有大小为 `k` 的子集。在只需要把第 `k` 层（根节点视为第 0 层）的节点收集起来，就是大小为 k 的所有组合。

这样只需修改 base case，控制算法只收集第 `k` 层节点的值即可：

```java
List<List<Integer>> res = new LinkedList<>();
LinkedList<Integer> track = new LinkedList<>();

public List<List<Integer>> combine(int n, int k) {
    backtrack(1, n, k);
    return res;
}

private void backtrack(int start, int n, int k) {
    // base case
    if(track.size() == k) {
        // 遍历到了第 k 层，收集当前节点的值
        res.add(new LinkedList<>(track));
        return;
    }

    for(int i = start; i <= n; i++) {
        // 做选择
        track.add(i);
        // 通过 start 参数控制树枝的遍历，避免产生重复的子集
        backtrack(i + 1, n, k);
        // 撤销选择
        track.removeLast();
    }
}
```

</br>

### 排列（元素无重不可复选）

- [46.全排列](BackTrack/46.全排列.java) &emsp;[🔗](https://leetcode.cn/problems/permutations/)

> 排列问题在前文「回溯算法核心框架」讲过

刚才的组合/子集问题使用 `start` 变量保证元素 `nums[start]` 之后只会出现 `nums[start+1..]` 中的元素，通过固定元素的相对位置保证不出现重复的子集。

但排列问题本身就是让穷举元素的位置，`nums[i]` 之后也可以出现 `nums[i]` 左边的元素，所以需要额外使用 `used` 数组来标记哪些元素还可以被选择。

标准全排列可以抽象成如下这棵多叉树：

![](https://s3.bmp.ovh/imgs/2022/07/23/4da42c85ea2d733e.png)

用 `used` 数组标记已经在路径上的元素避免重复选择，然后收集所有叶子节点上的值，就是所有全排列的结果：

```java
List<List<Integer>> res = new LinkedList<>();
    // 记录回溯算法的递归路径
    LinkedList<Integer> track = new LinkedList<>();
    // track 中的元素会被标记为 true
    boolean[] used;

    /* 主函数，输入一组不重复的数字，返回它们的全排列 */
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        backtrack(nums);
        return res;
    }

    // 回溯算法核心函数
    private void backtrack(int[] nums) {
        // base case，到达叶子节点
        if(track.size() == nums.length) {
            // 收集叶子节点上的值
            res.add(new LinkedList<>(track));
            return;
        }

        // 回溯算法标准框架
        for(int i = 0; i < nums.length; i++) {
            // 已经存在 track 中的元素，不能重复选择
            if(used[i]) {
                continue;
            }
            // 做选择
            used[i] = true;
            track.addLast(nums[i]);
            // 进入下一层回溯树
            backtrack(nums);
            // 撤销选择
            track.removeLast();
            used[i] = false;
        }
    }
```

如果题目不让算全排列，而是算元素个数为 `k` 的排列，也只需修改 base case，只收集第 `k` 层的节点值即可：

```java
// 回溯算法核心函数
private void backtrack(int[] nums, int k) {
    // base case，到达第 k 层，收集节点的值
    if (track.size() == k) {
        // 第 k 层节点的值就是大小为 k 的排列
        res.add(new LinkedList(track));
        return;
    }

    // 回溯算法标准框架
    for (int i = 0; i < nums.length; i++) {
        // ...
        backtrack(nums, k);
        // ...
    }
}
```

</br>

### 子集/组合（元素可重不可复选）

- [90.子集 II](BackTrack/90.子集-ii.java) &emsp;[🔗](https://leetcode.cn/problems/subsets-ii/)

![](https://s3.bmp.ovh/imgs/2022/07/23/e761472cf7458b59.png)

刚才的标准子集问题输入的 `nums` 是没有重复元素的，但这题存在重复元素。

以 `nums = [1,2,2]` 为例，为了区别两个 2 是不同元素，后面写作 `nums = [1,2,2']`。

按照之前的思路画出子集的树形结构。显然，两条值相同的相邻树枝会产生重复：

![](https://s3.bmp.ovh/imgs/2022/07/23/fdcd67a12cc27279.png)

所以需要进行剪枝，如果一个节点有多条值相同的树枝相邻则只遍历第一条，剩下的都剪掉不遍历：

![jXaxc8.png](https://s1.ax1x.com/2022/07/23/jXaxc8.png)

体现在代码上，需要先进行排序，让相同的元素靠在一起，如果发现 `nums[i] == nums[i-1]`，则跳过：

```java
List<List<Integer>> res = new LinkedList<>();
LinkedList<Integer> track = new LinkedList<>();

public List<List<Integer>> subsetsWithDup(int[] nums) {
    // 先排序，让相同的元素靠在一起
    Arrays.sort(nums);
    backtrack(nums, 0);
    return res;
}

private void backtrack(int[] nums, int start) {
    // 前序位置，每个节点的值都是一个子集
    res.add(new LinkedList<>(track));

    for(int i = start; i < nums.length; i++) {
        // 剪枝逻辑，值相同的相邻树枝，只遍历第一条
        if(i > start && nums[i] == nums[i - 1]) {
            continue;
        }
        track.add(nums[i]);
        backtrack(nums, i + 1);
        track.removeLast();
    }
}
```

这段代码和之前标准的子集问题的代码几乎相同，就是添加了排序和剪枝的逻辑。

**组合问题和子集问题是等价的**：

- [40.组合总和 II](BackTrack/40.组合总和-ii.java) &emsp;[🔗](https://leetcode.cn/problems/combination-sum-ii/)

[![jXdejU.png](https://s1.ax1x.com/2022/07/23/jXdejU.png)](https://imgtu.com/i/jXdejU)

这其实换个问法就变成子集问题了：请计算 `candidates` 中所有和为 `target` 的子集。

对比子集问题的解法，只要额外用一个 `trackSum` 变量记录回溯路径上的元素和，然后将 base case 改一改即可解决这道题：

```java
List<List<Integer>> res = new LinkedList<>();
// 记录回溯的路径
LinkedList<Integer> track = new LinkedList<>();
// 记录 track 中的元素之和
int trackSum = 0;

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    if(candidates.length == 0) {
        return res;
    }
    // 先排序，让相同的元素靠在一起
    Arrays.sort(candidates);
    backtrack(candidates, 0, target);
    return res;
}

private void backtrack(int[] nums, int start, int target) {
    // base case，达到目标和，找到符合条件的组合
    if(trackSum == target) {
        res.add(new LinkedList<>(track));
        return;
    }
    // base case，超过目标和，直接结束
    if (trackSum > target) {
        return;
    }

    // 回溯算法标准框架
    for(int i = start; i < nums.length; i++) {
        // 剪枝逻辑，值相同的树枝，只遍历第一条
        if(i > start && nums[i] == nums[i - 1]) {
            continue;
        }
        // 做选择
        track.add(nums[i]);
        trackSum += nums[i];
        // 递归遍历下一层回溯树
        backtrack(nums, i + 1, target);
        // 撤销选择
        track.removeLast();
        trackSum -= nums[i];
    }
}
```

</br>

### 排列（元素可重不可复选）

- [47.全排列 II](BackTrack/47.全排列-ii.java) &emsp;[🔗](https://leetcode.cn/problems/permutations-ii/)

![](https://s3.bmp.ovh/imgs/2022/07/23/2a1c7655c0545335.png)

[#46](BackTrack/46.全排列.java) 是标准的排列问题，而本题的输入元素存在重复的情况。

类比输入包含重复元素的子集/组合问题，这里也需要对重复的树枝进行修剪：

```java
List<List<Integer>> res = new LinkedList<>();
// 记录回溯算法的递归路径
LinkedList<Integer> track = new LinkedList<>();
// track 中的元素会被标记为 true
boolean[] used;

public List<List<Integer>> permuteUnique(int[] nums) {
    // 先排序，让相同的元素靠在一起
    Arrays.sort(nums);
    used = new boolean[nums.length];
    backtrack(nums);
    return res;
}

private void backtrack(int[] nums) {
    // base case，到达叶子节点
    if(track.size() == nums.length) {
        // 收集叶子节点上的值
        res.add(new LinkedList<>(track));
        return;
    }

    // 回溯算法标准框架
    for(int i = 0; i < nums.length; i++) {
        // 已经存在 track 中的元素，不能重复选择
        if(used[i]) {
            continue;
        }
        // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
        if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
            continue;
        }
        // 做选择
        used[i] = true;
        track.addLast(nums[i]);
        // 进入下一层回溯树
        backtrack(nums);
        // 撤销选择
        track.removeLast();
        used[i] = false;
    }
}
```

与之前不同的是，在修剪树枝时的判断中添加了 `!used[i - 1]` 这个条件。为了方便研究，依然把相同的元素用上标 `'` 以示区别。

假设输入为 `nums = [1,2,2']`，标准的全排列算法会得出如下答案：

```java
[
    [1,2,2'],[1,2',2],
    [2,1,2'],[2,2',1],
    [2',1,2],[2',2,1]
]
```

显然，这个结果存在重复，比如 `[1,2,2']` 和 `[1,2',2]` 应该只被算作同一个排列，但被算作了两个不同的排列。

要想把重复去除，就需要**保证相同元素在排列中的相对位置保持不变**。

比如 `nums = [1,2,2']` 这个例子，保持排列中 `2` 一直在 `2'` 前面。

这样，从上面 6 个排列中只能挑出 3 个排列符合这个条件：

```java
[ [1,2,2'],[2,1,2'],[2,2',1] ]
```

这也就是正确答案。

进一步，如果 `nums = [1,2,2',2'']`，只要保证重复元素 `2` 的相对位置固定，如 `2 -> 2' -> 2''`，也可以得到无重复的全排列结果。

这是因为**标准全排列算法之所以出现重复，是因为把相同元素形成的排列序列视为不同的序列，但实际上它们应该是相同的；而如果固定相同元素形成的序列顺序，当然就避免了重复。**

因此对于代码中：

```java
// 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
    // 如果前面的相邻相等元素没有用过，则跳过
    continue;
}
// 选择 nums[i]
```

当出现重复元素时，如输入 `nums = [1,2,2',2'']`，`2'` 只有在 `2` 已经被使用的情况下才会被选择，同理，`2''` 只有在 `2'` 已经被使用的情况下才会被选择，这就保证了相同元素在排列中的相对位置保证固定。

</br>

### 子集/组合（元素无重可复选）

- [39.组合总和](BackTrack/39.组合总和.java) &emsp;[🔗](https://leetcode.cn/problems/combination-sum/)

[![jXDmGR.png](https://s1.ax1x.com/2022/07/23/jXDmGR.png)](https://imgtu.com/i/jXDmGR)

这题实际上也是子集问题：`candidates` 的哪些子集的和为 `target`。

想解决这种类型的问题也要回到回溯树上，不妨先思考思考，标准的子集/组合问题是如何保证不重复使用元素的。

答案在于 `backtrack` 递归时输入的参数 `start`：

```java
// 无重组合的回溯算法框架
void backtrack(int[] nums, int start) {
    for (int i = start; i < nums.length; i++) {
        // ...
        // 递归遍历下一层回溯树，注意参数
        backtrack(nums, i + 1);
        // ...
    }
}
```

`i` 从 `start` 开始，下一层回溯树从 `start + 1` 开始，从而保证 `nums[start]` 这个元素不会被重复使用。

那么若想元素可以被重复使用，只需要将 `i + 1` 改为 `i` 即可：

```java
// 可重组合的回溯算法框架
void backtrack(int[] nums, int start) {
    for (int i = start; i < nums.length; i++) {
        // ...
        // 递归遍历下一层回溯树，注意参数
        backtrack(nums, i);
        // ...
    }
}
```

这相当于给之前的回溯树添加了一条树枝，在遍历这棵树的过程中，一个元素可以被无限次使用：

[![jXDzwD.png](https://s1.ax1x.com/2022/07/23/jXDzwD.png)](https://imgtu.com/i/jXDzwD)

当然，这样这棵回溯树会永远生长下去，所以递归函数需要设置合适的 base case 以结束算法，即路径和大于 `target` 时就不用再遍历下去了：

```java
List<List<Integer>> res = new LinkedList<>();
// 记录回溯的路径
LinkedList<Integer> track = new LinkedList<>();
// 记录 track 中的路径和
int trackSum = 0;

public List<List<Integer>> combinationSum(int[] candidates, int target) {
    if(candidates.length == 0) {
        return res;
    }
    backtrack(candidates, 0, target);
    return res;
}

// 回溯算法主函数
private void backtrack(int[] nums, int start, int target) {
    // base case，找到目标和，记录结果
    if(trackSum == target) {
        res.add(new LinkedList<>(track));
        return;
    }
    // base case，超过目标和，停止向下遍历
    if(trackSum > target) {
        return;
    }

    // 回溯算法标准框架
    for(int i = start; i < nums.length; i++) {
        // 做选择
        track.add(nums[i]);
        trackSum += nums[i];
        // 递归遍历下一层回溯树
        // 同一元素可重复使用，注意参数
        backtrack(nums, i, target);
        // 撤销选择
        track.removeLast();
        trackSum -= nums[i];
    }
}
```

</br>

### 排列（元素无重可复选）

`nums` 数组中的元素无重复且可复选的情况下，若输入 `nums = [1,2,3]`，那么这种条件下的全排列共有 `3^3 = 27` 种：

```java
[
  [1,1,1],[1,1,2],[1,1,3],[1,2,1],[1,2,2],[1,2,3],[1,3,1],[1,3,2],[1,3,3],
  [2,1,1],[2,1,2],[2,1,3],[2,2,1],[2,2,2],[2,2,3],[2,3,1],[2,3,2],[2,3,3],
  [3,1,1],[3,1,2],[3,1,3],[3,2,1],[3,2,2],[3,2,3],[3,3,1],[3,3,2],[3,3,3]
]
```

标准的全排列算法利用 `used` 数组进行剪枝，避免重复使用同一个元素。如果允许重复使用元素，去除所有 `used` 数组的剪枝逻辑即可。

代码如下：

```java
List<List<Integer>> res = new LinkedList<>();
LinkedList<Integer> track = new LinkedList<>();

public List<List<Integer>> permuteRepeat(int[] nums) {
    backtrack(nums);
    return res;
}

// 回溯算法核心函数
void backtrack(int[] nums) {
    // base case，到达叶子节点
    if (track.size() == nums.length) {
        // 收集叶子节点上的值
        res.add(new LinkedList(track));
        return;
    }

    // 回溯算法标准框架
    for (int i = 0; i < nums.length; i++) {
        // 做选择
        track.add(nums[i]);
        // 进入下一层回溯树
        backtrack(nums);
        // 取消选择
        track.removeLast();
    }
}
```

至此，排列/组合/子集问题的九种变化都解决了。

</br>

回顾排列/组合/子集问题的三种形式在代码上的区别。

由于子集问题和组合问题本质上是一样的，就是 base case 有一些区别，所以把这两个问题放在一起看。

**形式一、元素无重不可复选，即** `nums` **中的元素都是唯一的，每个元素最多只能被使用一次**，`backtrack` 核心代码如下：

```java
/* 组合/子集问题回溯算法框架 */
void backtrack(int[] nums, int start) {
    // 回溯算法标准框架
    for (int i = start; i < nums.length; i++) {
        // 做选择
        track.addLast(nums[i]);
        // 注意参数
        backtrack(nums, i + 1);
        // 撤销选择
        track.removeLast();
    }
}

/* 排列问题回溯算法框架 */
void backtrack(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        // 剪枝逻辑
        if (used[i]) {
            continue;
        }
        // 做选择
        used[i] = true;
        track.addLast(nums[i]);

        backtrack(nums);
        // 撤销选择
        track.removeLast();
        used[i] = false;
    }
}
```

**形式二、元素可重不可复选，即** `nums` **中的元素可以存在重复，每个元素最多只能被使用一次**，其关键在于排序和剪枝，`backtrack` 核心代码如下：

```java
Arrays.sort(nums);
/* 组合/子集问题回溯算法框架 */
void backtrack(int[] nums, int start) {
    // 回溯算法标准框架
    for (int i = start; i < nums.length; i++) {
        // 剪枝逻辑，跳过值相同的相邻树枝
        if (i > start && nums[i] == nums[i - 1]) {
            continue;
        }
        // 做选择
        track.addLast(nums[i]);
        // 注意参数
        backtrack(nums, i + 1);
        // 撤销选择
        track.removeLast();
    }
}


Arrays.sort(nums);
/* 排列问题回溯算法框架 */
void backtrack(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        // 剪枝逻辑
        if (used[i]) {
            continue;
        }
        // 剪枝逻辑，固定相同的元素在排列中的相对位置
        if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
            continue;
        }
        // 做选择
        used[i] = true;
        track.addLast(nums[i]);

        backtrack(nums);
        // 撤销选择
        track.removeLast();
        used[i] = false;
    }
}
```

**形式三、元素无重可复选，即** `nums` **中的元素都是唯一的，每个元素可以被使用若干次**，只要删掉去重逻辑即可，`backtrack` 核心代码如下：

```java
/* 组合/子集问题回溯算法框架 */
void backtrack(int[] nums, int start) {
    // 回溯算法标准框架
    for (int i = start; i < nums.length; i++) {
        // 做选择
        track.addLast(nums[i]);
        // 注意参数
        backtrack(nums, i);
        // 撤销选择
        track.removeLast();
    }
}


/* 排列问题回溯算法框架 */
void backtrack(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        // 做选择
        track.addLast(nums[i]);
        backtrack(nums);
        // 撤销选择
        track.removeLast();
    }
}
```

只要从树的角度思考，这些问题看似复杂多变，实际上稍微修改 base case 就能解决，因此需要牢记树类型题目重要性。

</br>

# 图

## 图的逻辑结构和具体实现

一幅图是由节点和边构成的，逻辑结构如下：

![j4XVQs.jpg](https://s1.ax1x.com/2022/07/16/j4XVQs.jpg)

根据这个逻辑结构，可以认为每个节点的实现如下：

```java
// 图节点的逻辑结构
class Vertex {
    int id;
    Vertex[] neighbors;
}
```

它和多叉树节点几乎完全一样：

```java
// 基本的 N 叉树节点
class TreeNode {
    int val;
    TreeNode[] children;
}
```

所以，图本质上就是个高级的多叉树，适用于树的 DFS/BFS 遍历算法，全部适用于图。

不过上面的这种实现是「逻辑上的」，实际上很少用 `Vertex` 类实现图，而是用邻接表和邻接矩阵来实现。

如上图所示的图，用邻接表和邻接矩阵的存储方式如下：

![j4ji0x.png](https://s1.ax1x.com/2022/07/16/j4ji0x.png)

邻接表很直观，把每个节点 `x` 的邻居都存到一个列表里，然后把 `x` 和这个列表关联起来，这样就可以通过一个节点 `x` 找到它的所有相邻节点。

邻接矩阵则是一个二维布尔数组，称为 `matrix`，如果节点 `x` 和 `y` 是相连的，那么就把 `matrix[x][y]` 设为 `true`（上图中绿色的方格代表 `true`）。如果想找节点 `x` 的邻居，去扫一圈 `matrix[x][..]` 就可以了。

如果用代码的形式来表现，邻接表和邻接矩阵大概长这样：

```java
// 邻接表
// graph[x] 存储 x 的所有邻居节点
List<Integer>[] graph;

// 邻接矩阵
// matrix[x][y] 记录 x 是否有一条指向 y 的边
boolean[][] matrix;
```

对于邻接表，优点是占用的空间少。但邻接表无法快速判断两个节点是否相邻。

对于邻接表，优点是可以快速判断两个节点是否相邻，只需要判断 `matrix[i][j]` 是否为 `true`。但占用的空间大。

> 在常规的算法题中，邻接表的使用会更频繁一些，主要是因为操作起来较为简单，但这不意味着邻接矩阵应该被轻视。矩阵是一个强有力的数学工具，图的一些隐晦性质可以借助精妙的矩阵运算展现出来。

图论中的度(degree)：在无向图中，「度」就是每个节点相连的边的条数。

由于有向图的边有方向，所以有向图中每个节点「度」被细分为入度（indegree）和出度（outdegree），如下图：

![](https://s3.bmp.ovh/imgs/2022/07/16/ce98179a2c5048b1.png)

其中节点 `3` 的入度为 3（有三条边指向它），出度为 1（它有 1 条边指向别的节点）。

其他更复杂的模型都是基于这个最简单的图衍生出来的。

</br>

## 图的遍历

参考多叉树的 DFS 遍历框架如下：

```java
// 多叉树遍历框架
void traverse(TreeNode root) {
    if (root == null) return;
    // 前序位置
    for (TreeNode child : root.children) {
        traverse(child);
    }
    // 后序位置
}
```

图和多叉树最大的区别是，图是可能包含环的，从图的某一个节点开始遍历，有可能走了一圈又回到这个节点，而树不会出现这种情况，从某个节点出发必然走到叶子节点，不会回到它自身。

所以，如果图包含环，遍历框架就要一个 `visited` 数组进行辅助：

```java
// 记录被遍历过的节点
boolean[] visited;
// 记录从起点到当前节点的路径
boolean[] onPath;

// 图遍历框架
void traverse(Graph graph, int s) {
    if (visited[s]) return;
    // 经过节点 s，标记为已遍历
    visited[s] = true;
    // 做选择：标记节点 s 在路径上
    onPath[s] = true;
    for (int neighbor : graph.neighbors(s)) {
        traverse(graph, neighbor);
    }
    // 撤销选择：节点 s 离开路径
    onPath[s] = false;
}
```

注意 `visited` 和 `onPath` 数组的区别，前者用于记录节点是否被遍历过，后者用于记录从起点到当前节点的路径。`onPath` 在处理路径相关的问题时可以用到。

</br>

- [797.所有可能的路径](Graph/797.所有可能的路径.java) &emsp;[🔗](https://leetcode.cn/problems/all-paths-from-source-to-target/)

![](https://i.bmp.ovh/imgs/2022/07/16/93d0535f299a3f84.png)

以 `0` 为起点遍历图，同时记录遍历过的路径，当遍历到终点时将路径记录下来即可。由于输入的图是无环图，因此不需要使用 `visited` 数组辅助：

```java
// 记录所有路径
List<List<Integer>> res = new LinkedList<>();

public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    // 维护递归过程中经过的路径
    LinkedList<Integer> path = new LinkedList<>();
    traverse(graph, 0, path);
    return res;
}

// 图的遍历框架
private void traverse(int[][] graph, int s, LinkedList<Integer> path) {
    // 添加节点 s 到路径
    path.addLast(s);

    int n = graph.length;
    if(s == n - 1) {
        // 到达终点
        res.add(new LinkedList<>(path));
        path.removeLast();
        return;
    }

    // 递归每个相邻节点
    for(int v : graph[s]) {
        traverse(graph, v, path);
    }

    // 从路径移出节点 s
    path.removeLast();
}
```

注意 Java 的语言特性，因为 Java 函数参数传的是对象引用，所以向 `res` 中添加 `path` 时需要拷贝一个新的列表，否则最终 `res` 中的列表都是空的。

</br>

## 拓扑排序

### 环检测算法(DFS)

- [207.课程表](Graph/207.课程表.java) &emsp;[🔗](https://leetcode.cn/problems/course-schedule)

![](https://i.bmp.ovh/imgs/2022/07/16/fc7f1a7787d947d1.png)

当存在循环依赖时，无法修完所有课程。**依赖问题首先想到的是把问题转化成「有向图」，只要图中存在环，那就说明存在循环依赖。**

可以把课程看成「有向图」中的节点，节点编号分别是 `0, 1, ..., numCourses-1`，把课程之间的依赖关系看做节点之间的有向边。如必须修完课程 `1` 才能修课程 `3`，那么就有一条有向边从节点 `1` 指向 `3`。

如果生成当有向图中存在环，说明课程之间存在循环依赖，无法全部上完；反之，如果没有环，就可以完成全部课程。

使用邻接表：

```java
List<Integer>[] graph;
```

`graph[s]` 是一个列表，存储着节点 `s` 所指向的节点。生成图：

```java
List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
    // 图中共有 numCourses 个节点
    List<Integer>[] graph = new LinkedList[numCourses];
    for (int i = 0; i < numCourses; i++) {
        graph[i] = new LinkedList<>();
    }
    for (int[] edge : prerequisites) {
        int from = edge[1], to = edge[0];
        // 添加一条从 from 指向 to 的有向边
        // 边的方向是「被依赖」关系，即修完课程 from 才能修课程 to
        graph[from].add(to);
    }
    return graph;
}
```

遍历图：

```java
// 防止重复遍历同一个节点
boolean[] visited;

boolean canFinish(int numCourses, int[][] prerequisites) {
    List<Integer>[] graph = buildGraph(numCourses, prerequisites);
    
    visited = new boolean[numCourses];
    for (int i = 0; i < numCourses; i++) {
        traverse(graph, i);
    }
}

// 从节点 s 开始 DFS 遍历，将遍历过的节点标记为 true
void traverse(List<Integer>[] graph, int s) {
    if(visited[s]) {
        return;
    }
    /* 前序遍历代码位置 */
    // 将当前节点标记为已遍历
    visited[s] = true;
    for(int t : graph[s]) {
        traverse(graph, t);
    }
    /* 后序遍历代码位置 */
}
```

注意图中并不是所有节点都相连，所以要用一个 for 循环将所有节点都作为起点调用一次 DFS 搜索算法。
只需要再添加一个布尔数组 `onPath` 记录当前 `traverse` 经过的路径：

```java
boolean[] onPath;
boolean[] visited;

boolean hasCycle = false;

void traverse(List<Integer>[] graph, int s) {
    if (onPath[s]) {
        // 发现环
        hasCycle = true;
    }
    if (visited[s] || hasCycle) {
        return;
    }
    // 将节点 s 标记为已遍历
    visited[s] = true;
    // 开始遍历节点 s
    onPath[s] = true;
    for (int t : graph[s]) {
        traverse(graph, t);
    }
    // 节点 s 遍历完成
    onPath[s] = false;
}
```

在进入节点 `s` 的时候将 `onPath[s]` 标记为 `true`，离开时标记回 `false`，如果发现 `onPath[s]` 已经被标记，说明出现了环。

完整代码：

```java
// 记录遍历过的节点
private boolean[] visited;

// 记录一次递归堆栈中的节点
private boolean[] onPath;

// 记录图中是否有环
private boolean hasCycle = false;

public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<Integer>[] graph = buildGraph(numCourses, prerequisites);

    visited = new boolean[numCourses];
    onPath = new boolean[numCourses];
    
    for (int i = 0; i < numCourses; i++) {
        traverse(graph, i);
    }
    return !hasCycle;
}

private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
    List<Integer>[] graph = new LinkedList[numCourses];
    for (int i = 0; i < numCourses; i++) {
        graph[i] = new LinkedList<>();
    }

    for(int[] edge : prerequisites) {
        int from = edge[1], to = edge[0];
        // 边的方向是「被依赖」关系，即修完课程 from 才能修课程 to
        graph[from].add(to);
    }
    return graph;
}

private void traverse(List<Integer>[] graph, int s){
    if(onPath[s]) {
        // 存在环
        hasCycle = true;
    }
    if(visited[s] || hasCycle) {
        return;
    }

    visited[s] = true;
    onPath[s] = true;
    for(int t : graph[s]){
        traverse(graph, t);
    }
    onPath[s] = false;
}
```

</br>

### 拓扑排序算法(DFS)

- [210.课程表 II](Graph/210.课程表-ii.java) &emsp;[🔗](https://leetcode-cn.com/problems/course-schedule-ii)

![](https://i.bmp.ovh/imgs/2022/07/16/d982dfeffc93194d.png)

与 [#207](Graph/207.课程表.java) 不同的事，需要进一步返回一个合理的上课顺序，保证开始修每个课程时，前置的课程都已经修完。

如果一幅有向图中存在环，是无法进行 [拓扑排序](https://baijiahao.baidu.com/s?id=1717652999874154909&wfr=spider&for=pc) 的。如果把课程抽象成节点，课程之间的依赖关系抽象成有向边，那么拓扑排序结果就是上课顺序。

**将后序遍历的结果进行反转，就是拓扑排序的结果。**

> 是否需要反转看的是对边的定义，即依赖与被依赖关系。

对于环的判断，可以使用上提的主函数，完整代码：

```Java
// 记录后序遍历结果
List<Integer> postorder = new ArrayList<>();
// 记录是否存在环
boolean hasCycle = false;
boolean[] visited, onPath;

// 主函数
public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<Integer>[] graph = buildGraph(numCourses, prerequisites);
    visited = new boolean[numCourses];
    onPath = new boolean[numCourses];
    // 遍历图
    for (int i = 0; i < numCourses; i++) {
        traverse(graph, i);
    }
    // 有环图无法进行拓扑排序
    if (hasCycle) {
        return new int[]{};
    }
    // 逆后序遍历结果即为拓扑排序结果
    Collections.reverse(postorder);
    int[] res = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
        res[i] = postorder.get(i);
    }
    return res;
}

// 图遍历函数
void traverse(List<Integer>[] graph, int s) {
    if (onPath[s]) {
        // 发现环
        hasCycle = true;
    }
    if (visited[s] || hasCycle) {
        return;
    }
    // 前序遍历位置
    onPath[s] = true;
    visited[s] = true;
    for (int t : graph[s]) {
        traverse(graph, t);
    }
    // 后序遍历位置
    postorder.add(s);
    onPath[s] = false;
}

List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
    // ...
}
```

</br>

### 环检测算法(BFS)

```java
// 主函数
public boolean canFinish(int numCourses, int[][] prerequisites) {
    // 建图，有向边代表「被依赖」关系
    List<Integer>[] graph = buildGraph(numCourses, prerequisites);
    // 构建入度数组
    int[] indegree = new int[numCourses];
    for (int[] edge : prerequisites) {
        int from = edge[1], to = edge[0];
        // 节点 to 的入度加一
        indegree[to]++;
    }

    // 根据入度初始化队列中的节点
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
        if (indegree[i] == 0) {
            // 节点 i 没有入度，即没有依赖的节点
            // 可以作为拓扑排序的起点，加入队列
            q.offer(i);
        }
    }

    // 记录遍历的节点个数
    int count = 0;
    // 开始执行 BFS 循环
    while (!q.isEmpty()) {
        // 弹出节点 cur，并将它指向的节点的入度减一
        int cur = q.poll();
        count++;
        for (int next : graph[cur]) {
            indegree[next]--;
            if (indegree[next] == 0) {
                // 如果入度变为 0，说明 next 依赖的节点都已被遍历
                q.offer(next);
            }
        }
    }

    // 如果所有节点都被遍历过，说明不成环
    return count == numCourses;
}

List<Integer>[] buildGraph(int n, int[][] edges) {
    // ...
}
```

1. 构建邻接表，边的方向表示「被依赖」关系。

2. 构建一个 `indegree` 数组记录每个节点的入度，即 `indegree[i]` 记录节点 `i` 的入度。

3. 对 BFS 队列进行初始化，将入度为 0 的节点首先装入队列。

4. 开始执行 BFS 循环，不断弹出队列中的节点，减少相邻节点的入度，并将入度变为 0 的节点加入队列。

5. 如果最终所有节点都被遍历过（`count` 等于节点数），则说明不存在环，反之则说明存在环。

![](https://i.bmp.ovh/imgs/2022/07/16/c72d2bb208786b4d.png)

如果存在节点没有被遍历即，那么说明图中存在环。

</br>

### 拓扑排序(BFS)

由上面的思路可以发现，图中每个节点入队的顺序就是一个可行的拓扑排序结果。

因此只需要修改 BFS 版本的环检测算法，记录节点的遍历顺序即可得到拓扑排序的结果：

```java
// 主函数
public int[] findOrder(int numCourses, int[][] prerequisites) {
    // 建图，和环检测算法相同
    List<Integer>[] graph = buildGraph(numCourses, prerequisites);
    // 计算入度，和环检测算法相同
    int[] indegree = new int[numCourses];
    for (int[] edge : prerequisites) {
        int from = edge[1], to = edge[0];
        indegree[to]++;
    }

    // 根据入度初始化队列中的节点，和环检测算法相同
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
        if (indegree[i] == 0) {
            q.offer(i);
        }
    }

    // 记录拓扑排序结果
    int[] res = new int[numCourses];
    // 记录遍历节点的顺序（索引）
    int count = 0;
    // 开始执行 BFS 算法
    while (!q.isEmpty()) {
        int cur = q.poll();
        // 弹出节点的顺序即为拓扑排序结果
        res[count] = cur;
        count++;
        for (int next : graph[cur]) {
            indegree[next]--;
            if (indegree[next] == 0) {
                q.offer(next);
            }
        }
    }

    if (count != numCourses) {
        // 存在环，拓扑排序不存在
        return new int[]{};
    }
    
    return res;
}

// 建图函数
List<Integer>[] buildGraph(int n, int[][] edges) {
    // ...
}
```

这里的 BFS 算法是通过 `indegree` 数组实现的 `visited` 数组的作用，只有入度为 `0` 的节点才能入队，从而保证不会出现死循环。

</br>

## 二分图判定

### 二分图简介

百度百科对「二分图」的定义：

> 二分图的顶点集可分割为两个互不相交的子集，图中每条边依附的两个顶点都分属于这两个子集，且两个子集内的顶点不相邻。

![](https://i.bmp.ovh/imgs/2022/07/17/8cff726790465c70.png)

其实就是「双色问题」：用两种颜色将图中的所有顶点着色，且使得任意一条边的两个端点的颜色都不相同。

这个问题就等同于二分图的判定问题，如果能够成功地将图染色，那么这幅图就是一幅二分图，反之则不是：

![](https://i.bmp.ovh/imgs/2022/07/17/f70c199ad17d839d.png)

二分图作为一种特殊的图模型，会被很多高级图算法（比如最大流算法）用到。二分图结构在某些场景可以更高效地存储数据。

</br>

### 二分图判定思路

判定二分图就是用代码解决「双色问题」：**遍历一遍图，一边遍历一边染色，看看能不能用两种颜色给所有节点染色，且相邻节点的颜色都不相同。**

首先可以写出图的遍历框架：

```java
boolean[] visited;
void traverse(Graph graph, int v) {
    if(visited[v]) {
        return;
    }
    visited[v] = true;
    for(TreeNode neighbor : graph.neighbors(v)) {
        traverse(graph, neighbor);
    }
}
```

因为图中可能存在环，所以用 `visited` 数组防止死循环。

也可以把判断是否走过放在其他地方：

```java
boolean[] visited;
void traverse(Graph graph, int v) {
    // 前序遍历位置，标记节点 v 已访问
    visited[v] = true;
    for (int neighbor : graph.neighbors(v)) {
        if (!visited[neighbor]) {
            // 只遍历没标记过的相邻节点
            traverse(graph, neighbor);
        }
    }
}
```

这种写法把对 `visited` 的判断放到递归调用之前，和之前的写法唯一的不同是需要保证调用 `traverse(v)` 的时候，`visited[v] == false`。

这样就可以写出二分图判定的代码逻辑：

```java
void traverse(Graph graph, boolean[] visited, int v) {
    visited[v] = true;
    // 遍历节点 v 的所有相邻节点 neighbor
    for(TreeNode neighbor : graph.neighbors(v)) {
        if (!visited[neighbor]) {
            // 如果没访问过，就给节点 neighbor 涂上与 v 不同的颜色
            traverse(graph, visited, neighbor);
        } else {
            // 相邻节点 neighbor 已经被访问过
            // 那么应该比较节点 neighbor 和节点 v 的颜色
            // 若相同，则此图不是二分图
        }
    }
}
```

- [785.判断二分图](Graph/785.判断二分图.java) &emsp;[🔗](https://leetcode.cn/problems/is-graph-bipartite/)

![](https://i.bmp.ovh/imgs/2022/07/17/9009c2c644e1cb1e.png)

可以额外使用一个 `color` 数组来记录每个节点的颜色：

```Java
// 记录图是否符合二分图性质
private boolean ok = true;
// 记录图中节点的颜色，false 和 true 代表两种不同颜色
private boolean[] color;
// 记录图中节点是否被访问过
private boolean[] visited;

public boolean isBipartite(int[][] graph) {
    color = new boolean[graph.length];
    visited = new boolean[graph.length];

    // 因为图不一定是联通的，可能存在多个子图
    // 所以要把每个节点都作为起点进行一次遍历
    // 如果发现任何一个子图不是二分图，整幅图都不算二分图
    for(int i = 0; i < graph.length; i++) {
        if(!visited[i]) {
            traverse(graph, i);
        }
    }

    return ok;
}

private void traverse(int[][] graph, int v) {
    if(!ok) {
        return;
    }
    visited[v] = true;
    for(int w : graph[v]) {
        if(!visited[w]) {
            // 相邻节点 w 没有被访问过
            // 给节点 w 涂上和节点 v 不同的颜色
            color[w] = !color[v];
            // 继续遍历 w
            traverse(graph, w);
        } else {
            // 相邻节点 w 已经被访问过
            // 根据 v 和 w 的颜色判断是否是二分图
            if(color[w] == color[v]) {
                // 若相同，则此图不是二分图
                ok = false;
            }
        }
    }
}
```

</br>

- [886.可能的二分法](Graph/886.可能的二分法.java) &emsp;[🔗](https://leetcode.cn/problems/possible-bipartition/)

![](https://i.bmp.ovh/imgs/2022/07/17/0bf7a7e4dcfa0edf.png)

如果把每个人看做图中的节点，相互讨厌的关系看做图中的边，那么 `dislikes` 数组就可以构成一幅图。

又因为互相讨厌的人不能放在同一组里，相当于图中的所有相邻节点都要放进两个不同的组。

这就回到了「双色问题」，如果能够用两种颜色着色所有节点，且相邻节点颜色都不同，那么按照颜色把这些节点分成两组就可以了。

把 `dislikes` 构造成一幅图，然后执行二分图的判定算法即可：

```java
private boolean ok = true;
private boolean[] color;
private boolean[] visited;

public boolean possibleBipartition(int n, int[][] dislikes) {
    // 图节点编号从 1 开始
    color = new boolean[n + 1];
    visited = new boolean[n + 1];

    // 转化成邻接表表示图结构
    List<Integer>[] graph = buildGraph(n, dislikes);

    for(int i = 0; i <= n; i++) {
        if(!visited[i]) {
            traverse(graph, i);
        }
    }
    return ok;
}

private List<Integer>[] buildGraph(int n, int[][] dislikes) {
    // 图节点编号为 1...n
    List<Integer>[] graph = new LinkedList[n + 1];
    for (int i = 0; i <= n; i++) {
        graph[i] = new LinkedList<>();
    }
    for(int[] edge : dislikes) {
        int v = edge[1], w = edge[0];
        graph[v].add(w);
        graph[w].add(v);
    }
    return graph;
}

private void traverse(List<Integer>[] graph, int v) {
    if(!ok) {
        return;
    }
    visited[v] = true;
    for(int w : graph[v]) {
        if(!visited[w]) {
            color[w] = !color[v];
            traverse(graph, w);
        } else {
            if(color[w] == color[v]) {
                ok = false;
            }
        }
    }
}
```

</br>

## 并查集(UNION-FIND)算法

Union-Find 算法，也就是常说的并查集（Disjoint Set）结构，主要是解决图论中「动态连通性」问题的。

动态连通性其实可以抽象成给一幅图连线。比如下面这幅图，总共有 10 个节点，他们互不相连，分别用 0~9 标记：

![](https://i.bmp.ovh/imgs/2022/07/17/f728d0b913a522eb.png)

Union-Find 算法主要需要实现这两个 API：

```java
class UF {
    /* 将 p 和 q 连接 */
    public void union(int p, int q);
    /* 判断 p 和 q 是否连通 */
    public boolean connected(int p, int q);
    /* 返回图中有多少个连通分量 */
    public int count();
}
```

这里所说的「连通」是一种等价关系，也就是说具有如下三个性质：

1. 自反性：节点 `p` 和 `p` 是连通的。

2. 对称性：如果节点 `p` 和 `q` 连通，那么 `q` 和 `p` 也连通。

3. 传递性：如果节点 `p` 和 `q` 连通，`q` 和 `r` 连通，那么 `p` 和 `r` 也连通。

比如 0～9 任意两个不同的点都不连通，调用 `connected` 都会返回 `false`，连通分量为 10 个。

如果调用 `union(0, 1)`，那么 0 和 1 被连通，连通分量降为 9 个。

再调用 `union(1, 2)`，这时 0, 1, 2 都被连通，调用 `connected(0, 2)` 也会返回 `true`，连通分量变为 8 个。

![](https://s3.bmp.ovh/imgs/2022/07/17/c0dc0dfc657d0867.png)

判断这种「等价关系」非常实用，如编译器判断同一个变量的不同引用、社交网络中的朋友圈计算等。

</br>

### 基本思路 

可以使用森林（若干棵树）来表示图的动态连通性，用数组来具体实现这个森林。

设定树的每个节点有一个指针指向其父节点，如果是根节点的话，这个指针指向自己。如上图一开始的时候没有相互连通：

![](https://s3.bmp.ovh/imgs/2022/07/17/a63c386fe86d030e.png)

```java
class UF {
    // 记录连通分量
    private int count;
    // 节点 x 的父节点是 parent[x]
    private int[] parent;

    /* 构造函数，n 为图的节点总数 */
    public UF(int n) {
        // 一开始互不联通
        this.count = n;
        // 父节点指针初始指向自己
        parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
}
```

**如果某两个节点被连通，则让其中的（任意）一个节点的根节点接到另一个节点的根节点上：**

![](https://s3.bmp.ovh/imgs/2022/07/17/e4470285be9e73a5.png)

```java
public void union(int p, int q) {
    int rootP = find(p);
    int rootQ = find(q);
    if(rootP == rootQ) {
        return;
    }
    // 将两棵树合并为一棵
    parent[rootP] = rootQ;
    // 也可以使用 parent[rootQ] = rootP 
    // 两个分量合二为一，连通分量减一
    count--; 
}
/* 返回某个节点 x 的根节点 */
private int find(int x) {
    // 根节点的 parent[x] == x
    while(parent[x] != x) {
        x = parent[x];
    }
    return x;
}

/* 返回当前的连通分量个数 */
public int count() { 
    return count;
}
```

这样，如果节点 `p` 和 `q` 连通的话，它们一定拥有相同的根节点：

![](https://s3.bmp.ovh/imgs/2022/07/17/623924a23a7430b2.png)

```Java
public boolean connected(int p, int q) {
    int rootP = find(p);
    int rootQ = find(q);
    return rootP == rootQ;
}
```

至此，Union-Find 算法就基本完成了。

</br>

### 平衡性优化

这个算法的主要 API `connected` 和 `union` 中的复杂度都是 `find` 函数造成的，所以说它们的复杂度和 `find` 一样。

`find` 主要功能就是从某个节点向上遍历到树根，其时间复杂度就是树的高度。我们可能习惯性地认为树的高度就是 `logN`，但这并不一定。`logN` 的高度只存在于平衡二叉树，对于一般的树可能出现极端不平衡的情况，使得「树」几乎退化成「链表」，树的高度最坏情况下可能变成 `N`。

所以上面这种解法 `find` , `union` , `connected` 的时间复杂度都是 `O(N)`。

因此需要考虑如何避免树的不平衡，关键在于 `union` 过程：

```java
public void union(int p, int q) {
    int rootP = find(p);
    int rootQ = find(q);
    if (rootP == rootQ) {
        return;
    }
    parent[rootP] = rootQ;
    count--;
}
```

这里直接把 `p` 所在的树接到 `q` 所在的树的根节点下面，就可能出现「头重脚轻」的不平衡状况，比如下面这种局面：

![](https://s3.bmp.ovh/imgs/2022/07/17/ce502110e6817313.png)

长此以往，树可能生长得很不平衡。我们希望小一些的树接到大一些的树下面，这样就能避免头重脚轻，更平衡一些。解决方法是额外使用一个 `size` 数组，记录每棵树包含的节点数，不妨称为「重量」：

```java
class UF {
    private int count;
    private int[] parent;
    // 新增一个数组记录树的“重量”
    private int[] size;

    public UF(int n) {
        this.count = n;
        parent = new int[n];
        // 最初每棵树只有一个节点
        // 重量应该初始化 1
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    /* 其他函数 */
}
```

如 `size[3] = 5` 表示，以节点 `3` 为根的树总共有 5 个节点。修改一下 `union` 方法：

```java
public void union(int p, int q) {
    int rootP = find(p);
    int rootQ = find(q);
    if (rootP == rootQ)
        return;
    
    // 小树接到大树下面，较平衡
    if (size[rootP] > size[rootQ]) {
        parent[rootQ] = rootP;
        size[rootP] += size[rootQ];
    } else {
        parent[rootP] = rootQ;
        size[rootQ] += size[rootP];
    }
    count--;
}
```

这样，通过比较树的重量，就可以保证树的生长相对平衡，树的高度大致在 `logN` 这个数量级，极大提升执行效率。

此时 `find` , `union` , `connected` 的时间复杂度都下降为 `O(logN)`。

</br>

### 路径压缩

**其实我们并不在乎每棵树的结构长什么样，只在乎根节点。**

因为无论树长什么样，树上的每个节点的根节点都是相同的，所以可以进一步压缩每棵树的高度，使树高始终保持为常数。

![](https://s3.bmp.ovh/imgs/2022/07/17/6d93bfc2a8d5292c.png)

这样每个节点的父节点就是整棵树的根节点，`find` 就能以 `O(1)` 的时间找到某一节点的根节点。相应的，`connected` 和 `union` 复杂度都下降为 `O(1)`。

要做到这一点主要是修改 `find` 函数逻辑.

第一种是在 `find` 中加一行代码：

```Java
private int find(int x) {
    while (parent[x] != x) {
        // 这行代码进行路径压缩
        parent[x] = parent[parent[x]];
        x = parent[x];
    }
    return x;
}
```

每次 while 循环都会把一对父子节点改到同一层，这样每次调用 `find` 函数向树根遍历的同时就将树高缩短了。

路径压缩的第二种写法：

```java
public int find(int x) {
    if (parent[x] != x) {
        parent[x] = find(parent[x]);
    }
    return parent[x];
}
```

翻译成迭代：

```java
public int find(int x) {
    // 先找到根节点
    int root = x;
    while (parent[root] != root) {
        root = parent[root];
    }
    // 然后把 x 到根节点之间的所有节点直接接到根节点下面
    int old_parent = parent[x];
    while (x != root) {
        parent[x] = root;
        x = old_parent;
        old_parent = parent[old_parent];
    }
    return root;
}
```

![](https://s3.bmp.ovh/imgs/2022/07/17/0e8193deed942bfd.png)

比起第一种路径压缩，显然这种方法压缩得更彻底，直接把一整条树枝压平。就算一些极端情况下产生了一棵比较高的树，只要一次路径压缩就能大幅降低树高，从摊还分析的角度来看，所有操作的平均时间复杂度依然是 `O(1)`。

另外，如果使用路径压缩技巧，那么 `size` 数组的平衡优化就不是特别必要了：

<a id="Union-Find"></a>

```java
class UF {
    // 连通分量个数
    private int count;
    // 存储每个节点的父节点
    private int[] parent;

    // n 为图中节点的个数
    public UF(int n) {
        this.count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    
    // 将节点 p 和节点 q 连通
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        
        if (rootP == rootQ)
            return;
        
        parent[rootQ] = rootP;
        // 两个连通分量合并成一个连通分量
        count--;
    }

    // 判断节点 p 和节点 q 是否连通
    public boolean connected(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // 返回图中的连通分量个数
    public int count() {
        return count;
    }
}
```

Union-Find 算法的复杂度的分析：构造函数初始化数据结构需要 `O(N)` 的时间和空间复杂度；连通两个节点 `union`、判断两个节点的连通性 `connected`、计算连通分量 `count` 所需的时间复杂度均为 `O(1)`。

优化算法的过程：

1. 用 `parent` 数组记录每个节点的父节点，相当于指向父节点的指针，所以 `parent` 数组内实际存储着一个森林（若干棵多叉树）。

2. 用 `size` 数组记录着每棵树的重量，目的是让 `union` 后树依然拥有平衡性，保证各个 API 时间复杂度为 `O(logN)`，而不会退化成链表影响操作效率。

3. 在 `find` 函数中进行路径压缩，保证任意树的高度保持在常数，使得各个 API 时间复杂度为 `O(1)`。使用了路径压缩之后，可以不使用 size 数组的平衡优化。

</br>

- [323.无向图中连通分量的数目](Graph/323.无向图中连通分量的数目.java) &emsp;[🔗](https://leetcode.cn/problems/number-of-connected-components-in-an-undirected-graph/)

![](https://s3.bmp.ovh/imgs/2022/07/17/b74a073b1f32239f.png)

可以直接使用 UF 类来解决：

```java
public int countComponents(int n, int[][] edges) {
    UF uf = new UF(n);
    // 将每个节点进行连通
    for (int[] e : edges) {
        uf.union(e[0], e[1]);
    }
    // 返回连通分量的个数
    return uf.count();
}

class UF {
    // ...
}
```

另外，一些使用 DFS 深度优先算法解决的问题，也可以用 Union-Find 算法解决。

- [130.被围绕的区域](Graph/130.被围绕的区域.java) &emsp;[🔗](https://leetcode.cn/problems/surrounded-regions/)

![](https://s3.bmp.ovh/imgs/2022/07/17/d9305aef676d77d3.png)

必须是四面被围的 `O` 才能被换成 `X`，也就是说边角上的 `O` 一定不会被围，进一步，与边角上的 `O` 相连的 `O` 也不会被 `X` 围四面，也不会被替换。

如果使用 DFS 算法：

先用 for 循环遍历棋盘的四边，用 DFS 算法把那些与边界相连的 `O` 换成一个特殊字符，比如 `#`；然后再遍历整个棋盘，把剩下的 `O` 换成 `X`，把 `#` 恢复成 `O`。这样就能完成题目的要求，时间复杂度 `O(MN)`。

这个问题也可以用 Union-Find 算法解决：

把所有靠边的 `O` 和一个虚拟节点 `dummy` 进行连通：

![](https://s3.bmp.ovh/imgs/2022/07/17/55715f2b73aa74f7.png)

首先要解决的是，根据我们的实现，Union-Find 底层用的是一维数组，构造函数需要传入这个数组的大小，而题目给的是一个二维棋盘。

二维坐标 `(x,y)` 可以转换成 `x * n + y` 这个数（`m` 是棋盘的行数，`n` 是棋盘的列数）。**这是将二维坐标映射到一维的常用技巧**。

其次，索引 `[0.. m*n-1]` 都是棋盘内坐标的一维映射，因此虚拟的 `dummy` 节点占据索引 `m * n`。

```java
void solve(char[][] board) {
    if (board.length == 0) return;

    int m = board.length;
    int n = board[0].length;
    // 给 dummy 留一个额外位置
    UF uf = new UF(m * n + 1);
    int dummy = m * n;
    // 将首列和末列的 O 与 dummy 连通
    for (int i = 0; i < m; i++) {
        if (board[i][0] == 'O')
            uf.union(i * n, dummy);
        if (board[i][n - 1] == 'O')
            uf.union(i * n + n - 1, dummy);
    }
    // 将首行和末行的 O 与 dummy 连通
    for (int j = 0; j < n; j++) {
        if (board[0][j] == 'O')
            uf.union(j, dummy);
        if (board[m - 1][j] == 'O')
            uf.union(n * (m - 1) + j, dummy);
    }
    // 方向数组 d 是上下左右搜索的常用手法
    int[][] d = new int[][]{{1,0}, {0,1}, {0,-1}, {-1,0}};
    for (int i = 1; i < m - 1; i++) 
        for (int j = 1; j < n - 1; j++) 
            if (board[i][j] == 'O')
                // 将此 O 与上下左右的 O 连通
                for (int k = 0; k < 4; k++) {
                    int x = i + d[k][0];
                    int y = j + d[k][1];
                    if (board[x][y] == 'O')
                        uf.union(x * n + y, i * n + j);
                }
    // 所有不和 dummy 连通的 O，都要被替换
    for (int i = 1; i < m - 1; i++) 
        for (int j = 1; j < n - 1; j++) 
            if (!uf.connected(dummy, i * n + j))
                board[i][j] = 'X';
}

class UF {
    // ...
}
```

思路与 DFS 算法相同，只有和边界 `O` 相连的 `O` 才具有和 `dummy` 的连通性，它们不会被替换。

虽然实现复杂一些，甚至效率也略低于 DFS，但可以体现 Union-Find 主要思路：**适时增加虚拟节点，想办法让元素「分门别类」，建立动态连通关系**。

</br>

- [990.等式方程的可满足性](Graph/990.等式方程的可满足性.java) &emsp;[🔗](https://leetcode.cn/problems/satisfiability-of-equality-equations/)

![](https://s3.bmp.ovh/imgs/2022/07/17/6c03e9cdcc2194b5.png)

动态连通性其实就是一种等价关系，具有「自反性」「传递性」和「对称性」，`==` 关系也是一种等价关系，具有这些性质。所以这个问题适合使用 Union-Find 算法。

核心思想是将 `equations` 中的算式根据 `==` 和 `!=` 分成两部分，先处理 `==` 算式，使得它们通过相等关系各自关联（连通分量）；然后处理 `!=` 算式，检查不等关系是否破坏了相等关系的连通性。

```java
boolean equationsPossible(String[] equations) {
    // 26 个英文字母
    UF uf = new UF(26);
    // 先让相等的字母形成连通分量
    for (String eq : equations) {
        if (eq.charAt(1) == '=') {
            char x = eq.charAt(0);
            char y = eq.charAt(3);
            uf.union(x - 'a', y - 'a');
        }
    }
    // 检查不等关系是否打破相等关系的连通性
    for (String eq : equations) {
        if (eq.charAt(1) == '!') {
            char x = eq.charAt(0);
            char y = eq.charAt(3);
            // 如果相等关系成立，就是逻辑冲突
            if (uf.connected(x - 'a', y - 'a'))
                return false;
        }
    }
    return true;
}

class UF {
    // ...
}
```

</br>

## Kruskal 最小生成树算法

### 最小生成树

**「树」和「图」的根本区别：树不会包含环，图可以包含环**。

一副没有环的图可以拉伸成一棵树，即树是「无环连通图」。而「生成树」就是在图中找一颗饱含图所有节点的树，即生成树是含有图中所有顶点的「无环连通子图」。

一幅图可以有多种不同的生成树，如下图红色边就组成了两棵不同的生成树：

![](https://s3.bmp.ovh/imgs/2022/07/18/18535749842df6e7.png)

对于加权图，每条边都有权重，所以每棵生成树都有一个权重和。如上图，右侧生成树的权重和比左侧生成树的权重和小。

因此「最小生成树」就是在所有可能的生成树中，权重和最小的那棵生成树。

</br>

### Union-Find 并查集算法

图的生成树是含有其所有顶点的「无环连通子图」，最小生成树是权重和最小的生成树。而说到连通性就会想到上节的 Union-Find 并查集算法，用来高效处理图中连通分量的问题。

Union-Find 算法代码实现：[#Union-Find](#Union-Find)

Kruskal 算法的一个难点是保证生成树的合法性，因为在构造生成树的过程中，首先需要保证生成的是棵树（不包含环），Union-Find 算法的作用也就在此。

- [261.以图判树](Graph/261.以图判树.java) &emsp;[🔗](https://leetcode.cn/problems/graph-valid-tree/)

![](https://s3.bmp.ovh/imgs/2022/07/18/ca072fae878171be.png)

若该图包含环，则不能形成一个合法有效的树结构。而会产生环的场景：

![](https://s3.bmp.ovh/imgs/2022/07/18/e66cbfae5bdca68e.png)

不会产生环的场景：

![](https://s3.bmp.ovh/imgs/2022/07/18/8c26352433834ce8.png)

可以发现：**对于添加的这条边，如果该边的两个节点在同一连通分量里，那么添加这条边会产生环；反之，如果该边的两个节点不在同一连通分量里，则添加这条边不会产生环。**

而判断两个节点是否连通（是否在同一个连通分量中）就是 Union-Find 算法的实现的，所以这道题的解法代码如下：

```java
class Solution {
    public boolean validTree(int n, int[][] edges) {
        // 初始化 0...n-1 共 n 个节点
        UF uf = new UF(n);

        // 遍历所有边，将组成边的两个节点进行连接
        for(int[] edge : edges) {
            int u = edge[1];
            int v = edge[0];

            // 若两个节点已经在同一连通分量中，会产生环
            if(uf.connected(u, v)) {
                return false;
            }
            // 这条边不会产生环，可以是树的一部分
            uf.union(u, v);
        }
        // 要保证最后只形成了一棵树，即只有一个连通分量
        return uf.count() == 1;
    }
}

class UF {
    // ...
}
```

</br>

### Kruskal 算法

所谓最小生成树，就是图中若干边的集合（后文称这个集合为 `mst`，最小生成树的英文缩写），要保证这些边：

1. 包含图中的所有节点。

2. 形成的结构是树结构（即不存在环）。

3. 权重和最小。

有之前题目的铺垫，前两条可以很容易地利用 Union-Find 算法做到，关键在于第 3 点，如何保证得到的这棵生成树是权重和最小的。

这里可以使用到贪心思路：

将所有边按照权重从小到大排序，从权重最小的边开始遍历，如果这条边和 `mst` 中的其它边不会形成环，则这条边是最小生成树的一部分，将它加入 `mst` 集合；否则，这条边不是最小生成树的一部分，不把它加入 `mst` 集合。

这样，最后 `mst` 集合中的边就形成了最小生成树。

</br>

- [1135.最低成本联通所有城市](Graph/1135.最低成本联通所有城市-kruskal.java) &emsp;[🔗](https://leetcode.cn/problems/connecting-cities-with-minimum-cost/)

![](https://s3.bmp.ovh/imgs/2022/07/18/033fb0b903539914.png)

每座城市相当于图中的节点，连通城市的成本相当于边的权重，连通所有城市的最小成本即是最小生成树的权重之和。

```java
class Solution {
    public int minimumCost(int n, int[][] connections) {
        // 城市编号为 1...n，所以初始化大小为 n + 1
        UF uf = new UF(n + 1);
        // 对所有边按照权重从小到大排序
        Arrays.sort(connections, (a, b) -> (a[2] - b[2]));
        // 记录最小生成树的权重之和
        int mst = 0;

        for(int[] connection : connections) {
            int u = connection[0];
            int v = connection[1];
            int weight = connection[2];

            if(uf.connected(u, v)) {
                // 若这条边会产生环，则不能加入 mst
                continue;
            }

            // 若这条边不会产生环，则属于最小生成树
            mst += weight;
            uf.union(u, v);
        }
        // 保证所有节点都被连通
        // 按理说 uf.count() == 1 说明所有节点被连通
        // 但因为节点 0 没有被使用，所以 0 会额外占用一个连通分量
        return uf.count() == 2 ? mst : -1;
    }
}

class UF {
    // ...
}
```

整体思路和上一道题非常类似，可以认为树的判定算法加上按权重排序的逻辑就变成了 Kruskal 算法。

</br>

- [1584.连接所有点的最小费用](Graph/1584.连接所有点的最小费用-kruskal.java) &emsp;[🔗](https://leetcode.cn/problems/min-cost-to-connect-all-points/)

![](https://s3.bmp.ovh/imgs/2022/07/18/6c3978acf2f44ffc.png)

每个点就是无向加权图中的节点，边的权重就是曼哈顿距离，连接所有点的最小费用就是最小生成树的权重和。

所以解法思路就是先生成所有的边以及权重，然后对这些边执行 Kruskal 算法即可：

```java
public int minCostConnectPoints(int[][] points) {
    int n = points.length;
    // 生成所有边及权重
    List<int[]> edges = new ArrayList<>();
    for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
            int xi = points[i][0], yi = points[i][1];
            int xj = points[j][0], yj = points[j][1];

            // 用坐标点在 points 中的索引表示坐标点
            edges.add(new int[] {
                i, j, Math.abs(xi - xj) + Math.abs(yi - yj)
            });
        }
    }

    // 将边按照权重从小到大排序
    Collections.sort(edges, (a, b) -> (a[2] - b[2]));

    // Kruskal 算法
    int mst = 0;
    UF uf = new UF(n);
    for(int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];
        int weight = edge[2];

        if(uf.connected(u, v)) {
            continue;
        }

        mst += weight;
        uf.union(u, v);
    }
    return mst;
}
```

这道题做了一个小的变通：每个坐标点是一个二元组，按理说应该用五元组表示一条带权重的边，但这样的话不便执行 Union-Find 算法；所以用 `points` 数组中的索引代表每个坐标点，这样就可以直接复用之前的 Kruskal 算法逻辑了。

Kruskal 算法的复杂度分析：

假设一幅图的节点个数为 `V`，边的条数为 `E`，首先需要 `O(E)` 的空间装所有边，而且 Union-Find 算法也需要 `O(V)` 的空间，所以 Kruskal 算法总的空间复杂度就是 `O(V + E`)。

时间复杂度主要耗费在排序，需要 `O(ElogE)` 的时间，Union-Find 算法所有操作的复杂度都是 `O(1)`，套一个 for 循环也不过是 `O(E)`，所以总的时间复杂度为 `O(ElogE)`。

</br>

## Prim 最小生成树算法

### 对比 Kruskal 算法

图论的最小生成树问题，就是从图中找若干边形成一个边的集合 `mst`，这些边有以下特性：

1. 这些边组成的是一棵树（树和图的区别在于不能包含环）。

2. 这些边形成的树要包含所有节点。

3. 这些边的权重之和要尽可能小。

对于 Kruskal 算法，首先用到了贪心思想，来满足权重之和尽可能小的问题：

先对所有边按照权重从小到大排序，从权重最小的边开始，选择合适的边加入 `mst` 集合，这样挑出来的边组成的树就是权重和最小的。

其次，Kruskal 算法用到了 Union-Find 并查集算法，来保证挑选出来的这些边组成的一定是一棵「树」，而不会包含环或者形成一片「森林」：

如果一条边的两个节点已经是连通的，则这条边会使树中出现环；如果最后的连通分量总数大于 1，则说明形成的是「森林」而不是一棵「树」。

而对于 Prim 算法，首先也使用贪心思想来让生成树的权重尽可能小，也就是「切分定理」。

其次，Prim 算法使用 BFS 算法思想 和 `visited` 布尔数组避免成环，来保证选出来的边最终形成的一定是一棵树。

Prim 算法不需要事先对所有边排序，而是利用优先级队列动态实现排序的效果，所以 Prim 算法类似于 Kruskal 的动态过程。

</br>

### 切分定理

「切分」就是将一幅图分为两个不重叠且非空的节点集合：

![](https://s3.bmp.ovh/imgs/2022/07/18/5492fc440959c00f.png)

红线把图中的节点分成了两个集合，就是一种「切分」，其中被红线切中的的边（标记为蓝色）叫做「横切边」。

「切分定理」：

**对于任意一种「切分」，其中权重最小的那条「横切边」一定是构成最小生成树的一条边**。

它的证明也很容易：

如果一幅加权无向图存在最小生成树，假设下图中用绿色标出来的边就是最小生成树：

![](https://s3.bmp.ovh/imgs/2022/07/18/906a8d1ed6db4003.png)

那么肯定可以找到若干「切分」方式，将这棵最小生成树切成两棵子树。如下面这种切分：

![](https://s3.bmp.ovh/imgs/2022/07/18/c7c815f135c0f0a8.png)

任选一条蓝色的「横切边」都可以将这两棵子树连接起来，构成一棵生成树。为了让最终这棵生成树的权重和最小，需要选择权重最小的那条「横切边」。这就证明了「切分定理」。

根据切分定理，计算最小生成树的算法思路就可以很容易想到：

既然每一次「切分」一定可以找到最小生成树中的一条边，那每次都把权重最小的「横切边」拿出来加入最小生成树，直到把构成最小生成树的所有边都切出来为止。

</br>

### Prim 算法实现

按照「切分」的定义，只要把图中的节点切成两个不重叠且非空的节点集合即可算作一个合法的「切分」，那么只切出来一个节点也算是一个合法的「切分」，而且「横切边」就是这个节点的边。

假设从 A 点开始切分：

![](https://s3.bmp.ovh/imgs/2022/07/18/6fc27f6545f30cef.png)

按照切分定理，「横切边」`AB`, `AF` 中权重最小的边一定是最小生成树中的一条边：

![](https://s3.bmp.ovh/imgs/2022/07/18/e5f75dfe19510824.png)

现在已经找到最小生成树的第一条边（边 `AB`），按照 Prim 算法的逻辑，接下来可以围绕 `A` 和 `B` 这两个节点做切分：

![](https://s3.bmp.ovh/imgs/2022/07/18/06adffe6276d276f.png)

然后又可以从这个切分产生的横切边（图中蓝色的边）中找出权重最小的一条边，也就又找到了最小生成树中的第二条边 `BC`：

![](https://s3.bmp.ovh/imgs/2022/07/18/8615a8301d802cbf.png)

接下来类似，再围绕 `A`, `B`, `C` 这三个点做切分，产生的横切边中权重最小的边是 `BD`，那么 `BD` 就是最小生成树的第三条边：

![](https://s3.bmp.ovh/imgs/2022/07/18/7c109ee58a621b13.png)

接下来再围绕 `A`, `B`, `C`, `D` 这四个点做切分 ……

Prim 算法的逻辑就是这样，每次切分都能找到最小生成树的一条边，然后又可以进行新一轮切分，直到找到最小生成树的所有边为止。

这样设计算法有一个好处，就是比较容易确定每次新的「切分」所产生的「横切边」。

回顾刚才的图，当知道了节点 `A`, `B` 的所有「横切边」（不妨表示为 `cut({A, B})`），也就是图中蓝色的边：

![](https://s3.bmp.ovh/imgs/2022/07/18/06adffe6276d276f.png)

可以根据它快速计算出 `cut({A, B, C})`，也就是节点 `A`, `B`, `C` 的所有「横切边」:

`cut({A, B, C}) = cut({A, B}) + cut({C})`

而 `cut({C})` 就是节点 `C` 的所有邻边：

![](https://s3.bmp.ovh/imgs/2022/07/18/a161da6f239d332e.png)

因此，在进行切分的过程中只需要不断把新节点的邻边加入横切边集合，就可以得到新的切分的所有横切边。

注意 `cut({A, B})` 的横切边和 `cut({C})` 的横切边中 `BC` 边重复了。可以用一个布尔数组 `inMST` 辅助防止重复计算横切边。

而求横切边的目的是找权重最小的横切边，可以用一个优先级队列存储这些横切边来动态计算权重最小的横切边。

明白了上诉原理就可以用代码实现 Prim 算法：

```java
class Prim {
    // 核心数据结构，存储「横切边」的优先级队列
    private PriorityQueue<int[]> pq;
    // 类似 visited 数组的作用，记录已经成为最小生成树的一部分的节点
    private boolean[] inMST;
    // 记录最小生成树的权重和
    private int weightSum = 0;
    // graph 是用邻接表表示的一幅图，
    // graph[s] 记录节点 s 所有相邻的边，
    // 三元组 int[]{from, to, weight} 表示一条边
    private List<int[]>[] graph;

    public Prim(List<int[]>[] graph) {
        this.graph = graph;
        this.pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);

        // 图中有 n 个节点
        int n = graph.length;
        this.inMST = new boolean[n];

        // 不妨从节点 0 开始切分
        inMST[0] = true;
        cut(0);
        // 不断进行切分，向最小生成树中添加边
        while (!pq.isEmpty()) {
            int[] edge = pq.poll();
            int to = edge[1];
            int weight = edge[2];
            if (inMST[to]) {
                // 节点 to 已经在最小生成树中，跳过
                // 否则这条边会产生环
                continue;
            }
            // 将边 edge 加入最小生成树
            weightSum += weight;
            inMST[to] = true;
            // 节点 to 加入后，进行新一轮切分，会产生更多横切边
            cut(to);
        }
    }

    // 将 s 的横切边加入优先队列
    private void cut(int s) {
        // 遍历 s 的邻边
        for (int[] edge : graph[s]) {
            int to = edge[1];
            if (inMST[to]) {
                // 相邻接点 to 已经在最小生成树中，跳过
                // 否则这条边会产生环
                continue;
            }
            // 加入横切边队列
            pq.offer(edge);
        }
    }

    // 最小生成树的权重和
    public int weightSum() {
        return weightSum;
    }

    // 判断最小生成树是否包含图中的所有节点
    public boolean allConnected() {
        for (int i = 0; i < inMST.length; i++) {
            if (!inMST[i]) {
                return false;
            }
        }
        return true;
    }
}
```

Kruskal 算法是在一开始的时候就把所有的边排序，然后从权重最小的边开始挑选属于最小生成树的边，组建最小生成树。

Prim 算法是从一个起点的切分（一组横切边）开始执行类似 BFS 算法的逻辑，借助切分定理和优先级队列动态排序的特性，从这个起点「生长」出一棵最小生成树。

Prim 算法的时间复杂度主要在优先级队列 `pq` 的操作上，由于 `pq` 里面装的是图中的「边」，假设一幅图边的条数为 `E`，那么最多操作 `O(E)` 次 `pq`。每次操作优先级队列的时间复杂度取决于队列中的元素个数，取最坏情况就是 `O(logE)`。

所以这种 Prim 算法实现的总时间复杂度是 `O(ElogE)`。Kruskal 算法，它的时间复杂度主要是给所有边按照权重排序，也是 `O(ElogE)`。

</br>

- [1135.最低成本联通所有城市](Graph/1135.最低成本联通所有城市-prim.java) &emsp;[🔗](https://leetcode.cn/problems/connecting-cities-with-minimum-cost/)

每座城市相当于图中的节点，连通城市的成本相当于边的权重，连通所有城市的最小成本即是最小生成树的权重之和。

先把题目输入的 `connections` 转化成邻接表形式，然后输入给之前实现的 Prim 算法类即可：

```java
public int minimumCost(int n, int[][] connections) {
    List<int[]>[] graph = buildGraph(n, connections);
    Prim prim = new Prim(graph);
    if(!prim.allConnected()) {
        return -1;
    }
    return prim.weightSum();
}

List<int[]>[] buildGraph(int n, int[][] connections) {
    List<int[]>[] graph = new LinkedList[n];
    for(int i = 0; i < n; i++) {
        graph[i] = new LinkedList<>();
    }
    for(int[] conn : connections) {
        // 题目给的节点编号从 1 开始
        // 但实现的 Prim 算法需要从 0 开始编号
        int u = conn[0] - 1;
        int v = conn[1] - 1;
        int weight = conn[2];

        graph[u].add(new int[]{u, v, weight});
        graph[v].add(new int[]{v, u, weight});
    }
    return graph;
}
```

关于 `buildGraph` 函数需要注意两点：

1. 题目给的节点编号是从 1 开始的，所以做一下索引偏移，转化成从 0 开始以便 `Prim` 类使用；

2. 如何用邻接表表示无向加权图，「无向图」其实就可以理解为「双向图」。

这样转化出来的 `graph` 形式就和之前的 `Prim` 算法类对应了，可以直接使用 `Prim` 算法计算最小生成树。

</br>

- [1584.连接所有点的最小费用](Graph/1584.连接所有点的最小费用-prim.java) &emsp;[🔗](https://leetcode.cn/problems/min-cost-to-connect-all-points/)

每个点就是无向加权图中的节点，边的权重就是曼哈顿距离，连接所有点的最小费用就是最小生成树的权重和。

所以只需要把 `points` 数组转化成邻接表的形式，即可复用之前实现的 `Prim` 算法类：

```java
public int minCostConnectPoints(int[][] points) {
    int n = points.length;
    List<int[]>[] graph = buildGraph(n, points);
    return new Prim(graph).weightSum();
}

private List<int[]>[] buildGraph(int n, int[][] points) {
    List<int[]>[] graph = new LinkedList[n];
    for (int i = 0; i < n; i++) {
        graph[i] = new LinkedList<>();
    }
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int xi = points[i][0], yi = points[i][1];
            int xj = points[j][0], yj = points[j][1];
            int weight = Math.abs(xi - xj) + Math.abs(yi - yj);

            graph[i].add(new int[]{i, j, weight});
            graph[j].add(new int[]{j, i, weight});
        }
    }
    return graph;
}
```

用 `points` 数组中的索引代表每个坐标点，这样就可以直接复用之前的 `Prim` 算法逻辑了。

</br>

## BFS 算法

BFS 的核心思想就是把一些问题抽象成图，从一个点开始，向四周开始扩散。一般来说，写 BFS 算法都是用「队列」这种数据结构，每次将一个节点周围的所有节点加入队列。

BFS 相对 DFS 的最主要的区别是：BFS 找到的路径一定是最短的，但代价就是空间复杂度可能比 DFS 大很多。

</br>

BFS 出现的常见场景问题的本质就是在一幅「图」中找到从起点 `start` 到终点 `target` 的最近距离。

代码框架：

```java
// 计算从起点 start 到终点 target 的最近距离
int BFS(Node start, Node target) {
    Queue<Node> q; // 核心数据结构
    Set<Node> visited; // 避免走回头路
    
    q.offer(start); // 将起点加入队列
    visited.add(start);
    int step = 0; // 记录扩散的步数

    while (!q.isEmpty()) {
        int sz = q.size();
        /* 将当前队列中的所有节点向四周扩散 */
        for (int i = 0; i < sz; i++) {
            Node cur = q.poll();
            /* 判断是否到达终点 */
            if (cur is target)
                return step;
            /* 将 cur 的相邻节点加入队列 */
            for (Node x : cur.adj()) {
                if (x not in visited) {
                    q.offer(x);
                    visited.add(x);
                }
            }
        }
        /* 更新步数 */
        step++;
    }
}
```

`cur.adj()` 泛指 `cur` 相邻的节点，如二维数组中，`cur` 上下左右四面的位置就是相邻节点；`visited` 的主要作用是防止走回头路，大部分时候都是必须的，但是像一般的二叉树结构，没有子节点到父节点的指针，不会走回头路就不需要 `visited`。

</br>

- [111.二叉树的最小深度](Tree/111.二叉树的最小深度.java) &emsp;[🔗](https://leetcode.cn/problems/minimum-depth-of-binary-tree/)

![](https://s3.bmp.ovh/imgs/2022/07/19/34f09e0720835bbf.png)

首先需要明确起点 `start` 和终点 `target` 是什么，怎么判断到达了终点。

显然起点就是 `root` 根节点，终点就是最靠近根节点的那个「叶子节点」，叶子节点就是两个子节点都是 `null` 的节点：

```java
if (cur.left == null && cur.right == null) 
    // 到达叶子节点
```

按照代码框架修改：

```java
public int minDepth(TreeNode root) {
    if(root == null) {
        return 0;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    // root 本身就是一层，depth 初始化为 1
    int depth = 1;

    while(!queue.isEmpty()) {
        int sz = queue.size();
        /* 遍历当前层的节点 */
        for(int i = 0; i < sz; i++) {
            TreeNode cur = queue.poll();
            /* 判断是否到达叶子结点 */
            if(cur.left == null && cur.right == null) {
                return depth;
            }
            /* 将下一层节点加入队列 */
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
        // 增加步数
        depth++;
    }
    return depth;
}
```

这里注意这个 while 循环和 for 循环的配合，while 循环控制一层一层往下走，for 循环利用 `sz` 变量控制从左到右遍历每一层二叉树节点：

![](https://s3.bmp.ovh/imgs/2022/07/19/6d8cf26e89926337.png)

这个形式在普通 BFS 问题中都很常见，但是在 Dijkstra 算法模板框架中修改了这种代码模式。

其他复杂问题都是这个框架的变形，用 BFS 找最短距离的好处就是 `depth` 每增加一次，队列中的所有节点都向前迈一步，这保证了第一次到达终点的时候，走的步数是最少的。而 DFS 要找到最短路径需要把所有节点都走完才能对比出最短路径。

一般来说在找最短路径的时候使用 BFS，其他时候还是 DFS 使用得多。

</br>

- [752.打开转盘锁](Graph/752.打开转盘锁.java) &emsp;[🔗](https://leetcode.cn/problems/open-the-lock/)

![](https://s3.bmp.ovh/imgs/2022/07/19/0e447d0e49a9fc87.png)

这题难点在于有 `deadends` 约束，不能直奔 `target`。

但若只转一次锁，一共有 4 个位置，每个位置都可以向上或向下转，也就是有 8 种可能。如从 `"0000"` 开始转一次，可能的结果有 `"1000", "9000", "0100", "0900" ...` 共 8 种密码。再以这 8 种密码为基础再转一次，穷举出所有可能。

这就可以抽象成一幅图，每个节点有 8 个相邻的节点，让求最短距离，就是典型的 BFS 算法：

```java
// 向上转
String plusOne(String s, int j) {
    char[] ch = s.toCharArray();
    if(ch[j] == '9') {
        ch[j] = '0';
    } else {
        ch[j] += 1;
    }
    return new String(ch);
}

// 向下转
String minusOne(String s, int j) {
    char[] ch = s.toCharArray();
    if(ch[j] == '0') {
        ch[j] = '9';
    } else {
        ch[j] -= 1;
    }
    return new String(ch);
}

// BFS 框架，打印出所有可能的密码
void BFS(String target) {
    Queue<String> q = new LinkedList<>();
    q.offer("0000");

    while(!q.isEmpty()) {
        int sz = q.size();
        
        //将当前队列中的所有节点向周围扩散
        for(int i = 0; i < sz; i++) {
            String cur = q.poll();
            // 判断是否到达终点
            System.out.println(cur);

            // 将一个节点的相邻节点加入队列
            // 0000 四位
            for(int j = 0; j < 4; j++) {
                String up = plusOne(cur, j);
                String down = minusOne(cur, j);
                q.offer(up);
                q.offer(down);
            }
        }
        // 增加步数
    }
}
```

这段 BFS 代码已经能够穷举所有可能的密码组合了，但有如下问题需要解决：

1. 会走回头路。如从 `"0000"` 到 `"1000"`，但是等从队列拿出 `"1000"` 时，还可以到 `"0000`"，这样会产生死循环。

2. 没有终止条件，需要返回找到 `target` 时的步数。

3. 没有对 `deadends` 的处理，这些 `deadends` 是不能出现的，遇到这些密码的时候需要跳过。

在上面代码中修改即可：

```java
public int openLock(String[] deadends, String target) {
    // 记录需要跳过的 deadens
    Set<String> deads = new HashSet<>();
    for(String s : deadends) {
        deads.add(s);
    }

    // 记录已经穷举过的密码，防止走回头路
    Set<String> visited = new HashSet<>();
    Queue<String> q = new LinkedList<>();

    // 从起点开始 BFS
    int step = 0;
    q.offer("0000");
    visited.add("0000");

    while(!q.isEmpty()) {
        int sz = q.size();
        // 将当前队列中的所有节点向周围扩散
        for(int i = 0; i < sz; i++) {
            String cur = q.poll();

            // 判断是否到达终点
            if(deads.contains(cur)) {
                continue;
            }
            if(cur.equals(target)) {
                return step;
            }

            // 将一个节点的未遍历相邻节点加入队列
            for(int j = 0; j < 4; j++) {
                String up = plusOne(cur, j);
                if(!visited.contains(up)) {
                    q.offer(up);
                    visited.add(up);
                }
                String down = minusOne(cur, j);
                if(!visited.contains(down)) {
                    q.offer(down);
                    visited.add(down);
                }
            }
        }
        // 增加步数
        step++;
    }
    // 无法达到
    return -1;
}
```

可以不需要 `dead` 这个哈希集合，直接将这些元素初始化到 `visited` 集合中效果相同。

</br>

## Dijkstra 算法

### 图的抽象

「图」这种数据结构的基本实现，图中的节点一般就抽象成一个数字（索引），图的具体实现一般是「邻接矩阵」或者「邻接表」。

![](https://s3.bmp.ovh/imgs/2022/07/19/76610c47f983f840.png)

如上图用邻接表和邻接矩阵的存储方式如下：

![](https://s1.ax1x.com/2022/07/16/j4ji0x.png)

一幅图可以用如下 Java 代码表示：

```java
// graph[s] 存储节点 s 指向的节点（出度）
List<Integer>[] graph;
```

如果要把一个问题抽象成「图」的问题，那么首先要实现一个 API `adj`：

```java
// 输入节点 s 返回 s 的相邻节点
List<Integer> adj(int s);
```

类似多叉树节点中的 `children` 字段记录当前节点的所有子节点，`adj(s)` 就是计算一个节点 `s` 的相邻节点。

比如用邻接表表示「图」的方式，`adj` 函数就可以这样表示：

```java
List<Integer>[] graph;

// 输入节点 s，返回 s 的相邻节点
List<Integer> adj(int s) {
    return graph[s];
}
```

对于「加权图」，需要知道两个节点之间的边权重是多少，所以还可以抽象出一个 `weight` 方法：

```Java
// 返回节点 from 到节点 to 之间的边的权重
int weight(int from, int to);
```

这个 `weight` 方法可以根据实际情况而定，因为不同的算法题，题目给的「权重」含义可能不一样，存储权重的方式也不一样。

有了上述基础知识，就可以搞定 Dijkstra 算法了。

</br>

### 二叉树层级遍历和 BFS 算法

二叉树的层级遍历框架：

```java
// 输入一棵二叉树的根节点，层序遍历这棵二叉树
void levelTraverse(TreeNode root) {
    if (root == null) return 0;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    int depth = 1;
    // 从上到下遍历二叉树的每一层
    while (!q.isEmpty()) {
        int sz = q.size();
        // 从左到右遍历每一层的每个节点
        for (int i = 0; i < sz; i++) {
            TreeNode cur = q.poll();
            printf("节点 %s 在第 %s 层", cur, depth);

            // 将下一层节点放入队列
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
        depth++;
    }
}
```

while 循环和 for 循环的配合正是这个遍历框架设计的巧妙之处：

![](https://s3.bmp.ovh/imgs/2022/07/19/6d8cf26e89926337.png)

**while 循环控制一层一层往下走，for 循环利用 `sz` 变量控制从左到右遍历每一层二叉树节点。**

注意代码框架中的 `depth` 变量记录了当前遍历到的层数。每当遍历到一个节点 `cur`，就知道这个节点属于第几层。

二叉树的遍历框架，可以扩展出多叉树的层序遍历框架：

```java
// 输入一棵多叉树的根节点，层序遍历这棵多叉树
void levelTraverse(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    int depth = 1;
    // 从上到下遍历多叉树的每一层
    while (!q.isEmpty()) {
        int sz = q.size();
        // 从左到右遍历每一层的每个节点
        for (int i = 0; i < sz; i++) {
            TreeNode cur = q.poll();
            printf("节点 %s 在第 %s 层", cur, depth);

            // 将下一层节点放入队列
            for (TreeNode child : cur.children) {
                q.offer(child);
            }
        }
        depth++;
    }
}
```

基于多叉树的遍历框架，可以扩展出 BFS（广度优先搜索）的算法框架：

```java
// 输入起点，进行 BFS 搜索
int BFS(Node start) {
    Queue<Node> q; // 核心数据结构
    Set<Node> visited; // 避免走回头路
    
    q.offer(start); // 将起点加入队列
    visited.add(start);

    int step = 0; // 记录搜索的步数
    while (q not empty) {
        int sz = q.size();
        /* 将当前队列中的所有节点向四周扩散一步 */
        for (int i = 0; i < sz; i++) {
            Node cur = q.poll();
            printf("从 %s 到 %s 的最短距离是 %s", start, cur, step);

            /* 将 cur 的相邻节点加入队列 */
            for (Node x : cur.adj()) {
                if (x not in visited) {
                    q.offer(x);
                    visited.add(x);
                }
            }
        }
        step++;
    }
}
```

注意，BFS 算法框架也是 while 循环嵌套 for 循环的形式，也用了一个 `step` 变量记录 for 循环执行的次数，多用了一个 `visited` 集合记录走过的节点。

对于「无权图」，其每条「边」没有权重，或者说每条「边」的权重都是 1，从起点 `start` 到任意一个节点之间的路径权重就是它们之间「边」的条数，就是 `step` 变量记录的值。

BFS 算法利用 for 循环一层一层向外扩散的逻辑和 `visited` 集合防止走回头路的逻辑，当每次从队列中拿出节点 `cur` 的时候，从 `start` 到 `cur` 的最短权重就是 `step` 记录的步数。

而对于「加权图」，这个权重可以是任意正数（Dijkstra 算法要求不能存在负权重边），比如下图的例子：

![](https://s3.bmp.ovh/imgs/2022/07/19/ca619432420f26ee.png)

如果沿用 BFS 算法中的 `step` 变量记录「步数」，显然红色路径一步就可以走到终点，但是这一步的权重很大；正确的最小权重路径应该是绿色的路径，虽然需要走很多步，但是路径权重依然很小。

Dijkstra 和 BFS 算法差不多，对之前的 BFS 框架进行改造：

**去掉 while 循环里面的 for 循环。**

for 循环是为了让二叉树一层一层往下遍历，让 BFS 算法一步一步向外扩散，因为这个层数 `depth`，或步数 `step` 在之前的场景中有用。

但现在想解决「加权图」中的最短路径问题，「步数」已经没有参考意义了，「路径的权重之和」才有意义，所以这个 for 循环可以被去掉：

```java
// 输入一棵二叉树的根节点，遍历这棵二叉树所有节点
void levelTraverse(TreeNode root) {
    if (root == null) return 0;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    // 遍历二叉树的每一个节点
    while (!q.isEmpty()) {
        TreeNode cur = q.poll();
        printf("我不知道节点 %s 在第几层", cur);

        // 将子节点放入队列
        if (cur.left != null) {
            q.offer(cur.left);
        }
        if (cur.right != null) {
            q.offer(cur.right);
        }
    }
}
```

如果想同时维护 `depth` 变量，让每个节点 `cur` 知道自己在第几层，可以新建一个 `State` 类，记录每个节点所在的层数：

```java
class State {
    // 记录 node 节点的深度
    int depth;
    TreeNode node;

    State(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}

// 输入一棵二叉树的根节点，遍历这棵二叉树所有节点
void levelTraverse(TreeNode root) {
    if(root == null) {
        return 0;
    }
    Queue<State> q = new LinkedList<>();
    q.offer(new State(root, 1));

    // 遍历二叉树的每一个节点
    while(!q.isEmpty()) {
        State cur = q.poll();
        TreeNode curNode = cur.node;
        int curDepth = cur.depth;
        printf("节点 %s 在第 %s 层", curNode, curDepth);

        // 将子节点放入队列
        if(curNode.left != null) {
            q.offer(new State(curNode.left, curDepth + 1));
        }
        if(curNode.right != null) {
            q.offer(new State(curNode.right, curDepth + 1));
        }
    }
}
```

这样，就可以不使用 for 循环也确切地知道每个二叉树节点的深度了。

</br>

### Dijkstra 算法框架

```java
// 输入一幅图和一个起点 start，计算 start 到其他节点的最短距离
int[] dijkstra(int start, List<Integer>[] graph);
```

输入一幅图 `graph` 和一个起点 `start`，返回一个记录最短路径权重的数组。

标准的 Dijkstra 算法会把从起点 `start` 到所有其他节点的最短路径都算出来，如输入起点 `start = 3`，函数返回一个 `int[]` 数组，假设赋值给 `distTo` 变量，那么从起点 `3` 到节点 `6` 的最短路径权重的值就是 `distTo[6]`。

类似二叉树的层序遍历，这里也需要用 `State` 类记录一些额外信息，也就是使用 `distFromStart` 变量记录从起点 `start` 到当前这个节点的距离：

```java
class State {
    // 图节点的 id
    int id;
    // 从 start 节点到当前节点的距离
    int distFromStart;

    State(int id, int distFromStart) {
        this.id = id;
        this.distFromStart = distFromStart;
    }
}
```

普通 BFS 算法中，根据 BFS 的逻辑和无权图的特点，第一次遇到某个节点所走的步数就是最短距离，所以用一个 `visited` 数组防止走回头路，每个节点只会经过一次。

加权图中的 Dijkstra 算法和无权图中的普通 BFS 算法不同，在 Dijkstra 算法中，第一次经过某个节点时的路径权重不一定就是最小的，所以对于同一个节点可能会经过多次，而且每次的 `distFromStart` 可能都不一样，比如下图：

![](https://s3.bmp.ovh/imgs/2022/07/19/817c4fb6b00ff29e.png)

会经过节点 `5` 三次，每次的 `distFromStart` 值都不一样。那么取 `distFromStart` 最小的那次就是从起点 `start` 到节点 `5` 的最短路径权重。

这样就可以写出 Dijkstra 算法框架了，Dijkstra 可以理解成一个带 dp table（或备忘录）的 BFS 算法，伪码如下：

```java
// 返回节点 from 到节点 to 之间的边的权重
int weight(int from, int to);

// 输入节点 s 返回 s 的相邻节点
List<Integer> adj(int s);

// 输入一幅图和一个起点 start，计算 start 到其他节点的最短距离
int[] dijkstra(int start, List<Integer>[] graph) {
    // 图中节点的个数
    int V = graph.length;

    // 记录最短路径的权重，你可以理解为 dp table
    // 定义：distTo[i] 的值就是节点 start 到达节点 i 的最短路径权重
    int[] distTo = new int[V];

    // 求最小值，所以 dp table 初始化为正无穷
    Arrays.fill(distTo, Integer.MAX_VALUE);

    // base case，start 到 start 的最短距离就是 0
    distTo[start] = 0;

    // 优先级队列，distFromStart 较小的排在前面
    Queue<State> pq = new PriorityQueue<>((a, b) -> a.distFromStart - b.distFromStart);

    // 从起点 start 开始进行 BFS
    pq.offer(new State(start, 0));

    while(!pq.isEmpty()) {
        State curState = pq.poll();
        int curDistFromStart = curState.distFromStart;

        if(curDistFromStart > distTo[curNodeID]) {
            // 已经有一条更短的路径到达 curNode 节点了
            continue;
        }

        // 将 curNode 的相邻节点装入队列
        for(int nextNodeID : adj(curNodeID)) {
            // 判断从 curNode 到 nextNode 的距离是否会更短
            int distToNextNode = distTo[curNodeID] + weight(curNodeID, nextNodeID);
            if(distTo[nextNodeID] > distToNextNode) {
                // 更新 dp table
                distTo[nextNodeID] = distToNextNode;
                // 将这个节点以及距离放入队列
                pq.offer(new State(nextNodeID, distToNextNode));
            }
        }
    }
    return distTo;
}
```

对比普通的 BFS 算法：

1. 没有 `visited` 集合记录已访问的节点，所以一个节点会被访问多次，会被多次加入队列，那会不会导致队列永远不为空，造成死循环？

2. 为什么用优先级队列 `PriorityQueue` 而不是 `LinkedList` 实现的普通队列？为什么要按照 `distFromStart` 的值来排序？

3. 如果我只想计算起点 `start` 到某一个终点 `end` 的最短路径，是否可以修改算法，提升一些效率？

首先，这个算法不用 `visited` 集合也不会死循环。循环结束的条件是队列为空，那么就要注意看什么时候往队列里放元素（调用 `offer` 方法），再注意看什么时候从队列往外拿元素（调用 `poll` 方法）。

while 循环每执行一次，都会往外拿一个元素，但想往队列里放元素就有很多限制，必须满足下面这个条件：

```java
// 判断从 curNode 到 nextNode 的距离是否会更短
if (distTo[nextNodeID] > distToNextNode) {
    // 更新 dp table
    distTo[nextNodeID] = distToNextNode;
    pq.offer(new State(nextNodeID, distToNextNode));
}
```

这个算法逻辑就是在不断的最小化 `distTo` 数组中的元素，因此 `distTo` 数组可以理解成熟悉的 `dp table`。如果能让到达 `nextNodeID` 的距离更短，就更新 `distTo[nextNodeID]` 的值，让其入队，否则不让入队。

因为两个节点之间的最短距离（路径权重）肯定是一个确定的值，不可能无限减小下去，所以队列一定会空。队列空了之后，`distTo` 数组中记录的就是从 `start` 到其他节点的最短距离。

对于第 2 点，如果要用普通队列，可以直接把 `PriorityQueue` 改成 `LinkedList`，也能得到正确答案但是效率会低很多。

Dijkstra 算法使用优先级队列，主要是为了效率上的优化，类似一种贪心算法的思路，计算从起点 `start` 到终点 `end` 的最短路径权重：

![](https://s3.bmp.ovh/imgs/2022/07/19/552858884eac2cba.png)

假设当前只遍历了图中的这几个节点，那么你下一步准备遍历的节点显然是橙色路径的可能性更大，所以我们希望节点 `2` 排在队列靠前的位置，优先被拿出来向后遍历。

所以我们使用 `PriorityQueue` 作为队列，让 `distFromStart` 的值较小的节点排在前面，这就类似贪心算法的贪心思路，可以很大程度上优化算法的效率。

对于第 3 点，如果只关心起点 `start` 到某一个终点 `end` 的最短路径，只需要稍微修改：

```java
// 输入起点 start 和终点 end，计算起点到终点的最短距离
int dijkstra(int start, int end, List<Integer>[] graph) {

    // ...

    while (!pq.isEmpty()) {
        State curState = pq.poll();
        int curNodeID = curState.id;
        int curDistFromStart = curState.distFromStart;

        // 在这里加一个判断，其他代码不用改
        if (curNodeID == end) {
            return curDistFromStart;
        }

        if (curDistFromStart > distTo[curNodeID]) {
            continue;
        }

        // ...
    }

    // 如果运行到这里，说明从 start 无法走到 end
    return Integer.MAX_VALUE;
}
```

因为优先级队列自动排序的性质，每次从队列里面拿出来的都是 `distFromStart` 值最小的，所以当第一次从队列中拿出终点 `end` 时，此时的 `distFromStart` 对应的值就是从 `start` 到 `end` 的最短距离。

这个算法较之前的实现提前 `return` 了，所以效率有一定的提高。

</br>

- [743.网络延迟时间](Graph/743.网络延迟时间.java) &emsp;[🔗](https://leetcode.cn/problems/network-delay-time/)

![](https://s3.bmp.ovh/imgs/2022/07/19/38ef0b9e0e99c0e7.png)

求所有节点都收到信号的时间，把传递时间看做距离，实际上就是问「从节点 `k` 到其他所有节点的最短路径中，最长的那条最短路径距离是多少」，也就是计算从节点 `k` 出发到其他所有节点的最短路径，就是标准的 Dijkstra 算法。

根据之前 Dijkstra 算法的框架可以写出下面代码：

```java
public int networkDelayTime(int[][] times, int n, int k) {
    // 节点编号是从 1 开始的，所以要一个大小为 n + 1 的邻接表
    List<int[]>[] graph = new LinkedList[n+1];
    for (int i = 1; i <= n; i++) {
        graph[i] = new LinkedList<>();   
    }

    // 构造图
    for(int [] edge : times) {
        int from = edge[0];
        int to = edge[1];
        int weight = edge[2];

        // from -> List<(to, weight)>
        // 邻接表存储图结构，同时存储权重信息
        graph[from].add(new int[] {to, weight});
    }
    // 使用 dijkstra 算法计算以节点 k 为起点到其他节点的最短路径
    int[] distTo = dijkstra(k, graph);

    // 找到最长的那一条最短路径
    int res = 0;
    for(int i = 0; i < distTo.length; i++) {
        if(distTo[i] == Integer.MAX_VALUE) {
            // 有节点不可达，返回 -1
            return -1;
        }
        res = Math.max(res, distTo[i]);
    }
    return res;
}

// 输入一个起点 start，计算从 start 到其他节点的最短距离
private int[] dijkstra(int start, List<int[]>[] graph) {

}
```

上述代码首先利用题目输入的数据转化成邻接表表示一幅图，接下来可以直接套用 Dijkstra 算法的框架：

```java
// 输入一个起点 start，计算从 start 到其他节点的最短距离
private int[] dijkstra(int start, List<int[]>[] graph) {
// 定义：distTo[i] 的值就是起点 start 到达节点 i 的最短路径权重
int[] distTo = new int[graph.length];
Arrays.fill(distTo, Integer.MAX_VALUE);

// base case，start 到 start 的最短距离就是 0
distTo[start] = 0;

// 优先级队列，distFromStart 较小的排在前面
Queue<State> pq = new PriorityQueue<>((a, b) -> a.distFromStart - b.distFromStart);

// 从起点 start 开始进行 BFS
pq.offer(new State(start, 0));

while(!pq.isEmpty()) {
    State curState = pq.poll();
    int curNodeID = curState.id;
    int curDistFromStart = curState.distFromStart;

    if(curDistFromStart > distTo[curNodeID]) {
        continue;
    }

    // 将 curNode 的相邻节点装入队列
    for(int[] neighbor : graph[curNodeID]) {
        int nextNodeID = neighbor[0];
        int distToNextNode = distTo[curNodeID] + neighbor[1];

        // 更新 dp table
        if(distTo[nextNodeID] > distToNextNode) {
            distTo[nextNodeID] = distToNextNode;
            pq.offer(new State(nextNodeID, distToNextNode));
        }
    }
}
return distTo;
}
```

</br>

- [1631.最小体力消耗路径](Graph/1631.最小体力消耗路径.java) &emsp;[🔗](https://leetcode.cn/problems/path-with-minimum-effort)

![](https://s3.bmp.ovh/imgs/2022/07/19/5d94ff12b40ae024.png)

如果把二维数组中每个 `(x, y)` 坐标看做一个节点，它上下左右的坐标就是相邻节点，它对应的值和相邻坐标对应的值之差的绝对值就是题目说的「体力消耗」，可以理解为边的权重。

这样，就在让求以左上角坐标为起点，以右下角坐标为终点，起点到终点的最短路径，Dijkstra 算法可以做到。**不过，这道题中评判一条路径是长还是短的标准不再是路径经过的权重总和，而是路径经过的权重最大值**。

二维矩阵抽象成图，先实现图的 `adj` 方法：

```java
// 方向数组，上下左右的坐标偏移量
int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

// 返回坐标 (x, y) 的上下左右相邻坐标
List<int[]> adj(int[][] matrix, int x, int y) {
int m = matrix.length, n = matrix[0].length;

// 存储相邻节点
List<int[]> neighbors = new ArrayList<>();
for(int[] dir : dirs) {
    int nextX = x + dir[0];
    int nextY = y + dir[1];

    if(nextX >= m || nextX < 0 || nextY >= n || nextY < 0) {
        // 索引越界
        continue;
    }
    neighbors.add(new int[]{nextX, nextY});
}
return neighbors;
}
```

类似的，现在认为一个二维坐标 `(x, y)` 是图中的一个节点，所以 `State` 类也需要修改：

```java
class State {
// 矩阵中的一个位置
int x, y;

// 从起点 (0, 0) 到当前位置的最小体力消耗（距离）
int effortFromStart;

State(int x, int y, int effortFromStart) {
    this.x = x;
    this.y = y;
    this.effortFromStart = effortFromStart;
}
}
```

这样就可以使用 Dijkstra 算法框架了：

```java
// Dijkstra 算法，计算 (0, 0) 到 (m - 1, n - 1) 的最小体力消耗
public int minimumEffortPath(int[][] heights) {
    int m = heights.length, n =heights[0].length;
    // 定义：从 (0, 0) 到 (i, j) 的最小体力消耗是 effortTo[i][j]
    int[][] effortTo = new int[m][n];

    // dp table 初始化为正无穷
    for(int i = 0; i < m; i++) {
        Arrays.fill(effortTo[i], Integer.MAX_VALUE);
    }

    // base case，起点到起点的最小消耗就是 0
    effortTo[0][0] = 0;

    // 优先级队列，effortFromStart 较小的排在前面
    Queue<State> pq = new PriorityQueue<>((a, b) -> a.effortFromStart - b.effortFromStart);

    // 从起点 (0, 0) 开始进行 BFS
    pq.offer(new State(0, 0, 0));

    while(!pq.isEmpty()) {
        State curState = pq.poll();
        int curX = curState.x;
        int curY = curState.y;
        int curEffortFromStart = curState.effortFromStart;

        // 到达终点提前结束
        if(curX == m - 1 && curY == n - 1) {
            return curEffortFromStart;
        }

        if(curEffortFromStart > effortTo[curX][curY]) {
            continue;
        }

        // 将 (curX, curY) 的相邻坐标装入队列
        for(int[] neighbor : adj(heights, curX, curY)) {
            int nextX = neighbor[0];
            int nextY = neighbor[1];

            // 计算从 (curX, curY) 达到 (nextX, nextY) 的消耗
            int effortToNextNode = Math.max(effortTo[curX][curY], 
            Math.abs(heights[curX][curY] - heights[nextX][nextY]));

            // 更新 dp table
            if(effortTo[nextX][nextY] > effortToNextNode) {
                effortTo[nextX][nextY] = effortToNextNode;
                pq.offer(new State(nextX, nextY, effortToNextNode));
            }
        }
    }
    return -1;
}
```

</br>

- [1514.概率最大的路径](Graph/1514.概率最大的路径.java) &emsp;[🔗](https://leetcode.cn/problems/path-with-maximum-probability/)

![](https://s3.bmp.ovh/imgs/2022/07/19/202b6128a20a118e.png)

这道题给的是无向图，而无向图本质上可以认为是「双向图」，从而转化成有向图。 Dijkstra 和很多最优化算法一样，计算的是「最优值」，这个最优值可能是最大值，也可能是最小值。标准 Dijkstra 算法是计算最短路径的，Dijkstra 算法不允许存在负权重边是因为 Dijkstra 计算最短路径的正确性依赖一个前提：路径中每增加一条边，路径的总权重就会增加。

所以如果想计算最长路径，路径中每增加一条边，路径的总权重就会减少，要是能够满足这个条件，也可以用 Dijkstra 算法。而这道题边和边之间是乘法关系，每条边的概率都是小于 1 的，所以肯定会越乘越小。

不过，这道题的解法要把优先级队列的排序顺序反过来，一些 if 大小判断也要反过来：

```java
double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
    List<double[]>[] graph = new LinkedList[n];
    for(int i = 0; i < n; i++) {
        graph[i] = new LinkedList<>();
    }

    // 构造无向图
    for(int i = 0; i < edges.length; i++) {
        int from = edges[i][0];
        int to = edges[i][1];
        double weight = succProb[i];

        // 双向图
        graph[from].add(new double[]{(double)to, weight});
        graph[to].add(new double[]{(double)from, weight});
    }
    return dijkstra(start, end, graph);
}

double dijkstra(int start, int end, List<double[]>[] graph) {
    // 定义：probTo[i] 的值就是节点 start 到达节点 i 的最大概率
    double[] probTo = new double[graph.length];

    // dp table 初始化为一个取不到的最小值
    Arrays.fill(probTo, -1);

    // base case，start 到 start 的概率就是 1
    probTo[start] = 1;

     // 优先级队列，probFromStart 较大的排在前面
    Queue<State> pq = new PriorityQueue<>((a, b) -> {
        return Double.compare(b.probFromStart, a.probFromStart);
    });

    // 从起点 start 开始进行 BFS
    pq.offer(new State(start, 1));

    while(!pq.isEmpty()) {
        State curState = pq.poll();
        int curNodeID = curState.id;
        double curProbFromStart = curState.probFromStart;

        // 遇到终点提前返回
        if (curNodeID == end) {
            return curProbFromStart;
        }
        
        if (curProbFromStart < probTo[curNodeID]) {
            // 已经有一条概率更大的路径到达 curNode 节点了
            continue;
        }
        // 将 curNode 的相邻节点装入队列
        for (double[] neighbor : graph[curNodeID]) {
            int nextNodeID = (int)neighbor[0];
            // 判断从 curNode 到 nextNode 的概率是否会更大
            double probToNextNode = probTo[curNodeID] * neighbor[1];
            if (probTo[nextNodeID] < probToNextNode) {
                probTo[nextNodeID] = probToNextNode;
                pq.offer(new State(nextNodeID, probToNextNode));
            }
        }
    }
    // 如果到达这里，说明从 start 开始无法到达 end，返回 0
    return 0.0;
}

class State {
    // 图节点的 id
    int id;
    // 从 start 节点到达当前节点的概率
    double probFromStart;

    State(int id, double probFromStart) {
        this.id = id;
        this.probFromStart = probFromStart;
    }
}
```

</br>

# 数据结构

## LRU 算法

LRU 是 Least Recently Used 的缩写，即最近最少使用页面置换算法，是为虚拟页式存储管理服务的，是根据页面调入内存后的使用情况进行决策了。由于无法预测各页面将来的使用情况，只能利用 “最近的过去” 作为 “最近的将来” 的近似。

因此，LRU 算法就是将最近最久未使用的页面予以淘汰。

- [146.lru-缓存](DS/146.lru-缓存.java) &emsp;[🔗](https://leetcode.cn/problems/lru-cache)

![](https://s3.bmp.ovh/imgs/2022/07/20/c8fb511179a25999.png)

设计数据结构：

首先要接收一个 `capacity` 参数作为缓存的最大容量，然后实现两个 API，一个是 `put(key, val)` 方法存入键值对，另一个是 `get(key)` 方法获取 `key` 对应的 `val`，如果 `key` 不存在则返回 `-1`。

对题目示例的解释：

```java
/* 缓存容量为 2 */
LRUCache cache = new LRUCache(2);
// 可以把 cache 理解成一个队列
// 假设左边是队头，右边是队尾
// 最近使用的排在队头，久未使用的排在队尾
// 圆括号表示键值对 (key, val)

cache.put(1, 1);
// cache = [(1, 1)]

cache.put(2, 2);
// cache = [(2, 2), (1, 1)]

cache.get(1);       // 返回 1
// cache = [(1, 1), (2, 2)]
// 解释：因为最近访问了键 1，所以提前至队头
// 返回键 1 对应的值 1

cache.put(3, 3);
// cache = [(3, 3), (1, 1)]
// 解释：缓存容量已满，需要删除内容空出位置
// 优先删除久未使用的数据，也就是队尾的数据
// 然后把新的数据插入队头

cache.get(2);       // 返回 -1 (未找到)
// cache = [(3, 3), (1, 1)]
// 解释：cache 中不存在键为 2 的数据

cache.put(1, 4);    
// cache = [(1, 4), (3, 3)]
// 解释：键 1 已存在，把原始值 1 覆盖为 4
// 不要忘了也要将键值对提前到队头
```

分析上面的操作过程，要让 `put` 和 `get` 方法的时间复杂度为` O(1)`，可以总结出 `cache` 这个数据结构必要的条件：

1. 显然 `cache` 中的元素必须有时序，以区分最近使用的和久未使用的数据，当容量满后要删除最近最久未使用的元素空出位置。

2. 要在 `cache` 中快速找某个 `key` 是否已存在并得到对应的 `val`；

3. 每次访问 `cache` 中的某个 `key`，需要将这个元素变为最近使用的，也就是说 `cache` 要支持在任意位置快速插入和删除元素。

同时符合上述条件的数据结构中，哈希表查找快，但数据无固定顺序；链表有顺序之分，插入删除快，但是查找慢。因此根据计算机通用的折中，形成一种新的数据结构：哈希链表 `LinkedHashMap`。

LRU 缓存算法的核心数据结构就是哈希链表，双向链表和哈希表的结合体：

![](https://s3.bmp.ovh/imgs/2022/07/20/08ffeaba0e8600be.png)

借助这个结构，前面的 3 个条件：

1. 如果每次默认从链表尾部添加元素，那么显然越靠尾部的元素就是最近使用的，越靠头部的元素就是最久未使用的。

2. 对于某一个 `key`，可以通过哈希表快速定位到链表中的节点，从而取得对应 `val`。

3. 链表显然是支持在任意位置快速插入和删除的，修改指针就即可。不过传统的链表无法按照索引快速访问某一个位置的元素，而这里借助哈希表，可以通过 `key` 快速映射到任意一个链表节点，然后进行插入和删除。

这里先手动造轮子，不使用 Java 内置的 `LinkedHashMap`。首先实现双链表的节点类：

```java
class Node {
    public int key, val;
    public Node next, prev;
    
    public Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}
```

依靠 `Node` 类型构建一个双链表，实现几个 LRU 算法必须的 API：

```java
class DoubleList {
    // 虚拟头尾节点
    private Node head, tail;  
    // 链表元素数
    private int size;

    public DoubleList() {
        // 初始化双向链表的数据
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    // 在链表尾部添加节点 x，时间 O(1)
    public void addLast(Node x) {
        x.prev = tail.prev;
        x.next = tail;
        tail.prev.next = x;
        tail.prev = x;
        size++;
    }

    // 删除链表中的 x 节点（x 一定存在）
    // 由于是双链表且给的是目标 Node 节点，时间 O(1)
    public void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    // 删除链表中第一个节点，并返回该节点，时间 O(1)
    public Node removeFirst() {
        if(head.next == tail) {
            return null;
        }
        Node first = head.next;
        remove(first);
        return first;
    }

    // 返回链表长度，时间 O(1)
    public int size() {
        return size;
    }
}
```

这样，就可以体现出为什么需要使用双向链表了：因为我们需要删除操作。删除一个节点不光要得到该节点本身的指针，也需要操作其前驱节点的指针，而双向链表才能支持直接查找前驱，保证操作的时间复杂度 `O(1)`。

注意我们实现的双链表 API 只能从尾部插入，也就是说靠尾部的数据是最近使用的，靠头部的数据是最久未使用的。

有了双向链表的实现，只需要在 LRU 算法中把它和哈希表结合起来即可，代码框架：

```java
class LRUCache {
    // key -> Node(key, val)
    private HashMap<Integer, Node> map;
    // Node(k1, v1) <-> Node(k2, v2)...
    private DoubleList cache;
    // 最大容量
    private int cap;
    
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }
```

由于要同时维护一个双链表 `cache` 和一个哈希表 `map`，因此一些操作需要注意同步，如删除某个 `key` 时，需要在 `cache` 中删除对应的 `Node`，同时需要在 `map` 中删除 `key`。一个有效的方案是：在这两种数据结构之上提供一层抽象 API。就是尽量让 LRU 的主方法 `get` 和 `put` 避免直接操作 `map` 和 `cache` 的细节：

```java
// 将某个 key 提升为最近使用的
private void makeRecently(int key) {
    Node x = map.get(key);
    // 先从链表中删除这个节点
    cache.remove(x);
    // 重新插到队尾
    cache.addLast(x);
}

// 添加最近使用的元素
private void addRecently(int key, int val) {
    Node x = new Node(key, val);
    // 链表尾部就是最近使用的元素
    cache.addLast(x);
    // 在 map 中添加 key 的映射
    map.put(key, x);
}

// 删除某一个 key
private void deleteKey(int key) {
    Node x = map.get(key);
    // 从链表中删除
    cache.remove(x);
    // 从 map 中删除
    map.remove(key);
}

// 删除最久未使用的元素
private void removeLeastRecently() {
    // 链表头部的第一个元素就是最久未使用的
    Node deletedNode = cache.removeFirst();
    // 同时从 map 中删除它的 key
    int deletedKey = deletedNode.key;
    map.remove(deletedKey);
}
```

这里就可以看出在链表中同时存储 `key` 和 `val` 而不是只存储 `val` 的原因： 在 `removeLeastRecently` 函数中需要用 `deletedNode` 得到 `deletedKey`。

也就是说，当缓存容量满时，不仅仅要删除最后一个 `Node` 节点，还要把 `map` 中映射到该节点的 `key` 同时删除，而这个 `key` 只能由 `Node` 得到。如果 `Node` 结构中只存储 `val`，那么就无法获取 `key`，就无法删除 `map` 中的键，造成错误。

上述方法就是简单的操作封装，调用这些函数可以避免直接操作 `cache` 链表和 `map` 哈希表，下面实现 LRU 算法的 `get` 方法：

```java
public int get(int key) {
    if(!map.containsKey(key)) {
        return -1;
    }
    // 将该数据提升为最近使用的
    makeRecently(key);
    return map.get(key).val;
}
```

`put` 方法的逻辑：

![](https://s3.bmp.ovh/imgs/2022/07/20/a75fcba3cc6f46ab.png)

代码：

```java
public void put(int key, int val) {
    if(map.containsKey(key)) {
        // 删除旧的数据
        deleteKey(key);
        // 新插入的数据为最近使用的数据
        addRecently(key, val);
        return;
    }

    if(cap == cache.size()) {
        // 删除最久未使用的元素
        removeLeastRecently();
    }

    // 添加为最近使用的元素
    addRecently(key, val);
}
```

这样就实现了 LRUCache 类。最后用 Java 的内置类型 `LinkedHashMap` 来实现 LRU 算法，逻辑和之前完全一致：

```java
class LRUCache {
    int cap;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
    
    public void LRUCache(int capacity) {
        cap = capacity;
    }

    public void get(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }
        return cache.get(key).val;
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            // 修改 key 的值
            cache.put(key, val);
            // 将 key 变为最近使用
            makeRecently(key);
            return;
        }
        
        if (cache.size() >= this.cap) {
            // 链表头部就是最久未使用的 key
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        // 将新的 key 添加链表尾部
        cache.put(key, val);
    }
    
    private void makeRecently(int key) {
        int val = cache.get(key);
        // 删除 key，重新插入到队尾
        cache.remove(key);
        cache.put(key, val);
    }
}
```

</br>

## LFU 算法

LFU 是 Least Frequently Used 的缩写，即最近最少使用策略，也就是说在一段时间内数据被使用频次最少的优先被淘汰。

从实现难度上来说，LFU 算法的难度大于 LRU 算法， LFU 算法是淘汰访问频次最低的数据，如果访问频次最低的数据有多条，需要淘汰最旧的数据。把数据按照访问频次进行排序，而且频次还会不断变化。

- [460.lfu-缓存](DS/460.lfu-缓存.java) &emsp;[🔗](https://leetcode.cn/problems/lfu-cache)

![](https://s3.bmp.ovh/imgs/2022/07/20/63519fa54826011e.png)

- `get(key)` 方法会去缓存中查询键 `key`，如果 `key` 存在，则返回 `key` 对应的 `val`，否则返回 `-1`。

- `put(key, value)` 方法插入或修改缓存。如果 `key` 已存在，则将它对应的值改为 `val`；如果 `key` 不存在，则插入键值对 `(key, val)`。

- 当缓存达到容量 `capacity` 时，则应该在插入新的键值对之前，删除使用频次（用 `freq` 表示）最低的键值对。如果 `freq` 最低的键值对有多个，则删除其中最旧的一个。

```
// 构造一个容量为 2 的 LFU 缓存
LFUCache cache = new LFUCache(2);

// 插入两对 (key, val)，对应的 freq 为 1
cache.put(1, 10);
cache.put(2, 20);

// 查询 key 为 1 对应的 val
// 返回 10，同时键 1 对应的 freq 变为 2
cache.get(1);

// 容量已满，淘汰 freq 最小的键 2
// 插入键值对 (3, 30)，对应的 freq 为 1
cache.put(3, 30);   

// 键 2 已经被淘汰删除，返回 -1
cache.get(2); 
```

根据 LFU 算法的逻辑列举出算法需求：

1. 调用 `get(key)` 方法时，要返回该 `key` 对应的 `val`。

2. 只要用 `get` 或者 `put` 方法访问一次某个 `key`，该 `key` 的 `freq` 就加一。

3. 如果在容量满了的时候进行插入，则需要将 `freq` 最小的 `key` 删除，如果最小的 `freq` 对应多个 `key`，则删除其中最旧的一个。

需要在 O(1) 的时间内解决这些需求，可以使用基本数据结构：

1. 使用一个 `HashMap` 存储 `key` 到 `val` 的映射，就可以快速计算 `get(key)`。

```Java
HashMap<Integer, Integer> keyToVal;
```

2. 使用一个 `HashMap` 存储 `key` 到 `freq` 的映射，就可以快速操作 `key` 对应的 `freq`。

```java
HashMap<Integer, Integer> keyToFreq;
```

3. 这个需求是 LFU 算法的核心
    1. 首先需要 `freq` 到 `key` 的映射，用来找到 `freq` 最小的 `key`。

    2. 要将 `freq` 最小的 `key` 删除，就需要快速得到当前所有 `key` 最小的 `freq`。若想时间复杂度为 `O(1)`，就不能遍历寻找，需要用一个变量 `minFreq` 来记录当前最小的 `freq`。
   
    3. 可能有多个 `key` 拥有相同的 `freq`，所以 `freq` 对 `key` 是一对多的关系，即一个 `freq` 对应一个 `key` 的列表。

    4. `freq` 对应的 `key` 的列表是存在时序的，便于快速查找并删除最旧的 `key`。

    5. 能够快速删除 `key` 列表中的任何一个 `key`。如果频次为 `freq` 的某个 `key` 被访问，那么它的频次就会变成 `freq+1`，就应该从 `freq` 对应的 `key` 列表中删除，加到 `freq+1` 对应的 `key` 的列表中。

```java
HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;
int minFreq = 0;
```

`LinkedHashSet` 是链表和哈希集合的结合体。链表不能快速访问链表节点，但是插入元素具有时序；哈希集合中的元素无序，但是可以对元素进行快速的访问和删除。它们结合起来就兼具了哈希集合和链表的特性，既可以在 `O(1)` 时间内访问或删除其中的元素，又可以保持插入的时序，高效实现 3.5 这个需求。

综上，可以写出 LFU 算法的基本数据结构：

```java
class LFUCache {
    // key 到 val 的映射，称 KV 表
    HashMap<Integer, Integer> keyToVal;

    // key 到 freq 的映射，称 KF 表
    HashMap<Integer, Integer> keyToFreq;

    // freq 到 key 列表的映射，称 FK 表
    HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;

    // 记录最小的频次
    int minFreq;

    // 记录 LFU 缓存的最大容量
    int cap;

    public LFUCache(int capacity) {
        keyToVal = new HashMap<>();
        keyToFreq = new HashMap<>();
        freqToKeys = new HashMap<>();

        this.cap = capacity;
        this.minFreq = 0;
    }

    public int get(int key){}

    public void put(int key, int value) {}
}
```

首先实现 `get(key)` 方法，返回 `key` 对应的 `val`，然后增加 `key` 对应的`freq`：

```java
public int get(int key) {
    if(!keyToVal.containsKey(key)) {
        return -1;
    }
    // 增加 key 对应的 freq
    increaseFreq(key);
    return keyToVal.get(key);
}
```

增加key对应的freq是 LFU 算法的核心，所以抽象成一个函数 `increaseFreq`。

然后实现 `put(key, val)` 方法，逻辑如下图：

![](https://s3.bmp.ovh/imgs/2022/07/20/01f57ee4ab018b3f.png)

```java
public void put(int key, int val) {
    if(this.cap <= 0) {
        return;
    }

    // 若 key 已存在，修改对应的 val
    if(keyToVal.containsKey(key)) {
        keyToVal.put(key, val);
        // key 对应的 freq 增加 1
        increaseFreq(key);
        return;
    }

    // key 不存在，需要插入
    // 容量已满需要淘汰一个 freq 最小的 key
    if(this.cap <= keyToVal.size()) {
        removeMinFreqKey();
    }

    // 插入 key 和 val，对应的 freq 为 1
    // 插入 KV 表
    keyToVal.put(key, val);
    // 插入 KF 表
    keyToFreq.put(key, 1);
    // 插入 FK 表
    freqToKeys.put(1, new LinkedHashSet<>());
    freqToKeys.get(1).add(key);

    // 插入新 key 后最小的 freq 是 1
    this.minFreq = 1;
}
```

`increaseFreq` 和 `removeMinFreqKey` 方法是 LFU 算法的核心，首先实现 `removeMinFreqKey()`：

```java
private void removeMinFreqKey() {
    // freq 最小的 key 列表
    LinkedHashSet<Integer> minKeyList = freqToKeys.get(minFreq);

    // 其中最先被插入的那个 key 就是该被淘汰的 key
    int deletedKey = minKeyList.iterator().next();

    // 更新 FK 表
    minKeyList.remove(deletedKey);
    if(minKeyList.isEmpty()) {
        freqToKeys.remove(this.minFreq);
    }

    // 更新 KV 表
    keyToVal.remove(deletedKey);
    // 更新 KF 表
    keyToFreq.remove(deletedKey);
}
```

删除某个键 `key` 需要同时修改三个映射表，借助 `minFreq` 参数可以从 `FK` 表中找到 `freq` 最小的 `minKeyList`，根据时序，其中第一个元素就是要被淘汰的 `deletedKey`，操作三个映射表删除这个 `key` 即可。

如果 `minKeyList` 中只有一个元素，那么删除之后 `minFreq` 对应的 `key` 列表就为空了，也就是 `minFreq` 变量需要被更新。如何计算当前的 `minFreq` 是多少呢？

实际上无法快速计算 `minFreq`，只能线性遍历 `FK` 表或者 `KF` 表来计算，但这样肯定不能保证 `O(1)` 的时间复杂度。

但是这里没有必要更新 `minFreq` 变量，因为 `removeMinFreqKey` 这个函数是在 `put` 方法中插入新 `key` 时可能调用。而 `put` 插入新 `key` 时一定会把 `minFreq` 更新成 1，所以说这里 `minFreq` 值不需要考虑。

然后实现 `increaseFreq()`：

```java
private void increaseFreq(int key) {
    int freq = keyToFreq.get(key);
    
    // 更新 KF 表
    keyToFreq.put(key, freq + 1);

    // 更新 FK 表
    // 将 key 从 freq 对应的列表中删除
    freqToKeys.get(freq).remove(key);

    // 将 key 加入 freq + 1 对应的列表中
    freqToKeys.putIfAbsent(freq + 1, new LinkedHashSet<>());
    freqToKeys.get(freq + 1).add(key);

    // 如果 freq 对应的列表空了，移除这个 freq
    if (freqToKeys.get(freq).isEmpty()) {
        freqToKeys.remove(freq);
        // 如果这个 freq 恰好是 minFreq，更新 minFreq
        if (freq == this.minFreq) {
            this.minFreq++;
        }
    }
}
```

更新某个 `key` 的 `freq` 会涉及 `FK` 表和 `KF` 表，所以分别更新这两个表即可。

和之前类似，当 `FK` 表中 `freq` 对应的列表被删空后，需要删除 `FK` 表中 `freq` 这个映射。如果这个 `freq` 恰好是 `minFreq`，说明 `minFreq` 变量需要更新。因为把 `key` 的 `freq` 加 1，所以 `minFreq` 也加 1。

这样就实现了 LFU 算法。

</br>

## 设计朋友圈时间线

- [355.设计推特](DS/355.设计推特.java) &emsp;[🔗](https://leetcode.cn/problems/design-twitter/)

![](https://s3.bmp.ovh/imgs/2022/07/20/c437418baee0ab8d.png)

Twitter 和微博功能差不多，主要要实现这样几个 API：

```Java
class Twitter {

    /** user 发表一条 tweet 动态 */
    public void postTweet(int userId, int tweetId) {}
    
    /** 返回该 user 关注的人（包括他自己）最近的动态 id，
    最多 10 条，而且这些动态必须按从新到旧的时间线顺序排列。*/
    public List<Integer> getNewsFeed(int userId) {}
    
    /** follower 关注 followee，如果 Id 不存在则新建 */
    public void follow(int followerId, int followeeId) {}
    
    /** follower 取关 followee，如果 Id 不存在则什么都不做 */
    public void unfollow(int followerId, int followeeId) {}
}
```

题目示例解释：

```java
Twitter twitter = new Twitter();

twitter.postTweet(1, 5);
// 用户 1 发送了一条新推文 5

twitter.getNewsFeed(1);
// return [5]，因为自己是关注自己的

twitter.follow(1, 2);
// 用户 1 关注了用户 2

twitter.postTweet(2, 6);
// 用户 2 发送了一个新推文 (id = 6)

twitter.getNewsFeed(1);
// return [6, 5]
// 解释：用户 1 关注了自己和用户 2，所以返回他们的最近推文
// 而且 6 必须在 5 之前，因为 6 是最近发送的

twitter.unfollow(1, 2);
// 用户 1 取消关注了用户 2

twitter.getNewsFeed(1);
// return [5]
```

这几个 API 中最核心的功能难点是 `getNewsFeed`，返回的结果必须在时间上有序，但用户的关注是动态变化的。

如果把每个用户各自的推文存储在链表里，每个链表节点存储文章 `id` 和一个时间戳 `time`（记录发帖时间以便比较），且这个链表是按 `time` 有序的，那么如果某个用户关注了 `k` 个用户，就可以用合并 `k` 个有序链表的算法合并出有序的推文列表，正确地 `getNewsFeed`。

根据分析，需要一个 `User` 类储存 `user` 信息，还需要一个 `Tweet` 类储存推文信息，并且要作为链表的节点。所以先搭建整体框架：

```java
class Twitter {
    private static int timestamp = 0;
    private static class Tweet {}
    private static class User {}

    /* API */
    public void postTweet(int userId, int tweetId) {}
    public List<Integer> getNewsFeed(int userId) {}
    public void follow(int followerId, int followeeId) {}
    public void unfollow(int followerId, int followeeId) {}
}
```

之所以要把 `Tweet` 和 `User` 类放到 `Twitter` 类里面，是因为 `Tweet` 类必须要用到一个全局时间戳 `timestamp`，而 `User` 类又需要用到 `Tweet` 类记录用户发送的推文，所以它们都作为内部类。

</br>

1. Tweet 类的实现

每个 `Tweet` 实例需要记录自己的 `tweetId` 和发表时间 `time`，且作为链表节点，要有一个指向下一个节点的 `next` 指针。

```java
class Tweet {
    private int id;
    private int time;
    private Tweet next;

    // 需要传入推文内容（id）和发文时间
    public Tweet(int id, int time) {
        this.id = id;
        this.time = time;
        this.next = null;
    }
}
```

![](https://s3.bmp.ovh/imgs/2022/07/20/1bf101ef2c1d3ccb.png)

</br>

2. User 类的实现

一个用户需要存储的信息有 `userId`，关注列表，以及该用户发过的推文列表。其中关注列表应该用集合（HashSet）这种数据结构来存，因为不能重复，而且需要快速查找；推文列表应该由链表这种数据结构储存，以便于进行有序合并的操作：

![](https://s3.bmp.ovh/imgs/2022/07/20/31932608faf0d171.png)

除此之外，根据面向对象的设计原则，「关注」「取关」和「发文」应该是 `User` 的行为，而且关注列表和推文列表也存储在 `User` 类中，所以也应该给 `User` 添加 `follow`、`unfollow` 和 `post` 方法：

```java
// static int timestamp = 0
class User {
    private int id;
    public Set<Integer> followed;
    // 用户发表的推文链表头结点
    public Tweet head;

    public User(int id) {
        followed = new HashSet<>();
        this.id = id;
        this.head = null;

        // 关注自己
        follow(id);
    }

    public void follow(int userId) {
        followed.add(userId);
    }

    public void unfollow(int userId) {
        // 不能取关自己
        if(userId != this.id) {
            followed.remove(userId);
        }
    }

    public void post(int tweetId) {
        Tweet tweet = new Tweet(tweetId, timestamp);
        timestamp++;

        // 将新建的推文插入链表头
        // 越靠前的推文 time 值越大
        tweet.next = head;
        head = tweet;
    }
}
```

</br>

3. API 实现

```java
class Twitter {
    private static int timestamp = 0;
    private static class Tweet {...}
    private static class User {...}

    // 需要一个映射将 userId 和 User 对象对应起来
    private HashMap<Integer, User> userMap = new HashMap<>();

    /** user 发表一条 tweet 动态 */
    public void postTweet(int userId, int tweetId) {
        // 若 userId 不存在，则新建
        if(!userMap.containsKey(userId)) {
            userMap.put(userId, new User(userId));
        }
        User u = userMap.get(userId);
        u.post(tweetId);
    }

    /** follower 关注 followee */
    public void follow(int followerId, int followeeId) {
        // 若 follower 不存在，则新建
        if(!userMap.containsKey(followerId)) {
            User u = new User(followerId);
            userMap.put(followerId, u);
        }
        // 若 followee 不存在，则新建
        if(!userMap.containsKey(followeeId)) {
            User u = new User(followeeId);
            userMap.put(followeeId, u);
        }   
        userMap.get(followerId).follow(followeeId); 
    }

     /** follower 取关 followee，如果 Id 不存在则什么都不做 */
     public void unfollow(int followerId, int followeeId) {
        if(userMap.containsKey(followeeId)) {
            User follower = userMap.get(followeeId);
            follower.unfollow(followeeId);
        }
     }

     /** 返回该 user 关注的人（包括他自己）最近的动态 id，
    最多 10 条，而且这些动态必须按从新到旧的时间线顺序排列。*/
    public List<Integer> getNewsFeed(int userId) {
        // 见下文
    }
}
```

</br>

4. getNewsFeed 算法实现

实现合并 k 个有序链表的算法需要用到优先级队列（PriorityQueue），这种数据结构是「二叉堆」最重要的应用，可以理解为它可以对插入的元素自动排序。乱序的元素插入其中就被放到了正确的位置，可以按照从小到大（或从大到小）有序地取出元素。

```python
PriorityQueue pq
# 乱序插入
for i in {2,4,1,9,6}:
    pq.add(i)
while pq not empty:
    # 每次取出第一个（最小）元素
    print(pq.pop())

# 输出有序：1,2,4,6,9
```

把优先级队列设为按 `time` 属性从大到小降序排列，因为 `time` 越大意味着时间越近，应该排在前面：

```java
public List<Integer> getNewsFeed(int userId) {
    List<Integer> res = new ArrayList<>();
    if(!userMap.containsKey(userId)) {
        return res;
    }

    // 关注列表的用户 Id
    Set<Integer> users = userMap.get(userId).followed;

    // 自动通过 time 属性从大到小排序，容量为 users 的大小
    PriorityQueue<Tweet> pq = new PriorityQueue<>(user.size(), (a, b) -> b.time - a.time);

    // 先将所有链表头节点插入优先级队列
    for(int id : users) {
        Tweet tweet = userMap.get(id).head;
        if(tweet == null) {
            continue;
        }
        pq.add(tweet);
    }

    while(!pq.isEmpty()) {
        // 最多返回 10 条
        if(res.size() == 10) {
            break;
        }

        // 弹出 time 值最大的（最近发表的）
        Tweet tweet = pq.poll();
        res.add(tweet.id);

        // 将下一篇 Tweet 插入进行排序
        if(tweet.next != null) {
            pq.add(tweet.next);
        }
    }
    return res;
}
```

过程假设有三个 `Tweet` 链表按 `time` 属性降序排列，把它们降序合并添加到 `res` 中。注意图中链表节点中的数字是 `time` 属性，不是 `id` 属性：

![](https://labuladong.github.io/algo/images/%e8%ae%be%e8%ae%a1Twitter/merge.gif)

至此，这道一个极其简化的 Twitter 时间线功能就设计完毕了。

</br>

## 前缀树算法

Trie 树又叫字典树、前缀树、单词查找树，是一种二叉树衍生出来的高级数据结构，主要应用场景是处理字符串前缀相关的操作。

常见的 `Map` 和 `Set` 的底层实现原理有哈希表和二叉搜索树两种，如 Java 的 `HashMap/HashSet` 和 C++ 的 `unorderd_map/unordered_set` 底层就是用哈希表实现，而 Java 的 `TreeMap/TreeSet` 和 C++ 的 `map/set` 底层使用红黑树这种自平衡 BST 实现的。

而下面要实现的 `TrieSet/TrieMap` 底层则用 Trie 树这种结构来实现。

本质上 `Set` 可以视为一种特殊的 `Map`，`Set` 其实就是 `Map` 中的键。所以下面先实现 `TrieMap`，然后在 `TrieMap` 的基础上封装出 `TrieSet`。

各种结构都是为了在「特定场景」下尽可能高效地进行增删查改。如 `HashMap<K, V>` 的优势是能够在 `O(1)` 时间通过键查找对应的值，但要求键的类型 `K` 必须是「可哈希」的；而 `TreeMap<K, V>` 的特点是方便根据键的大小进行操作，但要求键的类型 `K` 必须是「可比较」的。

下面要实现的 `TrieMap` 也是类似的，由于 Trie 树原理，我们要求 `TrieMap<V>` 的键必须是字符串类型，值的类型 `V` 可以随意。

</br>

### Trie 树原理

**Trie 树本质上就是一棵从二叉树衍生出来的多叉树。**

二叉树节点的代码实现：

```java
/* 基本的二叉树节点 */
class TreeNode {
    int val;
    TreeNode left, right;
}
```

其中 `left, right` 存储左右子节点的指针。

多叉树节点的代码实现：

```java
/* 基本的多叉树节点 */
class TreeNode {
    int val;
    TreeNode[] children;
}
```

其中 `children` 数组中存储指向孩子节点的指针。

而 `TrieMap` 中的树节点 `TrieNode` 的代码实现：

```java
/* Trie 树节点实现 */
class TrieNode<V> {
    V val = null;
    TrieNode<V>[] children = new TrieNode[256];
}
```

这个 `val` 字段存储键对应的值，`children` 数组存储指向子节点的指针。

但是和之前的普通多叉树节点不同，`TrieNode` 中 `children` 数组的索引是有意义的，代表键中的一个字符。

如 `children[97]` 若非空，说明这里存储了一个字符 `'a'`，因为 `'a'` 的 ASCII 码为 97。

这里只考虑处理 ASCII 字符，所以 `children` 数组的大小设置为 256。可以根据具体问题修改，比如改成更小的数组或者 `HashMap<Character, TrieNode>` 都是一样的效果。

Trie 树的结构：

![](https://s3.bmp.ovh/imgs/2022/07/21/42ae8f27d056f5d4.png)

一个节点有 256 个子节点指针，但大多数时候都是空的，可以省略掉不画，所以一般看到的 Trie 树结构如下图：

![](https://s3.bmp.ovh/imgs/2022/07/21/52073fda17f7e8b2.png)

这是在 `TrieMap<Integer`> 中插入一些键值对后的样子，白色节点代表 `val` 字段为空，橙色节点代表 `val` 字段非空。

特别注意，`TrieNode` 节点本身只存储 `val` 字段，并没有一个字段来存储字符，字符是通过子节点在父节点的 `children` 数组中的索引确定的。

形象理解就是，Trie 树用「树枝」存储字符串（键），用「节点」存储字符串（键）对应的数据（值）。所以在图中把字符标在树枝，键对应的值 `val` 标在节点上：

![](https://s3.bmp.ovh/imgs/2022/07/21/6855db9918e34ab8.png)

因为其中的字符串共享前缀，相同前缀的字符串集中在 Trie 树中的一个子树上，给字符串的处理带来很大的便利。使用 Trie 树又叫做前缀树。

</br>

### TrieMap/TrieSet API 实现

假设 TrieMap 中已经存储了如上图键值对：

```java
// 底层用 Trie 树实现的键值映射
// 键为 String 类型，值为类型 V
class TrieMap<V> {

    /***** 增/改 *****/

    // 在 Map 中添加 key
    public void put(String key, V val);

    /***** 删 *****/

    // 删除键 key 以及对应的值
    public void remove(String key);

    /***** 查 *****/

    // 搜索 key 对应的值，不存在则返回 null
    // get("the") -> 4
    // get("tha") -> null
    public V get(String key);

    // 判断 key 是否存在在 Map 中
    // containsKey("tea") -> false
    // containsKey("team") -> true
    public boolean containsKey(String key);

    // 在 Map 的所有键中搜索 query 的最短前缀
    // shortestPrefixOf("themxyz") -> "the"
    public String shortestPrefixOf(String query);

    // 在 Map 的所有键中搜索 query 的最长前缀
    // longestPrefixOf("themxyz") -> "them"
    public String longestPrefixOf(String query);

    // 搜索所有前缀为 prefix 的键
    // keysWithPrefix("th") -> ["that", "the", "them"]
    public List<String> keysWithPrefix(String prefix);

    // 判断是和否存在前缀为 prefix 的键
    // hasKeyWithPrefix("tha") -> true
    // hasKeyWithPrefix("apple") -> false
    public boolean hasKeyWithPrefix(String prefix);

    // 通配符 . 匹配任意字符，搜索所有匹配的键
    // keysWithPattern("t.a.") -> ["team", "that"]
    public List<String> keysWithPattern(String pattern);

    // 通配符 . 匹配任意字符，判断是否存在匹配的键
    // hasKeyWithPattern(".ip") -> true
    // hasKeyWithPattern(".i") -> false
    public boolean hasKeyWithPattern(String pattern);

    // 返回 Map 中键值对的数量
    public int size();
}
```

`TrieSet` 的 API 大同小异，这里不重复列举。

首先，`TrieMap` 类中一定需要记录 Trie 的根节点 `root`，以及 Trie 树中的所有节点数量用于实现 `size()` 方法：

```java
class TrieMap<V> {
    // ASCII 码个数
    private static final int R = 256;
    // 当前存在 Map 中的键值对个数
    private int size = 0;

    private static class TrieNode<V> {
        V val = null;
        TrieNode<V>[] children = new TrieNode[R];
    }

    // Trie 树的根节点
    private TrieNode<V> root = null;

    /* 其他 API 的实现... */

    public int size() {
        return size;
    }
}
```

另外，再实现一个工具函数 `getNode`：

```java
// 从节点 node 开始搜索 key，如果存在返回对应节点，否则返回 null
private TrieNode<V> getNode(TrieNode<V> node, String key) {
    TrieNode<V> p = node;

    // 从节点 node 开始搜索 key
    for(int i = 0; i < key.length(); i++) {
        if(p == null) {
            return null;
        }

        // 向下搜索
        char c = key.charAt(i);
        p = p.children[c];
    }

    return p;
}
```

![](https://s3.bmp.ovh/imgs/2022/07/21/513cac8fe97f601e.png)

这样就可以实现 `containsKey` 和 `get` 方法了：

```java
// 搜索 key 对应的值，不存在则返回 null
public V get(String key) {
    // 从 root 开始搜索 key
    TrieNode<V> node = getNode(root, key);
    if(node == null || node.val == null) {
        // node 为空或 node 的 val 字段为空都说明 key 没有对应的值
        return null;
    }
    return node.val;
}

// 判断 key 是否存在在 Map 中
public boolean containsKey(String key) {
    return get(key) != null;
}
```

需要注意，就算 `getNode(key)` 的返回值 `node` 非空，也只能说字符串 `key` 是一个「前缀」；除非 `node.val` 同时非空，才能判断键 `key` 存在。

不过，这个特性恰好能够帮我们实现 `hasKeyWithPrefix` 方法：

```java
// 判断是和否存在前缀为 prefix 的键
public boolean hasKeyWithPrefix(String prefix) {
    // 只要能找到一个节点，就是存在前缀
    return getNode(root, prefix) != null;
}
```

类似于 `getNode` 方法的逻辑可以实现 `shortestPrefixOf` 方法，只要在第一次遇到存有 val 的节点时返回：

```java
// 在所有键中寻找 query 的最短前缀
public String shortestPrefixOf(String query) {
    TrieNode<V> p = root;
    // 从节点 node 开始搜索 key
    for(int i = 0; i < query.length(); i++) {
        if(p == null) {
            return "";
        }
        if(p.val != null) {
            // 找到一个键是 query 的前缀
            return query.substring(0, i);
        }
        // 向下搜索
        char c = query.charAt(i);
        p = p.children[c];
    }

    if(p != null && p.val != null) {
        // 如果 query 本身就是一个键
        return query;
    }
    return "";
}
```

这里需要注意的是 for 循环结束之后还需要额外检查一下。

因为 Trie 树中「树枝」存储字符串，「节点」存储字符串对应的值，for 循环相当于只遍历了「树枝」，但漏掉了最后一个「节点」，即 `query` 本身就是 TrieMap 中的一个键的情况。

`longestPrefixOf` 非常类似：

```java
`longestPrefixOf` 也是非常类似的：
public String longestPrefixOf(String query) {
    TrieNode<V> p = root;
    // 记录前缀的最大长度
    int maxLen = 0;

    // 从节点 node 开始搜索 key
    for(int i = 0; i < query.length(); i++) {
        if(p == null) {
            break;
        }
        if(p.val != null) {
             // 找到一个键是 query 的前缀，更新前缀的最大长度
             maxLen = i;
        }
        // 向下搜索
        char c = query.charAt(i);
        p = p.children[c];
    }

    if (p != null && p.val != null) {
        // 如果 query 本身就是一个键
        return query;
    }
    return query.substring(0, maxLen);
}
```

每次遇到 `p.val` 非空的时候说明找到一个键，但是不急着返回，而是更新 `maxLen` 变量，记录最长前缀的长度。

同样的，在 for 循环结束时要特殊判断一下，处理 `query` 本身就是键的情况。

实现 `keysWithPrefix` 方法，得到所有前缀为 `prefix` 的键。先利用 `getNode` 函数在 Trie 树中找到 `prefix` 对应的节点 `x`，然施展多叉树的遍历算法，遍历以 `x` 为根的这棵 Trie 树，找到所有键值对：

![](https://s3.bmp.ovh/imgs/2022/07/21/b6dd7cc2877a77cd.png)

代码实现如下：

```java
// 搜索前缀为 prefix 的所有键
public List<String> keysWithPrefix(String prefix) {
    List<String> res = new LinkedList<>();

    // 找到匹配 prefix 在 Trie 树中的节点
    TrieNode<V> x = getNode(root, prefix);
    if(x == null) {
        return res;
    }
    // DFS 遍历以 x 为根的这棵 Trie 树
    traverse(x, new StringBuilder(prefix), res);
    return res;
}

// 遍历以 node 节点为根的 Trie 树，找到所有键
private void traverse(TrieNode<V> node, StringBuilder path, List<String> res) {
    if(node == null) {
         // 到达 Trie 树底部叶子结点
        return;
    }

    if(node.val != null) {
        // 找到一个 key，添加到结果列表中
        res.add(path.toString());
    }

    for(char c = 0; c < R; c++) {
        path.append(c);
        traverse(node.children[c], path, res);
        path.deleteCharAt(path.length() - 1);
    }
}
```

实现 `keysWithPattern` 方法，使用通配符来匹配多个键，其关键就在于通配符 `.` 可以匹配所有字符，用 `path` 变量记录匹配键的路径：

```java
// 通配符 . 匹配任意字符
public List<String> keysWithPattern(String pattern) {
    List<String> res = new LinkedList<>();
    traverse(root, new StringBuilder(), pattern, 0 , res);
    return res;
}

// 遍历函数，尝试在「以 node 为根的 Trie 树中」匹配 pattern[i..]
private void traverse(TrieNode<V> node, StringBuilder path, String pattern, int i, List<String> res) {
     if (node == null) {
        // 树枝不存在，即字符 pattern[i-1] 匹配失败
        return;
    }
    if (i == pattern.length()) {
        // pattern 匹配完成
        if (node.val != null) {
            // 如果这个节点存储着 val，则找到一个匹配的键
            res.add(path.toString());
        }
        return;
    }
    char c = pattern.charAt(i);
    if (c == '.') {
        // pattern[i] 是通配符，可以变化成任意字符
        // 多叉树（回溯算法）遍历框架
        for (char j = 0; j < R; j++) {
            path.append(j);
            traverse(node.children[j], path, pattern, i + 1, res);
            path.deleteCharAt(path.length() - 1);
        }
    } else {
        // pattern[i] 是普通字符 c
        path.append(c);
        traverse(node.children[c], path, pattern, i + 1, res);
        path.deleteCharAt(path.length() - 1);
    }
}
```

`keysWithPattern` 和 `keysWithPrefix` 的实现有些类似，而且这两个函数还有一个潜在的特性：它们返回的结果列表一定是符合「字典序」的：每一个节点的 `children` 数组都是从左到右进行遍历，即按照 ASCII 码从小到大的顺序递归遍历，得到的结果自然是符合字典序的。

实现 `hasKeyWithPattern` 方法：

```java
// 判断是和否存在前缀为 prefix 的键
public boolean hasKeyWithPattern(String pattern) {
    // 从 root 节点开始匹配 pattern[0..]
    return hasKeyWithPattern(root, pattern, 0);
}

// 函数定义：从 node 节点开始匹配 pattern[i..]，返回是否成功匹配
private boolean hasKeyWithPattern(TrieNode<V> node, String pattern, int i) {
    if (node == null) {
        // 树枝不存在，即匹配失败
        return false;
    }
    if (i == pattern.length()) {
        // 模式串走到头了，看看匹配到的是否是一个键
        return node.val != null;
    }
    char c = pattern.charAt(i);
    // 没有遇到通配符
    if (c != '.') {
        // 从 node.children[c] 节点开始匹配 pattern[i+1..]
        return hasKeyWithPattern(node.children[c], pattern, i + 1);
    }
    // 遇到通配符
    for (int j = 0; j < R; j++) {
        // pattern[i] 可以变化成任意字符，尝试所有可能，只要遇到一个匹配成功就返回
        if (hasKeyWithPattern(node.children[j], pattern, i + 1)) {
            return true;
        }
    }
    // 都没有匹配
    return false;
}
```

`put` 方法：

```java
// 在 map 中添加或修改键值对
public void put(String key, V val) {
    if (!containsKey(key)) {
        // 新增键值对
        size++;
    }
    // 需要一个额外的辅助函数，并接收其返回值
    root = put(root, key, val, 0);
}

// 定义：向以 node 为根的 Trie 树中插入 key[i..]，返回插入完成后的根节点
private TrieNode<V> put(TrieNode<V> node, String key, V val, int i) {
    if (node == null) {
        // 如果树枝不存在，新建
        node = new TrieNode<>();
    }
    if (i == key.length()) {
        // key 的路径已插入完成，将值 val 存入节点
        node.val = val;
        return node;
    }
    char c = key.charAt(i);
    // 递归插入子节点，并接收返回值
    node.children[c] = put(node.children[c], key, val, i + 1);
    return node;
}
```

因为是递归修改数据结构，所以必须额外创建一个返回类型为 `TrieNode` 的辅助函数，并且在递归调用的时候接收其返回值，拼接到父节点上。

由于 Trie 树中的键就是「树枝」，值就是「节点」，所以插入的逻辑就是沿路新建「树枝」，把 `key` 的整条「树枝」构建出来之后，在树枝末端的「节点」中存储 `val`。

对于 `remove` 函数，如下图这个场景，如果想删除键 `"team"`，那么需要删掉 `"eam"` 这条树枝才是符合逻辑的：

![](https://s3.bmp.ovh/imgs/2022/07/21/df21251abd234070.png)

要控制算法来正确地进行删除：

首先递归修改数据结构时，如果一个节点想删掉自己，直接返回空指针。

其次，一个节点如何知道自己是否需要被删除主要看自己的 `val` 字段是否为空以及自己的 `children` 数组是否全都是空指针。一个节点要先递归处理子树，然后在后序位置检查自己的 `val` 字段和 `children` 列表，判断自己是否需要被删除。如果自己的 `val` 字段为空，说明自己没有存储值，如果同时自己的 `children` 数组全是空指针，说明自己下面也没有接树枝，即不是任何一个键的前缀。这种情况下这个节点就应该删掉自己。

代码实现：

```Java
// 在 Map 中删除 key
public void remove(String key) {
    if (!containsKey(key)) {
        return;
    }
    // 递归修改数据结构要接收函数的返回值
    root = remove(root, key, 0);
    size--;
}

// 定义：在以 node 为根的 Trie 树中删除 key[i..]，返回删除后的根节点
private TrieNode<V> remove(TrieNode<V> node, String key, int i) {
    if (node == null) {
        return null;
    }
    if (i == key.length()) {
        // 找到了 key 对应的 TrieNode，删除 val
        node.val = null;
    } else {
        char c = key.charAt(i);
        // 递归去子树进行删除
        node.children[c] = remove(node.children[c], key, i + 1);
    }
    // 后序位置，递归路径上的节点可能需要被清理
    if (node.val != null) {
        // 如果该 TireNode 存储着 val，不需要被清理
        return node;
    }
    // 检查该 TrieNode 是否还有后缀
    for (int c = 0; c < R; c++) {
        if (node.children[c] != null) {
            // 只要存在一个子节点（后缀树枝），就不需要被清理
            return node;
        }
    }
    // 既没有存储 val，也没有后缀树枝，则该节点需要被清理
    return null;
}
```

到这里 TrieMap 的所有 API 就实现完了，完整代码如下：

```java
class TrieMap<V> {
    // ASCII 码个数
    private static final int R = 256;
    // 当前存在 Map 中的键值对个数
    private int size = 0;
    // Trie 树的根节点
    private TrieNode<V> root = null;

    private static class TrieNode<V> {
        V val = null;
        TrieNode<V>[] children = new TrieNode[R];
    }

    /***** 增/改 *****/

    // 在 map 中添加或修改键值对
    public void put(String key, V val) {
        if (!containsKey(key)) {
            // 新增键值对
            size++;
        }
        // 需要一个额外的辅助函数，并接收其返回值
        root = put(root, key, val, 0);
    }

    // 定义：向以 node 为根的 Trie 树中插入 key[i..]，返回插入完成后的根节点
    private TrieNode<V> put(TrieNode<V> node, String key, V val, int i) {
        if (node == null) {
            // 如果树枝不存在，新建
            node = new TrieNode<>();
        }
        if (i == key.length()) {
            // key 的路径已插入完成，将值 val 存入节点
            node.val = val;
            return node;
        }
        char c = key.charAt(i);
        // 递归插入子节点，并接收返回值
        node.children[c] = put(node.children[c], key, val, i + 1);
        return node;
    }

    /***** 删 *****/

    // 在 Map 中删除 key
    public void remove(String key) {
        if (!containsKey(key)) {
            return;
        }
        // 递归修改数据结构要接收函数的返回值
        root = remove(root, key, 0);
        size--;
    }

    // 定义：在以 node 为根的 Trie 树中删除 key[i..]，返回删除后的根节点
    private TrieNode<V> remove(TrieNode<V> node, String key, int i) {
        if (node == null) {
            return null;
        }
        if (i == key.length()) {
            // 找到了 key 对应的 TrieNode，删除 val
            node.val = null;
        } else {
            char c = key.charAt(i);
            // 递归去子树进行删除
            node.children[c] = remove(node.children[c], key, i + 1);
        }
        // 后序位置，递归路径上的节点可能需要被清理
        if (node.val != null) {
            // 如果该 TireNode 存储着 val，不需要被清理
            return node;
        }
        // 检查该 TrieNode 是否还有后缀
        for (int c = 0; c < R; c++) {
            if (node.children[c] != null) {
                // 只要存在一个子节点（后缀树枝），就不需要被清理
                return node;
            }
        }
        // 既没有存储 val，也没有后缀树枝，则该节点需要被清理
        return null;
    }

    /***** 查 *****/

    // 搜索 key 对应的值，不存在则返回 null
    public V get(String key) {
        // 从 root 开始搜索 key
        TrieNode<V> x = getNode(root, key);
        if (x == null || x.val == null) {
            // x 为空或 x 的 val 字段为空都说明 key 没有对应的值
            return null;
        }
        return x.val;
    }

    // 判断 key 是否存在在 Map 中
    public boolean containsKey(String key) {
        return get(key) != null;
    }

    // 判断是和否存在前缀为 prefix 的键
    public boolean hasKeyWithPrefix(String prefix) {
        // 只要能找到一个节点，就是存在前缀
        return getNode(root, prefix) != null;
    }

    // 在所有键中寻找 query 的最短前缀
    public String shortestPrefixOf(String query) {
        TrieNode<V> p = root;
        // 从节点 node 开始搜索 key
        for (int i = 0; i < query.length(); i++) {
            if (p == null) {
                // 无法向下搜索
                return "";
            }
            if (p.val != null) {
                // 找到一个键是 query 的前缀
                return query.substring(0, i);
            }
            // 向下搜索
            char c = query.charAt(i);
            p = p.children[c];
        }

        if (p != null && p.val != null) {
            // 如果 query 本身就是一个键
            return query;
        }
        return "";
    }

    // 在所有键中寻找 query 的最长前缀
    public String longestPrefixOf(String query) {
        TrieNode<V> p = root;
        // 记录前缀的最大长度
        int max_len = 0;

        // 从节点 node 开始搜索 key
        for (int i = 0; i < query.length(); i++) {
            if (p == null) {
                // 无法向下搜索
                break;
            }
            if (p.val != null) {
                // 找到一个键是 query 的前缀，更新前缀的最大长度
                max_len = i;
            }
            // 向下搜索
            char c = query.charAt(i);
            p = p.children[c];
        }

        if (p != null && p.val != null) {
            // 如果 query 本身就是一个键
            return query;
        }
        return query.substring(0, max_len);
    }

    // 搜索前缀为 prefix 的所有键
    public List<String> keysWithPrefix(String prefix) {
        List<String> res = new LinkedList<>();
        // 找到匹配 prefix 在 Trie 树中的那个节点
        TrieNode<V> x = getNode(root, prefix);
        if (x == null) {
            return res;
        }
        // DFS 遍历以 x 为根的这棵 Trie 树
        traverse(x, new StringBuilder(prefix), res);
        return res;
    }

    // 遍历以 node 节点为根的 Trie 树，找到所有键
    private void traverse(TrieNode<V> node, StringBuilder path, List<String> res) {
        if (node == null) {
            // 到达 Trie 树底部叶子结点
            return;
        }

        if (node.val != null) {
            // 找到一个 key，添加到结果列表中
            res.add(path.toString());
        }

        // 回溯算法遍历框架
        for (char c = 0; c < R; c++) {
            // 做选择
            path.append(c);
            traverse(node.children[c], path, res);
            // 撤销选择
            path.deleteCharAt(path.length() - 1);
        }
    }

    // 通配符 . 匹配任意字符
    public List<String> keysWithPattern(String pattern) {
        List<String> res = new LinkedList<>();
        traverse(root, new StringBuilder(), pattern, 0, res);
        return res;
    }

    // 遍历函数，尝试在「以 node 为根的 Trie 树中」匹配 pattern[i..]
    private void traverse(TrieNode<V> node, StringBuilder path, String pattern, int i, List<String> res) {
        if (node == null) {
            // 树枝不存在，即匹配失败
            return;
        }
        if (i == pattern.length()) {
            // pattern 匹配完成
            if (node.val != null) {
                // 如果这个节点存储着 val，则找到一个匹配的键
                res.add(path.toString());
            }
            return;
        }
        char c = pattern.charAt(i);
        if (c == '.') {
            // pattern[i] 是通配符，可以变化成任意字符
            // 多叉树（回溯算法）遍历框架
            for (char j = 0; j < R; j++) {
                path.append(j);
                traverse(node.children[j], path, pattern, i + 1, res);
                path.deleteCharAt(path.length() - 1);
            }
        } else {
            // pattern[i] 是普通字符 c
            path.append(c);
            traverse(node.children[c], path, pattern, i + 1, res);
            path.deleteCharAt(path.length() - 1);
        }
    }

    // 判断是和否存在前缀为 prefix 的键
    public boolean hasKeyWithPattern(String pattern) {
        // 从 root 节点开始匹配 pattern[0..]
        return hasKeyWithPattern(root, pattern, 0);
    }

    // 函数定义：从 node 节点开始匹配 pattern[i..]，返回是否成功匹配
    private boolean hasKeyWithPattern(TrieNode<V> node, String pattern, int i) {
        if (node == null) {
            // 树枝不存在，即匹配失败
            return false;
        }
        if (i == pattern.length()) {
            // 模式串走到头了，看看匹配到的是否是一个键
            return node.val != null;
        }
        char c = pattern.charAt(i);
        // 没有遇到通配符
        if (c != '.') {
            // 从 node.children[c] 节点开始匹配 pattern[i+1..]
            return hasKeyWithPattern(node.children[c], pattern, i + 1);
        }
        // 遇到通配符
        for (int j = 0; j < R; j++) {
            // pattern[i] 可以变化成任意字符，尝试所有可能，只要遇到一个匹配成功就返回
            if (hasKeyWithPattern(node.children[j], pattern, i + 1)) {
                return true;
            }
        }
        // 都没有匹配
        return false;
    }

    // 从节点 node 开始搜索 key，如果存在返回对应节点，否则返回 null
    private TrieNode<V> getNode(TrieNode<V> node, String key) {
        TrieNode<V> p = node;
        // 从节点 node 开始搜索 key
        for (int i = 0; i < key.length(); i++) {
            if (p == null) {
                // 无法向下搜索
                return null;
            }
            // 向下搜索
            char c = key.charAt(i);
            p = p.children[c];
        }
        return p;
    }

    public int size() {
        return size;
    }
}
```

接下来只要对 TrieMap 做简单的封装即可实现 TrieSet：

```java
class TrieSet {
    // 底层用一个 TrieMap，键就是 TrieSet，值仅仅起到占位的作用
    // 值的类型可以随便设置，我参考 Java 标准库设置成 Object
    private final TrieMap<Object> map = new TrieMap<>();

    /***** 增 *****/

    // 在集合中添加元素 key
    public void add(String key) {
        map.put(key, new Object());
    }

    /***** 删 *****/

    // 从集合中删除元素 key
    public void remove(String key) {
        map.remove(key);
    }

    /***** 查 *****/

    // 判断元素 key 是否存在集合中
    public boolean contains(String key) {
        return map.containsKey(key);
    }

    // 在集合中寻找 query 的最短前缀
    public String shortestPrefixOf(String query) {
        return map.shortestPrefixOf(query);
    }

    // 在集合中寻找 query 的最长前缀
    public String longestPrefixOf(String query) {
        return map.longestPrefixOf(query);
    }

    // 在集合中搜索前缀为 prefix 的所有元素
    public List<String> keysWithPrefix(String prefix) {
        return map.keysWithPrefix(prefix);
    }

    // 判断集合中是否存在前缀为 prefix 的元素
    public boolean hasKeyWithPrefix(String prefix) {
        return map.hasKeyWithPrefix(prefix);
    }

    // 通配符 . 匹配任意字符，返回集合中匹配 pattern 的所有元素
    public List<String> keysWithPattern(String pattern) {
        return map.keysWithPattern(pattern);
    }

    // 通配符 . 匹配任意字符，判断集合中是否存在匹配 pattern 的元素
    public boolean hasKeyWithPattern(String pattern) {
        return map.hasKeyWithPattern(pattern);
    }

    // 返回集合中元素的个数
    public int size() {
        return map.size();
    }
}
```

</br>

- [208.实现Trie(前缀树)](DS/208.实现-trie-前缀树.java) &emsp;[🔗](https://leetcode.cn/problems/implement-trie-prefix-tree/)

![](https://s3.bmp.ovh/imgs/2022/07/21/40e71b8a0943206f.png)

题目让实现的几个函数就是 `TrieSet` 的部分 API，所以封装一个 `TrieSet` 就能解决这道题了：

```java
class Trie {
    // 封装 TrieSet
    TrieSet set = new TrieSet();

    // 插入一个元素
    public void insert(String word) {
        set.add(word);
    }

    // 判断元素是否在集合中
    public boolean search(String word) {
        return set.contains(word);
    }

    // 判断集合中是否有前缀为 prefix 的元素
    public boolean startsWith(String prefix) {
        return set.hasKeyWithPrefix(prefix);
    }
}

class TrieSet { /* 见上文 */ }

class TrieMap { /* 见上文 */ }
```

</br>

- [648.单词替换](DS/648.单词替换.java) &emsp;[🔗](https://leetcode.cn/problems/replace-words/)

![](https://s3.bmp.ovh/imgs/2022/07/21/45426aae419cc007.png)

可以把输入的词根列表 `dict` 存入 `TrieSet`，然后直接复用实现的 `shortestPrefixOf` 函数：

```java
String replaceWords(List<String> dict, String sentence) {
    // 先将词根都存入 TrieSet
    TrieSet set = new TrieSet();
    for (String key : dict) {
        set.add(key);
    }
    StringBuilder sb = new StringBuilder();
    String[] words = sentence.split(" ");
    // 处理句子中的单词
    for (int i = 0; i < words.length; i++) {
        // 在 Trie 树中搜索最短词根（最短前缀）
        String prefix = set.shortestPrefixOf(words[i]);
        if (!prefix.isEmpty()) {
            // 如果搜索到了，改写为词根
            sb.append(prefix);
        } else {
            // 否则，原样放回
            sb.append(words[i]);
        }

        if (i != words.length - 1) {
            // 添加单词之间的空格
            sb.append(' ');
        }
    }

    return sb.toString();
}

class TrieSet { /* 见上文 */ }

class TrieMap { /* 见上文 */ }
```

</br>

- [211.添加与搜索单词](DS/211.添加与搜索单词-数据结构设计.java) &emsp;[🔗](https://leetcode.cn/problems/design-add-and-search-words-data-structure/)

![](https://s3.bmp.ovh/imgs/2022/07/21/13a39f5626b8b74f.png)

考点在于 `search` 函数进行通配符匹配，其实就是给 `TrieSet` 实现的 `hasKeyWithPattern` 方法：

```java
class WordDictionary {
    TrieSet set = new TrieSet();

    // 在 TrieSet 中添加元素
    public void addWord(String word) {
        set.add(word);
    }

    // 通配符匹配元素
    public boolean search(String word) {
        return set.hasKeyWithPattern(word);
    }
}

class TrieSet { /* 见上文 */ }

class TrieMap { /* 见上文 */ }
```

超时可以根据题目将 `R` 改小。

</br>

- [1804.实现Trie(前缀树) II](DS/1804.实现-trie-（前缀树）-ii.java) &emsp;[🔗](https://leetcode.cn/problems/implement-trie-ii-prefix-tree/)

![](https://s3.bmp.ovh/imgs/2022/07/21/c0b6621db903d1c8.png)

这题就可以用到 `TrieMap`，每个插入的 `word` 就是键，插入的次数就是对应的值，然后复用 `TrieMap` 的 API 就能实现题目要求的这些函数：

```java
class Trie {
    // 封装实现的 TrieMap
    TrieMap<Integer> map = new TrieMap<>();

    // 插入 word 并记录插入次数
    public void insert(String word) {
        if (!map.containsKey(word)) {
            map.put(word, 1);
        } else {
            map.put(word, map.get(word) + 1);
        }
    }

    // 查询 word 插入的次数
    public int countWordsEqualTo(String word) {
        if (!map.containsKey(word)) {
            return 0;
        }
        return map.get(word);
    }

    // 累加前缀为 prefix 的键的插入次数总和
    public int countWordsStartingWith(String prefix) {
        int res = 0;
        for (String key : map.keysWithPrefix(prefix)) {
            res += map.get(key);
        }
        return res;
    }

    // word 的插入次数减一
    public void erase(String word) {
        int freq = map.get(word);
        if (freq - 1 == 0) {
            map.remove(word);
        } else {
            map.put(word, freq - 1);
        }
    }
}

class TrieMap { /* 见上文 */ }
```

</br>


- [677.键值映射](DS/677.键值映射.java) &emsp;[🔗](https://leetcode.cn/problems/map-sum-pairs/)

![](https://s3.bmp.ovh/imgs/2022/07/21/7432871a0c5dc392.png)

```java
class MapSum {
    // 封装实现的 TrieMap
    TrieMap<Integer> map = new TrieMap<>();

    // 插入键值对
    public void insert(String key, int val) {
        map.put(key, val);
    }

    // 累加所有前缀为 prefix 的键的值
    public int sum(String prefix) {
        List<String> keys = map.keysWithPrefix(prefix);
        int res = 0;
        for (String key : keys) {
            res += map.get(key);
        }
        return res;
    }
}

class TrieMap { /* 见上文 */ }
```

</br>

## 单调栈结构

栈（stack）是一种简单的数据结构，先进后出的逻辑顺序，符合某些问题的特点，比如函数调用栈。单调栈实际上就是栈，只是利用了一些巧妙的逻辑，使得每次新元素入栈后，栈内的元素都保持有序（单调递增或单调递减）。

</br>

### 单调栈模版

输入一个数组 `nums`，返回一个等长的结果数组，结果数组中对应索引存储着下一个更大元素，如果没有更大的元素就存 -1。

比如输入一个数组 `nums = [2,1,2,4,3]`，返回数组 `[4,2,4,-1,-1]`。因为第一个 2 后面比 2 大的数是 4; 1 后面比 1 大的数是 2；第二个 2 后面比 2 大的数是 4; 4 后面没有比 4 大的数，填 -1；3 后面没有比 3 大的数，填 -1。

这道题的暴力解法很容易想到，就是对每个元素后面都进行扫描，找到第一个更大的元素就行了。但是暴力解法的时间复杂度是 `O(n^2)`。

这个问题可以抽象思考：把数组的元素想象成并列站立的人，元素大小想象成人的身高。这些人面对站成一列，如何求元素「2」的下一个更大元素？如果能够看到元素「2」，那么他后面可见的第一个人就是「2」的下一个更大元素，因为比「2」小的元素身高不够，都被「2」挡住了，第一个露出来的就是答案。

![](https://s3.bmp.ovh/imgs/2022/07/22/6152a56df1837b8e.png)

代码：

```java
int[] nextGreaterElement(int[] nums) {
    int n = nums.length;
    // 存放答案的数组
    int res[] = new int[n];
    Stack<Integer> stack = new Stack();

    // 倒着往栈里放
    for(int i = n - 1; i >= 0; i--) {
        // 判定大小
        while(!stack.isEmpty() && stack.peek() <= nums[i]) {
            // 小的出栈
            s.pop();
        }
        // nums[i] 后的更大元素
        res[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(nums[i]);
    }
    return res;
}
```

这就是单调队列解决问题的模板。for 循环从后往前扫描元素，因为借助的是栈的结构，倒着入栈就是是正着出栈。while 循环是把两个「个子高」元素之间的元素排除。

总共有 `n` 个元素，每个元素都被 `push` 入栈了一次，而最多会被 `pop` 一次，没有任何冗余操作。所以总的计算规模是和元素规模 `n` 成正比的，也就是 `O(n)` 的复杂度。

- [496.下一个更大元素 I](DS/496.下一个更大元素-i.java) &emsp;[🔗](https://leetcode.cn/problems/next-greater-element-i/)

![](https://s3.bmp.ovh/imgs/2022/07/22/ed461f444ea0ada1.png)

题目说 `nums1` 是 `nums2` 的子集，那么先把 `nums2` 中每个元素的下一个更大元素算出来存到一个映射里，然后再让 `nums1` 中的元素去查表即可：

```java
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    // 记录 nums2 中每个元素的下一个更大元素
    int[] greater = nextGreaterElement(nums2);
    // 转化成映射：元素 x -> x 的下一个最大元素
    HashMap<Integer, Integer> greaterMap = new HashMap<>();
    
    for (int i = 0; i < nums2.length; i++) {
        greaterMap.put(nums2[i], greater[i]);
    }
    
    // nums1 是 nums2 的子集，所以根据 greaterMap 可以得到结果
    int[] res = new int[nums1.length];
    for (int i = 0; i < res.length; i++) {
        res[i] = greaterMap.get(nums1[i]);
    }
    return res;
}

public int[] nextGreaterElement(int[] nums) {
    // 见上文
}
```

这样，对于下一个更大或相等的元素可以将 while 判断中将 `<=` 改为 `<` 即可；对于下一个更小的元素将 while 中 `<=` 改为 `>=`；对于下一个更小或相等的元素可以改为 `>`。

若需寻找上一个，注意之前的 for 循环都是从数组的尾部开始往栈里添加元素，这样栈顶元素就是 `nums[i]` 之后的元素。所以只要我们**从数组的头部开始**往栈里添加元素，栈顶的元素就是 `nums[i]` 之前的元素，即可计算 `nums[i]` 的上一个更大元素。

</br>

- [739.每日温度](DS/739.每日温度.java) &emsp;[🔗](https://leetcode.cn/problems/daily-temperatures/)

![](https://s3.bmp.ovh/imgs/2022/07/22/608e329dffe43942.png)

这里让求的是当前元素距离下一个更大元素的索引距离，对模版进行修改即可：

```java
public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] res = new int[n];
    // 存放元素索引，而不是元素
    Stack<Integer> stack = new Stack<>();

    for(int i = n - 1; i >= 0; i--) {
        while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
            stack.pop();
        }
        res[i] = stack.isEmpty() ? 0 : (stack.peek() - i);
        stack.push(i);
    }

    return res;
}
```

</br>

### 处理环形数组

- [503.下一个更大元素 II](DS/503.下一个更大元素-ii.java) &emsp;[🔗](https://leetcode.cn/problems/next-greater-element-ii/)

![](https://s3.bmp.ovh/imgs/2022/07/22/2f04aa61fc3195cd.png)

输入一个「环形数组」，计算其中每个元素的下一个更大元素。比如输入 `[2,1,2,4,3]`，应该返回 `[4,2,4,-1,4]`，因为拥有了环形属性，最后一个元素 3 绕了一圈后找到了比自己大的元素 4。

我们一般是通过 `%` 运算符求模来模拟环形特效：

```java
int[] arr = {1,2,3,4,5};
int n = arr.length, index = 0;
while (true) {
    // 在环形数组中转圈
    print(arr[index % n]);
    index++;
}
```

如输入是 [2,1,2,4,3]，对于最后一个元素 3，如何找到元素 4 作为下一个更大元素。对于这种需求，常用套路就是将数组长度翻倍：

![](https://s3.bmp.ovh/imgs/2022/07/22/322a026beeb1b1a5.png)

这样，元素 3 就可以找到元素 4 作为下一个更大元素了，而且其他的元素都可以被正确地计算。

有了思路，最简单的实现方式当然可以把这个双倍长度的数组构造出来，然后套用算法模板。但是也可以不用构造新数组，而是利用循环数组的技巧来模拟数组长度翻倍的效果：

```java
public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    Stack<Integer> stack = new Stack<>();

    // 数组长度加倍模拟环形数组
    for(int i = 2 * n - 1; i >= 0; i--) {
        // 索引 i 要求模
        while(!stack.isEmpty() && stack.peek() <= nums[i % n]) {
            stack.pop();
        }
        res[i % n] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(nums[i % n]);
    }
    return res;
}
```

</br>

## 单调队列

单调队列主要是解决下面场景：

给一个数组 `window`，已知其最值为 `A`，如果给 `window` 中添加一个数 `B`，那么比较一下 `A` 和 `B` 就可以立即算出新的最值；但如果要从 `window` 数组中减少一个数，就不能直接得到最值了，因为如果减少的这个数恰好是 `A`，就需要遍历 `window` 中的所有元素重新寻找新的最值。

如果单纯地维护最值，优先级队列队头元素就是最值。但优先级队列无法满足标准队列结构「先进先出」的时间顺序，因为优先级队列底层利用二叉堆对元素进行动态排序，元素的出队顺序是元素的大小顺序，和入队的先后顺序完全没有关系。

所以需要一种新的队列结构，既能够维护队列元素「先进先出」的时间顺序，又能够正确维护队列中所有元素的最值，这就是「单调队列」结构。

「单调队列」这个数据结构主要用来辅助解决滑动窗口相关的问题。

</br>

- [239.滑动窗口最大值](DS/239.滑动窗口最大值.java) &emsp;[🔗](https://leetcode.cn/problems/sliding-window-maximum/)

![](https://s3.bmp.ovh/imgs/2022/07/22/7cb6eeed7ff6c840.png)

### 搭建解题框架

普通的队列的标准 API：

```java
class Queue {
    // enqueue 操作，在队尾加入元素 n
    void push(int n);
    // dequeue 操作，删除队头元素
    void pop();
}
```

实现的「单调队列」的 API：

```Java
class MonotonicQueue {
    // 在队尾添加元素 n
    void push(int n);
    // 返回当前队列中的最大值
    int max();
    // 队头元素如果是 n，删除它
    void pop(int n);
}
```

「滑动窗口」问题的解答框架：

```java
int[] maxSlidingWindow(int[] nums, int k) {
    MonotonicQueue window = new MonotonicQueue();
    List<Integer> res = new ArrayList<>();

    for(int i = 0; i < nums.length; i++) {
        if(i < k - 1) {
            //先把窗口的前 k - 1 填满
            window.push(nums[i]);
        } else {
            // 窗口开始向前滑动
            // 移入新元素
            window.push(nums[i]);
            // 将当前窗口中的最大元素记入结果
            res.add(window.max());
            // 移出最后的元素
            window.pop(nums[i - k + 1]);
        }
    }

    // 将 List 类型转化成 int[] 数组作为返回值
    int[] arr = new int[res.size()];
    for (int i = 0; i < res.size(); i++) {
        arr[i] = res.get(i);
    }
    return arr;
}
```

![](https://s3.bmp.ovh/imgs/2022/07/22/7a445c48395787c3.png)

</br>

### 实现单调队列数据结构

观察滑动窗口的过程能发现，实现「单调队列」必须使用一种数据结构支持在头部和尾部进行插入和删除，双链表就满足这个条件。

「单调队列」的核心思路和「单调栈」类似，`push` 方法依然在队尾添加元素，但是要把前面比自己小的元素都删掉：

```java
class MonotonicQueue {
// 双链表，支持头部和尾部增删元素
// 维护其中的元素自尾部到头部单调递增
private LinkedList<Integer> maxq = new LinkedList<>();

// 在尾部添加一个元素 n，维护 maxq 的单调性质
public void push(int n) {
    // 将前面小于自己的元素都删除
    while(!maxq.isEmpty() && maxq.getLast() < n) {
        maxq.pollLast();
    }
    maxq.addLast(n);
}
```

![](https://s3.bmp.ovh/imgs/2022/07/22/07bed877199444e4.png)

如果每个元素被加入时都这样操作，最终单调队列中的元素大小就会保持一个单调递减的顺序，因此对于 `max` 方法：

```java
public void max() {
    // 队头元素最大
    return maxq.getFirst();
}
```

`pop` 方法在队头删除元素 `n`：

```java
public void pop(int n) {
    if(n == maxq.getFirst()) {
        maxq.pollFirst();
    }
}
```

之所以要判断 `data.getFirst() == n`，是因为想删除的队头元素 `n` 可能已经不存在了，这时候就不用删除：

![](https://s3.bmp.ovh/imgs/2022/07/22/3438c6f6a7b53bff.png)

完整代码：

```java
/* 单调队列的实现 */
class MonotonicQueue {
    LinkedList<Integer> maxq = new LinkedList<>();
    public void push(int n) {
        // 将小于 n 的元素全部删除
        while (!maxq.isEmpty() && maxq.getLast() < n) {
            maxq.pollLast();
        }
        // 然后将 n 加入尾部
        maxq.addLast(n);
    }

    public int max() {
        return maxq.getFirst();
    }

    public void pop(int n) {
        if (n == maxq.getFirst()) {
            maxq.pollFirst();
        }
    }
}

/* 解题函数的实现 */
int[] maxSlidingWindow(int[] nums, int k) {
    MonotonicQueue window = new MonotonicQueue();
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
        if (i < k - 1) {
            //先填满窗口的前 k - 1
            window.push(nums[i]);
        } else {
            // 窗口向前滑动，加入新数字
            window.push(nums[i]);
            // 记录当前窗口的最大值
            res.add(window.max());
            // 移出旧数字
            window.pop(nums[i - k + 1]);
        }
    }
    // 需要转成 int[] 数组再返回
    int[] arr = new int[res.size()];
    for (int i = 0; i < res.size(); i++) {
        arr[i] = res.get(i);
    }
    return arr;
}
```

有一点细节问题：在实现 `MonotonicQueue` 时，我们使用了 Java 的 `LinkedList`，因为链表结构支持在头部和尾部快速增删元素；而在解法代码中的 `res` 则使用的 `ArrayList` 结构，因为后续会按照索引取元素，所以数组结构更合适。

对于复杂度分析，单独看 `push` 操作的复杂度确实不是 `O(1)`，但是算法整体的复杂度依然是 `O(N)` 线性时间。`nums` 中的每个元素最多被 `push` 和 `pop` 一次，没有任何多余操作，所以整体的复杂度还是 `O(N)`。空间复杂度就是窗口的大小` O(k)`。

</br>

### 单调队列的通用实现

之前的 `MonotonicQueue` 类只实现了 `max` 方法，还可以再额外添加一个 `min` 方法，在 `O(1)` 的时间返回队列中所有元素的最小值。同时前面的 `pop` 方法还需要接收一个参数，这显然有悖于标准队列的做法。

```java
/* 单调队列的通用实现，可以高效维护最大值和最小值 */
class MonotonicQueue<E extends Comparable<E>> {

    // 标准队列 API，向队尾加入元素
    public void push(E elem);

    // 标准队列 API，从队头弹出元素，符合先进先出的顺序
    public E pop();

    // 标准队列 API，返回队列中的元素个数
    public int size();

    // 单调队列特有 API，O(1) 时间计算队列中元素的最大值
    public E max();

    // 单调队列特有 API，O(1) 时间计算队列中元素的最小值
    public E min();
}
```

实现 `min` 方法类似于 `max`，可以在底层再维护一个 `minq` 队列，维护队列中元素从尾部到头部的元素单调递减，这样头部第一个元素就是所有元素中的最小值了。

由于 `push` 方法在添加元素的同时还可能会删除元素，所以 `maxq` 和 `minq` 中都没有保存所有元素。如果想实现标准的 `pop` 方法以及 `size` 方法，还得再额外维护一个标准队列 `q`，这个 `q` 存储所有存在于队列中的元素，不维护单调性：

```java
/* 单调队列的实现，可以高效维护最大值和最小值 */
class MonotonicQueue<E extends Comparable<E>> {
    // 常规队列，存储所有元素
    LinkedList<E> q = new LinkedList<>();
    // 元素降序排列的单调队列，头部是最大值
    LinkedList<E> maxq = new LinkedList<>();
    // 元素升序排列的单调队列，头部是最小值
    LinkedList<E> minq = new LinkedList<>();

    public void push(E elem) {
        // 维护常规队列，直接在队尾插入元素
        q.addLast(elem);

        // 维护 maxq，将小于 elem 的元素全部删除
        while (!maxq.isEmpty() && maxq.getLast().compareTo(elem) < 0) {
            maxq.pollLast();
        }
        maxq.addLast(elem);

        // 维护 minq，将大于 elem 的元素全部删除
        while (!minq.isEmpty() && minq.getLast().compareTo(elem) > 0) {
            minq.pollLast();
        }
        minq.addLast(elem);
    }

    public E max() {
        // maxq 的头部是最大元素
        return maxq.getFirst();
    }

    public E min() {
        // minq 的头部是最大元素
        return minq.getFirst();
    }

    public E pop() {
        // 从标准队列头部弹出需要删除的元素
        E deleteVal = q.pollFirst();
        assert deleteVal != null;

        // 由于 push 的时候会删除元素，deleteVal 可能已经被删掉了
        if (deleteVal.equals(maxq.getFirst())) {
            maxq.pollFirst();
        }
        if (deleteVal.equals(minq.getFirst())) {
            minq.pollFirst();
        }
        return deleteVal;
    }

    public int size() {
        // 标准队列的大小即是当前队列的大小
        return q.size();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}
```

需要注意的是，这个通用实现内部维护了三个队列，且涉及到 Java 的泛型，所以在刷题平台上执行的效率不会高。如果追求效率，可以根据具体的题目简化单调队列的实现，从而提升效率。

</br>

- [1438.绝对差不超过限制的最长连续子数组](DS/1438.绝对差不超过限制的最长连续子数组.java) &emsp;[🔗](https://leetcode.cn/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)

![](https://s3.bmp.ovh/imgs/2022/07/22/29c7723979b5b7c7.png)

当窗口内绝对值之差不超过 `limit` 时扩大窗口，当新加入窗口的元素使得绝对值之差超过 `limit` 时开始收缩窗口，窗口的最大宽度即最长子数组的长度。

但当窗口进新元素时可以更新窗口中的最大值和最小值，但当窗口收缩时该如何更新最大值和最小值？这就用到单调队列结构，这里需要一个通用的 `MonotonicQueue` 类，用来高效判断窗口中的最大值和最小值：

```java
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0, right = 0;
        int windowSize = 0, res = 0;
        MonotonicQueue<Integer> window = new MonotonicQueue<>();

        while(right < nums.length) {
            // 扩大窗口，更新窗口最值
            window.push(nums[right]);
            right++;
            windowSize++;

            while(window.max() - window.min() > limit) {
                // 缩小窗口，更新窗口最值
                window.pop();
                left++;
                windowSize--;
            }
            // 在窗口收缩判断完之后才更新答案
            res = Math.max(res, windowSize);
        }
        return res;
    }
}

/* 单调队列的实现，可以高效维护最大值和最小值 */
class MonotonicQueue<E extends Comparable<E>> {}
```

</br>

- [862.和至少为 K 的最短子数组](DS/862.和至少为-k-的最短子数组.java) &emsp;[🔗](https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/)

![](https://s3.bmp.ovh/imgs/2022/07/22/c64233346d1b8635.png)

这题难点在于同时结合了「滑动窗口算法」、「前缀和技巧」和「单调队列」几个知识点。首先，想要快速记录子数组的和，需要「前缀和技巧」预计算一个 `preSum` 数组，然后在这个 `preSum` 数组上施展「滑动窗口算法」寻找一个差值大于 `k` 且宽度最小的「窗口」，这个窗口的大小就是题目想要的结果。当滑动窗口扩大时，新进入窗口的元素 `preSum[right]` 需要知道窗口中最小的那个元素是多少，和最小的那个元素相减才能得到尽可能大的子数组和。快速判断窗口中的最值就需要单调队列结构：

```java
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        // 根据题目的数据范围，前缀和数组中元素可能非常大，所以用 long 类型
        long[] preSum = new long[n + 1];
        preSum[0] = 0;
        
        // 计算 nums 的前缀和数组
        for(int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }

        // 单调队列结构辅助滑动窗口算法
        MonotonicQueue<Long> window = new MonotonicQueue<>();
        int left = 0, right = 0;
        int len = Integer.MAX_VALUE;

        // 开始执行滑动窗口算法框架
        while(right < preSum.length) {
            // 扩大窗口，元素入队
            window.push(preSum[right]);
            right++;
            // 若新进入窗口的元素和窗口中的最小值之差大于等于 k，
            // 说明得到了符合条件的子数组，缩小窗口，使子数组长度尽可能小
            while(right < preSum.length && !window.isEmpty() 
                && preSum[right] - window.min() >= k) {
                // 更新答案
                len = Math.min(len, right - left);
                // 缩小窗口
                window.pop();
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? -1 : len;
    }
}

/* 单调队列的实现，可以高效维护最大值和最小值 */
class MonotonicQueue<E extends Comparable<E>> {}
```

</br>

- [918.环形子数组的最大和](DS/918.环形子数组的最大和.java) &emsp;[🔗](https://leetcode.cn/problems/maximum-sum-circular-subarray/)

![](https://s3.bmp.ovh/imgs/2022/07/22/3199a4c175888538.png)

把 `nums` 数组扩大一倍，计算前缀和数组` preSum`，借助一个定长为 `nums.length` 的单调队列来计算环形数组中的最大子数组和：

```java
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        // 模拟环状的 nums 数组
        int[] preSum = new int[2 * n + 1];
        preSum[0] = 0;

        // 计算环状 nums 的前缀和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[(i - 1) % n];
        }

        // 记录答案
        int maxSum = Integer.MIN_VALUE;
        // 维护一个滑动窗口，以便根据窗口中的最小值计算最大子数组和
        MonotonicQueue<Integer> window = new MonotonicQueue<>();
        window.push(0);
        for (int i = 1; i < preSum.length; i++) {
            maxSum = Math.max(maxSum, preSum[i] - window.min());
            // 维护窗口的大小为 nums 数组的大小
            if (window.size() == n) {
                window.pop();
            }
            window.push(preSum[i]);
        }

        return maxSum;
    }
}

/* 单调队列的实现，可以高效维护最大值和最小值 */
class MonotonicQueue<E extends Comparable<E>> {}
```

</br>

## 二叉堆实现优先级队列

二叉堆是一种特殊的堆，二叉堆是完全二叉树或者是近似完全二叉树。二叉堆有两种：最大堆和最小堆。最大堆：父结点的键值总是大于或等于任何一个子节点的键值；最小堆：父结点的键值总是小于或等于任何一个子节点的键值。

二叉堆在逻辑上是一种特殊的二叉树（完全二叉树），只不过存储在数组里。一般的链表二叉树，我们操作节点的指针；而在数组里，我们把数组索引作为指针：

```java
// 父节点的索引
int parent(int root) {
    return root / 2;
}
// 左孩子的索引
int left(int root) {
    return root * 2;
}
// 右孩子的索引
int right(int root) {
    return root * 2 + 1;
}
```

如 `arr` 是一个字符数组，注意数组的第一个索引 0 不使用：

![jjkLXF.png](https://s1.ax1x.com/2022/07/24/jjkLXF.png)

因为这棵二叉树是「完全二叉树」，所以把 `arr[1]` 作为整棵树的根，每个节点的父节点和左右孩子的索引都可以通过简单的运算得到，这就是二叉堆设计的一个巧妙之处。

</br>

### 优先级队列

优先级队列这种数据结构有一个很有用的功能，在插入或者删除元素时，元素会自动排序，这底层的原理就是二叉堆的操作。

数据结构的功能无非增删查改，优先级队列有两个主要 API，分别是 `insert` 插入一个元素和 `delMax` 删除最大元素（如果底层用最小堆，就是 `delMin`）。

实现一个简化的优先级队列，代码框架：

> 这里用到 Java 的泛型，Key 可以是任何一种可比较大小的数据类型，比如 Integer 等类型。

```java
public class MaxPQ<Key extends Comparable<Key>> {
    // 存储元素的数组
    private Key[] pq;
    // 当前 PriorityQueue 中的元素个数
    private int size = 0;

    public MaxPQ(int cap) {
        // 索引 0 不用，所以多分配一个空间
        pq = (Key[]) new Comparable[cap + 1];
    }

    /* 返回当前队列中最大元素 */
    public Key max() {
        return pq[1];
    }

    /* 插入元素 e */
    public void insert(Key e) {}

    /* 删除并返回当前队列中最大元素 */
    public Key delMax() {}

    /* 上浮第 x 个元素，以维护最大堆性质 */
    private void swim(int x) {}

    /* 下沉第 x 个元素，以维护最大堆性质 */
    private void sink(int x) {}

    /* 交换数组的两个元素 */
    private void swap(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[i] = temp;
    }

    /* 判断 pq[i] 是否比 pq[j] 小 */
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    /* left, right, parent */
}
```

</br>

### 实现 swim 和 sink

为了维护堆结构，需要有上浮 `swim` 和下沉 `sink` 的操作。

这里要实现是最大堆，每个节点都比它的两个子节点大，但是在插入元素和删除元素时，难免破坏堆的性质，这就需要通过这两个操作来恢复堆的性质。

对于最大堆，会破坏堆性质的有两种情况：

1. 如果某个节点 A 比它的子节点（中的一个）小，那么 A 就不应该做父节点，应该下去，下面那个更大的节点上来做父节点，这就是对 A 进行下沉。

2. 如果某个节点 A 比它的父节点大，那么 A 不应该做子节点，应该把父节点换下来，自己去做父节点，这就是对 A 的上浮。

当然，错位的节点 A 可能要上浮（或下沉）很多次，才能到达正确的位置，恢复堆的性质。

虽然上h和下沉操作是互逆等价的，但是最终我们的操作只会在堆底和堆顶进行，显然堆底的「错位」元素需要上浮，堆顶的「错位」元素需要下沉。

上浮代码实现：

```java
private void swim(int x) {
    // 浮到堆顶就不能再上浮
    while(x > 1 && less(parent(x), x)) {
        // 如果第 x 个元素比上层大
        // 将 x 换上去
        swap(parent(x), x);
        x = parent(x);
    }
}
```

下沉的代码实现：

上浮某个节点 A，只需要 A 和其父节点比较大小即可；但下沉某个节点 A，需要 A 和其两个子节点比较大小，如果 A 不是最大的就需要调整位置，要把较大的那个子节点和 A 交换。

```java
private void sink(int x) {
    // 沉到堆底就不能再下沉
    while(left(x) <= size) {
        // 假设左边节点较大
        int max = left(x);
        // 如果右边节点存在，比一下大小
        if(right(x) <= size && less(max, right(x))) {
            max = right(x);
        }
        // 结点 x 比两个孩子都大，不需要下沉
        if(less(max, x)) {
            break;
        }
        // 否则，不符合最大堆的结构，下沉 x 结点
        swap(x, max);
        x = max;
    }
}
```

### 实现 delMax 和 insert

这两个方法就是建立在 `swim` 和 `sink` 上的。

`insert` 方法先把要插入的元素添加到堆底的最后，然后让其上浮到正确位置。

```java
public void insert(Key e) {
    size++;
    // 先把新元素加到最后
    pq[size] = e;
    // 然后让它上浮到正确的位置
    swim(size);
}
```

`delMax` 方法先把堆顶元素 A 和堆底最后的元素 B 对调，然后删除 A，最后让 B 下沉到正确位置。

```java
public Key delMax() {
    // 最大堆的堆顶就是最大元素
    Key max = pq[1];
    // 把这个最大元素换到最后，删除之
    swap(1, size);
    pq[size] = null;
    size--;
    // 让 pq[1] 下沉到正确位置
    sink(1);
    return max;
}
```

至此，一个优先级队列就实现了，插入和删除元素的时间复杂度为 `O(logK)`，`K` 为当前二叉堆（优先级队列）中的元素总数。因为时间复杂度主要花费在 `sink` 或者 `swim` 上，而不管上浮还是下沉，最多就树（堆）的高度，也就是 `log` 级别。

</br>

## 队列实现栈及栈实现队列

队列是一种先进先出的数据结构，栈是一种先进后出的数据结构。这两种数据结构底层其实都是数组或者链表实现的。

</br>

### 用栈实现队列

- [232.用栈实现队列](DS/232.用栈实现队列.java) &emsp;[🔗](https://leetcode.cn/problems/implement-queue-using-stacks/)

![jjEerF.png](https://s1.ax1x.com/2022/07/24/jjEerF.png)

使用两个栈 `s1`, `s2` 就能实现一个队列的功能：

![jjEYrD.png](https://s1.ax1x.com/2022/07/24/jjEYrD.png)

```java
class MyQueue {
    private Stack<Integer> s1, s2;

    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    // ...
}
```

当调用 `push` 让元素入队时，只要把元素压入 `s1` 即可，如 `push` 进 3 个元素分别是 `1,2,3`，那么底层结构：

![jjEyM8.png](https://s1.ax1x.com/2022/07/24/jjEyM8.png)

```java
/** 添加元素到队尾 */
public void push(int x) {
    s1.push(x);
}
```

如果这时候使用 `peek` 查看队头的元素，队头元素应该是 1，但是在 `s1` 中 1 被压在栈底，因此需要 `s2` 起到中转的作用：当 `s2` 为空时，可以把 `s1` 的所有元素取出再添加进 `s2`，这时候 `s2` 中元素就是先进先出顺序了。

![jjE5R0.png](https://s1.ax1x.com/2022/07/24/jjE5R0.png)

```java
/** 返回队头元素 */
public int peek() {
    if(s2.isEmpty()) {
        // 把 s1 元素压入 s2
        while(!s1.isEmpty()) {
            s2.push(s1.pop())
        }
    }
    return s2.peek();
}
```

同理，对于 `pop` 操作，只需操作 `s2`。

```java
/** 删除队头的元素并返回 */
public int pop() {
    // 先调用 peek 保证 s2 非空
    peek();
    return s2.pop();
}
```

判断队列是否为空需要判断是否两个栈都为空：

```java
/** 判断队列是否为空 */
public boolean empty() {
    return s1.isEmpty() && s2.isEmpty();
}
```

至此，就用栈结构实现了一个队列，核心思想是利用两个栈互相配合。

`peek` 操作调用时可能触发 while 循环，这样时间复杂度是 `O(N)`，但是大部分情况下 while 循环不会被触发，时间复杂度是 `O(1)`。由于 `pop` 操作调用了 `peek`，它的时间复杂度和 `peek` 相同。

最坏时间复杂度是 `O(N)`，因为包含 while 循环，可能需要从 `s1` 往 `s2` 搬移元素。

均摊时间复杂度是 `O(1)`：对于一个元素，最多只可能被搬运一次，也就是说 `peek` 操作平均到每个元素的时间复杂度是 `O(1)`。

</br>

### 用队列实现栈

- [225.用队列实现栈](DS/225.用队列实现栈.java) &emsp;[🔗](https://leetcode.cn/problems/implement-stack-using-queues/)

![jjVHpt.png](https://s1.ax1x.com/2022/07/24/jjVHpt.png)

用队列实现栈只需要一个队列作为底层数据结构。

`push` 直接将元素加入队列，同时记录队尾元素，因为队尾元素相当于栈顶元素，如果要 `top` 查看栈顶元素可以直接返回：

```java
class MyStack {
    Queue<Integer> q = new LinkedList<>();
    int top = 0;

    /** 添加元素到栈顶 */
    public void push(int x) {
        // x 是队列的队尾，是栈的栈顶
        q.offer(x);
        top = x;
    }

    /** 返回栈顶元素 */
    public int top() {
        return top;
    }
}
```

由于底层数据结构是先进先出的队列，每次 `pop` 只能从队头取元素；但是栈是后进先出，也就是说 `pop` 要从队尾取元素：

[![jjVh0e.png](https://s1.ax1x.com/2022/07/24/jjVh0e.png)](https://imgtu.com/i/jjVh0e)

只需要把队列前面的都取出来再加入队尾，让之前的队尾元素排到队头，这样就可以取出了：

[![jjVHpt.png](https://s1.ax1x.com/2022/07/24/jjVHpt.png)](https://imgtu.com/i/jjVHpt)

```java
/** 删除栈顶的元素并返回 */
public int pop() {
    int size = q.size();
    while(size > 1) {
        q.offer(q.poll());
        size--;
    }
    // 之前的队尾元素已经到了队头
    return q.poll();
}
```

这样实现还存在对问题是：原来的队尾元素被提到队头并删除了，但是 `top` 变量没有更新，需要进行修改：

```java
/** 删除栈顶的元素并返回 */
public int pop() {
    int size = q.size();
    // 留下队尾 2 个元素
    while (size > 2) {
        q.offer(q.poll());
        size--;
    }
    // 记录新的队尾元素
    top = q.peek();
    q.offer(q.poll());
    // 删除之前的队尾元素
    return q.poll();
}
```

`empty` 只需看底层的队列是否为空：

```java
public boolean empty() {
    return q.isEmpty();
}
```

用队列实现栈 `pop` 操作时间复杂度是 `O(N)`，其他操作都是 `O(1)`​。​

</br>





