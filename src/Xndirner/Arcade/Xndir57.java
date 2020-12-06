package Xndirner.Arcade;

public class Xndir57 {
    public static void main(String[] args) {
        String[] array = {"dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)"};
        int[] array1 = new int[array.length];
        int count = 0;
        int x = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 5) {
                String s = array[i].substring(array[i].length() - 2, array[i].length() - 1);
                x = Integer.valueOf(s);
                array1[i] = x;

            } else if (array[i].length() == 8) {
                String s = array[i].substring(array[i].length() - 5, array[i].length() - 4) + array[i].substring(array[i].length() - 2, array[i].length() - 1);
                x = Integer.valueOf(s);
                array1[i] = x;

            } else if (array[i].length() == 2) {
                array1[i] = -1;

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array1[i]);
        }
    }
}



//
//
//
//        for (int i = 0; i < array.length; i++) {
//            count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i].equals(array[j]) && i != j) {
//                    count++;
//                    for (int k = 0; k < array1.length; k++) {
//                        if (array1[k] == count) {
//                            count++;
//                        }
//                    }
//                    array[j] = array[j] + '(' + count + ')';
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }


