package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }
    // 원의 둘레 = 지름*PI
    // 입력된 값 = 반지름
    // 2를 곱해주어야 함.
    double getCircumference() {
        return r*2*Math.PI;
    }
}

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        // 객체 생성
        Circle c = new Circle(radius);

        // 출력
        System.out.println(c.getCircumference());
    }
}
