package main.java.workbook2.varscope;

public class Demo {

    // 클래스 변수
    static int staticVar;
    // 인스턴스 변수
    int instanceVar;

    // static 초기화 블록 (클래스 로딩 시 1번만 실행)
    static {
        staticVar = 10;
        System.out.println("1. Static 초기화 블록 실행: staticVar = " + staticVar);
    }

    // 인스턴스 초기화 블록 (객체 생성 시마다 실행)
    {
        instanceVar = 20;
        System.out.println("2. 인스턴스 초기화 블록 실행: instanceVar = " + instanceVar);
    }

    // 생성자 (인스턴스 초기화 블록 다음 실행)
    public Demo() {
        System.out.println("3. 생성자 실행");
    }

    public static void main(String[] args) {
        System.out.println("Main 시작");

        Demo d1 = new Demo(); // 첫 번째 객체 생성
        System.out.println("---");
        Demo d2 = new Demo(); // 두 번째 객체 생성
    }
}