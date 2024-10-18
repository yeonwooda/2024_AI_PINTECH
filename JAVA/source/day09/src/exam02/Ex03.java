package exam02;

import java.sql.SQLOutput;

public class Ex03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb)); // 1324119927

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb)); // 1324119927

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb)); // 1324119927

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb)); // 1324119927 다 쌓았다 비워보자

        String str = sb.toString();//버퍼에서 문자열로 바꾸주자
        System.out.println(str); // ABCDEFGHI

        System.out.println(System.identityHashCode(str)); // 990368553

        String str2 = "ABCDEFGHI";
        System.out.println("str2 주소 : " + System.identityHashCode(str2));

        System.out.printf("str == str2:%s%n", str == str2); // false 이렇게 비교하지 말고 동등성으로 비교해라 이거는 지양 - 동일성한다 기억해라
        System.out.printf("str.equals(str2):%s%n", str.equals(str2)); // 이게 더 바람직하다 바람직해 - 동등성!
    }
}
