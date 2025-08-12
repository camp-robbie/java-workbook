package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Converter {

    // 화씨를 섭씨로 변환하는 클래스 메서드 toCelsius 입니다.
    static double toCelsius(double f) {
        return (f-32)*5/9;
    }

    // 섭씨를 화씨로 변환하는 인스턴스 메서드 toFahrenheit 입니다.
    double toFahrenheit(double c) {
        return c*9/5+32;
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        double c = sc.nextDouble();

        // toCelsius 는 클래스 메서드로, 객체 생성 없이 사용 가능합니다.
        double cRes = Converter.toCelsius(f);

        // toFahrenheit() 메서드를 사용하기 위해 객체를 생성합니다.
        Converter conv = new Converter();
        double fRes = conv.toFahrenheit(c);

        System.out.println(cRes + " " + fRes);
    }
}
