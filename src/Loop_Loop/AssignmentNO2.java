package Loop_Loop;

public class AssignmentNO2 {
    public static void main(String[] args) {
        /*
        //Right angle of trangle
        *
        * *
        * * *
        * * * *
        * * * * *
         */


        for(int row=1; row<=5; row++){
            for( int column=1; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        /*
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */


        for (int row = 1; row <=5 ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");
            }
            System.out.println();

        }

        /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
         */
        for (int row = 1; row <=5 ; row++){
            for (int column = 1; column <=row ; column++) {
                System.out.print(row+" ");

            }
            System.out.println( );
        }
            /*
                1
                2 3
                4 5 6
                7 8 9 10


              */
            int counter=1;
        for (int row = 1; row <=5; row++) {
            for (int column = 1; column <=row; column++) {
                System.out.print(counter++ +" ");
            }
            System.out.println();
        }
        /*
        1
        1 1
        1 1 1
        1 1 1 1
        1 1 1 1 1
         */
        for (int row = 1; row <=5 ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
        }
    }


