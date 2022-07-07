# 前言

算法学习的记录，LeetCode 刷题中...

感谢 [Labuladong](https://github.com/labuladong/fucking-algorithm) 、[Carl](https://github.com/youngyangyang04/leetcode-master) 等大佬免费的学习资料

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

- [25.K 个一组反转链表](LinkedList/25.k-个一组反转链表.java) &emsp;[🔗](https://leetcode.cn/problems/reverse-nodes-in-k-group/)

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

<br>