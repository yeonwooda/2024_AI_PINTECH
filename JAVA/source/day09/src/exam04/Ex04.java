package exam04;

public class Ex04 {
    public static void main(String[] args) {
        String transportationStr = "BUS";

        Transportation transportation = Enum.valueOf(Transportation.class, transportationStr);
        System.out.println(transportation);
        System.out.println(transportation instanceof Transportation);
    }
}
