package main.java.workbook2.varcompare;

import java.util.Scanner;

class Car {
    static int totalCars = 0;     // 공유되는 클래스 변수 선언 -> 한번만 0으로 설정(초기화)
    String name;                  // 인스턴스 변수 선언

    Car(String name) {            // 생성자 정의
        this.name = name;         // 필드 초기화
        // TODO: totalCars 증가
        totalCars++;              // totalCars +1 증가
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // Scanner 생성

        String n1 = sc.next();                               // 첫 번째 문자열 1개 읽어 n1에 저장
        String n2 = sc.next();                               // 다음 문자열 1개 읽어 n2에 저장
        String n3 = sc.next();                               // 다음 문자열 1개 읽어 n3에 저장

        Car c1 = new Car(n1);                                // 새로운 객체 Car(n1) 생성하여, 참조를 c1에 저장
        Car c2 = new Car(n2);                                // 새로운 객체 Car(n2) 생성하여, 참조를 c2에 저장
        Car c3 = new Car(n3);                                // 새로운 객체 Car(n3) 생성하여, 참조를 c3에 저장

        System.out.println(c1.name + " " + Car.totalCars);   // [c1이 참조하는 이름 + 공백 + Car클래스의 totalCars] 출력
        System.out.println(c2.name + " " + Car.totalCars);   // [c2이 참조하는 이름 + 공백 + Car클래스의 totalCars] 출력
        System.out.println(c3.name + " " + Car.totalCars);   // [c3이 참조하는 이름 + 공백 + Car클래스의 totalCars] 출력

        sc.close();                                          // 입력 닫기
    }
}
