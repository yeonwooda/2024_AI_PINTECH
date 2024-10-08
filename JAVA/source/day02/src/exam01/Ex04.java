package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1++;
        System.out.println(num2); //  11
        System.out.println(num1); // 11

        double num3 = 10.5;
        num3++;
        System.out.println(num3); // 11.5
    }
}
