package main.java.workbook2.methodcompare;

import java.util.Scanner;

class MathUtil {
    static int square(int n) {
        // TODO: n의 제곱 반환
        return (int) Math.pow(n,2);        //Math.pow(double a, double b)는 double형이기 때문에 (int)로 형변환 해줘야함
    }
    int cube(int n) {
        // TODO: n의 세제곱 반환
        return (int) Math.pow(n,3);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = MathUtil.square(n);        //클래스(Static)메서드는 객체 생성이 필요없다.
        MathUtil util = new MathUtil();     //객체 생성
        int cu = util.cube(n);              //객체 생성을 통한 인스턴스 메서드 호출
        // TODO: sq와 cu 출력
        System.out.println("제곱 결과: "+sq+" | 세제곱 결과: " + cu);

        sc.close();
    }
}
