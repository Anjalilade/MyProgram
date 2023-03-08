package ArrayPractice;

public class Demo11substraction {
    public static void main(String[] args) {
        int [] array= {25,56,76,45};
        int sub =20;
        for (int i=0; i< array.length; i++) {
            sub -=array[i];
            System.out.println("subtraction of elements"+ sub);
        }
        }

}
