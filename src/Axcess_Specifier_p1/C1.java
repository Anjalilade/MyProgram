package Axcess_Specifier_p1;

public class C1 {
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args) {
       C1 c=new C1();
c.meth1();
    }
}
