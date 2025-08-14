package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
        System.out.println(msg); // 컴파일 오류: msg는 main에서 접근 불가
    }
}