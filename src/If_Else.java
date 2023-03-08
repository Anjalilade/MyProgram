import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
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
        /*
        Scanner sc = new Scanner(System.in);
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

        //Assignment=4
        //A company decide to give house of50% to emp if his\her year of service is more than 5 year.
        //Ask user for their salary and year of service and print the net bonus amount.

       /* int service;
        int salary;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the salary of year");
        service=sc.nextInt();
        System.out.println("enter the salary");
        salary=sc.nextInt();
        if (service>5) {
            System.out.println("your service above 5 year so you get bonus, so your total salary is");
            System.out.println((salary) + (5 * salary) / 100);

        }
        else
        {
            System.out.println("sorry you are not eligible of bonus because your service less than 5, so your salary is");
            System.out.println(salary);

        }

       */
        //assignment=5
        /*
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        marks=sc.nextInt();
        if (marks<25) {
            System.out.println("F");
        } else if (marks<=45) {
            System.out.println("E");

        }
        else if (marks<=50) {
            System.out.println("D");

        }
        else if (marks<=60) {
            System.out.println("C");

        }
        else if (marks<=80) {
            System.out.println("B");

        }
        else if (marks<=100) {
            System.out.println("A");

        }
        else {
            System.out.println("visit your teacher");
        }
         */
        //assignment=6
       /*
        int age1;
        int age2;
        int age3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three ages");
        age1=sc.nextInt();
        age2=sc.nextInt();
        age3=sc.nextInt();
        if (age1<age2 && age1<age3)
        {
            System.out.println("the youngest is"+age1);
        }
        else if (age2<age3){
            System.out.println("the youngest is"+age2);
        }
        else {
            System.out.println("the youngest is"+age3);
        }
        if (age1>age2 && age1>age3){
            System.out.println("Oldest is");
        } else if (age1>age3) {
            System.out.println("the oldest is"+age2);

        }
        else {
            System.out.println("the oldest is"+age3);

        }

        */

        //assignment=7
        /*
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        if (num<0){
            System.out.println(num*-1);
        }
        else{
            System.out.println(num);
        }
         */
        //assignment=8
        /*
        int classes;
        int attend;
        float attended;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of the classes held");
        classes=sc.nextInt();
        System.out.println("number of attendence");
        attend=sc.nextInt();
        attended=((attend)/(float)(classes)*100);
        if (attended>=75){
            System.out.println("you allows to sit in exam");

        }
        else {
            System.out.println("you are not allow to sit");
        }

         */
        //assignment=9
        /*
        int classes;
        int attend;
        float attended;
        char medical;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of the classes held");
        classes=sc.nextInt();
        System.out.println("number of attendence");
        attend=sc.nextInt();
        attended=((attend)/(float)(classes)*100);
        System.out.println("if medical cause type y type n");
        medical=sc.next().charAt(0);
        if (attended>=75){
            System.out.println("you allows to sit in exam");

        }

        else if (medical=='y'){
            System.out.println("you are  allow to sit in exam");
        }
        else {
            System.out.println("you are not allow to sit in exam");
        }

         */
        //assignment=10
        //example=1
        //assignment=10
        //eg=1
        /*
        int x = 2;
        int y = 5;
        int z = 0;
        if (x == 2){

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (x!=5){

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (x!=5 && y>=5){

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (z  !=0 || x==2){

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (!(y<10)){

            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

         */
        //assignment=11
        /*
        int year=2000;
        if (year%4==0&&year%100!=0||year%400==0){

            System.out.println("its a leap year");
        }
        else{
            System.out.println("not leap year");
        }

         */

        //assignment=12

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter martial status(y/n)");
        char state = sc.next().charAt(0);
        System.out.println("enter your gender(m/f)");
        char gender = sc.next().charAt(0);
        if (gender == 'f' && age > 20 && age < 60) {
            System.out.println("place of service:urban");
        }
        if (gender == 'm' && age > 20 && age < 40) {
            System.out.println("place of service:anywhere");
        }
        if (gender == 'm' && age > 40 && age < 60) {
            System.out.println("place of service:urban area only");
        }
        if (age < 20 || age > 60) {
            System.out.println("error");
        }
    }
}


      /*  //assignmnet=13
        Scanner sc=new Scanner(System.in);
        System.out.println("enter four digit number");
        int num;
        num=sc.nextInt();
        int digit=num%10;
        num=num/10;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        int digit3=num%10;
        num=num/10;
        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

    }

}
}

       */
