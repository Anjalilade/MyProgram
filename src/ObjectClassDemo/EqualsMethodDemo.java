package ObjectClassDemo;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");


        student1=student2;
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
        System.out.println(10==20);


    }
}
