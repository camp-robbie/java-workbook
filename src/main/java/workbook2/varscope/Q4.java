package main.java.workbook2.varscope;

public class Q4 {
    // 익명 메서드 (일회용)을 사용합니다.
    // 1. static
    // 컴파일 시점에 호출됩니다.
    static {
        System.out.println("static block");
    }
    // 2. instance method
    // 객체 생성 시 호출됩니다.
    {
        System.out.println("instance block");
    }
    // 3. 생성자
    // 객체를 생성(파라미터 없이)헀을 때 호출됩니다.
    Q4() {
        System.out.println("constructor");
    }

    // 실행 순서 : 1. static -> 2. instance -> 3. constructor
    // 1. static은 컴파일 시점에 생성됩니다. (공통 객체)
    // 2. instance method는 객체를 생성했을 때 같이 생성됩니다.
    // 3. constructor 는 생성된 객체에 생성과 동시에 초기화를 해주기 위해 사용됩니다.
    //    따라서, 객체 생성 후 초기화 시점에 실행됩니다.

    public static void main(String[] args) {
        Q4 d = new Q4();
    }
}