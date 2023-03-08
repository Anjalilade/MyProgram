package ArrayPractice;

public class ArraySum {
    public static void main(String[] args) {
        int [] array={22,44,55,74,83,98,27};
        int sum=0;
        for (int i=0; i< array.length; i++){
            sum=sum+array[i];
        }
        System.out.println("Sum of all the elements of an array:"+sum);
    }
}
