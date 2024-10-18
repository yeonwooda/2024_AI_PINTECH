package exam01;

public class SimpleCalculator extends Calculator{ // Calculator 상속 받은


    public SimpleCalculator() {
        super(); // 상위클래스의 생성자 메서드를 의미 -> 기본생성자(cALCULATOR)

    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;  // 인스턴스 메서드
    } // implement 메소드 -> 추상 메서드 기본 틀, 재정의 된. => 추성메서드가 재정의 된. 추성메서드이긴하지만 인스턴스 메서드도 돼.
    // 인스턴스 메서드만 재정의 가능.



}
