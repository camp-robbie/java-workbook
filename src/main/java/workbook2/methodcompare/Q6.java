package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Vector2D {                                      // 클래스 정의
    double x;                                         // 필드 선언 -> 좌표
    double y;

    Vector2D(double x, double y) {                    // 생성자 정의
        this.x = x;
        this.y = y;
    }

    static double distance(Vector2D a, Vector2D b) {  // 클래스 정적 메서드 정의 -> 두 벡터 사이 거리 반환
        // TODO: 두 벡터 사이 거리 반환
        double dx = a.x - b.x;                        // x 거리 차이를 dx에 저장
        double dy = a.y - b.y;                        // y 거리 차이를 dy에 저장
        return Math.hypot(dx, dy);                    // 거리 계산하여 반환
    }

    void add(Vector2D other) {                        // 인스턴스 메서드 정의 -> 현재 벡터에 other 더함
        // TODO: 현재 벡터에 other를 더함
        x += other.x;                                 // x값에 other 합산
        y += other.y;                                 // y값에 other 합산
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // Scanner 생성

        double x1 = sc.nextDouble();                  // 첫 번째 실수 1개 읽어 x1에 저장
        double y1 = sc.nextDouble();                  // 두 번째 실수 1개 읽어 y1에 저장
        double x2 = sc.nextDouble();                  // 세 번째 실수 1개 읽어 x2에 저장
        double y2 = sc.nextDouble();                  // 네 번째 실수 1개 읽어 y2에 저장

        Vector2D v1 = new Vector2D(x1, y1);           // 새로운 객체 Vector2D(x1, y1) 생성하여, 참조를 v1에 저장
        Vector2D v2 = new Vector2D(x2, y2);           // 새로운 객체 Vector2D(x2, y2) 생성하여, 참조를 v2에 저장

        double dist = Vector2D.distance(v1, v2);      // Vector2D 클래스의 distance(v1, v2) 메서드를 호출하여 반환값을 dist에 저장
        v1.add(v2);                                   // v1이 참조하는 add(v2) 메서드 호출
        // TODO: dist와 v1.x, v1.y 출력
        System.out.println(dist + " " + (int)v1.x + " " + (int)v1.y);   // v1.x , v1.y 는 정수 형태로 출력

        sc.close();                                   // 입력 닫기
    }
}
