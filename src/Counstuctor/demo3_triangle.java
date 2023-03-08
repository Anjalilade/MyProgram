package Counstuctor;

public class demo3_triangle {
    int side1;
    int side2;
    int side3;

    demo3_triangle(int a1,int b1,int c1){
     side1=a1;
     side2=b1;
     side3=c1;

    }
    int area(){
        return side1*side2*side3;
    }
    int perimeter(){
        return side1+side2+side3;
    }

    public static void main(String[] args) {
        demo3_triangle obj=new demo3_triangle(10,20,30);
        System.out.println("area of triangle\n"+obj.area());
        System.out.println("perimeter of triangle\n"+obj.perimeter());
    }
    }

