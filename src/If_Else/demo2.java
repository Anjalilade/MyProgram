package If_Else;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}


