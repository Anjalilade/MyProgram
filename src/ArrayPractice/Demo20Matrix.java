package ArrayPractice;

public class Demo20Matrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {1, 2, 3, 1},
                {4, 5, 6, 1, 2},
                {7, 8},

        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
