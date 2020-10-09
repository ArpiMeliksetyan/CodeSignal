package Xndirner.Arcade;

public class Xndir47 {
    boolean isMAC48Address(String inputString) {

        String[] s = inputString.split("-");
        for (int i=0; i< s.length; i++){
            System.out.println(s[i]);
        }

        boolean isMac = true;
        int y = 17;
        int count = 0;


        for (int i = 2; i < 15; i = i + 3) {
            if (inputString.charAt(i) == '-') {
                count++;
            }
        }

        if (count != 5) {
            isMac = false;
        } else if (inputString.length() != 17) {
            isMac = false;
        } else if (!((inputString.charAt(0) >= 48 && inputString.charAt(0) <= 57) || (inputString.charAt(0) >= 65 && inputString.charAt(0) <= 70))) {
            isMac = false;
        } else if (!((inputString.charAt(y - 1) >= 48 && inputString.charAt(y - 1) <= 57) || (inputString.charAt(y - 1) >= 65 && inputString.charAt(y - 1) <= 70))) {
            isMac = false;
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i].length()!= 2){
                isMac=false;
                break;
            }
            if (!((s[i].charAt(0) >= 48 && s[i].charAt(0) <= 57) || (s[i].charAt(0) >= 65 && s[i].charAt(0) <= 70)) ||
                    !((s[i].charAt(1) >= 48 && s[i].charAt(1) <= 57) || (s[i].charAt(1) >= 65 && s[i].charAt(1) <= 70))) {
                isMac = false;
                break;
            }


        } return isMac;

    }
}
