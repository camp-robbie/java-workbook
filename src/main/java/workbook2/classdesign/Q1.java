package main.java.workbook2.classdesign;

import java.util.Scanner;

class Rectangle {               // 넓이 구하는 클래스
    int width;
    int height;

    // TODO: 생성자 작성
    Rectangle(int w, int h) {    // 생성자 정의
        width = w;               // 필드 초기화
        height = h;
    }

    // 메서드 //
    int getArea() {               // 메서드 정의
        // TODO: 넓이 반환
        return width * height;    // 넓이(width * height) 반환
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Scanner 생성
        int w = sc.nextInt();                    // 첫번째 정수 입력받아 w에 저장
        int h = sc.nextInt();                    // 두번째 정수 입력받아 h에 저장
        Rectangle rect = new Rectangle(w, h);    // 새로운 객체(Rectangle(w, h)) 생성하여 참조값을 rect에 저장

        // TODO: rect.getArea() 출력
        System.out.println(rect.getArea());       // rect(Rectangle 클래스의 생성자 참조된)
                                                  // getArea() 메서드 호출하여 사각형 넓이 반환
    }
}
