package Operator;

public class AssignmentNO3 {
    public static void main(String[] args) {
        //1st way
        int num=8;
        int add=(8+2345)/3;
        System.out.println("enter the value\n"+add);
        float modules=add%5*5;
        System.out.println("enter the value\n"+modules);
        //2nd way
        //Write a program to add 8 to the number 2345 and then divide it by 3
        System.out.println((8+2345)/3);

        //Now the modulus of hte quotient is taken with 5 and then multiply the resultant value by 5
        System.out.println((float) (((8+2345)/3)%5)*5);

    }
}
