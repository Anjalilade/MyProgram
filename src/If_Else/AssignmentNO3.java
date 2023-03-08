package If_Else;

import java.util.Scanner;

public class AssignmentNO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quality");
        int quantity = sc.nextInt();
        float price = quantity * 100;
        if (price > 1000) {
            float discount = (10 * price) / 100;
            float total = price - discount;
            System.out.println("discount price=:" + total);
        } else {
            System.out.println("the price is  " + price);
        }
    }
}



