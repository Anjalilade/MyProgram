package If_Else;

import java.util.Scanner;

public class AssignmentNO2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two value");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        if (num1<num2){
            System.out.println("it is greatest");
        }else {
            System.out.println("it is not greatest");
        }
    }
}
