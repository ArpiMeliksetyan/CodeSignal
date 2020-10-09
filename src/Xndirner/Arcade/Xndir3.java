package Xndirner.Arcade;

import java.util.Scanner;

public class Xndir3 {

    public static void main(String[] args) {

        checkPalindrome("aaabbaaaa");
        System.out.println();
    }

    static boolean checkPalindrome(String inputString) {
        boolean t=false;
        char[] letter = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            if (letter[i] != letter[letter.length - 1 - i]) {
                t=false;
                break;


            } else {
                t=true;
            }
        }
        return t;
    }
}

