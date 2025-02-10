
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (true){
            System.out.print("Enter text: ");
            String userInput = input.nextLine();
            if(userInput.equals("XDONE")){
                break;
            }
            sb.append(userInput);
        }
        System.out.println("You entered the following text:");
        System.out.println(sb);
    }
}