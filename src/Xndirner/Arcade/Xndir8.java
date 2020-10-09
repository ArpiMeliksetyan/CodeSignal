package Xndirner.Arcade;

public class Xndir8 {
    int matrixElementsSum(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i == 0 && matrix[i][j] != 0) {
                    sum += matrix[i][j];

                } else if (matrix[i][j] == 0 && i != matrix.length - 1) {
                    matrix[i + 1][j] = 0;

                } else if (i > 0 && matrix[i - 1][j] != 0) {
                    sum += matrix[i][j];
                }

            }

        }
        return sum;
    }
}
