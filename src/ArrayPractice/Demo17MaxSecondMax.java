package ArrayPractice;

public class Demo17MaxSecondMax {
    public static void main(String[] args) {
        int [] array={101,1,1234,9,348};
        int max =Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            if (max <array[i]){
                max=array[i];
            }
        }
        System.out.println("Max is"+max);
}
}