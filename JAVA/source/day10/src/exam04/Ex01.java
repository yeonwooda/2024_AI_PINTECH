package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>(); // 타입을 Apple로 명시
        Box<Apple> appleBox1 = new Box<>();
        appleBox.setItem(new Apple());
//        appleBox.setItem(new Grape());  타입 안정성 확보
        
        appleBox.setItem(new Apple());
        Apple apple = appleBox.getItem(); //  형 변환 x

        Box<Grape> grapeBox = new Box<>();
    }
}
