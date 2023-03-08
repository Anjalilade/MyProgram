package class_Object;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number= sc.nextInt();
        int factorial=Factorial.calculateFactorial(number);
        System.out.println("Factorial of "+number+"is"+ factorial);
    }

    private static int calculateFactorial(int number) {
        int factorial=1;
        if(number==0){
            return 1;
        }
        for (int i=1; i<=number; i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
