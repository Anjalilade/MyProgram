package InputByUser;

import java.util.Scanner;

public class AssignmentNO7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two string");
        String str1=sc.nextLine();
        String str2= sc.nextLine();
        String add=str1+str2;
        System.out.println(add);
    }
}
