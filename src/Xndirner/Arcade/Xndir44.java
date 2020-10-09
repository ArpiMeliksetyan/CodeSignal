package Xndirner.Arcade;

public class Xndir44 {
    public static void main(String[] args) {
        String x = "a.meliqsetyan@asa@index.ru";
        Xndir44 xndir44 = new Xndir44();
        System.out.println(xndir44.findDomain(x));
    }
    String findDomain(String x){
        int count = 0;
        int index = 0;
        String y = "";

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '@') {
                index = i;
            }
        }
        for (int i = index + 1; i < x.length(); i++) {
            y+=x.charAt(i);
        }
       return y;
    }
}
