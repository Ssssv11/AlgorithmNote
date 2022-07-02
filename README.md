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

</br>

# 数组

## 前缀和、前缀积

**前缀和技巧适用于快速、频繁地计算一个索引区间内的元素之和，它不会修改原始数组。**
核⼼思路是创建⼀个数组 `preSum`， `preSum[i]` 记录 `nums[0..i-1]` 的累加和(`preSum[0] = 0`)。若需要计算某个索引区间 [i, j] 内的元素之和，只需要计算 `preSum[j+1] - preSum[i]` 的值即可。

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
若需要对数组 `nums[i..j]` 全部加 1，再给 `nums[k..l]` 全部减 2 等等一系列增减操作，最后返回增减后的数组。常规思路就是使用 for 循环对指定区间内的元素进行加减，但这样对 `nums` 的修改非常频繁且效率低下，时间复杂度为 O(N)。
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
只需要花费 O(1) 的时间修改 `diff` 数组，就给 `nums` 的整个区间做了修改。多次修改 `diff` 后再通过计算就可以得到 `nums` 修改后的结果。

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

原地修改即不允许 new 新数组，只能在原数组上操作，返回一个长度，通过返回的长度和原始数组得到结果。
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

滑动窗口也是利用双指针来实现的，一个用于延伸现有窗口的 right 指针，和一个用于收缩窗口的 left 指针。在任意时刻，只有一个指针运动，而另一个保持静止。

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

`while(left < right)` 的终止条件是 `left == right`，即 `[right, right]`，区间中还有 right，但此时 while 循环终止了。也就是说此时区间中索引 right 没有被搜索，如果这时候直接返回 -1 就是错误的。

若需使用 `while(left < right)`，也可以在返回时再次搜索 right 处值：

```java
...
while(left < right) {
  ...
}
return nums[left] == target ? left : -1;
```

2. 为什么 `left = mid + 1`，`right = mid - 1` ？

当查到 mid > target 时，说明 target 在 mid 右边，所以 `left = mid + 1`，即搜索右半部分。同理，当查到 mid < target 时，说明 target 在 mid 左边，所以 `right = mid - 1`，即搜索左半部分。

3. 此算法的缺陷 ？

如有序数组 nums = [1,2,2,2,3]，target 为 2，此算法返回的索引为 2。但如果想得到 target 的左侧边界，即索引 1，或者 target 的右侧边界，即索引 3 的话此算法是无法处理的。

但是如果当找到一个 target，然后向左或向右线性搜索又难以保证二分查找对数级的复杂度。

</br>

### 寻找边界的二分搜索

对普通二分查找算法稍加改动就可以实现寻找边界的二分查找。重点是在查找到 target 时并不马上返回，而是继续缩小范围继续查找左边或右边是否还有 target。

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