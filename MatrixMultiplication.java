public class MatrixMultiplication {

    public static void main(String[] args) {

        // First matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Empty result matrix
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Matrix multiplication
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix2[0].length; j++) {

                for (int k = 0; k < matrix2.length; k++) {

                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result matrix
        System.out.println("Resulting Matrix:");

        for (int[] row : result) {

            for (int value : row) {

                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }
}