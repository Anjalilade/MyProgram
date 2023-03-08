package InputByUser;

import java.util.Scanner;

public class AssignmentNO3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number");
        double length= sc.nextDouble();
        double breadth=sc.nextDouble();
        double Area=length*breadth;
        System.out.println((int)Area);

    }
}
