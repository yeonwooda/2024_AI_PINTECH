public class exam06 {
    public static void main(String[] args) {
        int[] num =  {1,2,3,4,5,6,7,8,9,10};
        int evenCount = 0;
        for(int i = 0; i < num.length; i++) {
            if (num[i] % 2== 0) {
                evenCount++;
            }
        }
        System.out.printf("짝수 개수 : %d%n", evenCount);
     }
}
