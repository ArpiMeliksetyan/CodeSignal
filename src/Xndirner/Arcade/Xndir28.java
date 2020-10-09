package Xndirner.Arcade;

public class Xndir28 {
    public static void main(String[] args) {
        String s = "";
        String x = "Delete";

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 122) {
                s += (char) 97;

            } else {
                s += (char) (x.charAt(i) + 1);
            }
            System.out.println(s);
        }
    }
}

