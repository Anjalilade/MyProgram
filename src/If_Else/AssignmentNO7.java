package If_Else;

import java.util.Scanner;

public class AssignmentNO7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three ages");
       int age1 = sc.nextInt();
       int age2 = sc.nextInt();
       int age3 = sc.nextInt();
        if (age1 < age2 && age1 < age3) {
            System.out.println("the youngest is" + age1);
        } else if (age2 < age3) {
            System.out.println("the youngest is" + age2);
        } else {
            System.out.println("the youngest is" + age3);
        }
        if (age1 > age2 && age1 > age3) {
            System.out.println("Oldest is");
        } else if (age1 > age3) {
            System.out.println("the oldest is" + age2);

        } else {
            System.out.println("the oldest is" + age3);

        }

    }
}
