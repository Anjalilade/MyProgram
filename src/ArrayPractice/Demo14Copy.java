package ArrayPractice;

public class Demo14Copy {
    public static void main(String[] args) {
        int [] array={19,45,56,89};
        int [] copy =new int[array.length];
        for (int i=0; i< array.length; i++){
            copy[i]=array[i];
        }
        for (int i=0; i< copy.length; i++){
            System.out.println(copy[i]+" ");
        }

    }
}
