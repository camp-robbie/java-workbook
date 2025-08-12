package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {

        showLocal();

        // System.out.println(msg);
        // 로컬 변수를 참조하여 출력하려고 하였으나, 컴파일 오류가 발생합니다.
        // java: cannot find symbol
        // 해당 이름의 객체가 없다. = 메서드 종료시점에 삭제된다.
        // 같은 클래스임에도 오류가 발생함 = 메서드 내부에서만 참조 가능함.
    }
}