package main.java.workbook3.thissuper;

import java.util.Scanner;

class Employee {
    String name, dept;
    int salary;

    Employee(String name, String dept, int salary) {
        // TODO: 필드 초기화
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    void printInfo() {
        System.out.print("Name: " + name + ", Dept: " + dept + ", Salary: " + salary);
    }
}

class Manager extends  Employee/* TODO: Employee 상속 */ {
    String team;

    Manager(String name, String dept, int salary, String team) {
        // TODO: super() 호출 및 team 초기화
        super(name,dept,salary);                        //부모 클래스의 생성자 호출
        this.team=team;
    }

    void printInfo() {
        // TODO: super.printInfo() 호출 후 팀 정보 출력
        super.printInfo();                               //부모 클래스의 메서드 호출
        System.out.print(" team: "+ team);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직원 이름 입력");
        String n = sc.next();
        System.out.println("부서명 입력");
        String d = sc.next();
        System.out.println("임금 입력");
        int s = sc.nextInt();
        System.out.println("팀 이름 입력");
        String t = sc.next();
        Manager m = new Manager(n, d, s, t);
        m.printInfo();
    }
}
