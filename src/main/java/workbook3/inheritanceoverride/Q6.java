package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Employee {
    abstract double getPay(); // TODO: 급여 반환
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    double getPay() {
        // TODO: 정규직 급여 계산
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate, hours;
    PartTimeEmployee(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    double getPay() {
        // TODO: 시간제 급여 계산
        return hourlyRate*hours;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 직원
        System.out.println("Full Time Job : 'full' 입력 | Part Time Job | 'part' 입력");
        String type1 = sc.next();
        Employee e1;
        if (type1.equals("full")) {              //full time 직원인 경우
            System.out.println("임금 입력");
            double salary = sc.nextDouble();
            e1 = new FullTimeEmployee(salary);
        } else {                                 // type1 == "part"
            System.out.println("시급");
            double rate = sc.nextDouble();
            System.out.println("노동 시간");
            double h = sc.nextDouble();
            e1 = new PartTimeEmployee(rate, h);
        }

        // 두 번째 직원
        System.out.println("Full Time Job : 'full' 입력 | Part Time Job | 'part' 입력");
        String type2 = sc.next();
        Employee e2;
        if (type2.equals("full")) {
            System.out.println("임금 입력");
            double salary = sc.nextDouble();
            e2 = new FullTimeEmployee(salary);
        } else {
            System.out.println("시급");
            double rate = sc.nextDouble();
            System.out.println("노동 시간");
            double h = sc.nextDouble();
            e2 = new PartTimeEmployee(rate, h);
        }

        System.out.println(e1.getPay());
        System.out.println(e2.getPay());
    }
}
