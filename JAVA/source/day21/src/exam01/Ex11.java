package exam01;

import javax.xml.crypto.Data;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeUTF("안녕하세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
