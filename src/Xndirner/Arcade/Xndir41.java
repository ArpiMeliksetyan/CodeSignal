package Xndirner.Arcade;

public class Xndir41 {
    public static void main(String[] args) {

        int x = 777773;
        int y = 0;
        int count = 0;
        int count1 = 0;
        int z = 0;
        int t = 0;

        if (x >= 10) {
            while (x > 0) {
                y = y + x % 10;
                x = x / 10;
                count++;

            }
            count1++;
            int sum = y;

            if (sum < 10) {
                System.out.println(count1);
            } else {
                while (sum > 0) {
                    z = z + sum % 10;
                    sum = sum / 10;
                }
                count1++;
                if (z < 10) {
                    System.out.println(count1);
                } else {
                    while (z > 0) {
                        t = t + z % 10;
                        z = z / 10;
                    }
                    count1++;
                    System.out.println(count1);


                }

            }
        } else {
            System.out.println(count1);
        }
    }



}


