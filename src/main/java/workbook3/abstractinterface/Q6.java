package main.java.workbook3.abstractinterface;

import java.util.Scanner;
//Drawable 인터페이스
interface Drawable {
    //Drawable을 구현(implements)한 클래스는 반드시 draw 메서드를 구현해야함
    void draw();
}
//Rotatable 인터페이스
interface Rotatable {
    //모든 Rotatable을 implements한 클래스는 반드시 rotate 메서드를 구현해야함
    void rotate();
}
//Drawable 과 Rotatable 둘 다 implements한 Square 클래스
class Square implements Drawable, Rotatable {
    public void draw() {
        // TODO: "Square drawn" 출력
        System.out.println("Square drawn");
    }

    public void rotate() {
        // TODO: "Square rotated" 출력
        System.out.println("Square rotated");
    }
}
//Drawable를 implements한 Circle 클래스
class Circle implements Drawable {
    public void draw() {
        // TODO: "Circle drawn" 출력
        System.out.println("Circle drawn");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형 : 'square' 입력 | 원 : 'circle' 입력");
        String t1 = sc.next();
        System.out.println("사각형 : 'square' 입력 | 원 : 'circle' 입력");
        String t2 = sc.next();
        //입력받은 값에 따라 Drawable 타입의 변수 d1,d2가 객체 Square 혹은 Circle을 가리킴
        Drawable d1 = t1.equals("square") ? new Square() : new Circle();
        Drawable d2 = t2.equals("square") ? new Square() : new Circle();
        //draw()메서드 호출
        d1.draw();
        //d1이 Rotatable을 구현한 객체면 true
        if (d1 instanceof Rotatable) { // d1이 Rotatable 인터페이스(또는 그 하위 타입)를 실제로 구현한 객체인지 확인
            // TODO: d1 객체를 활용하여 rotate() 메서드를 호출한다.
            //d1을 Rotatable로 다운캐스팅한 후 rotate()메서드 호출
            ((Rotatable) d1).rotate();
        }
        d2.draw();
        if (d2 instanceof Rotatable) { // d2이 Rotatable 인터페이스(또는 그 하위 타입)를 실제로 구현한 객체인지 확인
            // TODO: d2 객체를 활용하여 rotate() 메서드를 호출한다.
            //d2를 Rotatable로 다운캐스팅한 후 rotate()메서드 호출
            ((Rotatable) d2).rotate();
        }
        sc.close();
    }
}
