package exam03;

public class Ex02 {
    public static void main(String[] args) {
       int result = calc(3);// 함수호출 - 기능을 실행
        System.out.println(result);
    }

    static int calc(int x) {
        int y = x * 2 + 3;

        return y;
    }
}


