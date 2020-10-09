package Xndirner.Arcade;

public class Xndir35 {
    public static void main(String[] args) {
        String s = "var_1__Int";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                System.out.println(s.charAt(i));
                break;

            }
        }
    }

    char firstDigit(String s) {
        char x = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                 x = s.charAt(i);

                break;

            }
        } return x;
    }
}