package Ques6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date 1 (yyyy-MM-dd): ");
        String date1 = input.nextLine();
        System.out.print("Enter date 2 (yyyy-MM-dd): ");
        String date2 = input.nextLine();

        LocalDate date_one = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date_two = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("First Date is after Second Date: " + date_one.isAfter(date_two));
        System.out.println("First Date is before Second Date: " + date_one.isBefore(date_two));

    }
}
