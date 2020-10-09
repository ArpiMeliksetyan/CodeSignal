package Xndirner.Arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xndir15 {




    String[] addBorder(String[] a) {
        int s = a[0].length() + 2;
        String[] a1 = new String[a.length + 2];
        String s1 = "";
        for (int i = 0; i < s; i++) {
            s1 += "*";
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = "*" + a[i] + "*";
        }
        for (int i = 0; i < a1.length; i++) {
            if (i == 0 || i == a1.length - 1) {
                a1[i] = s1;
            } else {
                a1[i] = a[i - 1];
            }
        }

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        } return a1;
    }


}


