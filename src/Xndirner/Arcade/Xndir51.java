package Xndirner.Arcade;

import java.util.ArrayList;
import java.util.List;

public class Xndir51 {
    int deleteDigit(int n) {

        int count = 0;
        int x = n;

        while (n > 0) {
            count++;
            n /= 10;
        }
        int[] array = new int[count];
        int k = count - 1;

        while (x > 0) {
            array[k] = x % 10;
            x /= 10;
            k--;
        }
        List<Integer> arr = new ArrayList<>(array.length);
        for (int a : array) {
            arr.add(a);
        }
        String max = "";
        for (int i = 0; i < arr.size() - 1; i++) {

            max = max + arr.get(i);
        }

        int h = 2;
        String z = "";
        int w;
        int w1 = Integer.valueOf(max);
        int q;
        int y;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.size() - h >= 0) {
                q = arr.get(arr.size() - h);
                y = arr.size() - h;
                arr.remove(arr.size() - h);
            } else {
                break;
            }

            for (int j = 0; j < arr.size(); j++) {
                z = z + arr.get(j);
            }
            w = Integer.valueOf(z);
            if (w1 < w) {
                w1 = w;
            }
            arr.add(y, q);
            h++;
            z = "";


        }
        return w1;

    }
}
