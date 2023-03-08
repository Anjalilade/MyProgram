package java_practice;

public class abc {


    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        System.out.println(add(number1,number2));
        System.out.println("main"+number1+"\t"+number2);
       }
       private static int add(int number1,int number2) {
           number1 = 100;
           number2 = 200;
           return number1+number2;
       }

}
