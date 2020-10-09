package Xndirner.Arcade;

public class Xndir30 {
    public static void main(String[] args) {
        int n = 4;
        int x = 0;

        int firstNumber = 3;
        int cirlceOfNumbers = 0;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = x;
            x++;
        }
        for (int i = 0; i < array.length; i++) {

            cirlceOfNumbers = firstNumber - array[array.length / 2];

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(cirlceOfNumbers);
        }
    }

    int circleOfNumbers(int n, int firstNumber) {

        int x = 0;
        int y = 0;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = x;
            x++;
        }
        for (int i = 0; i < array.length; i++) {
            if (firstNumber > array[array.length / 2]) {
                y = firstNumber - array[array.length / 2];


            } else if (firstNumber == array[array.length / 2]) {
                y = 0;
            } else {
                y = firstNumber + array[array.length / 2];
            }

        }
        return y;
    }
}
