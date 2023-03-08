package If_Else;

import java.util.Scanner;

public class AssignmnetNO8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        if (num<0){
            System.out.println(num*-1);
        } else  {
            System.out.println(num);

        }
    }
}
