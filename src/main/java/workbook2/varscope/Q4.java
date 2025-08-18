package main.java.workbook2.varscope;

public class Q4 {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }
    Q4() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Q4 d = new Q4();
    }
}

class Demo {                                    // Demo 클래스 생성
    static int s;                               // 클래스 변수
    int x;                                      // 인스턴스 변수

    static {                                    // static 초기화 블록
        s = 100;                                // 클래스 변수 값 설정
        System.out.println("static block");     // static 초기화 블록 실행 시 출력
    }

    {                                           // 인스턴스 초기화 블록
        x = 200;                                // 인스턴스 변수 값 설정
        System.out.println("instance block");   // 인스턴스 초기화 블록 실행 시 출력
    }

    Demo() {                                    // 생성자 정의
        System.out.println("constructor");      // Demo()생성자 호출 시 출력
    }

    public static void main(String[] args) {
        new Demo();
    }
}