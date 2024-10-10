package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 구구단
        for(int i = 2; i<= 9; i++) {
           // System.out.println("---" + i + "단 ---");
            System.out.printf("--- %d단 ---%n", i);

            for(int j = 1; j<=9; j++) {
                //System.out.println(i + "x" + j + "=" + i*j)
                // ;
                System.out.printf("%d x %d = %d%n", i,j, i*j);

            }

        }
        // System.out.print("가"); // 줄개행 x
        System.out.println("나"); // 줄개행 d
        System.out.print("나");
    }
}
