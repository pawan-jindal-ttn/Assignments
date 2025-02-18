//Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.

public class Ques1 {
    private int count = 0;
    void incrementor(){
        count++;
    }
    void decrementor(){
        count--;
    }
    public static void main(String[] args) {
        Ques1 ob = new Ques1();
        Thread t1 = new Thread(()->{
            System.out.println("entering into increment block");
            for (int i = 0; i < 10000; i++) {
                ob.incrementor();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        Thread t2 = new Thread(()->{
            System.out.println("entering into decrement block");
            for (int i = 0; i < 10000; i++) {
                ob.decrementor();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("Thread t2 interrupted");
                }
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(ob.count);
    }
}