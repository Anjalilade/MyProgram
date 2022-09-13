import java.nio.channels.WritableByteChannel;

public class Assignment {
    public static void main(String[]args) {
        // lets program
        //Assignment =1
        //Write a program to get the following output
        /*
        System.out.println("Hey there. I am data");

*/
        //Assignment=2
        //Write a program to print following on screen
        /*
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");

         */
        //Assignment=3
        //Print the following pattern on the screen
        /*
        System.out.println("* * * * * ");
        System.out.println("  * * *   ");
        System.out.println("    *     ");
        System.out.println("  * * *   ");
        System.out.println("* * * * * ");

         */


        //Assignment=4
        //Write a program to print the sum of the number 2,4 and 5.
        /*
        int a=2;
        int b=4;
        int c=5;
        int d=a+b+c;
        System.out.println(d);

         */
        //Assignment=5
        //Write a program to print the difference and product of the numbers 45 and 32.
        /*
        int a=45;
        int b=32;
        int sub=a-b;
        int multiply=a*b;
        System.out.println("enter the value of sub:"+ sub);
        System.out.println("enter the value of multiply:"+multiply );
        */

        //Know data-types
        //Assignment=1
        //Write a java program  to print an int, a double and a char on screen.
        /*
        int a=1045;
        char gender='m';
        double double_value=1000.5;
        System.out.println(a);
        System.out.println(gender);
        System.out.println(double_value);

         */
        //Assignment=2
        //Write a program to print the area of a recharge of sides 2 and 3 units respectively.
/*
        int a=2;
        int b=3;
        int area=a*b;
        System.out.println(area);

 */


        //Assignment=3
        // Write a program to print the product of the number 8.2and 6.
        /*
        float a= 8.2f;
        float b=6;
        float multiply=a*b;
        System.out.println("enter the value of multiply:"+multiply);

         */
        //Assignment=4
        // Print the ASCII value of the character 'h'
        /*
        int ch='h';
        System.out.println(ch);

         */
        /*
        char ch='h';
        System.out.println((int)ch);

         */
        /*
        int ch=104;
        System.out.println((char)ch);

         */
        //Assignment=5
        // Write a program to assign a value of 100.235 to a double variable and then convert it to int.
        /*
        double double_value=100.235d;
        System.out.println(double_value);

         */
        /*
        double double_value=100.235d;
        System.out.println((int)double_value);

         */
        //Assignment=6
        //Write a program to add 3 to the ASCII value of the  character 'd' and print the equivalent character.
       // int ch='d'+3;
       // System.out.println((int)ch);

       // char ch='d'+3;
       // System.out.println((char)ch);

        //Assignment=7
        // Write a program to add an integer variable having value 5 and a double variable having value 6.2.
        //int a=5;
       // double b=6.2;
       // double sum=a+b;
       // System.out.println(sum);

        //Assignment=8
        //Write a program to find the square of the number 3.9

        //float a= 3.9f;
        //float 3 ch=a*a;
       // System.out.println(ch);

        //operators
        //assignment=1
        //Length and breadth of a rectangle are 5 and 7 respectively
          //int length=5;
          //int breadth=7;
          //int area=length+breadth;
        //System.out.println(area);

        //assignment=2
        //Write a program to calculate the area and perimeter of the rectangle.
        //area
        //int length=2;
       // int breadth= 3;
       // int area=length+breadth;
       // System.out.println(area);

        //perimeter
       /* int a=10;
        int b=20;
        int perimeter=2*(a+b);
        System.out.println(perimeter);

        */

        //assignment=3
        // Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
        /*
        int a=2;
        int b=3;
        int c=5;
        int perimeter=2*(a+b+c);
        System.out.println(perimeter);

         */


        //Write a program to add 8 to the number 2345 and then divide it by 3
        //System.out.println((8+2345)/3);

        //Now the modulus of hte quotient is taken with 5 and then multiply the resultant value by 5
        //System.out.println((float) (((8+2345)/3)%5)*5);

        //Assignment=4
        //Now, solve the above question[Assignment-3] using assignment operators(eg. +=,-=,*=)

        //assignment=5
        //write a program to check if the two number 23 and 45 are equal.
        //System.out.println(23==45);//false

        //assignment=6
        // write a program to print the power of 7 raised to 5
       // System.out.println(7*7*7*7*7);

        //assignment=7
        //assign value of variables 'a' and 'b' as 55and70 respectively and then check if both the condition 'a<50'
       // and 'a<b' are true.
        /*
        int a=55;
        int b=70;
        System.out.println(a<50&a<b);//false

         */


        //assignment=8
        //Now solve the above
        //question[assignment=7] to check if at-least one of the  condition 'a<50' or 'a<b' is true.
        /*
        int a=55;
        int b=70;
        System.out.println(a<50||a<b);

         */

        //assignment=9
        //If the marks of Robert in three subjects are 78,45,and 62 respectively(each out of 100),write a program to calculate his total
        // makes and percentage marks.
        /*int a=78;
        int b=45;
        int c=62;
        float d=a+b+c;
        float per=(d/300)*100;
        System.out.println("the sum is");
        System.out.println(d);//185.0
        System.out.println("the percentage is");
        System.out.println(per);//61.666668

         */

        //assignment=10
        //suppose the value of variables 'a' and 'b' are and 8 respectively, write two program to swap the value of the two variables.
        /* a=6;
        int b=8;
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

         */
        //assignment=11;
        //write a program to convert fahrenheit into celsius
        /*
        int f=23;
        float fc=(f-32)*5/9;
        System.out.println(fc);

         */

        //assignment=12
        // The total number of student in a class are 90 out of which 45 are boys.
        // If 505 of the total student secured grade 'a' out of whhich 20 boys, then write a program to calculate te total number of girls getting grade'a'
       /* int total=90;
        int boys=45;
        int girls=total-boys;
        int AGradeBoys=20;
        float per=(50*total)/100;
        float sc=per-AGradeBoys;
        System.out.println("total; girls are");
        System.out.println(girls);
        System.out.println("girls who get a grade");
        System.out.println(sc);

        */


        //Assignment=13
        // Write the program to calculate the sum of the  first and the second lat digit of a 5 digit
        // Example:- number 12345;  Output:-(1+4=5)
        int number=12345;
        int sum=0;
        int digit=number%10;//5
        number=number/10;//1234

        digit=number%10;//4
        sum=sum+digit;

        digit=number%10;//4
        number=number/10;//123

        digit=number%10;//3
        number=number/10;//12

        digit=number%10;//2
        number=number/10;//1

        digit=number%10;//1
        number=number/10;//0

        sum=sum+digit;
        System.out.println("sum of the first and the second last digit is "+sum);








        

























    }
}
