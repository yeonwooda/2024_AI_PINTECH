package exam02;

//@MyAnno(value = "여기는 클래스!")
//@MyAnno({"여기는 클래스", "여기는 Student 클래스!"}) // 이렇게도 정의가능
@MyAnno(value = {"여기는 클래스", "여기는 Student 클래스!"}, min=10, max=100)

public class Student  {

    //@MyAnno(value = "여기는 메서드!")
 @MyAnno("여기는 메서드") // 이렇게도 정의가능
//    @MyAnno(value = "여기는 메서드", min=10, max=100)
    public void study() {

    }
}
