package exam01;

public class Q1 {
    public static void main(String[] args) {
        for (int i = 1; i <=40; i++){
            int roomNo = i % 10; // 0~ 9 사이 반복
            System.out.printf("학생%d, 방번호 %d번%n", i, roomNo);
        }
    }
}
