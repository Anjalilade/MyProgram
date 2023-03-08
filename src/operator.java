public class operator {
    public static void main(String[] args) {
        //using loops
        //question--1    using while
        //write a program to sum first n number using while loop
        /*int sum=0;
        int n=3;
        for (int i=0; i<n; i++){
            sum=sum+(2*i);
        }
        System.out.print("sum of the number is:");
        System.out.println(sum);

         */

        //question---2
        //write a program to print multiplication table a program of a given number n
       /*
       int n=3;
        for (int i=1; i<=10; i++) {

            System.out.printf("%d x %d= %d\n", n, i, n*i);
        }

        */

        //question--3
        //Write a program to print multiplication table of  10 in reverse order
/*

        //Example=---1
        //using break statement in for loop
        for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("java is great");
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
        }

 */

        //Example=---2
        //using break statement in for while loop
     /*
        int i = 0;
     while (i < 5) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
            i++;
        }
        System.out.println("loop end here");
    }

    }
      */


        //Example=---3
        //using break statement in for do-while loop
        /*int i = 0;
        do {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
            i++;
        }
        while (i < 5);
        System.out.println("loop ends here");

         */

        //Example=---4
        //using continue statement in for do-while loop
        int i=0;
        do{
            if (i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
            i++;
        }
        while (i<5);
        System.out.println("end the loop");




    }
}










