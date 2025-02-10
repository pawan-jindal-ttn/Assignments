package Ques4;
import java.util.Objects;
class Employee {
    private String name;
    private int age;
    private String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    @Override
    public String toString() {
        return "[ name='" + name + "', age=" + age + ", designation='" + designation + " ]";
    }
}



