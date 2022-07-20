package DS;

import java.util.HashMap;
import java.util.LinkedHashSet;

/*
 * @lc app=leetcode.cn id=460 lang=java
 *
 * [460] LFU 缓存
 */

// @lc code=start
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
    
    public int get(int key) {
        if(!keyToVal.containsKey(key)) {
            return -1;
        }
        // 增加 key 对应的 freq
        increaseFreq(key);
        return keyToVal.get(key);
    }
    
    public void put(int key, int value) {
        if(this.cap <= 0) {
            return;
        }
    
        // 若 key 已存在，修改对应的 val
        if(keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
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
        keyToVal.put(key, value);
        // 插入 KF 表
        keyToFreq.put(key, 1);
        // 插入 FK 表
        freqToKeys.putIfAbsent(1, new LinkedHashSet<>());
        freqToKeys.get(1).add(key);
    
        // 插入新 key 后最小的 freq 是 1
        this.minFreq = 1;
    }

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
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

