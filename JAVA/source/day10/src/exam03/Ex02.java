package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Grape()); // 사과만 담으려고 만든 박스인데 포도도 담겻다!
        // 자료가 오브젝트이기 때문에 수용가능

        // Apple apple = (Apple) appleBox.getItem();  타입 안정성이 떨어진다
       Object _apple = appleBox.getItem();
       if (_apple instanceof Apple) {
           Apple apple = (Apple) _apple;
       }
    }
}
