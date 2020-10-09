package Xndirner.Arcade;

public class Xndir27 {
    public static void main(String[] args) {
        String name = " variable";
        boolean t = true;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(0) <48 || name.charAt(0)>57) {

                if (!((name.charAt(i) <= 57 && name.charAt(i) >= 48) ||
                        (name.charAt(i) == 95) ||
                        ((name.charAt(i) <= 90 && name.charAt(i) >= 60)
                                || (name.charAt(i) <= 122 && name.charAt(i) >= 97)))) {
                    t=false;
                    break;

                }
            } else{
                t=false;
            }
        }
        System.out.println(t);
    }
}
