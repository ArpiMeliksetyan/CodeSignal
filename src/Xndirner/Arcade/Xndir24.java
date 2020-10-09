package Xndirner.Arcade;

public class Xndir24 {

    int[][] minesweeper(boolean[][] arr) {

        int[][] mat = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] && i == 0 && j == 0) {
                    mat[i][j + 1]++;
                    mat[i + 1][j]++;
                    mat[i + 1][j + 1]++;
                }
                if (arr[i][j] && i != 0 && j != 0 && i != arr.length - 1 && j != arr[i].length - 1) {
                    mat[i - 1][j - 1]++;
                    mat[i - 1][j]++;
                    mat[i - 1][j + 1]++;
                    mat[i][j - 1]++;
                    mat[i][j + 1]++;
                    mat[i + 1][j - 1]++;
                    mat[i + 1][j]++;
                    mat[i + 1][j + 1]++;
                }
                if (arr[i][j] && i == 0 && j == arr[i].length - 1) {
                    mat[i][j - 1]++;
                    mat[i + 1][j - 1]++;
                    mat[i + 1][j]++;
                }
                if (arr[i][j] && i == arr.length - 1 && j == 0) {
                    mat[i][j + 1]++;
                    mat[i - 1][j + 1]++;
                    mat[i - 1][j]++;
                }
                if (arr[i][j] && i == arr.length - 1 && j == arr[i].length - 1) {
                    mat[i][j - 1]++;
                    mat[i - 1][j - 1]++;
                    mat[i - 1][j]++;
                }

                if (arr[i][j] && i == 0 && j != 0 && j != arr[i].length - 1) {
                    mat[i][j - 1]++;
                    mat[i][j + 1]++;
                    mat[i + 1][j - 1]++;
                    mat[i + 1][j]++;
                    mat[i + 1][j + 1]++;
                }

                if (arr[i][j] && i == arr.length - 1 && j != 0 && j != arr[i].length - 1) {
                    mat[i][j - 1]++;
                    mat[i][j + 1]++;
                    mat[i - 1][j - 1]++;
                    mat[i - 1][j]++;
                    mat[i - 1][j + 1]++;
                }

                if (arr[i][j] && j == 0 && i != 0 && i != arr.length - 1) {
                    mat[i - 1][j]++;
                    mat[i - 1][j + 1]++;
                    mat[i][j + 1]++;
                    mat[i + 1][j]++;
                    mat[i + 1][j + 1]++;
                }

                if (arr[i][j] && j == arr[i].length - 1 && i != 0 && i != arr.length - 1) {
                    mat[i - 1][j]++;
                    mat[i - 1][j - 1]++;
                    mat[i][j - 1]++;
                    mat[i + 1][j]++;
                    mat[i + 1][j - 1]++;
                }
            }
        }
        return mat;
    }
}

