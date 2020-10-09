package Xndirner.Arcade;

import java.util.ArrayList;
import java.util.List;

public class Xndir43 {
    public static void main(String[] args) {
        String x = "bbbaacdaef";
        Xndir43 xndir43 = new Xndir43();
        System.out.println(xndir43.x(x));
    }

    boolean x(String x) {
        boolean isBeautiful = true;
        int count = 0;
        boolean swaped = false;
        char[] y = x.toCharArray();

        for (int i = 0; i < y.length; i++) {
            swaped = false;
            for (int j = 0; j < y.length - i - 1; j++) {
                if (y[j] > y[j + 1]) {
                    char temp = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                    swaped = true;
                }
            }
            if (swaped == false) {
                break;
            }
        }



        List<Character> z = new ArrayList();
        z.add('a');
        for (int i = 0; i < y.length; i++) {
            if ((z.get(z.size() - 1) != y[i])) {
                z.add(y[i]);
            }
        }
        System.out.println(z);
        List<Integer> w = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < z.size(); i++) {
            for (int j = index; i <= y.length; j++) {
                if (z.get(i) == y[j]) {
                    count++;
                    index++;
                } else {
                    w.add(count);
                    count = 0;
                    break;
                }
                if (index == y.length) {
                    w.add(count);
                    break;

                }

            }
        }


        for (int i = 0; i < z.size() - 1; i++) {
            if (z.get(0) != 97) {
                isBeautiful = false;
                break;
            } else if (z.get(i + 1) - z.get(i) != 1) {
                isBeautiful = false;
                break;
            } else if (w.get(i + 1) - w.get(i) > 0) {
                isBeautiful = false;

            }
        } return isBeautiful;

    }
}

