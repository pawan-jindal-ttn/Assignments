package Ques3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private final int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulating task execution time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ExecutorDemo {
    public static void multipleTaskRunner(ExecutorService e){
        for (int i = 0; i < 5; i++) {
            e.execute(new Task(i));
        }
        try {
            e.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        e.shutdown();
    }
    public static void main(String[] args) {
        System.out.println("\nUsing SingleThreadExecutor");
        ExecutorDemo.multipleTaskRunner(Executors.newSingleThreadExecutor());


        System.out.println("\nUsing CachedThreadPool");
        ExecutorDemo.multipleTaskRunner(Executors.newCachedThreadPool());

        System.out.println("\nUsing FixedThreadPool");
        ExecutorDemo.multipleTaskRunner(Executors.newFixedThreadPool(2));
    }
}
