package exam08;

public class MyFriendDetailInfo extends MyFriendInfo {
    private String address;
    private String phone;

    public MyFriendDetailInfo(String name, int age, String address, String phone) {
        super(name, age);
        this.address = address;
        this.phone = phone;
    }

    public void Dinfo() {
        Finfo(); // MyFriendInfo 의 이름 나이 가져오기
        System.out.println("주소 : " + address);
        System.out.println("전화: " + phone);
    }

    public static void main(String[] args) {
        MyFriendDetailInfo myFriendInfo = new MyFriendDetailInfo("오연우", 24, "부평", "010-1234-1234");
        myFriendInfo.Dinfo(); // 이름 나이 뿐 아니라 주소 전화번호까지도!
    }
}
