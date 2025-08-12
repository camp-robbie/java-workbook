package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {
    double r;
    // TODO: 생성자 작성
    // 생성자
    public Circle(double radius) {
        this.r = radius;    // 매개변수 radius 값을 Circle 필드 r에 대입함
    }
    double getCircumference() {
        // TODO: 둘레 반환
        return r * r * Math.PI;    // 둘레를 반환함 (원주율: Math.PI)
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c = new Circle(radius); // TODO: 생성자 작성 후 주석 해제
        // TODO: c.getCircumference() 출력
        System.out.println(c.getCircumference());   // 결과 출력
    }
}
