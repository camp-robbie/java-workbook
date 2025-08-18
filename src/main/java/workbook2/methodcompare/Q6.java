package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Vector2D {
    double x;
    double y;
    Vector2D(double x, double y) { this.x = x; this.y = y; }
    static double distance(Vector2D a, Vector2D b) {
        // TODO: 두 벡터 사이 거리 반환
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
    void add(Vector2D other) {
        // TODO: 현재 벡터에 other를 더함
        this.x += other.x;
        this.y += other.y;
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
        double dist = Vector2D.distance(v1, v2);
        v1.add(v2);
        // TODO: dist와 v1.x, v1.y 출력
        System.out.println(dist + " " + v1.x + " " + v1.y);
    }
}
