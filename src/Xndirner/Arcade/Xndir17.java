package Xndirner.Arcade;

public class Xndir17 {
    public static void main(String[] args) {
        int[] array = {2, 1, 10,1};
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                continue;
            } else {
                array[i + 1]++;
                count++;
                i = i-1;
            }

        }
        System.out.println(count);

    }

    int arrayChange(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                continue;
            } else {
                array[i + 1]++;
                count++;
                i = 0;
            }

        } return count;
    }

}

