package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            int ch = fis.read(); // 1바이트 읽기
            System.out.println((char)ch); // (char)가 안 적혀있으면 숫자로 나오고 붙으면 1바이트 읽어서 A로 나오는듯

            ch = fis.read();
            System.out.println((char) ch);

            ch = fis.read();
            System.out.println((char) ch);

            ch = fis.read();
            System.out.println((char) ch);

            ch = fis.read(); // 다 읽은 상태에서 다시 읽기. -1
            System.out.println(ch);





        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
