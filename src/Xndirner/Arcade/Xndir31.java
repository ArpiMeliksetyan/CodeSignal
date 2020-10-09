package Xndirner.Arcade;

public class Xndir31 {
    public static void main(String[] args) {
        int deposit = 100;
        double sum = 0;
        int rate = 20;
        int threshold = 170;
        int year = 0;

        while (year >= 0 && sum < threshold) {
            if (year == 0) {
                sum = deposit;
                year++;
            } else {
                sum = sum + (sum * rate) / 100;
                year++;
            }
        }
        System.out.println(year - 1);
    }
}
