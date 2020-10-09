package Xndirner.Arcade;

public class Xndir46 {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 2};
        int k = 3;
        int count = 0;
        int index = 0;
        int count1 = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }


        if (k == 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max && i != index) {
                    count1++;
                    break;
                }
            }
            if (count1 == 0) {
                count = 1;
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] + k > max) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}

//    int elect(int[] array, int x) {
//
//        int count;
//        int count1 = 0;
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] + x > array[j] && i != j) {
//                    count++;
//                } else if (array[i] + x <= array[j] && i != j) {
//                    count = 0;
//                    break;
//                }
//            }
//            if (count == array.length - 1) {
//                count1++;
//            }
//        }
//        return count1;
//    }

