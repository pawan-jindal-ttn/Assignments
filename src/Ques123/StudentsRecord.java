package Ques123;

import java.util.Objects;
import java.util.Optional;

record Student(int id, String name, int standard) {
    //compact constructor: used for adding additional logic to inbuilt constructor
    public Student{
//        Objects.requireNonNull(name, "Name cant be null");
//        Objects.requireNonNull(standard, "Standard cant be null");
        if(name == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    public void getStudentInfo(){
        System.out.println("ID: " + id + "\t" + "Name: " + name + "\tStandard: " + standard);
    }

//    public boolean isNull(){
//        Optional<Student> check = Optional.ofNullable(this);
//        return (check.isEmpty());
//    }
}
public class StudentsRecord {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Pawan Jindal", 12);
        Student student2 = new Student(2, "Karan Singh", 11);
        Student student3 = new Student(3, "Sambhav Gupta", 10);
        Student student4 = new Student(3, "Sambhav Gupta", 10);

        student1.getStudentInfo();
        student2.getStudentInfo();
        student3.getStudentInfo();

        System.out.println(student1.equals(student2));
        System.out.println(student3.equals(student4));
        System.out.println(student1.hashCode());
    }
}
