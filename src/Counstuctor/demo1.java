package Counstuctor;

public class demo1 {
    int a;
    int b;
    int c;

    demo1(int a1, int b1, int c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    int add() {
        return a + b + c;
    }
    public static void main(String[] args) {
        demo1 obj = new demo1(10, 20, 30);
         System.out.println(obj.add());


        }
    }
