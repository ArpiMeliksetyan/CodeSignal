package Xndirner.Arcade;

public class Xndir45 {

String buildPalindrome(String s) {
        String y = s;
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (checkPolindrome(y)) {
                break;
            }
            s1 = s.charAt(i) + s1;
            y = y + s1;
            if (checkPolindrome(y)) {
                break;
            }
            y = s;
        }
        return y;
    }

    boolean checkPolindrome(String s) {
        boolean t = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                t = false;
                break;
            }
        }
        return t;
    }

}

