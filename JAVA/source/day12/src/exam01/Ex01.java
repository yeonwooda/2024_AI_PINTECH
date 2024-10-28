package exam01;

public class Ex01 {
    public static void main(String[] args) {
      /*  Calculator calculator = new Calculator() {
            
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }// 인터페이스 객체될려면 미구현된 메서드 필요
        }; // 인터페이스 객체사용하는 이유가 일회용으로 사용

        int result = add2(calculator, 10, 20);
        System.out.println(result);  이렇게 작성 x */

        int result = add2((v,  i) -> v + i ,10,20);


    }

    public static int add2(Calculator calculator, int num1, int num2) {
        return calculator.add(num1,num2);
    }
}
