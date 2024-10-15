package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(); // Tiger, Animal
        Bird bird = new Bird();    // Bird, Animal
        Animal human = new Human(); // Human, Animal  둘 중 아무거나 써도 ㄱㅊ 다형성이니까

        tiger.move();
        bird.move();
        human.move();

    }
}
