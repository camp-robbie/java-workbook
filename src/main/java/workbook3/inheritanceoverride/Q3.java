package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }           //부모클래스 메서드
}

class Car extends Vehicle {
    void move() {
        // TODO: "Car is moving" 출력
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    void move() {
        // TODO: "Bike is moving" 출력
        System.out.println("Bike is moving");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            vehicles[i] = type.equals("car") ? new Car() : new Bike();      //입력값 "car"이면 Car객체 생성, 아니면 Bike객체 생성
        }
        for (Vehicle v : vehicles) {                                        //배열 vehicles 값 출력
            v.move();
        }
    }
}