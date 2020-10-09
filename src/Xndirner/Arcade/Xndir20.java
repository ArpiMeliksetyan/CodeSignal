package Xndirner.Arcade;

public class Xndir20 {
    public static void main(String[] args) {
        int[] array = {10, 11, 13};
        int max = 0;
        int max1 = 0;

        for (int i = 0; i < array.length; i++) {
            max = array[0] - array[1];
            max1 = array[1] - array[0];
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i] - array[i + 1]) {
                max = array[i] - array[i + 1];
            }
            if (max1 < array[i + 1] - array[i]) {
                max1 = array[i + 1] - array[i];
            }
        }
        if (max > max1) {
            System.out.println(max);
        } else {
            System.out.println(max1);

        }
    }
}

