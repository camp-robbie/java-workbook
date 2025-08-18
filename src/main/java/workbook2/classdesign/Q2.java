package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {                    // 원의 둘레 반환하는 클래스 생성
    double r;

    // TODO: 생성자 작성
    Circle(double r) {             // 생성자 정의
        this.r = r;                // 필드 초기화
    }

    double getCircumference() {    // 메서드 정의
        // TODO: 둘레 반환
        return Math.PI * r * 2;    // 원의 둘레 반환
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Scanner 생성

        double radius = sc.nextDouble();           // 공백으로 구분된 실수 토큰 1개 radius에 저장
        Circle c = new Circle(radius);             // Circle 객체를 생성하여 c(타입 Circle)에 참조 저장
                                                   //  => 객체 필드 r을 radius 로 초기화

        // TODO: c.getCircumference() 출력
        System.out.println(c.getCircumference());  // 원의 둘레 출력

        sc.close();                                // 입력 닫기
    }
}
