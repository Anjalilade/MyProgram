package java8Features;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();

        Child child = new Child();
        child.m1();

        Parent pc=new Child();
        pc.m1();



    }
}
