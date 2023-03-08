package ArrayPractice;

public class Demo3AccessingSetting {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        array[2]=100;
        for (int index=0; index<array.length; index++ ){
            System.out.println(array[index]);
        }
    }
}
