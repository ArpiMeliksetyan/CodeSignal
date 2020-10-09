package Xndirner.Arcade;

public class Xndir39 {
    public static void main(String[] args) {

        int value1 = 15;
        int weight1 = 2;
        int value2 = 20;
        int weight2 = 3;
        int maxW = 2;
        int sum = 0;

        if (maxW >= weight1 + weight2) {
            sum = value1 + value2;

        } else if (maxW < weight1 && maxW < weight2) {
            sum = 0;

        } else if (maxW <= weight1 && maxW >= weight2) {
            sum = value2;
        } else if (maxW >= weight1 && maxW <= weight2) {
            sum = value1;
        } else {
        if (value1 > value2) {
            sum = value1;
        } else {
            sum = value2;
        }
    }
        System.out.println(sum);

}
}
