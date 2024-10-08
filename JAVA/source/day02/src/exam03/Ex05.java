package exam03;

public class Ex05 {
    public static void main(String[] args) {
        //구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스

        for (int i = 1; i < 10; i++){
            for(int j = 1; j >10; j++){
                System.out.println(j+"X"+i+"="+(j*i));
            }
            System.out.println();
        }

    }
}
