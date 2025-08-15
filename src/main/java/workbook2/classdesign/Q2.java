package main.java.workbook2.classdesign;

import java.util.Scanner;

/**
 * 원(Circle)을 표현하는 클래스입니다.
 * - 필드: 반지름 r
 * - 메서드: getCircumference() -> 2 * PI * r
 */

class Circle {
    double r;
    // TODO: 생성자 작성

    Circle(double r) {
        this.r = r;
    }

    /**
     * 원의 둘레 = 2 * Math.PI * r
     */

    double getCircumference() {
        // TODO: 둘레 반환
        return 2 * Math.PI * r;
    }
}

public class Q2 {       // Circle (원의 둘레)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        Circle c = new Circle(radius); // TODO: 생성자 작성 후 주석 해제
        // TODO: c.getCircumference() 출력

        // 문제 예시와 동일한 소수 표현을 위해 그대로 출력
        System.out.println(c.getCircumference());

        sc.close();
    }
}
