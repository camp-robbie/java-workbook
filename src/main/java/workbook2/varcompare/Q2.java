package main.java.workbook2.varcompare;

import java.util.Scanner;

class Car {
    // 필드
    static int totalCars = 0;
    private final String name;

    // getter
    public String getName(){
        return name;
    }

    // 생성자
    Car(String name) {
        this.name = name;
        Car.totalCars++;
    }
}

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 차 이름 입력
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        // 객체 생성
        Car c1 = new Car(n1);
        Car c2 = new Car(n2);
        Car c3 = new Car(n3);

        // 출력
        System.out.println(c1.getName() + " " + Car.totalCars);
        System.out.println(c2.getName() + " " + Car.totalCars);
        System.out.println(c3.getName() + " " + Car.totalCars);
    }
}
