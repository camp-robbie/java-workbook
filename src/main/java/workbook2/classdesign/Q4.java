package main.java.workbook2.classdesign;

import java.util.Scanner;

// 좌표와 좌표 사이의 거리를 계산하는 메서드를 가지는 클래스 Point 입니다.
class Point {

    //필드
    private final double x;
    private final double y;

    // getter 입니다.
    // x getter
    public double getX(){
        return x;
    }
    // y getter
    public double getY(){
        return y;
    }

    // 생성자
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 두 점 사이의 거리를 계산하는 메서드를 생성합니다.
    // Point 객체를 파라미터로 받습니다.
    public double distance(Point p) {
        return Math.sqrt(Math.pow((p.getX()-this.x), 2) + Math.pow((p.getY() - this.y),2));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // 객체 생성
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        // 메서드 호출 및 출력
        System.out.println(p1.distance(p2));
    }
}