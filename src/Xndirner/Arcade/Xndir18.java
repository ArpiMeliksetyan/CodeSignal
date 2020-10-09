package Xndirner.Arcade;

import java.util.ArrayList;
import java.util.Arrays;

public class Xndir18 {
    public static void main(String[] args) {
        String x = "aabbccd";
        boolean t = true;
        int count = 0;
        int count1 = 0;
        char temp = ' ';

        ArrayList<Character> arrayList = new ArrayList<>();
        for (char i = 0; i < x.length(); i++) {
            arrayList.add(x.charAt(i));
        }
        for (char i = 0; i < arrayList.size(); i++) {
            for (char j = 0; j < arrayList.size() - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }


        ArrayList<Character> arrayList1 = new ArrayList<>();
        arrayList1.add(arrayList.get(0));
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList1.get(arrayList1.size() - 1) != arrayList.get(i)) {
                arrayList1.add(arrayList.get(i));
            }
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList1.size(); i++) {
            count = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList1.get(i) == arrayList.get(j)) {
                    count++;
                }
            }
            arrayList2.add(count);
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i) % 2 != 0) {
                count1++;
            }
        } if (count1>1){
            t=false;
        }
        System.out.println(t);


    }
}







