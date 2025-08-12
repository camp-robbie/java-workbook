package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Vector2D {

    // 필드
    private double x;
    private double y;

    // getter
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // 생성자
    Vector2D(double x, double y) {
        this.x = x; this.y = y;
    }

    // 클래스 메서드 distance
    // 두 백터 사이의 거리를 계산합니다.
    static double distance(Vector2D a, Vector2D b) {
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }

    // 백터를 더하는 메서드입니다.
    void add(Vector2D other) {
        this.x = this.x + other.getX();
        this.y = this.y + other.getY();
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Vector2D v1 = new Vector2D(x1, y1);
        Vector2D v2 = new Vector2D(x2, y2);

        // 클래스 메서드 distance를 호출합니다.
        // 객체명이 아닌 클래스 명으로 직접 호출한 것을 알 수 있습니다.
        double dist = Vector2D.distance(v1, v2);

        // 인스턴스 메서드 add를 호출합니다.
        v1.add(v2);

        // 출력 예시와 맞추기 위해 (int) 를 사용했습니다.
        System.out.println(dist+" "+(int)v1.getX()+" "+(int)v1.getY());
    }
}
