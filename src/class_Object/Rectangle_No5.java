package class_Object;

public class Rectangle_No5 {
    int l, b;

    Rectangle_No5(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int Area() {
        int area = l * b;
        return area;
    }

    public static void main(String[] args) {
        Rectangle_No5 obj = new Rectangle_No5(4, 5);
        Rectangle_No5 obj2 = new Rectangle_No5(5, 8);
        System.out.println("area of first rectangle:" + obj.Area());
        System.out.println("area of first rectangle:" + obj2.Area());

    }
}