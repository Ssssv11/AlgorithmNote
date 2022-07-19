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
void traverse(TreeNode root) {
    if (root == null) {
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
// 定义：在以 root 为根的二叉树中寻找值为 val 的节点
TreeNode find(TreeNode root, int val) {
    // base case
    if (root == null) {
        return null;
    }
    if (root.val == val) {
        return root;
    }
    // root 不是目标节点，去左子树找
    TreeNode left = find(root.left, val);
    if (left != null) {
        return left;
    }
    // 左子树找不到，去左子树找
    TreeNode right = find(root.right, val);
    if (right != null) {
        return right;
    }
    // 找不到
    return null;
}
```

基于这段代码进行修改，首先修改 `return` 的位置：

```java
TreeNode find(TreeNode root, int val) {
    if (root == null) {
        return null;
    }
    // 前序位置
    if (root.val == val) {
        return root;
    }
    // root 不是目标节点，去左右子树找
    TreeNode left = find(root.left, val);
    TreeNode right = find(root.right, val);
    
    return left != null ? left : right;
}
```

这段代码也可以达到目的，但实际运行的效率会低一些。这是因为，如果能够在左子树找到目标节点，这段代码还是会去右子树找，所以效率相对差一些。

更进一步，把对 `root.val` 的判断从前序位置移动到后序位置：

```java
TreeNode find(TreeNode root, int val) {
    if (root == null) {
        return null;
    }
    // 先去左右子树寻找
    TreeNode left = find(root.left, val);
    TreeNode right = find(root.right, val);
    // 后序位置
    if (root.val == val) {
        return root;
    }
 
    return left != null ? left : right;
}
```

这段代码相当于遍历了二叉树的所有节点，就算找到了目标值也需要先去去遍历左右子树，因此效率进一步降低。

现在若将题目修改为寻找值为 `val1` 或 `val2` 的节点：

```java
// 定义：在以 root 为根的二叉树中寻找值为 val1 或 val2 的节点
TreeNode find(TreeNode root, int val1, int val2) {
    // base case
    if (root == null) {
        return null;
    }
    // 前序位置
    if (root.val == val1 || root.val == val2) {
        return root;
    }
    // 去左右子树寻找
    TreeNode left = find(root.left, val1, val2);
    TreeNode right = find(root.right, val1, val2);
    // 后序位置，已经知道左右子树是否存在目标值

    return left != null ? left : right;
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
// 前序位置
if (root.val == val1 || root.val == val2) {
    // 遇到目标值，直接返回
    return root;
}
```

对于这道题来说，`p` 和 `q` 不一定存在于树中，所以不能遇到一个目标值就直接返回，而应该对二叉树进行完全搜索（遍历每一个节点），如果发现 `p` 或 `q` 不存在于树中，那么是不存在 LCA 的。

在 [寻找一个元素](#寻找一个元素) 小节我们写了几种 `find` 方法，其中一种是对二叉树进行完整遍历：

```java
TreeNode find(TreeNode root, int val) {
    if (root == null) {
        return null;
    }
    // 先去左右子树寻找
    TreeNode left = find(root.left, val);
    TreeNode right = find(root.right, val);
    // 后序位置
    if (root.val == val) {
        return root;
    }
 
    return left != null ? left : right;
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
TreeNode left = find(root.left, val1, val2);
TreeNode right = find(root.right, val1, val2);

// 后序位置，判断当前节点是不是 LCA 节点
if (left != null && right != null) {
    return root;
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

一般来说在找最短路径的时候使用 BFS，其他时候还是 DFS 使用得多

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

