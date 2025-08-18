package main.java.workbook2.returntype;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    // TODO: add 메서드 작성
    /*
    static 으로 add 메서드를 메모리에 올리고
    Scanner로 정수 입력 값을 두번 받아
    add 메서드 호출 후
    int 타입의 sum에 add의 return 값을 받아 출력한다.
     */
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // TODO: add 호출 후 결과 출력
            int sum = add(a, b);

            System.out.println(sum);
        } catch (InputMismatchException e){ // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해주세요!"); // 예외 처리
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}