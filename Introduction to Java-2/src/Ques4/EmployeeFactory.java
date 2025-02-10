package Ques4;

public class EmployeeFactory {
    public static Employee getEmployeeSalary(String empType){
        if(empType.trim().equalsIgnoreCase("JSDEVELOPER")){
            return new JSDev();
        }
        else if(empType.trim().equalsIgnoreCase("JAVADEVELOPER")){
            return new JavaDev();
        }
        else{
            return new AndroidDev();
        }
    }
}
