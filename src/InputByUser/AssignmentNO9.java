package InputByUser;

import java.util.Scanner;

public class AssignmentNO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a < 50) & (a < b)) {
            System.out.println(true);


        }else {
            System.out.println(false);
        }
    }
}

