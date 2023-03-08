package practice__loop;

public class thhird {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3



         */
        for (int row = 1; row <=3 ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
