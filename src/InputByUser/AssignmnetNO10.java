package InputByUser;

import java.util.Scanner;

public class AssignmnetNO10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first mark");
        System.out.println("enter the second mark");
        System.out.println("enter the third mark");

        int mark1= sc.nextInt();
        int mark2= sc.nextInt();
        int mark3= sc.nextInt();
         int total=mark1+mark2+mark3;
         float percentage=total/300*100;
        System.out.println("total mark\t"+total);
        System.out.println("percentage of\t"+percentage);
    }
}
