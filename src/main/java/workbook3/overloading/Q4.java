package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {
    // TODO: area 오버로딩 (double r), (double w, double h), (double base, double height)

    static double area(double r){
        return Math.PI * r * r;
    }

    static double area(double w, double h){
        return w * h;

    }

    static double area(double base, double height){
        return height * base;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        if (type.equals("circle")) {
            double r = sc.nextDouble();
             System.out.println(area(r)); // TODO: area 메서드 작성 후 주석 해제
        } else if (type.equals("rect")) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
             System.out.println(area(w,h)); // TODO: area 메서드 작성 후 주석 해제
        } else {
            double b = sc.nextDouble();
            double h = sc.nextDouble();
             System.out.println(area(b,h)); // TODO: area 메서드 작성 후 주석 해제
        }
    }
}