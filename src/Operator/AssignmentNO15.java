package Operator;
//(Write a program to reverse no)
// Number=123   Output=321

public class AssignmentNO15 {
    public static void main(String[] args) {
       int num=123 ;
       int digit=num%10;
       num=num/10;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digit2);

        int number=123,rev=0;
        while(number!=0)
        {
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;

        }
        System.out.println("the reverse order");


    }
}
