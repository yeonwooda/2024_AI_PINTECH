package exam01;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        Function<String, String> function = s -> s; // 항등 함수, 매개변수로 투입된 값을 반환값으로 그대로 반환

        Function<String, String> function1 = Function.identity(); // s -> s 항등함수임 위아래 똑같혀

    }
}
