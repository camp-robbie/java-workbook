package main.java.workbook2.methodcompare;

import java.util.Scanner;

class MathUtil {                  // 클래스 정의

    static int square(int n) {    // 정적 메서드 정의 -> 인스턴스 없이 MathUtil.square(n)로 호출 => 인스턴스 필드/메서드 직접접근 불가
        // TODO: n의 제곱 반환
        return (n * n);           // n 제곱 반환
    }
    int cube(int n) {             // 인스턴스 메서드 정의
        // TODO: n의 세제곱 반환
        return (n * n * n);       // n 세제곱 반환
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 생성

        int n = sc.nextInt();                   // 첫 번째 정수 1개 읽어 n에 저장
        int sq = MathUtil.square(n);            // MathUtil 클래스의 square(n) 메서드 호출하여 반환값을 sq에 저장
        MathUtil util = new MathUtil();         // 새로운 객체 MathUtil() 생성하여, 참조를 util 에 저장
        int cu = util.cube(n);                  // util이 참조하는 cube(n) 메서드 호출하여, 반환값을 cu에 저장

        // TODO: sq와 cu 출력
        System.out.println(sq + " " + cu);      // sq와 cu 출력 (공백으로 구분)

        sc.close();                             // 입력 닫기
    }
}
