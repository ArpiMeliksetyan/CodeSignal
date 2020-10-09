package Xndirner.Arcade;

public class Xndir25 {
    public static void main(String[] args) {
        int elemToReplace = 1;
        int substitutionElem = 3;
        int[] array = {1, 2, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemToReplace) {
                array[i] = array[i] - array[i] + substitutionElem;
            }
        } for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
