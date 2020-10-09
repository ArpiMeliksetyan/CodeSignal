package Xndirner.Arcade;

public class Xndir5 {
    int shapeArea(int n) {
        int x=1;
        int count=0;
        int shapeArea;
        for (int i=1; i<n; i++){
            shapeArea=x;
            count++;
            x=shapeArea+(count*4);


        } return x;

    }
}
