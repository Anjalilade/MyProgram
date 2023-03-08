package Loop_Loop;

import java_practice.Average;

import java.util.Scanner;

public class AssignmentNO1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how mwny number you want to calculate average");
        int numbers= sc.nextInt();
        System.out.println("enter the values");
        float sum=0;
        for (int i = 1; i < numbers; i++) {
           sum += sc.nextInt();

        }
        float average=sum/numbers;
        System.out.println("Average"+average);
    }
}
