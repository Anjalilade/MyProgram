package java_practice;

public class Test1 {
    static {
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    public void Test1(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Test1 Test1 = new Test1();
        //output= static,instance
    }
}
