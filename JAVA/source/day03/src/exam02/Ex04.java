package exam02;

public class Ex04 {
    public static void main(String[] args) {
       // int[] nums = new int[] {10, 20, 30, 40}; // 선언과 동시에 초기화 하는 방법

        int[] nums = {10,20,30,40};

//        int[] nums;
//        nums = {10,20,30,40};
        System.out.printf("length=%d%n", nums.length); //배열의 공간의 갯수
        for (int i = 0; i <=6; i++){
            System.out.println(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            // 이거시 관례
            System.out.println(nums[i]);
        }

        for (int num : nums) {  // 향상된 for 문
            System.out.println(num);
        }


    }
}