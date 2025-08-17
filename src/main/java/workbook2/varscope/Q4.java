package main.java.workbook2.varscope;

public class Q4 {
    static {
        System.out.println("static block"); // 최초 실행 1번만 출력
    }
    {
        System.out.println("instance block"); // 인스턴스 초기화 블록 출력
    }
    Q4() {
        System.out.println("constructor"); // 생성자 출력
    }

    public static void main(String[] args) {
        Q4 d = new Q4();
        // 차이를 비교하기 위해 하나 더 생성
        Q4 d2 = new Q4();
    }
}