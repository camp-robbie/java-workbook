package main.java.workbook2.classdesign;

import java.util.Scanner;

class Point {
    double x;
    double y;

    // TODO: 생성자 및 distanceTo 메서드 작성
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
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
        System.out.println(p1.distanceTo(p2));
        sc.close();
    }
}