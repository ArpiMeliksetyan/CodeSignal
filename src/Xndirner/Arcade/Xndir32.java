package Xndirner.Arcade;

public class Xndir32 {
    public static void main(String[] args) {
        int[] x = {2,3};
        int[] y = new int[x.length];
        int sum = 0;
        int min = 0;
        int z = 0;


        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i != j && x[j] - x[i] > 0) {
                    sum = sum + (x[j] - x[i]);

                } else if (i != j && x[j] - x[i] < 0) {
                    sum = sum - (x[j] - x[i]);
                }
            }
            y[i] = sum;
            sum = 0;

        }
        for (int i = 0; i < y.length; i++) {
            min = y[0];
        }
        for (int i = 0; i < y.length; i++) {
            if (min > y[i]) {
                min = y[i];
                z=i;

            }

        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(x[z]);
            break;
        }
    }

    int absoluteValuesSumMinimization(int[] x) {
        int[] y = new int[x.length];
        int sum = 0;
        int min = 0;
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i != j && x[j] - x[i] > 0) {
                    sum = sum + (x[j] - x[i]);

                } else if (i != j && x[j] - x[i] < 0) {
                    sum = sum - (x[j] - x[i]);
                }
            }
            y[i] = sum;
            sum = 0;

        }
        for (int i = 0; i < y.length; i++) {
            min = y[0];
        }
        for (int i = 0; i < y.length; i++) {
            if (min > y[i]) {
                min = y[i];
                z=i;

            }

        } return x[z];

    }

}


