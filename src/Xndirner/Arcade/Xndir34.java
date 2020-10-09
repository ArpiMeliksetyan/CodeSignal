package Xndirner.Arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xndir34 {
    public static void main(String[] args) {
        int count = 0;
        int k = 1;
        int z = k;
        Integer[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        List<Integer> list = new ArrayList<>(Arrays.asList(x));
        for (int i = 0; i < list.size(); i++) {

            if (k!=1 && i == k - 1) {
                list.remove(i);
                k = k + (z - 1);
            } else if(k==1){
                list.removeAll(list);
            }

        }

        Integer[] y = new Integer[list.size()];
        y = list.toArray(y);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(y[i]);
        }
    }
}
