package Ques1;

import java.util.Scanner;
import java.util.concurrent.*;

class CallableDemo implements Callable<Integer> {
    int num;
    int factorial = 1;

    public CallableDemo(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        CallableDemo ob = new CallableDemo(num);
//        Thread t = new Thread(); //cannot do this in callable

//        maintains pool of thread
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> result = executorService.submit(ob);
        System.out.println(result.get());

//        will not wait for any another thread to enter
        executorService.shutdown();
    }
}
