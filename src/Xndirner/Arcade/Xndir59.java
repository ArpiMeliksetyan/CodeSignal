package Xndirner.Arcade;

public class Xndir59 {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 5;
        int[][] array = new int[n][n];

        int x = 1;
        int index = 0;
        int index1 = 0;
        int i, j;

        for (int s = 0; s <= n1 / 2; s++) {

            i = index;
            j = index;

            while (j < n) {
                array[i][j] = x;
                x++;
                j++;
            }
            i++;
            j--;

            while (i < n) {
                array[i][j] = x;
                x++;
                i++;
            }
            j--;
            i--;
            while (j >= index1) {
                array[i][j] = x;
                x++;
                j--;
            }
            i--;
            j++;

            while (i > index1) {
                array[i][j] = x;
                x++;
                i--;
            }
            index++;
            index1++;
            n--;
        }


        for (int l = 0; l < array.length; l++) {
            for (int k = 0; k < array[l].length; k++) {
                System.out.print(array[l][k] + " ");
            }
            System.out.println();
        }
    }
}
