package If_Else;

import java.util.Scanner;

public class AssignmentNO4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two value");
        int service= sc.nextInt();
        int salary= sc.nextInt();
        if (service<5){
            System.out.println("your service above 5 year so you get bonus, so your total salary is");
            System.out.println((salary) + (5 * salary) / 100);

        }
        else
        {
            System.out.println("sorry you are not eligible of bonus because your service less than 5, so your salary is");
            System.out.println(salary);

        }
        }

    }



