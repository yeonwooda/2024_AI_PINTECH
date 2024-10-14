package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000; // 지양
        s1.name = "김이름";
        s1.major = "수학";
        
        s1.showInfo(); 
        
        Student s2 = new Student();
        s2.id = 1001; // 지양ㅁ
        s2.name = "이이름";
        s2.major = "영어";
        s2.showInfo();
        s1.showInfo();
        
        s2.staticMethod(); // 지양한다 왜? 정적인지 인스턴스인지 헷갈려 클래스로 직접 접근을권장
    
    }
}
