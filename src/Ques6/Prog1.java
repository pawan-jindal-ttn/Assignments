package Ques6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date 1 (yyyy-MM-dd): ");
        String date1 = input.nextLine();
        System.out.println("Enter date 2 (yyyy-MM-dd): ");
        String date2 = input.nextLine();

        LocalDate date_one = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date_two = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if(date_one != date_two){
            System.out.println("First Date is: " + date_one);
            System.out.println("Second Date is: " + date_two);
        }
    }
}
