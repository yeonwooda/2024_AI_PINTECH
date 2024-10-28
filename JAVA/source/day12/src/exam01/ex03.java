package exam01;

public class ex03 {
    public static void main(String[] args) {
/*        MyLambda myLambda = (s) -> System.out.println(s);

        MyLambda myLambda1 = s -> System.out.println(s); // 이렇게 작성 가능*/

        // 매개변수 없는 경우 소괄호 생략 불가!
        MyLambda myLambda = () -> System.out.println("출력");

    }
}
