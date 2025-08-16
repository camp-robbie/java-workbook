package main.java.workbook2.varcompare;

import java.util.Scanner;

// `Car` 클래스에 클래스 변수 `totalCars`와 인스턴스 변수 `name`을 선언하고, 객체를 생성할 때마다 `totalCars`를 증가시키는 프로그램을 작성
// 3개의 자동차 객체를 생성하고 각 객체의 이름과 총 자동차 수를 출력
class Car {
    static int totalCars = 0;       // 생성된 객체의  총 개수를 세는 클래스 변수 totalCars
    String name;                    // 생성된 각 객체의 이름

    // 생성자
    Car(String name) {
        this.name = name;           // 생성자 매개변수 name을 인스턴스 변수 name에 저장함
        // TODO: totalCars 증가
        ++totalCars;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();                  // 이름 입력받음
        String n2 = sc.next();                  // 이름 입력받음
        String n3 = sc.next();                  // 이름 입력받음

        Car c1 = new Car(n1);                   // Car 객체 c1 생성
        Car c2 = new Car(n2);                   // Car 객체 c2 생성
        Car c3 = new Car(n3);                   // Car 객체 c3 생성

        System.out.println(c1.name + " " + Car.totalCars);      // c1의 인스턴스 변수 name과 Car.totalCars 출력
        System.out.println(c2.name + " " + Car.totalCars);      // c2의 인스턴스 변수 name과 Car.totalCars 출력
        System.out.println(c3.name + " " + Car.totalCars);      // c3의 인스턴스 변수 name과 Car.totalCars 출력

        sc.close();         // 스캐너 닫기
    }
}
