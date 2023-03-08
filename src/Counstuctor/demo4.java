package Counstuctor;

public class demo4 {
    int number;
    String name;
    int rollnumber;
    int std;
    demo4(int nu,String nm,int roll,int st){
        number=nu;
        name="nm";
        rollnumber=roll;
        std=st;

    }

    public static void main(String[] args) {
        demo4 obj=new demo4(12 ,"abc",12,5);
        System.out.println("The numbere is\n"+obj.number);
        System.out.println("The name is\n"+obj.name);
        System.out.println("The rollnumber is\n"+obj.rollnumber);
        System.out.println("The std is\n"+obj.std);
    }


    }

