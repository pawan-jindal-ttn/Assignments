package Ques2;

import java.util.*;

class Employee implements Comparable<Employee>{
    Integer Age;
    Double Salary;
    String Name;

    public Employee(String Name, Integer Age, Double Salary){
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }

    @Override
    public int compareTo(Employee e){
        return Name.compareTo(e.Name);
    }
    public String toString(){
        String print = ("Name: " + Name + " " +
                            "\nAge: " + Age + "\n Salary" + Salary);
        return print;
    }
}

class SalaryCompare implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.Salary > o2.Salary) return 1;
        else if(o1.Salary < o2.Salary) return -1;
        return 0;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SalaryCompare salCompare = new SalaryCompare();
        List<Employee> employees = new ArrayList<>(4);

        for(int i = 0; i<3; i++){
            System.out.print("Enter Name: ");
            String name = input.next();
            System.out.print("Enter Age: ");
            Integer age = input.nextInt();
            System.out.print("Enter Salary: ");
            Double salary = input.nextDouble();
            System.out.println();

            employees.add(new Employee(name, age, salary));
        }

        System.out.println("Sorted according to name: ");
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println("Sorted according to salaries: ");
        Collections.sort(employees, new SalaryCompare());

        System.out.println(employees);
    }
}