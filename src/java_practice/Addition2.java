package java_practice;

import java.util.Scanner;

public class Addition2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("enter fist value");
        num1=sc.nextInt();
        System.out.println("enter second value");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("sum\t"+sum);
    }
}
