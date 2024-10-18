package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 문자는 객체  / 문자열 상수
        String str2 = "ABC"; // 자원은 힙에 있어~ / 문자열 상수

        System.out.printf("str1.equals(str2):%s%n", str1.equals(str2));// 동등성 비교, 값에대한 비교 ture  abc가 abc인거 비교
        System.out.printf("str1 == str2:%s%n", str1 == str2); // 동일성 비교 true => 주소가 같냐는 비교 "" 묶어서 비교 햇을 때는 주소가 같다

        System.out.printf("str1 주소 : %d%n", System.identityHashCode(str1));
        System.out.printf("str2 주소 : %d%n", System.identityHashCode(str2));



    }
}
