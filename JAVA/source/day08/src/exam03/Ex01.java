package exam03;

// import java.lang.String; 이렇게 안 쓰고 
import java.lang.*; // 컴파일러가 자동 코드 추가 어차피 쓰게 될 패키지니까

public class Ex01 extends java.lang.Object /* 컴파일러가 자동 추가 */{
    public static void main(String[] args) {
        String str = "안녕하세요.";
    }
}
