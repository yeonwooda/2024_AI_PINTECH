package exam04;

public class Ex07 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");  // 두 개 다 동등혀~
        String s3 = "ABC";

        System.out.printf("s1 주소:%d, hascode():%d%n", System.identityHashCode(s1), s1.hashCode());
        System.out.printf("s2 주소:%d, hascode():%d%n", System.identityHashCode(s2), s1.hashCode());
        System.out.printf("s3 주소:%d, hascode():%d%n", System.identityHashCode(s3), s1.hashCode());

    }
}
