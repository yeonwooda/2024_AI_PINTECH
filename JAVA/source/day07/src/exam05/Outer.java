package exam05;

public class Outer {

    int num1 = 10;
    class Inner { // 인스턴스 내부 클래스


        static  int num; //JDK 16부터 가능 15이전은 불가
        int num1 = 20;

        void method() {
            System.out.println(num1);  // inner - num1
            System.out.println(Outer.this.num1); //outer - num1
        }
    }
}
