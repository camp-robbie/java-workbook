package main.java.workbook2.classdesign;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    // TODO: 생성자 작성
    // 생성자 (매개변수: int width, int height)
    public Rectangle(int width, int height) {
        this.width = width;     // 매개변수 width 값을 Rectangle 필드 width에 대입함
        this.height = height;   // 매개변수 heigh 값을 Rectangle 필드 height에 대입함
    }
    int getArea() {
        // TODO: 넓이 반환
        return width * height;  // 넓이를 반환함
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        Rectangle rect = new Rectangle(w, h); // TODO: 생성자 작성 후 주석 해제
        // TODO: rect.getArea() 출력
        System.out.println(rect.getArea()); // 결과를 출력함
    }
}
