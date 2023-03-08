package class_Object;

public class Triangle1_NO4 {
    Triangle1_NO4(int a, int b, int c){
        int perimeter=a+b+c;
        System.out.println("perimeter:"+perimeter);
        float s=perimeter/2;
        double area=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("Area:"+area);
    }

    public static void main(String[] args) {

        Triangle1_NO4 obj=new Triangle1_NO4(3,4,5);
    }

}
