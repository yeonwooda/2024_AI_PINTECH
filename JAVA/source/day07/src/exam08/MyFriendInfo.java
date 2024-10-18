package exam08;

public class MyFriendInfo  {
    private String name; // 이름, 나이 정의
    private int age;


    public MyFriendInfo(String name, int age) {
        this.name = name;
        this.age = age; // 생성자 만들기, 입출력 간단한 예제는 get, set이 필요 없을 수도~
    }

    public void Finfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

}
