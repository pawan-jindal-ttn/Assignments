package Ques5;

sealed class Employee{
    String name;
    public Employee(String name){
        this.name = name;
    }
    void work(){
        System.out.println(name + " is working.");
    }
}

final class Manager extends Employee{
    public Manager(String name){
        super(name);
    }
    public void manage(){
        System.out.println(name + " is managing team");
    }
}

non-sealed class Engineer extends Employee{
    public Engineer(String name){
        super(name);
    }
    public void develop(){
        System.out.println(name + " is developing.");
    }
}

class SoftwareEngineer extends Engineer{
    public SoftwareEngineer(String name){
        super(name);
    }
    public void code(){
        System.out.println(name + " is writing code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Manager e1 = new Manager("Rohan");
        Engineer e2 = new Engineer("Shyam");
        SoftwareEngineer e3 = new SoftwareEngineer("Karan");

        e1.work();
        e2.work();
        e3.work();

        System.out.println();

        e1.manage();
        e2.develop();
        e3.code();
    }
}
