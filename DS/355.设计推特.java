package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=355 lang=java
 *
 * [355] 设计推特
 */

// @lc code=start
class Twitter {
    private static int timestamp = 0;
    // 需要一个映射将 userId 和 User 对象对应起来
    private HashMap<Integer, User> userMap = new HashMap<>();

    public Twitter() {

    }
    
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
        if(userMap.containsKey(followerId)) {
            User follower = userMap.get(followerId);
            follower.unfollow(followeeId);
        }
     }

     /** 返回该 user 关注的人（包括他自己）最近的动态 id，
    最多 10 条，而且这些动态必须按从新到旧的时间线顺序排列。*/
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if(!userMap.containsKey(userId)) {
            return res;
        }
    
        // 关注列表的用户 Id
        Set<Integer> users = userMap.get(userId).followed;
    
        // 自动通过 time 属性从大到小排序，容量为 users 的大小
        PriorityQueue<Tweet> pq = new PriorityQueue<>(users.size(), (a, b) -> 
            (b.time - a.time)
        );
    
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
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
// @lc code=end

