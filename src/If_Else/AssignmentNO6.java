package If_Else;

import java.util.Scanner;

public class AssignmentNO6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the tree age");
        int age1= sc.nextInt();
        int age2= sc.nextInt();
        int age3= sc.nextInt();
        if (((age1<age2)&&(age1<age3)||(age2<age3))) {
            System.out.println("it is youngest");
        }else
            System.out.println("it is oldest");

        }
    }

