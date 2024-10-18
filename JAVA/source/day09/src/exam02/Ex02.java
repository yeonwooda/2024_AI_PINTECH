package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String str = "ABC";
        // 주소 봐볼게
        System.out.println(System.identityHashCode(str)); // 1324119927

        // 결합 해볼게
        str += "DEF";
        System.out.println(System.identityHashCode(str)); // 1747585824
        // 왜 주소가 다르냐?
        // 문자열을 결합할 때 마다 새로운 객체 생성!!

        // final있자나 한번 설정되면 못 바꿔
        //  식구가 늘어서 방이 필요해
        // 자기 방 원한다 같이 쓰기 싫다!
        // 집이 3칸인데 집은 고정되어잇어 증축 못늘려 안돼
        // 합리적인건 이사가~~
        // 그러니까
        // 문자열이 불변하기 때문에 문자열을 결합햇을때 마다 이렇게 나오는겨
        // 공간이 고정이니까 그 전꺼 못써 새로 만들자~ ABC
        // 문자열 결합해 그럼 또 공간 만들어~ ABCDEF 그 전 주소 연결 끊어버려~
        // 참조가 끊겻어!!! GC가 수거해서 제거까지 깔끔하게~
        // 문자를 결합할때마다 너무 투머치로 일을 해야해 => 동적으로 만이 추가하면 자원 낭비 ㄹㅈㄷ
        // 문자열 불변 특징 때문에


        str += "GHI";
        System.out.println(System.identityHashCode(str)); // 1023892928


        // 결합하면 하나로 나온다
        System.out.println(str); // ABCDEFGHI 이렇게

    }
}
