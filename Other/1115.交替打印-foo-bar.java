package Other;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * @lc app=leetcode.cn id=1115 lang=java
 *
 * [1115] 交替打印 FooBar
 */

// @lc code=start
class FooBar {
    private int n;

    private Lock lock = new ReentrantLock(true);
    private volatile boolean fooIsPrinted = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n;) {
            lock.lock();
            try{
                if(!fooIsPrinted) {
        	        // printFoo.run() outputs "foo". Do not change or remove this line.
        	        printFoo.run();
                    i++;
                    fooIsPrinted = true;
                } else {
                    Thread.yield();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n;) {
            lock.lock();
            try {
                if(fooIsPrinted) {
                    // printBar.run() outputs "bar". Do not change or remove this line.
        	        printBar.run();
                    i++;
                    fooIsPrinted = false;
                } else {
                    Thread.yield();
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
// @lc code=end

