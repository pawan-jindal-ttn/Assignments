import java.util.Scanner;
public class Ques3 {

    public static double area(double r){
        return Math.PI * r * r;
    }

    public static double circumference(double r){
        return 2 * Math.PI * r;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ch;
        do{
            System.out.println("*******Menu*******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            ch = input.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius= input.nextDouble();
                    double area = area(radius);
                    System.out.println("The area of the circle is: " + area);
                    break;

                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    double radiusForCircumference = input.nextDouble();
                    double circumference = circumference(radiusForCircumference);
                    System.out.println("The circumference of the circle is: " + circumference);
                    break;

                case 3:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Please choose a valid option.");
                    break;
            }
        }
        while (ch != 3);
    }
}
