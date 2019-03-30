import java.time.LocalDate;
import java.util.Arrays;

/**
 * This program demonstrates a triangular array.
 *
 * @author Cay Horstmann
 * @version 1.20 2004-02-10
 */
public class Main {
    public static void main(String[] args) {
    Employee a = new Employee("haha");
    Employee b = new Employee("haha3");
    Integer result = a.getEmID();
    System.out.println(result);

    }
}

class Employee {
    private  String employeeName;
    private static Integer emID=0;
    public Employee(String name){
        employeeName=name;
        emID++;
    }
    public Integer getEmID(){
        return emID;
    }
}