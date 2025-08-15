package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {
    // TODO: area 오버로딩 (double r), (double w, double h), (double base, double height)
    static double area(double r){
        return r*r*Math.PI;
    }
    static double area(double w, double h){
        return w*h;
    }
    static double areaTriangle(double base, double height){         //두번째 메서드 이름, 매개변수타입, 매개변수갯수가 같아서 오버로딩 불가 -> 매서드 이름을 변경
        return (base*height)/2;
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
            System.out.println(areaTriangle(b,h)); // TODO: area 메서드 작성 후 주석 해제
        }
    }
}