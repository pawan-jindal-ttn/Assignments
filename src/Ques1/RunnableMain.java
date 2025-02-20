package Ques1;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// used when we dont need to return any result
// Runnable interface -> run
// Callable interface -> call

//Callable throws checked exception while runnable dont

class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("This is runnable interface");
    }
}

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = (Future<Integer>) executorService.submit(new RunnableDemo());
        try {
            System.out.println(result.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
