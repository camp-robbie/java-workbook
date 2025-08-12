package main.java.workbook2.classdesign;

import java.util.Scanner;

class Point {
    double x;
    double y;
    // TODO: 생성자 및 distanceTo 메서드 작성
    // 생성자 (매개변수: double x, double y)
    public Point(double x, double y) {
        this.x = x;     // 매개변수 x 값을 Point 필드 x에 대입함
        this.y = y;     // 매개변수 y 값을 Point 필드 y에 대입함
    }

    // distanceTo 메서드 (매개변수: Point other)
    // 거리 공식: Math.sqrt((x2-x1)^2 + (y2-y1)^2)
    double distanceTo(Point other) {
        return Math.sqrt(((other.x - x) * (other.x - x)) + (other.y - y) * (other.y - y));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
         Point p1 = new Point(x1, y1); // TODO: 생성자 작성 후 주석 해제
         Point p2 = new Point(x2, y2); // TODO: 생성자 작성 후 주석 해제
        // TODO: p1.distanceTo(p2) 출력
        System.out.println(p1.distanceTo(p2));  // p1.distanceTo(p2) 출력함
    }
}