package Xndirner.Arcade;

public class Xndir49 {
    String lineEncoding(String s) {
        String s1 = "";
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = index; j < s.length(); j++) {
                if ((i > 0) && (s.charAt(i) == s.charAt(i - 1))) {
                    break;
                }

                if (s.charAt(i) == s.charAt(j) && j != s.length() - 1) {
                    count++;
                    index++;
                }

                else if (s.charAt(i) == s.charAt(j) && j == s.length() - 1) {
                    if (count == 0) {
                        s1 = s1 + s.charAt(i);
                        break;
                    } else{
                        count++;
                        s1 = s1 + count + s.charAt(i);
                    }
                }
                else {
                    if (count != 1) {
                        s1 = s1 + count + s.charAt(i);
                        count = 0;
                        break;
                    } else {
                        s1 = s1 + s.charAt(i);
                        count = 0;
                        break;
                    }
                }
            }

        } return s1;
    }

}
