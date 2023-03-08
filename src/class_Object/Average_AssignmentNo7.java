package class_Object;
import java.util.Scanner;
public class Average_AssignmentNo7 {
    void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        float avreage=(float)(number1+number2+number3);
        System.out.println("Average of three number=%2f"+avreage);
    }
    public static void main(String[]args){
        Average_AssignmentNo7 obj=new Average_AssignmentNo7();
        obj.calculate();
    }
}
