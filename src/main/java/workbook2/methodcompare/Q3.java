package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Converter {                          // 클래스 정의

    static double toCelsius(double f) {    // 클래스 정적 메서드 정의
        // TODO: 섭씨로 변환
        return ((f -32) * 5/9);            // 화씨 -> 섭씨 변환하여, 섭씨값 반환
    }

    double toFahrenheit(double c) {        // 인스턴스 메서드 정의
        // TODO: 화씨로 변환
        return ((c * 9/5) + 32);           // 섭씨 -> 화씨 변환하여, 화씨값 반환
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Scanner 생성

        double f = sc.nextDouble();                // 첫 번째 실수 1개 읽어 f에 저장
        double c = sc.nextDouble();                // 두 번째 실수 1개 읽어 c에 저장
        double cRes = Converter.toCelsius(f);      // Converter 클래스의 toCelsius(f) 메서드 호출하여 반환값(섭씨)을 cRes에 저장
        Converter conv = new Converter();          // 새로운 객체 Converter() 생성하여, 참조를 conv 에 저장
        double fRes = conv.toFahrenheit(c);        // conv가 참조하는 toFahrenheit(c) 메서드 호출하여 반환값(화씨)을 fRes에 저장

        // TODO: cRes와 fRes 출력
        System.out.println(cRes + " " + fRes);     // cRes 와 fRes 출력 (공백으로 구분)

        sc.close();                                // 입력 닫기
    }
}
