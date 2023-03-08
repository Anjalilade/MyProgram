package InputByUser;

import java.util.Scanner;

public class AssignmentNO1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int number1=sc.nextInt();
        int number2= sc.nextInt();
        int sum=number1+number2;
        int product=number1*number2;
        System.out.println("enter the sum of number\t"+sum);
        System.out.println("enter the product of number\t"+product);

    }
}
