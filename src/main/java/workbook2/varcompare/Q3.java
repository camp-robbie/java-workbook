package main.java.workbook2.varcompare;

import java.util.Scanner;

class Student {

    // 필드
    static int studentCount = 0;
    private final int id;
    private final String name;

    // getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    Student(String name) {
        this.name = name;
        this.id = ++studentCount;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Student stu = new Student(name);
            System.out.println(stu.getName() + " " + stu.getId());
        }
    }
}