package main.java.workbook3.abstractinterface;

import java.util.Scanner;
//Movable 인터페이스
interface Movable {
    //모든 Movable을 implements한 클래스는 move()메서드를 구현해야함
    void move();
}
//인터페이스 Movable를 implements한 Robot 클래스
class Robot implements Movable {
    public void move() {
        // TODO: "Robot moves" 출력
        System.out.println("Robot moves");
    }
}
//인터페이스 Movable를 implements한 Car 클래스
class Car implements Movable {
    public void move() {
        // TODO: "Car moves" 출력
        System.out.println("Car moves");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movable[] objs = new Movable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            objs[i] = t.equals("robot") ? new Robot() : new Car();
        }
        for (Movable m : objs) {
            m.move();
        }
        sc.close();
    }
}