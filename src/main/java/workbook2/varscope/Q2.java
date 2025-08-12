package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
        // System.out.println(msg); msg를 읽어들일 수 없음 > 변수 msg는 매서드 안에서만 작동하기 때문에!

    }
}