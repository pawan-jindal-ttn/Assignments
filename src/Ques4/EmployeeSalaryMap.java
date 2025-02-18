package Ques4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryMap {
    public static void main(String[] args) {
        Map<Employee, Integer> employeeMap = new HashMap<>();

        Employee emp1 = new Employee("Ram", 20, "Software Engineer");
        Employee emp2 = new Employee("Shyam", 25, "Technical Lead");
        Employee emp3 = new Employee("Rohan", 21, "Associate Technical Lead");

        employeeMap.put(emp1, 75000);
        employeeMap.put(emp2, 90000);
        employeeMap.put(emp3, 60000);

        for (Map.Entry<Employee, Integer> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
        }
    }
}
