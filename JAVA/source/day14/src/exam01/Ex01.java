package exam01;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> itmes = new ArrayList<>();
        itmes.add("항목1");
        itmes.add("항목2");
        itmes.add("항목3");
        itmes.add("항목4");
        itmes.add("항목5");

        for (int i = itmes.size() - 1; i >= 0; i--) {
            itmes.remove(i);
            System.out.printf("꺼낸요소: %s%n", itmes);
        }



      /*  for (int i = 0; i < itmes.size(); i++) {
            itmes.remove(i);
        }
*/
    /*    for (int i = 0; i < itmes.size(); i++) {
            String item = itmes.get(i);
            System.out.println(item);
        }*/



    }
}
