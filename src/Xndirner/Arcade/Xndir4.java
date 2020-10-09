package Xndirner.Arcade;

public class Xndir4 {
    int adjacentElementsProduct(int[] inputArray) {
        int maxProduct = inputArray[0]*inputArray[1];
        for (int i = 0; i < inputArray.length-1; i++) {
            if (maxProduct < inputArray[i] * inputArray[i + 1]) {
                maxProduct = inputArray[i] * inputArray[i + 1];
            }
        } return maxProduct;

    }
}
