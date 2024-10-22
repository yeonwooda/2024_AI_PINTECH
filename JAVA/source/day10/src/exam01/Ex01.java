package exam01;

import static exam01.Transportation.*; // Transportation 에 정의돈 정적 자원 import

public class Ex01 {
    public static void main(String[] args) {
        System.out.printf("SUBWAY.name():%s, SUBWAY.ordinal():%d%n", SUBAWY.name(), // subawy앞에 tr클래스명 안 붙여도 됌 임포트해서
           SUBAWY.ordinal());

        System.out.printf("SUBWAY.name():%s, SUBWAY.ordinal():%d%n", BUS.name(),
                BUS.ordinal());

        System.out.printf("SUBWAY.name():%s, SUBWAY.ordinal():%d%n", TAXI.name(),
                TAXI.ordinal()); // ORDINAL -> 위치 번호, 변동 가능, 직접 외부 X 내부에서 작성~
    }
}
