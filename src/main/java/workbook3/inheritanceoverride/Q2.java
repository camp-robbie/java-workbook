package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Shape {
    // 추상 메서드 → 자식 클래스에서 반드시 구현해야 함
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        // TODO: "Draw Circle" 출력
        System.out.println("Draw Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        // TODO: "Draw Rectangle" 출력
        System.out.println("Draw Rectangle");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] arr = new Shape[3];                 //Shape 타입 배열 생성 (크기 = 3, 아직 객체는 없음)
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                arr[i] = new Circle();              //사용자 입력값이 "circle"이면 Circle객체 생성
            } else {
                arr[i] = new Rectangle();           //아니면 Rectangle 객체 생성
            }
        }
        // 다형성(polymorphism): Shape 타입으로 받아도 실제 객체의 draw() 실행됨
        for (Shape s : arr) {                       //배열의 각 값 출력
            s.draw();                                // Circle이면 "Draw Circle", Rectangle이면 "Draw Rectangle"
        }
        sc.close();
    }
}