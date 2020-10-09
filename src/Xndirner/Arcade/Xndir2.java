package Xndirner.Arcade;

import java.util.Scanner;

public class Xndir2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        int century;

        if (year >= 1) {
            if (year % 100 == 0) {
                century = year / 100;
            } else {
                century = (year / 100) + 1;
            }
            System.out.println(century);

        }
    }
}
