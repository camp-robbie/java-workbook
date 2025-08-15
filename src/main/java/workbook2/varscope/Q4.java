package main.java.workbook2.varscope;

public class Q4 {

    /// static 블록
    // 클래스가 '로딩될 때' 1회 실행
    static {
        System.out.println("static block");
    }

    /// 인스턴스 초기화 블록
    // '객체가 생성될 때마다' 생성자보다 먼저 실행
    {
        System.out.println("instance block");
    }

    Q4() {
        /// 생성자: 인스턴스 블록 다음에 실행
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Q4 d = new Q4();
        // 출력 순서:
        // 1) static block              클래스 로딩 시 1회
        // 2) instance block            객체 생성 시
        // 3) constructor               객체 생성 시
    }
}