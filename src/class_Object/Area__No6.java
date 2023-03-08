package class_Object;

import java.util.Scanner;

public class Area__No6 {
    int lenght;
    int breadth;

    Area__No6(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    int returnArea() {
        return lenght * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Area__No6 obj = new Area__No6(l, b);
        System.out.println("Area of the rectangle is:" + obj.returnArea());

    }
}
