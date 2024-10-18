package exam04;

public class Ex03 {
    public static void main(String[] args) {
       // Transportation transportation = Transportation.SUBWAY; ordinal : 0
       Transportation transportation = Transportation.BUS; // ordinal : 1
        String transportationStr = transportation.name(); // trans.toString()
        System.out.println(transportationStr);

        int ordinal = transportation.ordinal();
        System.out.printf("ordinal:%d%n", ordinal); // 상수가 정의된 순서 위치 번호

    }
}
