package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {            // showLocal() 메서드
        String msg = "inside";           // 지역변수 msg에 "inside" 값 저장
        System.out.println(msg);         // msg 출력
    }
    public static void main(String[] args) {
        showLocal();                                            // 메서드 호출은 가능
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
        /* System.out.println(msg);  -> 지역변수에 직접 접근 시도
           위 출력 실행 시, 컴파일 오류 발생!
           msg는 showLocal() 메서드에서만 사용가능한 지역변수 이므로,
           메서드 외부에서 호출 시 컴파일 오류 발생.
         */
    }
}