import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=380 lang=java
 *
 * [380] O(1) 时间插入、删除和获取随机元素
 */

// @lc code=start

/*
 * HashMap，key：val，value：index
 */
class RandomizedSet {
    static int[] nums = new int[200010];
    Random random = new Random();
    Map<Integer, Integer> map = new HashMap<>();
    int index = -1;
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        nums[++index] = val;
        map.put(val, index);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int loc = map.remove(val);
        if(loc != index) {
            map.put(nums[index], loc);
        }
        nums[loc] = nums[index--];
        return true;
    }
    
    public int getRandom() {
        return nums[random.nextInt(index + 1)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

