package ArrayPractice;

public class Demo13devide {
    public static void main(String[] args) {
        int [] Array={5,6,9,6,4};
        int devide=4;
        for (int i=0; i< Array.length; i++){
            devide %=Array[i];
            System.out.println("devided of element"+devide);
        }

    }
}
