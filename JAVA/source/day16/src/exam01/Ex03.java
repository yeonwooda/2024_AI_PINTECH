package exam01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        Set<String> items = new TreeSet<>(Comparator.reverseOrder()); // 이게 더 쉬운 , 역순 정렬 (람다식 형태) => (s1, s2)-> s2.compareTo(s1) -> 이거는 그렇게 좋지 않은
        items.add("이름3");
        items.add("이름2");
        items.add("이름1");
        items.add("이름5");
        items.add("이름4");


        items.forEach(System.out::println);
    }
}
