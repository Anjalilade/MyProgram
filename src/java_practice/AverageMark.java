package java_practice;

import java.util.Scanner;

public class AverageMark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark1,mark2,mark3;
        int Total_marks;
        double avg_marks;
        System.out.println("enter the value of two");
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
        Total_marks=mark1+mark2+mark3;
        avg_marks=(double)Total_marks/3;
        System.out.println("Totalmarks\t"+Total_marks);
        System.out.println("avg_marks\t"+Math.round(avg_marks));



    }
}
