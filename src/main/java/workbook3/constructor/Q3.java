package main.java.workbook3.constructor;

import java.util.Scanner;

class Car {
    String model;
    int price;
    Car() {
        // TODO 매개변수가 없는 생성자
        this.model = "Unknown";
        this.price = 0;
    }
    Car(String model, int price) {
        // TODO모델명과 가격을 매개변수로 받는 생성자
        this.model=model;
        this.price=price;
    }
    Car(int price) {
        // TODO가격만 받는 생성자(모델명은 “Unknown”으로)
        this.price=price;
        this.model="Unknown";
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        Car c1 = new Car();
        Car c2 = new Car(m, p1);
        Car c3 = new Car(p2);
        System.out.println(c1.model + " " + c1.price);
        System.out.println(c2.model + " " + c2.price);
        System.out.println(c3.model + " " + c3.price);
    }
}