package Xndirner.Arcade;

public class Xndir50 {
    int chessKnight(String s1) {

        int x = 8;
        int y = 8;
        int z = 97;
        String s = "";
        boolean t = false;

        String[][] array = new String[x][x];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                s = s + (char) z + y;
                array[i][j] = s;
                z++;
                s = "";

            }

            y--;
            z = 97;

        }
        int x1 = 0;
        int y1 = 0;
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (s1.equals(array[i][j])) {
                    x1 = i;
                    y1 = j;
                }
            }
        }
        if (x1 - 2 >= 0 && y1 - 1 >= 0) {
            count++;
        }
        if (x1 - 1 >= 0 && y1 - 2 >= 0) {
            count++;
        }
        if (x1 + 1 < 8 && y1 - 2 >= 0) {
            count++;
        }
        if (x1 + 2 < 8 && y1 - 1 >= 0) {
            count++;
        }
        if (x1 - 2 >= 0 && y1 + 1 < 8) {
            count++;
        }
        if (x1 - 1 >= 0 && y1 + 2 < 8) {
            count++;
        }
        if (x1 + 1 < 8 && y1 + 2 < 8) {
            count++;
        }
        if (x1 + 2 < 8 && y1 + 1 < 8) {
            count++;
        }
        return count;

    }



}
