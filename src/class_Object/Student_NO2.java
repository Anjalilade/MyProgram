package class_Object;

public class Student_NO2 {
    String name;
    int roll_No;
    long phone;
    String address;

    public static void main(String[] args) {
        Student_NO2 obj1 = new Student_NO2();
        obj1.name = "john";
        obj1.roll_No = '2';
        obj1.phone = 8830306663L;
        obj1.address = "Addresses of the john";
        Student_NO2 obj2 = new Student_NO2();
        obj2.name = "sam";
        obj2.roll_No = '3';
        obj2.phone = 9833675953L;
        obj2.address = "Address of the sam";
        System.out.println("Name:"+obj1.name+"Roll NO:"+obj1.roll_No+"phone no:"+obj1.phone+"Address:"+obj1.address);
        System.out.println("Name:"+obj2.name+"Roll NO:"+obj2.roll_No+"phone no:"+obj2.phone+"Address:"+obj2.address);

    }
}
