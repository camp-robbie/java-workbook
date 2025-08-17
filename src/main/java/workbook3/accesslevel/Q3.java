package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Employee {
    //public 변수 -> 다른 클래스에서 호출 가능
    public String name;
    //private 변수 -> 다른 클래스에서 접근 불가 -> getter, setter 필요
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    //getter -> private 변수 값 가져오는 기능
    public int getSalary() {
        return salary;
    }
    //setter -> private 변수 값 설정하는 기능
    public void setSalary(int salary) {
        // TODO: salary 설정
        this.salary=salary;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직원1 이름 입력하세요.");
        String n1 = sc.next();
        System.out.println("직원1 연봉 입력하세요.");
        int s1 = sc.nextInt();
        System.out.println("직원2 이름 입력하세요.");
        String n2 = sc.next();
        System.out.println("직원1 연봉 입력하세요.");
        int s2 = sc.nextInt();
        System.out.println("직원 1의 연봉 증가 금액을 입력하세요.");
        int raise = sc.nextInt();
        Employee e1 = new Employee(n1, s1);
        Employee e2 = new Employee(n2, s2);
        e1.setSalary(e1.getSalary() + raise);
        System.out.println(e1.getSalary() + " " + e2.getSalary());

        sc.close();
    }
}
