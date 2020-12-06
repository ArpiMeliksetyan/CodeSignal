package Xndirner.Arcade;

public class Xndir54 {
    int sumUpNumbers(String s) {
        int sum = 0;
        int x = 0;
        String s1 = "";
        int count = 0;


        for (int j = 0; j < s.length(); j++) {
            if ((s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
                s1 += s.charAt(j);
                count++;
            } else if (count > 0 && (!(s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
                x = Integer.parseInt(s1);
                sum += x;
                count =0;
                s1 = "";

            }
        }
        if (count>0){
            x = Integer.parseInt(s1);
            sum += x;}
        return sum;
    }
}
