package Xndirner.Arcade;

import java.util.ArrayList;

public class Xndir16 {
    boolean areSimilar(int[] a, int[] b) {

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> a1List = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                count++;
                a1.add(a[i]);
                b1.add(b[i]);
            }
        }
        ArrayList<Integer> a1clon = new ArrayList<>();
        a1clon = (ArrayList<Integer>) a1.clone();


        if(count == 0){
            return(true);
        }
        else if(count == 2){
            int t = 0;
            t = a1clon.get(0);
            a1clon.set(0, a1clon.get(1));
            a1clon.set(1, t);

            a1List.add(a1);
            a1List.add(a1clon);
            return(a1List.contains(b1));
        }
        else{
            return false;
        }
    }
}









