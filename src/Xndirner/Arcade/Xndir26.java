package Xndirner.Arcade;

public class Xndir26 {
    public static void main(String[] args) {
        int x=100;
        boolean t = true;
        while(x>0){
            if ((x%10)%2!=0){
                t=false;
                break;

            }
            x=x/10;
        }
        System.out.println(t);
    }
}
