package If_Else;

import java.util.Scanner;

public class AssigmentNO12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        char status = sc.next().charAt(0);
        char gender = sc.next().charAt(0);
        if (gender =='f'&& age > 20 && age < 60) {
            System.out.println("place of service:urban");
        }
        if (gender == 'm' && age > 20 && age < 40) {
            System.out.println("place of service:anywhere");
        }
        if (gender == 'm' && age > 40 && age < 60) {
            System.out.println("place of service:urban area only");
        }
        if (age < 20 || age > 60) {
            System.out.println("error");
        }

    }
        }
