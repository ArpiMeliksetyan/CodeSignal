package Xndirner.Arcade;

public class Xndir9 {
    String[] allLongestStrings(String[] array) {

        int maxLen = array[0].length();

        for (int i = 1; i < array.length; i++) {
            if (maxLen < array[i].length()) {
                maxLen = array[i].length();
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == maxLen) {
                count++;
            }
        }

        String arr[] = new String[count];


        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = index; j < array.length; j++) {
                if (array[j].length() == maxLen) {
                    arr[i] = array[j];
                    index = j + 1;
                    break;
                }
            }
        }
        return arr;
    }
}
