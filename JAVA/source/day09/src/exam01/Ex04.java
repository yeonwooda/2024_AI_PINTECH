package exam01;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException{ //throw 의미 x 편의상

        // 실행 과정 중 로드 (동적) 데이터 영역으로 올리는 forName
        Class cls = Class.forName("exam01.Person");
        System.out.println(cls); // 동적 로딩
    }
}
