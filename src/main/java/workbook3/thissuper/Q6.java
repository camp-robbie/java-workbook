package main.java.workbook3.thissuper;

import java.util.Scanner;

abstract class Building {
    int floors;

    Building(int floors) {
        this.floors = floors;
    }

    abstract void showInfo();
}

class House extends Building/* TODO: Building 상속 */ {
    House(int floors) {
        // TODO: super() 호출
        super(floors);
    }

    void showInfo() {
        // TODO: "층수, 주거" 출력
        System.out.println(super.floors + " 주거");
    }
}

class Office extends Building/* TODO: Building 상속 */ {
    Office(int floors) {
        // TODO: super() 호출
        super(floors);
    }

    void showInfo() {
        // TODO: "층수, 업무" 출력
        System.out.println(super.floors + " 업무");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        int f1 = sc.nextInt();
        String type2 = sc.next();
        int f2 = sc.nextInt();
        // TODO: 위 House 및 Office 클래스 구현 완료 후 아래 주석 해제

        Building b1 = type1.equals("house") ? new House(f1) : new Office(f1);
        Building b2 = type2.equals("house") ? new House(f2) : new Office(f2);
        b1.showInfo();
        b2.showInfo();
    }
}