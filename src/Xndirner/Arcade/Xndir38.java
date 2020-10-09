package Xndirner.Arcade;

public class Xndir38 {
    public static void main(String[] args) {
        int upSpeed = 100;
        int downSpeed = 10;
        int desiredHeight = 910;
        int sum = 0;
        int count = 0;
        int x = upSpeed - downSpeed;

        if (upSpeed > desiredHeight) {
            count = 1;
        } else if(upSpeed+downSpeed==desiredHeight) {
            while (upSpeed <= desiredHeight ) {
                sum = sum + x
                ;
                upSpeed=upSpeed+x;
                count++;
            }
            count++;
        } else {
            while (upSpeed <= desiredHeight ) {
                sum = sum + x
                ;
                upSpeed=upSpeed+x;
                count++;
            }

        }
        System.out.println(count);
    }
}
