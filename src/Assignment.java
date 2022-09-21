import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
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

       /* int number=12345;
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

        */

        //Write a program to calculate the sum of the digits of a 3-digit number.

        // Number=132       Output=6
       /*
       int num=132;
       int sum ;
       int digit1=num%10;
       num=num/10;

       int digit2=num%10;
       num =num/10;
       int digit3=num%10;
       sum=digit1+digit2+digit3;
    System.out.println(sum);

        */

        //assignment=16
        //(Write a program to reverse no)
        // Number=123   Output=321

      /*
       int num=123;

       int digit=num%10;
       num=num/10;

       int digit1=num%10;
       num =num/10;

       int digit2=num%10;
       num=num/10;
       System.out.println(digit);
       System.out.println(digit1);
       System.out.println(digit2);

       */

       /*int num=123,rev=0;
       while(num!=0)
       {
          int rem=num%10;
          rev=rev*10+rem;
          num=num/10;

       }
       System.out.println("the reverse order");

        */


        //input user
        //assignment=1
        // (Write a program to take two integer inputs from user and print sum and product of them)
       /* Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
         int sum=a+b;
         int product=a*b;
        System.out.println("enter sum of number:"+sum);
        System.out.println("enter product of number:"+product);

         */

        //assignment=2(Take to  integer input from user)
        //first calculate the sum of two then product of two.
        //finally print the sum of product of both obtained results

       /* Scanner sc=new Scanner(System.in);

        int a;
        int b;
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
        int sum=a+b;
        int product=a*b;
        int add=sum+product;

        System.out.println("enter sum of number is:"+sum);
        System.out.println("enter product of number is:"+product);
        System.out.println("addition of sum and product is:"+add);

        */

        //assignment=3
        //(Ask user to give two double input for length and breadth of a rectangle and print area type casting to int)
        /*Scanner sc= new Scanner(System.in);
        double length;
        double breadth;
        System.out.println("enter the length");
        length=sc.nextDouble();
        System.out.println("enter the breadth");
        breadth=sc.nextDouble();
         int area=(int) ((int) length*breadth);
        System.out.println("area of the rectangle :"+area);

         */

        //assignment=4
        //Take a name, Roll no, and field of interest from user and print in the format below
        // hey, my name is xyz znd my roll number is xyz. my field interest are xyz.
        /*Scanner sc =new Scanner(System.in);
        String name;
        String area;
        int Roll_no;
        System.out.println("enter your name");
       name= sc.nextLine();
        System.out.println("enter your area");
        area= sc.nextLine();
        System.out.println("enter the roll number");
        Roll_no=sc.nextInt();
        System.out.println("hey");
        System.out.println("My Name is");
        System.out.println(name);
        System.out.println("My Roll no is");
        System.out.println(Roll_no);
        System.out.println("My field interest are");
        System.out.println(area);

         */


        //assignment=5
        //(Take side of square from user and print area and perimeter of it)
       /* Scanner sc =new Scanner(System.in);
        double square;
        System.out.println("enter the side of square");
        square= sc.nextDouble();
        double area=square*square;
        double perimeter=4*square;
        System.out.println("area of square");
        System.out.println(area);
        System.out.println("perimeter of square ");
        System.out.println(perimeter);

        */

        //assignment=6
        // (Write a program to find square of a number)
        //Example Input=2   Output=4
      /* Scanner sc =new Scanner(System.in);
        double num;
        System.out.println("enter the number");
        num= sc.nextInt();
        double square=num*num;
        System.out.println("square of number  is");
        System.out.println(square);

       */


        //assignment=7
        //(Take to different string input and print them in same line  )
        //example input Codes
        //Dope
        //output CodeDope
       /* Scanner sc =new Scanner(System.in);
        String Str1;
        System.out.println("enter the first string is");
        Str1= sc.nextLine();
        String Str2;
        System.out.println("enter the second string is");
        Str2= sc.nextLine();
        String add= Str1+Str2;
        System.out.println("entire string is:\n"+add);
       // System.out.println(add);

        */

        //assignment=8
        //(Take 3 input from user and check all are equal)
        // (use &&,||)
        /*Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("enter the first number is");
        num1 = sc.nextInt();
        int num2;
        System.out.println("enter the second second is");
        num2 = sc.nextInt();
        int num3;
        System.out.println("enter the second second is");
        num3 = sc.nextInt();
        if (((num1 == num2) && (num1 == num3) && (num2 == num3))) {
            System.out.println("all no are same");
        } else {
            System.out.println("all no are not same");

        }

         */


        //assignment=9
        //
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        if ((a<50) && (a<b) ) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

         */

        //assignment=10
        //(if the marks of robert in three sub are entered through keyboard (each out of 100) write a program to calculate)
        //his total marks and per' mark

       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter the mark of tree subject is");

        int Mark1 = sc.nextInt();
        int Mark2= sc.nextInt();
        int Mark3= sc.nextInt();
        float sum=Mark1+Mark2+Mark3;
        System.out.println("total sum of tree sub:"+sum);
        float per=(sum/300)*100;
        System.out.println("percentage of tree sub:"+per);

        */


        //if else
        //assignment=1
        // Take value of length and breadth of a rectangle from user and check if it ia square or not

        /*
        Scanner sc = new Scanner(System.in);

        int length;
        int breadth;
        System.out.println("enter length");

        length = sc.nextInt();
        System.out.println("enter breadth");
        breadth = sc.nextInt();
        if (length == breadth)
        {

            System.out.println("it is square");
        }

         else
        {
            System.out.println("it is a not square");
        }

         */

         //Assignment=2
        //Take to int value from user and print greatest among them

       /* Scanner sc = new Scanner(System.in);

        int a;
        int b;
        System.out.println("enter valur a");
        a = sc.nextInt();
        System.out.println("enter value b");
        b=sc.nextInt();
        if (a>b)
        {
            System.out.println("a is grater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }

        */
        //assignment=3
        //A shop will give discount of 10% if the cost of purchased quantity is more than 1000
        // Ask user for quantity
        // Suppose, one unit will cost 100
        // Judge and print total cost for user
       /*
        Scanner sc = new Scanner(System.in);

        System.out.println("enter quantity");
        int quantity;
        quantity=sc.nextInt();
        float price =quantity*100;
        if (price>1000){
        float discount=(10*price)/100;
        float total=price-discount;
            System.out.println("discount price=:"+total);
        }
        else
        {
            System.out.println("the price is  "+price);
        }

        */


        //example=2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter quantity");
        int quantity;
        quantity=sc.nextInt();
        float price =quantity*100;
        if (price>1000){
            float discount=(price/100)*10;
            float total=price-discount;
            System.out.println("discount price=:"+total);
        }
        else
        {
            System.out.println("the price is  "+price);
        }





























    }
}

