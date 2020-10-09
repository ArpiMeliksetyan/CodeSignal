package Xndirner.Arcade;

public class Xndir40 {
    public static void main(String[] args) {
        String x = "123ab";
        String y = "";
        int count = 0;


        for (int i = 0; i < x.length() ; i++) {
            if (x.charAt(i) >= 48 && x.charAt(i) <= 57) {
                count++;
            }

        }
        if (count == x.length()) {
            y = x;
            System.out.println(y);
        } else {

            for (int i = 0; i < x.length() - 1; i++) {

                if (!(x.charAt(i) >= 48 && x.charAt(i) <= 57)) {
                    y = "";
                    break;
                } else if (x.charAt(i) >= 48 && x.charAt(i + 1) <= 57) {
                    y = y + x.charAt(i);

                } else if (x.charAt(i) >= 48 && x.charAt(i) <= 57 && !(x.charAt(i) >= 48 && x.charAt(i + 1) <= 57)) {
                    y = y + x.charAt(i);
                    break;
                } else {
                    y = "";
                }
            }
            System.out.println(y);
        }
    }
}


