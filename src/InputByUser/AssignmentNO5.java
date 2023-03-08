package InputByUser;

import java.util.Scanner;

public class AssignmentNO5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two value");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int perimeter=2*length+breadth;
        System.out.println("enter the area of perimter\t"+perimeter);
    }
}
