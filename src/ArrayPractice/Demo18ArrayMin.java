package ArrayPractice;

public class Demo18ArrayMin {
    public static void main(String[] args) {
        int [] array={101,1,1234,9,348};
        int min =Integer.MAX_VALUE;
        for (int i=0; i< array.length; i++){
            if (min<array[i]){
                min=array[i];
            }
        }
        System.out.println("Min is"+min);
    }
}