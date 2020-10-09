package Xndirner.Arcade;

import java.util.ArrayList;
import java.util.List;

public class Xndir52 {
    public static void main(String[] args) {
        String a = "Ab acsd asf";
        List<Integer> array = new ArrayList<>();
        List<String> array1 = new ArrayList<>();
        String y = "";
        int max = 0;
        int index = 0;
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) >= 65 && a.charAt(i) <= 90) || (a.charAt(i) >= 97 && a.charAt(i) <= 122)) {
                if (count1 > 0) {
                    y = "";
                    count1 = 0;
                }
                y = y + a.charAt(i);
                count++;

            } else if (count != 0 && !((a.charAt(i) >= 65 && a.charAt(i) <= 90) || ((a.charAt(i) >= 97 && a.charAt(i) <= 122)))) {
                if (count1 == 0) {
                    array1.add(y);
                }
                count1++;
            } else if (y.length() == a.length()) {
                y = a;
                break;
            }
        }
       array1.add(y);
        if (!(y.length() == a.length())) {
            for (int i = 0; i < array1.size(); i++) {
                array.add(array1.get(i).length());
            }
            System.out.println(array);

            for (int i = 0; i < array1.size(); i++) {
                if (max <= array.get(i)) {
                    max = array.get(i);
                    index = i;


                }
            }

            System.out.println(array1.get(index));
        } else {
            System.out.println(a);
        }
    }
}
