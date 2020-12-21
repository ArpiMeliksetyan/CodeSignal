package Xndirner.Arcade;

public class Xndir58 {
    public static void main(String[] args) {
        String s = "010010000110010101101100011011000110111100100001";
        StringBuilder stringBuilder = new StringBuilder();

        int charCode;

        for (int i = 0; i < s.length(); i += 8) {
            charCode = Integer.parseInt(s.substring(i, i + 8), 2);

            String returnChar = String.valueOf((char)charCode);
            stringBuilder.append(returnChar);
        }
        System.out.println(stringBuilder.toString());



    }

}
