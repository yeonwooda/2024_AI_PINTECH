package exam01;

public enum Transportation {
    SUBAWY("지하철") {
        @Override
        public int getTotal(int person) {
            return 1500 * person;
        }
    },
    BUS("버스")  {
        @Override
        public int getTotal(int person) {
            return 14000 * person;
        }
    },

    TAXI("택시") {
        @Override
        public int getTotal(int person) {
            return 4500 * person;
        }
    }; // 정적 상수 객체들


    private final String title;

    Transportation(String title) { // private
        this.title = title;
    }


    public String getTitle(){
        return title;
    }

    public abstract int getTotal(int person); // 추상클래스 추상 메서드가 정의 가능한
}
