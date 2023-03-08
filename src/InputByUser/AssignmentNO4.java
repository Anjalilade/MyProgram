package InputByUser;

import java.util.Scanner;

public class AssignmentNO4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  name");
        System.out.println("enter the roll number");
        System.out.println("enter the field interest");
        String name=sc.nextLine();
        String rollNumber= sc.nextLine();
        String field=sc.nextLine();
        System.out.println("my name is\t"+name);
        System.out.println("my roll number is"+rollNumber);
        System.out.println("my interest field is"+field);
    }
}
