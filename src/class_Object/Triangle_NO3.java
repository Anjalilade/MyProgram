package class_Object;

public class Triangle_NO3 {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int c=5;
        int perimeter=a+b+c;
        System.out.println("perimeter:"+ perimeter);
        float s=perimeter/2;
        double area=Math.sqrt((s-a)*(s-b)*(s-c));
        System.out.println("Area:"+area);

    }
}
