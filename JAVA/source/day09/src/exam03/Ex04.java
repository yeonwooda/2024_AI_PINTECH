package exam03;

import java.sql.SQLOutput;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = 100; // 오토박싱
        Integer num2 = 200; // 오토박싱

        Integer num3 = num1 + num2; // num1.intValue() + num2.intValue() - 언박싱
        // integer num3은 이다 오토박싱이다 감싸고 잇잖아 

        System.out.println(num3);

    }
}
