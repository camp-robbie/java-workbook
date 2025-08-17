package main.java.workbook3.abstractinterface;

import java.util.Scanner;
//추상클래스 Shape
abstract class Shape {
    //추상 메서드 perimeter : 모든 Shape는 perimeter() 메서드를 구현해야 함
    abstract double perimeter();
}
//추상클래스 Shape를 상속받은 Rectangle 클래스
class Rectangle extends Shape {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double perimeter() {
        // TODO: 둘레 계산
        return 2*(w+h);
    }
}
//추상클래스 Shape를 상속받은 Triangle 클래스
class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        // TODO: 둘레 계산
        return a+b+c;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직사각형 입력 : 'rect' | 삼각형 입력 : 'triangle'");
        String type1 = sc.next();
        Shape s;
        if (type1.equals("rect")) {
            System.out.println("직사각형 가로 길이");
            double w = sc.nextDouble();
            System.out.println("직사각형 높이");
            double h = sc.nextDouble();
            //Shape 타입 변수 s가 Rectangle 객체를 가리킴
            s = new Rectangle(w, h);

        } else {
            System.out.println("삼각현 한 변의 길이(1)");
            double a = sc.nextDouble();
            System.out.println("삼각현 한 변의 길이(2)");
            double b = sc.nextDouble();
            System.out.println("삼각현 한 변의 길이(3)");
            double c = sc.nextDouble();
            //Shape 타입 변수 s가 Triangle 객체를 가리킴
            s = new Triangle(a, b, c);
        }
        //s의 perimeter() 메서드 호출
        System.out.println(s.perimeter());

        sc.close();
    }
}
