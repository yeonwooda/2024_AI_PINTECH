package exam01;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
        A ac = c;

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(ac));


        A a = new C();
        B b = new C();
    }
}
