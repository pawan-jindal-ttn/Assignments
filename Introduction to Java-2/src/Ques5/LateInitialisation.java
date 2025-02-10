package Ques5;

class SingletonClass{
    private static SingletonClass ob;

    private SingletonClass(){}

    public static SingletonClass DB_CONNECTION(){
        if(ob == null){
            ob = new SingletonClass();
        }
        return ob;
    }
}
public class LateInitialisation {
    public static void main(String[] args) {
        SingletonClass ob1 = SingletonClass.DB_CONNECTION();
        System.out.println(ob1.hashCode());
    }
}
