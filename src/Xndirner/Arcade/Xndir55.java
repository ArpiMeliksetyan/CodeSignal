package Xndirner.Arcade;

import java.util.Arrays;

public class Xndir55 {
    public static void main(String[] args) {


        int[][] array = {{1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}};
//        int[][] array = {{9, 9, 9, 9, 9}, {9, 9, 9, 9, 9}, {9, 9, 9, 9, 9}, {9, 9, 9, 9, 9}, {9, 9, 9, 9, 9}, {9, 9, 9, 9, 9}};

        String[] s = new String[array.length];
        String[] s2 = new String[(array.length - 1) * (array[0].length - 1)];
        String s1 = "";
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                s1 = s1 + array[i][j];
            }
            s[i] = s1;
            s1 = "";
        }
        int k = 0;
        int m = 0;
        int n = 2;
        int j = 0;


        for (int i = 0; i < s.length-1; i++) {
            while (n <= s[k].length()) {
                String a = s[k].substring(m, n);
                k++;
                String b = s[k].substring(m, n);
                s2[j] = a + b;
                m++;
                n++;
                j++;
                k--;
            }
            k++;
            n = 2;
            m = 0;
        }

        for (int i = 0; i < s2.length; i++) {
            for (int z = i + 1; z < s2.length; z++) {
                if ((s2[i].charAt(0) == s2[z].charAt(0) && s2[i].charAt(1) == s2[z].charAt(1)
                        && s2[i].charAt(2) == s2[z].charAt(2) && s2[i].charAt(3) == s2[z].charAt(3))) {
                    count++;
                    break;
                }
            }

        }
        System.out.println(s2.length - count);
    }
}
