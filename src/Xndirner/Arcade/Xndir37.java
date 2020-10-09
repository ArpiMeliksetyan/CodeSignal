package Xndirner.Arcade;

public class Xndir37 {
    public static void main(String[] args) {
        int[] x = {1, 3, 2, 4};
        int k = 3;
        int sum = 0;
        int index = 0;
        int count = 0;
        int t;
        int z=0;
        int[] y = new int[x.length - (k - 1)];


        for (int i = 0; i < x.length; i++) {
            while (i < k) {
                sum = sum + x[i];
                i++;
            }
            if (index == 0) {
                i = index;
                y[i] = sum;
                count++;
                k++;
                sum = 0;
                index++;
            } else {
                i = index;
                y[i] = sum;
                count++;
                if (count == y.length) {
                    break;
                }
                k++;
                sum = 0;
                index++;
            }

        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length - 1; j++) {
                if (y[j] > y[j + 1]) {
                    t = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = t;
                }

            } z=y[y.length - 1];
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(z);
        }
    }

}



