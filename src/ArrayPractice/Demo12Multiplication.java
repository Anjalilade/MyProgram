package ArrayPractice;

public class Demo12Multiplication {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8,};
        int multi = 4;
        for (int i=0; i< array.length; i++){
         multi *= array[i];
            System.out.println("Multiplication of element"+multi);

        }
    }
}