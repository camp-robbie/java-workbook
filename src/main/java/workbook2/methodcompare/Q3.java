package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Converter {
    static double toCelsius(double f) {
        // TODO: 섭씨로 변환
        return (f - 32) * 5/9;
    }
    double toFahrenheit(double c) {
        // TODO: 화씨로 변환
        return c * 9/5 + 32;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double cRes = Converter.toCelsius(f);   //클래스(Static)메서드 호출
        Converter conv = new Converter();       //객체생성
        double fRes = conv.toFahrenheit(c);     //객체생성을 통한 인스턴스 메서드 호출
        // TODO: cRes와 fRes 출력
        System.out.println("섭씨변환 : "+cRes + " | 화씨변환 : " + fRes);

        sc.close();
    }
}
