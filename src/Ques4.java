//Write a code to simulate a deadlock in java
class MyResource{
    void use(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Ques4 {
    private final MyResource resource1 = new MyResource();
    private final MyResource resource2 = new MyResource();

    Thread t1 = new Thread(() -> {
        synchronized (resource1) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource2) {
                resource1.use();
            }
        }

    });
    Thread t2 = new Thread(() -> {
        synchronized (resource2){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource1){
                System.out.println(resource1);
            }
        }
    });

    public void triggerDeadlock() throws InterruptedException{
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        Ques4 ob = new Ques4();
        ob.triggerDeadlock();
    }
}
