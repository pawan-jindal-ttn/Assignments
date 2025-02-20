package Ques5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework {
    private static long factorial(int finalI) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int fact = 1;
        for(int i = 1; i<=finalI;i++)
            fact = fact * i;
        return fact;
    }
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(3);


        for(int i = 1; i < 10 ; i++){
            int finalI = i;
            service.submit(() -> {
                long result = factorial(finalI);
                System.out.println(Thread.currentThread().getName()+" "+result);
            });

        }
        service.awaitTermination(3, TimeUnit.SECONDS);
        service.shutdown();
//        service.shutdownNow(); it will forcefully end the thread, even if some of the tasks are waiting

        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime));

    }
}