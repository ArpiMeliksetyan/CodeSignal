package Xndirner.Arcade;

public class Xndir6 {

    int makeArrayConsecutive2(int[] statues) {
        int t;
        int sum = 0;
        for (int i = 0; i < statues.length; i++) {
            for (int j = 0; j < statues.length - 1; j++) {
                if (statues[j] > statues[j + 1]) {
                    t = statues[j];
                    statues[j] = statues[j + 1];
                    statues[j + 1] = t;

                }
            }
        }
        for (int i = 0; i < statues.length - 1; i++) {
            if (statues[i + 1] - statues[i] != 1) {
                sum = sum + (statues[i + 1] - statues[i] - 1);

            }

        }return sum;
    }
}
