package Ques4;

import java.util.Scanner;

public class DeveloperClient {
    public static void main(String[] args) {
        // need to avoid tight coupling, i.e. we need not to mention particular developer class constructor
        // rather factory class will return object based on our input

        Scanner input = new Scanner(System.in);

        System.out.println("1. JSDeveloper\n2. JavaDeveloper\n3. AndroidDeveloper\n");
        System.out.print("Enter your employee type: ");
        String employeeType = input.next();
        Employee salary = EmployeeFactory.getEmployeeSalary(employeeType);
        System.out.println("Salary of " + employeeType + " is : " + salary.salary());

    }
}
