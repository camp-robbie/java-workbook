package main.java.workbook2.classdesign;

import java.util.Scanner;

/**
 * 평면 좌표의 점(Point)을 표현하는 클래스입니다.
 * - 필드: x, y
 * - 메서드: distanceTo(other) -> 두 점 사이의 거리
 *
 * 거리 공식:
 * sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
 */

class Point {
    double x;
    double y;
    // TODO: 생성자 및 distanceTo 메서드 작성

    /**
     * 생성자: x, y 좌표 초기화
     */

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 다른 점(other)까지의 거리를 반환합니다.
     */

    double distanceTo(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;

        // Math.sqrt와 Math.pow(…, 2)를 사용해 공식 그대로 구현
        return Math.sqrt(dx * dx + dy * dy);

        // 참고: 수치 안정성을 위해 Math.hypot(dx, dy)도 사용 가능
        // return Math.hypot(dx, dy);
    }
}

public class Q4 {       // Point (두 점 사이 거리)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

         Point p1 = new Point(x1, y1); // TODO: 생성자 작성 후 주석 해제
         Point p2 = new Point(x2, y2); // TODO: 생성자 작성 후 주석 해제
        // TODO: p1.distanceTo(p2) 출력

        System.out.println(p1.distanceTo(p2));

        sc.close();
    }
}