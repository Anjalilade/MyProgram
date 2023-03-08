package InputByUser;

import java.util.Scanner;

public class AssignmentNO2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number");


        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int sum=number1+number2;
        int product=number1*number2;
        int add=sum+product;
        System.out.println("sum of number is\t"+sum);
        System.out.println("product of number is\t"+product);
        System.out.println(add);

    }
}
