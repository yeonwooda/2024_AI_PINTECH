package exam01;

import java.util.function.IntPredicate;

public class Ex02 {
    public static void main(String[] args) {
        IntPredicate cond1 = x -> x >= 10;
        IntPredicate cond2 = x -> x <= 100;
        IntPredicate cond3 = cond1.and(cond2); // x >= 10 && x <= 100
        System.out.println(cond3.test(150)); // false
        System.out.println(cond3.test(50)); // true


        IntPredicate cond4 = cond3.negate(); // x < 10 || x > 100,  부정
        System.out.println(cond4.test(150)); // true
    }
}
