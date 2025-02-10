import java.io.*;
import java.util.Scanner;

class User{
    private String firstName, lastName, phoneNo;
    private int age;

    public User(String firstName, String lastName, int age, String phoneNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString(){
        return firstName + "," + lastName + "," + age + "," + phoneNo;
    }
}

public class Ques2{
    private static final String FILE_NAME = "users.txt";

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            while(true){
                System.out.print("Enter First Name: ");
                String firstName = input.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = input.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(input.nextLine());

                System.out.print("Enter Phone Number: ");
                String phoneNumber = input.nextLine();

                User user = new User(firstName, lastName, age, phoneNumber);
                writer.write(user.toString());
                writer.newLine();
                writer.flush();

                System.out.print("Type Quit to end: ");
                String response = input.nextLine();
                if(response.equalsIgnoreCase("QUIT")){
                    break;
                }
            }
        }
        catch(IOException | NumberFormatException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally{
            input.close();
        }
    }
}
