import java.util.Scanner;

public class Ques1{
    public static String FirstName, LastName;
    public static int age;

    static{
        System.out.println("First Name: " + FirstName);
    }

    public static void getInfo(){
        System.out.println("Full Name: " + FirstName + LastName);
        System.out.println("Age: " + age);
    }

    public static void setInfo(String FirstName, String LastName, int age){
        Ques1.FirstName = FirstName;
        Ques1.LastName = LastName;
        Ques1.age = age;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String FirstName = input.next();
        System.out.println("Enter your last name: ");
        String LastName = input.next();
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        Ques1.setInfo(FirstName, LastName, age);

        Ques1.getInfo();
    }
}