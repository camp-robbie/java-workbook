package main.java.workbook2.classdesign;

import java.util.InputMismatchException;
import java.util.Scanner;

class Point {
    double x;
    double y;

    // TODO: 생성자 및 distanceTo 메서드 작성
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 거리 공식 Math.sqrt((x2-x1)^2 + (y2-y1)^2)
    public double distanceTo(Point p1, Point p2) {
        return Math.sqrt(
                ((p2.x - p1.x) * (p2.x - p1.x))
                        + ((p2.y - p1.y) * (p2.y - p1.y))
        );
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            Point p1 = new Point(x1, y1); // TODO: 생성자 작성 후 주석 해제
            Point p2 = new Point(x2, y2); // TODO: 생성자 작성 후 주석 해제

            // TODO: p1.distanceTo(p2) 출력
            System.out.println(p1.distanceTo(p1, p2));
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}