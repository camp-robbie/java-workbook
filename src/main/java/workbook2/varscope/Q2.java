package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
        // System.out.println(msg);
        // 같은 클래스에 있더라도 메서드가 다르다면 사용하지 못한다...
        // 컴파일 오류 발생
        // java: cannot find symbol
    }
}