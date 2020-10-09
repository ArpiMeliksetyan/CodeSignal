package Xndirner.Arcade;

import java.util.Scanner;

public class Xndir11 {

    public static void main(String[] args) {

    }

    boolean isLucky(int n) {
        int sum = 0;
        int sum1 = 0;
        boolean t = true;
        String b = Integer.toString(n);
        String[] x = b.split("");
        int y = x.length;

        for (int j = 0; j <= y / 2 - 1; j++) {
            sum = sum + Integer.parseInt(x[j]);
        }
        for (int j = x.length - 1; j > y / 2 - 1; j--) {
            sum1 = sum1 + Integer.parseInt(x[j]);
        }
        if (sum == sum1) {
            t = true;

        } else {
            t = false;
        }
        return t;
    }



// DAVO VERSION
    boolean isLucky1(int n) {
        int m = n;
        int len = 0;

        while(m > 0){
            m = m/10;
            len++;
        }

        int sum1 = 0;
        int sum2 = 0;
        int x = len / 2;

        while(len > 0){
            if(x < len){
                sum1 = sum1 + n%10;
            }
            else {
                sum2 = sum2 + n % 10;
            }
            len--;
            n = n/10;
        }

        if(sum1 == sum2){
            return true;
        }
        else{
            return false;
        }
    }
}
