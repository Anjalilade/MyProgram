package class_Object;

public class Employee1_AssignmentNO11 {
    String  name;
    int salary;
    int numberOfHourWorked;
    void acceptEmployeeDetails(String n,int sal,int hours) {
        name = n;
        salary = sal;
        numberOfHourWorked = hours;
    }
    void addSalary(){
        if (salary<500){
            salary=salary+10;
        }
    }
    void addWork(){
        if (numberOfHourWorked>6){
            salary=salary+5;
        }
    }
    public static void main(String[] args) {
        Employee1_AssignmentNO11 obj=new Employee1_AssignmentNO11();
        obj.acceptEmployeeDetails("abc",300,7);
        obj.addSalary();
        System.out.println("Salary"+obj.salary);
        obj.addWork();
        System.out.println("Salary"+obj.salary);

    }
}
