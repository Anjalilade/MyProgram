package Counstuctor;

public class demo2 {
        private String name;
       demo2(){
           name="program";
           System.out.println("Constructor call is");
       }

    public static void main(String[] args) {
        demo2 obj=new demo2();
        System.out.println("the name is\n"+obj.name);
    }
    }

