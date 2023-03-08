package ArrayPractice;

public class Demo19Multi {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {},
                {}

        };
        System.out.println(array);
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int [][]array2={
                {10},
                {20,30},
                {40,50,60}
        };
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println(array2[1].length);
        System.out.println(array2[2].length);

        System.out.println("*******Printing Multi Dimention Array******");
        for (int index = 0; index < array2.length; index++) {
            for (int j = 0; j < array2[index].length; j++){
                System.out.println(array2[index][j]+" ");
            }
            System.out.println();
        }


        }
    }

