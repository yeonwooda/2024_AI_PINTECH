package exam07;

public class Outer {

    void method() {
        // 지역 내부 클래스
        class Inner {
            int add (int num1, int num2) {
                return num1 + num2;
            }
        }

        Inner inner = new Inner();
        int result =  inner.add(10,20); // add 한번 만 하고 끝 활용도 낮음
        System.out.println(result);
    }
}
