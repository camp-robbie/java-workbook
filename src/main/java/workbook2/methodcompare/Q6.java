package main.java.workbook2.methodcompare;

import java.util.Scanner;

// `Vector2D` 클래스를 설계하여 x, y 좌표를 필드로 갖고, 클래스 메서드 `distance`로 두 벡터 사이의 거리를 계산하며, 인스턴스 메서드 `add`로 두 벡터를 더하는 프로그램을 작성
// 거리 계산은 `Math.hypot`을 사용
class Vector2D {
    double x;           // x 좌표를 나타낼 인스턴스 변수 x
    double y;           // y 좌표를 나타낼 인스턴스 변수 y

    // 생성자
    Vector2D(double x, double y) {
        this.x = x;     // 매개변수 x를 인스턴스 변수 x에 대입함
        this.y = y;     // 매개변수 y를 인스턴스 변수 y에 대입함
    }

    // 클래스 메서드 distance
    static double distance(Vector2D a, Vector2D b) {
        // TODO: 두 벡터 사이 거리 반환
        return Math.hypot(b.x - a.x, b.y - a.y);
    }

    // 인스턴스 메서드 add
    void add(Vector2D other) {
        // TODO: 현재 벡터에 other를 더함
        x += other.x;                       // x = x + other.x;
        y += other.y;                       // y = y + other.y;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 스캐너 시작

        double x1 = sc.nextDouble();                    // 숫자를 입력받음 (첫번째 x 좌표)
        double y1 = sc.nextDouble();                    // 숫자를 입력받음 (첫번째 y 좌표)

        double x2 = sc.nextDouble();                    // 숫자를 입력받음 (두번째 x 좌표)
        double y2 = sc.nextDouble();                    // 숫자를 입력받음 (두번째 y 좌표)

        Vector2D v1 = new Vector2D(x1, y1);             // 입력받은 x1, y1을 바탕으로 Vector2D 타입 객체 v1 생성
        Vector2D v2 = new Vector2D(x2, y2);             // 입력받은 x2, y2을 바탕으로 Vector2D 타입 객체 v2 생성

        double dist = Vector2D.distance(v1, v2);        // Vector2D 클래스의 클래스 메서드 distance을 실행하여 결과를 double형 변수 dist에 저장함

        v1.add(v2);                                     // v2를 바탕으로 v1 객체의 인스턴스 메서드 add를 실행함

        // TODO: dist와 v1.x, v1.y 출력
        System.out.println(dist + " " + (int)v1.x + " " + (int)v1.y);   // 결과를 출력함 (같은 출력을 얻기 위해 int형으로 형변환)

        sc.close();                                     // 스캐너 닫기
    }
}
