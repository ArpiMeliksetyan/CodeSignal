package Xndirner.Arcade;

public class Xndir22 {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 9};
        int n = 1;
        int count = 0;
        boolean t = true;
        while (t) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % n == 0) {
                    count++;
                }
            }
            if(count == 0){

                break;
            }
            count = 0;
            n++;
        }
        System.out.println(n);
    }
}




