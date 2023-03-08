package If_Else;

import java.util.Scanner;

public class AssignmentNO13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the four digit");
        int num= sc.nextInt();

        int digit=num%10;
        num=num/10;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        int digit3=num%10;
        num=num/10;
        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);



    }
}
