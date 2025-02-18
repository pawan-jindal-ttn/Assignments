package Ques2;

//Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.
public class MethodSynchronisation {
    static int count = 0;
    synchronized static void increment(){
        count++;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        //if .join method is not written then it will print count without waiting for the completion of the tasks
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println(count);
    }
}
