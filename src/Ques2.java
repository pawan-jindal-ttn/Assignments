@FunctionalInterface
interface Demo{
    void show();
    static void staticMethod(){
        System.out.println("This is a static method");
    }
    default void defaultMethod(){
        System.out.println("This is a default method");
    }
}
public class Ques2 {
    public static void main(String[] args) {
        Demo ob = ()->{
            System.out.println("This is abstract method");
        };
        ob.show();
        ob.defaultMethod();
        Demo.staticMethod();
    }
}