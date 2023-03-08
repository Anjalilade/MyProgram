package ObjectClassDemo;

public class GetClassMethodDemo {
    public static void main(String[] args) {
        GetClassMethodDemo ref=new GetClassMethodDemo();
        Class classref=ref.getClass();
        System.out.println(classref.getName());
    }
}
