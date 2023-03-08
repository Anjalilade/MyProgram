package class_Object;public class EmployeeNo9 {
    String employeeName;
        int yearOfJoining;
        String address;
        int salary;

    public static void main(String[] args) {
        EmployeeNo9 obj=new EmployeeNo9();
        obj.employeeName="anjali";
        obj.yearOfJoining=2021;
        obj.address="Dhadane";
        obj.salary=12000;
        EmployeeNo9 obj1=new EmployeeNo9();
        obj1.employeeName="Madhuri";
        obj1.yearOfJoining=2022;
        obj1.address="Sakri";
        obj1.salary=13000;

        EmployeeNo9 obj2=new EmployeeNo9();
        obj2.employeeName="Sonu";
        obj2.yearOfJoining=2000;
        obj2.address="Nandurbar";
        obj2.salary=11000;
        System.out.println(obj.employeeName+"\t"+obj.yearOfJoining+"\t"+obj.address+"\t"+obj.salary);
        System.out.println(obj1.employeeName+"\t"+obj1.yearOfJoining+"\t"+obj1.address+"\t"+obj1.salary);
        System.out.println(obj2.employeeName+"\t"+obj2.yearOfJoining+"\t"+obj2.address+"\t"+obj2.salary);

    }
    }

