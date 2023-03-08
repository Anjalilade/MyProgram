package If_Else;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>18){
            System.out.println("Adults");
        }else{
            System.out.println("NOt Adults");
        }

    }
}