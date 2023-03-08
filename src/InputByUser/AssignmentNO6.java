package InputByUser;

import java.util.Scanner;

public class AssignmentNO6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two value");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int square1=num1*num1;
       int square2=num2*num2;
        System.out.println("Find the square of number\t"+square1);
        System.out.println("Find the square of number\t"+square2);



        double num;
        System.out.println("enter the number");
        num= sc.nextInt();
        double square=num*num;
        System.out.println("square of number  is");
        System.out.println(square);


    }
}
