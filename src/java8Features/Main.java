package java8Features;

public class Main {
    public static void main(String[] args) {
        I ia=new A();
        I ib=new B();
        I ic=new C();
        I id=new D();


        ia.m1();
        ib.m1();
        ic.m1();
        id.m1();

        ia.m2();
        ia.m2();
        ia.m2();
        ia.m2();


    }
}
