package Xndirner.Arcade;

public class Xndir53 {

    boolean validTime(String s) {
        String a = s.substring(0, 2);
        String b = s.substring(3, 5);
        boolean validTime = false;
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        if ((x >= 0 && x <= 23) && (y>=0 && y <=59))
            validTime=true;


        return validTime;

    }
}
