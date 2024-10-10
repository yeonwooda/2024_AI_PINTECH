package exam01;

public class Q3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++){
            
            if (i % 2 == 0){
                continue; // 짝수단일 때 건너띄기 -> 홀수단만 출력
                
            }

            System.out.printf("--- %d단 ---%n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d x %d = %d%n", i, j, i * j);
                }




//        for (int i = 2; i <= 9; i++){
//            if (i % 2 == 1) {
//                System.out.printf("--- %d단 ---%n", i);
//                for (int j = 1; j <= 9; j++) {
//                    System.out.printf("%d x %d = %d%n", i, j, i * j);
//
//                }
//            }
        }
    }
}
