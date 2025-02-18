//WAP to showcase the usage of volatile in java.
public class Ques3 {
    volatile boolean check = false;

    public void setCheckTrue(){
        check = true;
    }

    public void printIfTrue(){
        while(check == false){
        }
        System.out.println("Flag is true");
    }

    public static void main(String[] args) throws InterruptedException {
        Ques3 ob = new Ques3();

        Thread writer = new Thread(()->{
            ob.setCheckTrue();
            try{
                Thread.sleep(1000); //making write thread work first, so that it could set check value to true
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }) ;

        Thread reader = new Thread(ob::printIfTrue);

        reader.start();
        writer.start();

        reader.join();
        writer.join();
    }
}
