package Xndirner.Arcade;

import java.util.ArrayList;

public class Xndir23 {

    int[][] boxBlur(int[][] array) {
        int y = array[0].length - 2;
        int x = array.length - 2;


        int[][] array1 = new int[x][y];
        int sum = 0;
        int count = 0;
        int count1 = 0;
        int index = 0;


        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < x * y; i++) {
            for (int j = index; j < 3 + index; j++) {
                if (j == x + 2) {
                    break;
                }
                for (int k = count; k < 3 + count; k++) {
                    sum += array[j][k];

                    if (k == y + 2) {
                        count1++;
                        break;
                    }

                }
                if (count1 > 0) {
                    break;
                }


            }
            count++;
            arrayList.add(sum / 9);
            sum = 0;
            if (count == y) {
                index++;
                count = 0;
            }

        }
        int g = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = arrayList.get(g);
                g++;
            }
        }
        return array1;
    }

}

