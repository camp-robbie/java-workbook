package main.java.workbook2.methodcompare;

import java.util.Scanner;

// `Converter` 클래스에 클래스 메서드 `toCelsius`(화씨→섭씨)와 인스턴스 메서드 `toFahrenheit`(섭씨→화씨)를 작성
// 화씨 → 섭씨: `(F - 32) * 5/9`
// 섭씨 → 화씨: `C * 9/5 + 32`
class Converter {
    // 클래스 메서드 toCelsius
    static double toCelsius(double f) {
        // TODO: 섭씨로 변환
        return (f - 32) * 5 / 9;
    }

    // 인스턴스 메서드 toFahrenheit
    double toFahrenheit(double c) {
        // TODO: 화씨로 변환
        return c * 9 / 5 + 32;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        double f = sc.nextDouble();             // 숫자를 입력받아 double형 변수
        double c = sc.nextDouble();             // 숫자를 입력받아 double형 변수

        double cRes = Converter.toCelsius(f);   // Converter 클래스의 클래스 메서드 toCelsius를 호출하여 결과를 double형 변수 cRes에 저장함

        Converter conv = new Converter();       // Converter 타입의 conv 객체를 생성함 (생성자를 생성하지 않았을 경우, 기본 생성자는 자동으로 만들어줌)
        double fRes = conv.toFahrenheit(c);     // conv 객체의 인스턴스 메서드 toFahrenheit을 호출하여 결과를 double형 변수 fRes에 저장함
        // TODO: cRes와 fRes 출력
        System.out.println(cRes + " " + fRes);  // 결과를 출력함
    }
}
