package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // 문자열을 -> Enum 상수 객로 바꿔주는게 Enum.valueOf(Class<T> 역할
//
//        Transportation trans = Enum.valueOf(Transportation.class, "SUBWAWY");
//        System.out.println(trans);

    /*    Transportation trans = Transportation.valueOf("SUBWAY");
        System.out.println(trans);*/

        // Transportation에 정의된 상수 목록 확인 가능
        Transportation[] items = Transportation.values();
        System.out.println(Arrays.toString(items));

    }
}
