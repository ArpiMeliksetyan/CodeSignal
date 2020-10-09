package Xndirner.Arcade;

public class Xndir14 {


    int[] alternatingSums(int[] a) {
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum = sum + a[i];
            } else {
                sum1 = sum1 + a[i];
            }
        }
        int[] alternatingSums = {sum, sum1};
        return alternatingSums;

    }
}


