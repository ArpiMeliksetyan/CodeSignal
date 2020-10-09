package Xndirner.Arcade;

public class Xndir42 {

    boolean bishopAndPawn(String bishop, String pawn) {
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
        int x2 = 0;
        int y2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (bishop.equals(array[i][j])) {
                    x1 = i;
                    y1 = j;
                }
                if (pawn.equals(array[i][j])) {
                    x2 = i;
                    y2 = j;
                }

            }
        }
        if (x1 - x2 == y1 - y2 || x1 - x2 == -(y1 - y2)) {
            t = true;

        }
        return t;

    }

}

