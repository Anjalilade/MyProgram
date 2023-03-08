package InputByUser;

import java.util.Scanner;

public class AssignmentNO8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three value");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (((a==b)&& (b==c) || (c==a))){
            System.out.println("all are equal");
        }else {
            System.out.println("any of two are equal");
        }





    }
}
