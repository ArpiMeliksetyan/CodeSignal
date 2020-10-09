package Xndirner.Arcade;

public class Xndir21 {
    public static void main(String[] args) {
        String x = "025.16.054.1";

        String[] y = x.split("\\.");
        boolean t = false;
        int count = 0;
        int dotCount = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 46) {
                dotCount++;
            }
        }


        for (int i = 0; i < y.length; i++) {

            if (y[i].length() == 3) {
                for (int j = 0; j < y[i].length() - 2; j++) {
                    if ((y[i].charAt(j) == 50) &&
                            (y[i].charAt(j + 1) <= 53 && y[i].charAt(j + 1) >= 48) &&
                            (y[i].charAt(j + 2) <= 53 && y[i].charAt(j + 2) >= 48)) {
                        System.out.println(y[i].charAt(1));
                        break;

                    } else if ((y[i].charAt(j) == 50) &&
                            (y[i].charAt(j + 1) < 53 && y[i].charAt(j + 1) >= 48) &&
                            (y[i].charAt(j + 2) <= 57 && y[i].charAt(j + 2) >= 48)) {
                        break;

                    } else if ((y[i].charAt(j) == 49) &&
                            (y[i].charAt(j + 1) <= 57 && y[i].charAt(j + 1) >= 48) &&
                            (y[i].charAt(j + 2) <= 57 && y[i].charAt(j + 2) >= 48)) {
                        System.out.println(y[i].charAt(1));
                        break;
                    } else {
                        count++;
                    }
                }

            } else if (y[i].length() == 2) {
                for (int j = 0; j < y[i].length() - 1; j++) {
                    if ((y[i].charAt(j) <= 57 && y[i].charAt(j) >= 49) &&
                            (y[i].charAt(j + 1) <= 57 && y[i].charAt(j + 1) >= 48)) {
                        break;
                    } else {
                        count++;
                    }
                }
            } else if (y[i].length() == 1) {
                for (int j = 0; j < y[i].length(); j++) {
                    if ((y[i].charAt(j) <= 57 && y[i].charAt(j) >= 48)) {

                        break;
                    } else {
                        count++;
                    }

                }

            } else {
                count++;
                break;

            }
        }
        if (count == 0 && dotCount == 3) {
            t = true;

        } else {
            t = false;
        }
        System.out.println(t);
    }
}


