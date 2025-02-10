package Ques5;

class Singleton{
    private static final Singleton ob = new Singleton();

    private Singleton(){
    }

    public static Singleton DB_CONNECTION(){
        return ob;
    }
}
public class EarlyInitialisation {
    public static void main(String[] args) {
        Singleton newObject1 = Singleton.DB_CONNECTION();
        System.out.println(newObject1.hashCode());
    }
}
