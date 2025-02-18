package Ques2;

import java.util.Objects;

public class BlockSynchronisation {
    static int count = 0;
    static void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException{
//        same lock will ensure that one thread increments the count value at a particular time
        Object lock = new Object();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                synchronized (lock){
                    increment();
                }
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                synchronized (lock){
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);
    }
}
