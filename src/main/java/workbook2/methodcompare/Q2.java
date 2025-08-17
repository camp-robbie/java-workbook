package main.java.workbook2.methodcompare;

import java.util.Scanner;

// `MathUtil` 클래스에 클래스 메서드 `square`와 인스턴스 메서드 `cube`를 정의하고, 정수 n에 대해 제곱과 세제곱을 각각 출력하는 프로그램을 작성
class MathUtil {
    // 클래스 메서드 square
    static int square(int n) {
        // TODO: n의 제곱 반환
        return n * n;
    }

    // 인스턴스 메서드 cube
    int cube(int n) {
        // TODO: n의 세제곱 반환
        return n * n * n;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        int n = sc.nextInt();                   // 숫자를 입력받음

        int sq = MathUtil.square(n);            // MathUtil 클래스의 클래스 메서드 square를 호출함

        MathUtil util = new MathUtil();         // MathUtil 타입의 util 객체를 생성함 (생성자를 생성하지 않았을 경우, 기본 생성자는 자동으로 만들어짐)
        int cu = util.cube(n);                  // util 객체의 인스턴스 메서드 cube를 호출하여 결과를 int형 변수 cu에 저장함
        // TODO: sq와 cu 출력
        System.out.println(sq + " " + cu);      // sq와 cu 결과를 출력함

        sc.close();                             // 스캐너 닫기
    }
}
