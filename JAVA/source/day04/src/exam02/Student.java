package exam02;

public class Student {
    int id;
    String name;
    String major;



    /**
     * 따로 정의하지 않으면 기본 생성되는 생성자
     * 디폴트 생성자
     */
    public Student() {
        // 객체 생성 이후 실행
        // 객체의 변수의 값 초기화
        id = 1000;
        name = " 이이름";
        major = "영어";
    }

    public Student(int _id, String _name, String _major){
            id = _id;
            name = _name;
            major = _major;
    }


    void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);


    }


}
