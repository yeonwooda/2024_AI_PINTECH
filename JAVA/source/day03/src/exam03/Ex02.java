package exam03;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
//       int result = calc(3);// 함수호출 - 기능을 실행
//        System.out.println(result);
//    }
//
//    static int calc(int x) {
//        int y = x * 2 + 3;
//
//        return y;

        // 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요

        int user = 20;
        int[] arr = new int[user];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }


        System.out.println(Arrays.toString(arr));

//     for (int i = 0; i <=arr.length; i++) {
//           arr[i] = i + 1;
//           System.out.println(arr[i]);
//        }
        // 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

    }
}


