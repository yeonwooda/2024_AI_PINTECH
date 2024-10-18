package exam03;

public interface Buyer {
    int NUM = 10; // publice static final 정적 상수

    void buy();
    default void order() { // JDK 7
        System.out.println("Buyer - 주문!");
    }
    
    private void privateMethod() { // JDK 9
        System.out.println("private 메서드");
    }
    
    static void staticMethod() {
        System.out.println("정적 메서드");
    }
}
