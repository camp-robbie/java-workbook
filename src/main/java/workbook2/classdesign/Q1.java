package main.java.workbook2.classdesign;

import java.util.Scanner;

/**
 * 직사각형을 표현하는 간단한 클래스입니다.
 * - 필드: 가로(width), 세로(height)
 * - 메서드: getArea() -> width * height 반환
 */

class Rectangle {
    int width;      // 가로
    int height;     // 세로
    // TODO: 생성자 작성

    /**
     * 생성자: 가로와 세로를 받아 필드를 초기화합니다.
     */

    Rectangle(int width, int height) {
        this.width = width;             // this.width (필드) = width; 매개변수 (지역 변수)
        this.height = height;
    }

    /**
     * 넓이 = 가로 * 세로
     */

    int getArea() {
        // TODO: 넓이 반환
        return 0;
    }
}

public class Q1 {       // Rectangle (넓이) 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        Rectangle rect = new Rectangle(w, h); // TODO: 생성자 작성 후 주석 해제
        // TODO: rect.getArea() 출력

        // 넓이 출력
        System.out.println(rect.getArea());

        sc.close();
    }
}
