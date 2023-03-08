package Operator;

public class AssignmentNO9 {
    public static void main(String[] args) {
        int marks1=78;
        int marks2=45;
        int marks3=62;
        float sum=marks1+marks2+marks3;
        float percentade=(sum/300)*100;
        System.out.println("enter the sum of\n"+sum);
        System.out.println("enter the percentage\n"+percentade);

        //2nd way
        int a=78;
        int b=45;
        int c=62;
        float d=a+b+c;
        float per=(d/300)*100;
        System.out.println("the sum is");
        System.out.println(d);//185.0
        System.out.println("the percentage is");
        System.out.println(per);//61.666668

    }
}
