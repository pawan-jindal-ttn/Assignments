package Ques4;
import java.util.Random;
import java.util.concurrent.*;

public class RandomIntegerGen {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService execute = Executors.newSingleThreadExecutor();
        Future<Integer> randomNumber = execute.submit(()->new Random().nextInt(100));
        System.out.println(randomNumber.get());
        execute.shutdown();
    }
}
