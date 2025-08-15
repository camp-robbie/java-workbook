package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    /*
    static인 addExclamation 메서드를 메모리에 올린다.
    입력 값인 String(불변) 문자열 s에 !를 추가한다.
     */
    public static void addExclamation(String s) {
        s = s + "!";
    }

    /*
    static인 addExclamation 메서드를 메모리에 올린다.
    입력 값인 StringBuilder(가변) 문자열 sb에 !를 추가한다.
     */
    public static void addExclamation(StringBuilder sb) {
        sb.append("!\n");
    }

    /*
    Scanner로 입력한 첫번째 입력 값은 String에 저장,
    두번째 입력 값은 StringBuilder에 저장,
    그 후 각 메서드를 호출 후 저장 한 변수들을 메서드로 전달
    출력 예시와 맞게 결과 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(sc.next());
            addExclamation(s); // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
            addExclamation(sb); // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제
            // TODO: s와 sb 출력
            System.out.print(s + " " + sb);
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}