package Xndirner.Arcade;

public class Xndir12 {


    public static void main(String[] args) {


        int[] y = {160, 150, -1, 140, -1, -1, 190, 145};
        int t;
        int count = 0;


        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length - 1; j++) {
                if (y[j] > y[j + 1]) {
                    if ((y[j] != -1 || y[j + 1] != -1)) {
                        t = y[j];
                        y[j] = y[j + 1];
                        y[j + 1] = t;
                    } else {
                        j++;
                    }
                }
            }
        }


            for (int i = 0; i < y.length; i++) {
                System.out.println(y[i]);

            }
        }
    }

//        int[] y = {160, 150, -1, 140, -1, -1, 190, 145};
//
//        for (int i = 1; i < y.length; i++) {
//            if (y[i] == -1) {
//                continue;
//            }
//            int key = y[i];
//            int j = i - 1;
//            int count = 1;
//
//
//            while (j >= 0 && (y[j] > key || y[j] == -1)) {
//                if (y[j] == -1) {
//                    count++;
//
//                } else {
//                    y[j + count] = y[j];
//                    count = 1;
//                }
//                j--;
//
//            }
//            y[j + count] = key;
//        }
//        for (int i = 1; i < y.length; i++) {
//            System.out.println(y[i]);
//        }
//
//
//    }
//}
//

