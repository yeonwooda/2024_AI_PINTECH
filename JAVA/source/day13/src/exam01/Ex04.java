package exam01;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Ex04 {
    public static void main(String[] args) {

        ToIntFunction<String> toIntFunction = s -> s.length();  // 너무 길어 한번 쓰고 버릴건데

        ToIntFunction<String> toIntFunction1 = String::length; // 이렇게 간략하게 써라잉 이게 메소드 참조다잉


    }
}
