//Write a code to simulate a deadlock in java
package Ques2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyResource {
    Lock lock;
    String resourceName;

    MyResource(String resourceName, Lock lock) {
        this.lock = lock;
        this.resourceName = resourceName;
    }

    void use() {
        System.out.println(Thread.currentThread().getName() + " acquired " + this.resourceName);
    }

    static void solveDeadlock(MyResource resource1, MyResource resource2) {
        while (true) {
            boolean firstLock = resource1.lock.tryLock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            boolean secondLock = resource2.lock.tryLock();
            if (firstLock && secondLock) break;
            if (firstLock) {
                resource1.lock.unlock();
                System.out.println(Thread.currentThread().getName() + " releasing " + resource1.resourceName);
            }
            if (secondLock) {
                resource2.lock.unlock();
                System.out.println(Thread.currentThread().getName() + " releasing " + resource2.resourceName);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            resource1.use();
            resource2.use();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } finally {
            resource1.lock.unlock();
            resource2.lock.unlock();
            System.out.println(Thread.currentThread().getName() + " released both locks.");
        }

    }
}

public class SolveDeadlock {
    public static void main(String[] args) throws InterruptedException {
        MyResource resource1 = new MyResource("Resource 1", new ReentrantLock());
        MyResource resource2 = new MyResource("Resource 2", new ReentrantLock());

        Thread t1 = new Thread(() -> {
            MyResource.solveDeadlock(resource1, resource2);
        });
        Thread t2 = new Thread(() -> {
            MyResource.solveDeadlock(resource2, resource1);
        });
        t1.start();
        t2.start();
    }
}