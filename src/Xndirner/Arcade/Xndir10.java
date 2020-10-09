package Xndirner.Arcade;

import java.util.*;
import java.util.stream.Collectors;

public class Xndir10 {



    int commonCharacterCount(String s1, String s2) {
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        int count = 0;

        ArrayList<String> a = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(arr2));


        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i).equals(b.get(j))) {
                    count++;
                    b.remove(j);
                    break;
                }
            }
        }
        return count;


    }
}




