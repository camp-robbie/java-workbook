package main.java.workbook2.classdesign;

import java.util.Scanner;

class Point {
    double x;
    double y;

    // TODO: 생성자 및 distanceTo 메서드 작성
    // 생성자 정의 //
    Point(double x, double y) {   // Point 생성자 정의
        this.x = x;               // 필드 초기화
        this.y = y;
    }

    // 두 점 거리 구하는 메서드 정의 //
    void distanceTo(Point p) {
        System.out.println(Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y)));
      // = System.out.println(Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)));
      // = System.out.println(Math.hypot(this.x - p.x, this.y - p.y));
    }
}

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Scanner 생성

        double x1 = sc.nextDouble();           // 공백으로 구분된 다음 실수 하나 읽어 x1에 저장
        double y1 = sc.nextDouble();           // 다음 실수 하나를 y1에 저장
        double x2 = sc.nextDouble();           // 다음 실수 하나를 x2에 저장
        double y2 = sc.nextDouble();           // 다음 실수 하나를 y2에 저장

        Point p1 = new Point(x1, y1);          // 새로운 객체 Point(x1, y1) 생성 후, 참조를 p1(타입: Point)에 저장
        Point p2 = new Point(x2, y2);          // 새로운 객체 Point(x2, y2) 생성 후, 참조를 p2(타입: Point)에 저장

        // TODO: p1.distanceTo(p2) 출력
        p1.distanceTo(p2);                     // p1 기준으로 distanceTo(p2) 메서드 호출하여 거리 출력
    }
}

/*  Math.pow(a, b)
      - a를 b제곱

    Math.sqrt(a)
      - a의 제곱근

    Math.hypot(x, y)
      - Math.sqrt((x2-x1)^2 + (y2-y1)^2) 수치적으로 안전하게 계산하는 메서드
 */