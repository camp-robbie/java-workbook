package main.java.workbook3.abstractinterface;

import java.util.Scanner;
//추상 클래스 Employee
abstract class Employee {
    //추상 메서드
    abstract double calculateSalary();
}
//Employee를 상속받은 FullTimeEmployee 클래스
class FullTimeEmployee extends Employee {
    double base, bonus;

    FullTimeEmployee(double base, double bonus) {
        this.base = base;
        this.bonus = bonus;
    }

    double calculateSalary() {
        // TODO: 급여 계산 기본급+보너스
        return base+bonus;
    }
}
//Employee를 상속받은 PartTimeEmployee 클래스
class PartTimeEmployee extends Employee {
    double hourly, hours;

    PartTimeEmployee(double hourly, double hours) {
        this.hourly = hourly;
        this.hours = hours;
    }

    double calculateSalary() {
        // TODO: 급여 계산 시간당 급여 × 근무시간
        return hourly*hours;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정규직 : 'full' 입력 | 시간제 : 'part' 입력");
        String type1 = sc.next();
        //Employee 타입 변수 선언 (실제 객체는 FullTimeEmployee 또는 PartTimeEmployee)
        Employee e;
        if (type1.equals("full")) {
            System.out.println("기본 급여를 입력하세요.");
            double base = sc.nextDouble();
            System.out.println("보너스 금액을 입력하세요.");
            double bonus = sc.nextDouble();
            //변수 e가 FullTimeEmployee 객체를 가리킴
            e = new FullTimeEmployee(base, bonus);
        } else {
            System.out.println("시간당 급여를 입력하세요.");
            double hourly = sc.nextDouble();
            System.out.println("근로 시간을 입력하세요.");
            double hours = sc.nextDouble();
            //변수 e가 PartTimeEmployee 객체를 가리킴
            e = new PartTimeEmployee(hourly, hours);
        }
        //생성한 객체에 따라 메서드 실행
        System.out.println(e.calculateSalary());
        sc.close();
    }
}