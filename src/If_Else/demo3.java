package If_Else;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        System.out.println("Enter second number");
        int a= sc.nextInt();
        int b=sc.nextInt();
        if (a==b){
            System.out.println("Equals");
        }else if (a>b) {
                System.out.println("is greater");
        } else{
                System.out.println("is less");
            }
        }
    }


