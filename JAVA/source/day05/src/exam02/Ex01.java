package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
//        s1.year = 2024; // 통제 불가
//        s1.month = 2;
//        s1.day = 31; // 대입 하자 마자 값이 들어가기 때문에 (메모리할당) 통제할 수 있는 방법은 X

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showDate();

        int month = s1.getMonth();
        System.out.println(month);
    }
}
