package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        // 지역변수: 이 메서드 안에서만 유효
        String msg = "inside";
        System.out.println(msg);
    }

    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류

        // 지역변수는 메서드 내부에서만 접근 가능하므로, 메서드 외부에서 출력하려고 하면 주석 등으로 설명합니다.
        // System.out.println(msg);
        // 오류: msg는 showLocal 메서드의 지역변수라 여기서 보이지 않음
    }
}