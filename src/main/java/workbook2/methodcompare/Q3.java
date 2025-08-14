package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Converter {
    static double toCelsius(double f) {
        // TODO: 섭씨로 변환
        return (f -32)*5/9;
    }
    double toFahrenheit(double c) {
        // TODO: 화씨로 변환
        return c*9/5+32;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double cRes = Converter.toCelsius(f);
        Converter conv = new Converter();
        double fRes = conv.toFahrenheit(c);
        // TODO: cRes와 fRes 출력
        System.out.println(cRes + " " + fRes);
    }
}
