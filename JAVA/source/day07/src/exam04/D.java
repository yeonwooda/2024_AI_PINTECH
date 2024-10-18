package exam04;

public class D implements C{ // a,b인터페이스 상속 받은 / 미구현된 메소드가 있기 때문에 처음에 빨간 줄 뜨고 ctrl + i 로 구현


    @Override
    public void common() {
        System.out.println("Common 호출");
    } // a,b 인터페이스 추상 메서드 구현

    @Override
    public void methodC() {

    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}
