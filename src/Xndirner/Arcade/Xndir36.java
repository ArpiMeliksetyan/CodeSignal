package Xndirner.Arcade;

public class Xndir36 {
    public static void main(String[] args) {
        String s = "cabca";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(s.length() - count);
    }

}