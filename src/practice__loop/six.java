package practice__loop;

public class six {
    public static void main(String[] args) {
        /*
        1
        1 1
        1 1 1
        1 1 1 1
        1 1 1 1 1
        1 1 1 1 1 1
         */
        for (int row = 1; row <=10 ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }

    }
}
