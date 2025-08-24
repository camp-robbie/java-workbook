package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {
    // TODO: area 오버로딩 (double r), (double w, double h), (double b, double h)
    // area 오버로딩 (double)
    public static double area(double r) {
        return r * r * Math.PI;                     // 원의 넓이를 구하여 반환함
    }

    // area 오버로딩 (double, double)
    public static int area(double w, double h) {    // 출력 값을 맞춰주기 위하여 int형으로 반환함
        return (int)(w * h);                        // 사각형의 넓이를 구하여 반환함
    }

    // area 오버로딩 (double, double, int)
    public static int area(double b, double h, int TRIANGLE_DIV) {      // 출력 값을 맞춰주기 위하여 int형으로 반환함
        return (int)(b * h) / TRIANGLE_DIV;                             // 삼각형의 넓이를 구하여 반환함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        for (int i = 0; i < 3; i++) {           // 3번 반복을 수행함
            String type = sc.next();            // type을 입력받음 (원, 사각형, 삼각형)
            final int TRIANGLE_DIV = 2;         // 삼각형일 경우, 나누는 값 2를 상수로 저장함

            if (type.equals("circle")) {        // type에 입력된 값이 circle일 경우
                double r = sc.nextDouble();     // r의 값(반지름의 값)을 입력받음
                System.out.println(area(r));    // area(r)의 결과를 출력함

            } else if (type.equals("rect")) {   // type에 입력된 값이 rect일 경우
                double w = sc.nextDouble();     // w의 값(밑변의 값)을 입력받음
                double h = sc.nextDouble();     // h의 값(높이의 값)을 입력받음
                System.out.println(area(w, h)); // area(w, h)의 결과를 출력함

            } else {                            // 그렇지 않으면(삼각형일 경우)
                double b = sc.nextDouble();     // b의 값(밑변의 값)을 입력받음
                double h = sc.nextDouble();     // h의 값(높이의 값)을 입력받음
                System.out.println(area(b, h, TRIANGLE_DIV));   // (area(b, h, TRIANGLE_DIV)의 결과를 출력함
            }
        }
        sc.close();                             // 스캐너 닫기
    }
}