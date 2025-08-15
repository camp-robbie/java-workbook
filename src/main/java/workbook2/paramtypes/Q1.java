package main.java.workbook2.paramtypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    /*
    static을 사용하여 메서드를 메모리에 올린다.
    x에 10을 더하면서 저장한다.
    x를 return한다.
     */
    public static int primitiveParam(int x) {
        x += 10;
        return x;
    }

    /*
    Scanner로 x 입력 값을 받는다.
    입력 받은 x의 값을 static으로 올렸던 메서드를 호출하여 입력 값으로 넣는다.
    그 값을 result에 저장한다.
    결과값을 result를 return한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int result = primitiveParam(x); // TODO: primitiveParam 메서드 작성 후 주석 해제
            // TODO: 원래 x와 메서드 반환 값 출력
            System.out.print("(x의 값:" + x + ") ");
            System.out.println("(메서드 반환 값:" + result + ")");
        } catch (InputMismatchException e) { // 숫자 이외의 입력을 받을 시
            System.out.println("숫자만을 입력해주세요."); // 예외 처리
        } finally {
            sc.close(); // 자원 누수 방지
        }
    }
}