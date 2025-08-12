package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
        // 지역 변수이기 때문에 외부에서 호출하면 컴파일 오류가 뜸
//        System.out.println(msg);
    }
}