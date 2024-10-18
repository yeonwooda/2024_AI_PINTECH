package exam03;

public class Ex06 {
    public static void main(String[] args) {
        // byte 범위의 숫자 내에서는 동일 객체를 공유, 그 이상의 숫자인 경우는 새로운 객체 생성
        Integer num1 = Integer.valueOf(100000);
        Integer num2 = Integer.valueOf(100000);



        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));  // 1324119927
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));  // 1324119927
    }
}
