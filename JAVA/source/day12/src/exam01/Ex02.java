package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        Calculator calculator1 = (num1,  num2) -> num1 + num2;

    }
}
