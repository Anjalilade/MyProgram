package Operator;
//Write a program to calculate the sum of the digits of a 3-digit number.
public class AssignmentNO14 {
    public static void main(String[] args) {
        int num=123;
       int sum=0;
       int digit1=num%10;
       num=num/10;

        int digit2=num%10;
        num=num/10;


        int digit3=num%10;
        num=num/10;
        sum=digit1+digit2+digit3;
        System.out.println("sum of number is:\t"+sum);



    }

}
