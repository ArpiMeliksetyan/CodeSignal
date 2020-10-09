package Xndirner.Arcade;

public class Xndir29 {
    public static void main(String[] args) {
        String cell1 = "A1";
        boolean isBleack = false;
        boolean isBleack1 = false;
        boolean end = false;
        String cell2 = "B1";
        for (int i = 0; i < cell1.length(); i++) {
            if ((cell1.charAt(i) == 65 || cell1.charAt(i) == 67 || cell1.charAt(i) == 69 || cell1.charAt(i) == 71) &&
                    (cell1.charAt(i + 1) == 49 || cell1.charAt(i + 1) == 51 || cell1.charAt(i + 1) == 53 || cell1.charAt(i + 1) == 55)) {
                isBleack = true;
            } else if ((cell1.charAt(i) == 66 || cell1.charAt(i) == 68 || cell1.charAt(i) == 70 || cell1.charAt(i) == 72) &&
                    (cell1.charAt(i + 1) == 50 || cell1.charAt(i + 1) == 52 || cell1.charAt(i + 1) == 54 || cell1.charAt(i + 1) == 56)) {
                isBleack = true;
            }

        }
        for (int i = 0; i < cell2.length(); i++) {
            if ((cell2.charAt(i) == 65 || cell2.charAt(i) == 67 || cell2.charAt(i) == 69 || cell2.charAt(i) == 71) &&
                    (cell2.charAt(i + 1) == 49 || cell2.charAt(i + 1) == 51 || cell2.charAt(i + 1) == 53 || cell2.charAt(i + 1) == 55)) {
                isBleack1 = true;
            } else if ((cell2.charAt(i) == 66 || cell2.charAt(i) == 68 || cell2.charAt(i) == 70 || cell2.charAt(i) == 72) &&
                    (cell2.charAt(i + 1) == 50 || cell2.charAt(i + 1) == 52 || cell2.charAt(i + 1) == 54 || cell2.charAt(i + 1) == 56)) {
                isBleack1 = true;
            }
        }
        if (isBleack==isBleack1){
            end=true;

        }
        System.out.println(end);

    }
}



