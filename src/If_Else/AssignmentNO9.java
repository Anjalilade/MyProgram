package If_Else;

import java.util.Scanner;

public class AssignmentNO9 {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        int classes= sc.nextInt();
        System.out.println("enter the number of classes held");
        int attend= sc.nextInt();
        float attended;
        System.out.println("number the classes attended");
         attended=((attend)/(float)(classes)*100);
         if (attended<75){
             System.out.println("you are allowed sit");
         }else {
             System.out.println("you are not allowed to sit");
         }

        */

        int classes;
        int attend;
        float attended;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of the classes held");
        classes=sc.nextInt();
        System.out.println("number of attendence");
        attend=sc.nextInt();
                attended=((attend)/(float)(classes)*100);
        if (attended>=75){
            System.out.println("you allows to sit in exam");

        }
        else {
            System.out.println("you are not allow to sit");
        }


    }
}
