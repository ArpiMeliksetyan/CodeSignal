package Xndirner.Arcade;

public class Xndir56 {
    public static void main(String[] args) {
        int x = 2;
        int y = -1;
        int z = 2;
        int count = 0;
        boolean prime = false;

        while (z * z <= x) {
            if (x % z == 0) {
                count++;
            }
            if (count > 0) {
                break;
            }
            z++;
        }
        if (count == 0) {
            prime = true;
        }
        System.out.println(prime);

        if (x > 0 && x < 10) {
            y = x;
        } else if (prime && x > 10) {
            y = -1;
        } else if (!prime && x > 10){

        }
    }
}
