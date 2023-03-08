
package FunctionInterfaceDemo;

public class Demo1 {
    public static void main(String[] args) {
        //Traditional Way
        I i = new A();
        i.m1();
        //Anonymous Class Way
        I i1 = new I() {
            @Override
            public void m1() {

         System.out.println("anonymous class way");
        }
    };
        i1.m1();
    }
}
