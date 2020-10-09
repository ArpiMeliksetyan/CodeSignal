package Xndirner.Interview.Arrays;

import java.util.*;

public class A2 {
    public static void main(String[] args) {
        String s = "ngrhhqbh";
        String[] a = s.split("");
        HashSet<String> set1 = new HashSet<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (!set1.contains(a[i])) {
                map.put(a[i], count);
                set1.add(a[i]);
            } else {
                if (map.containsKey(a[i])) {
                    count++;
                    map.put(a[i], count);
                    count = 1;
                }
            }
        }
        String[] l = map.keySet().toArray(new String[0]);
        Integer[] inter = map.values().toArray(new Integer[0]);

        int count1 = 0;
        for (int i : inter) {
            if (i == 1) {
                break;
            }
            count1++;
        }
        if (!map.values().contains(1)) {
            System.out.println("_");
        } else
            System.out.println(l[count1]);




    }
}

