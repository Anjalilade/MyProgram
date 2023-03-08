package ArrayPractice;

public class Demo9Sum {
    public static void main(String[] args) {
        int[] array = {10,30,40,50};
        int sum=0;
        for (int i=0; i< array.length; i++) {

            sum += array[i];
        }
        System.out.println("sum of the elemnts is"+sum);

    }
}
