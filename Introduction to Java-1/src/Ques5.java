import java.util.Scanner;

public class Ques5 {
    String firstname, lastname, designation;
    int age;

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public void setLastName(String firstname) {
        this.lastname = lastname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return this.designation;
    }

    public String toString() {
        return "Person Information";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ques5 ob = new Ques5();

        System.out.println(ob);
        ob.setFirstName("Pawan");
        ob.setLastName("Jindal");
        ob.setAge(21);
        ob.setDesignation("SDE");

        System.out.println("Name: " + ob.getFirstName() + " " + ob.lastname);
        System.out.println("Age: " + ob.getAge());
        System.out.println("Designation: " + ob.getDesignation());

    }
}
