package Xndirner.Arcade;

public class Xndir19 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 15;
        int d = 10;
        boolean t = true;

        if (!((a==c || a==d && b==c || b==d) && a+b==c+d)){
            t=false;
        }
        System.out.println(t);

    }
}
