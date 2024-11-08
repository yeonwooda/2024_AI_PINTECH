package exam01;

import java.io.*;
import java.nio.Buffer;

public class Ex10 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("hell03.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            // 문자열을 한줄씩 읽기
            String line;
            while ((line = br.readLine())  != null) {
                System.out.println(line);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
