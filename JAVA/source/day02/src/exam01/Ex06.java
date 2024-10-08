package exam01;

public class Ex06 {
    public static void main(String[] args) {
       boolean result1 = 10 > 5;
//        System.out.println(result1);

        int num1 = 5;
        boolean result2 = num1 >= 10;
        boolean result3 = num1 < 100;
        boolean result4 = result2 && result3;

        boolean result5 = num1 >= 10 && num1 < 100; // 메모리 할당이 적음 / 참 또는 거짓이 나와야 연산 가능

//        System.out.println(result2); // true
//        System.out.println(result3);
        System.out.println(result4);
    }
}
