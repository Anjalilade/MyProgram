package class_Object;
import java.util.Scanner;
public class Area_NO1 {
    int length, breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public int getArea() {
        int area;
        area = length * breadth;
        return area;

    }

    public static void main(String[] args) {
        Area_NO1 obj = new Area_NO1();
        System.out.println("enter the parameters");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        obj.setDim(l, b);
        System.out.println(obj.getArea());

    }
}