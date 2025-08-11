package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {
    double r;

    // TODO: 생성자 작성
    public Circle(double r) {
        this.r = r;
    }

    double getCircumference() {
        // TODO: 둘레 반환
        return r*2*Math.PI;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        // TODO: c.getCircumference() 출력
        System.out.println(c.getCircumference());
    }
}
