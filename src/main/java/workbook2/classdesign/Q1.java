package main.java.workbook2.classdesign;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    // TODO: 생성자 작성
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getArea() {
        // TODO: 넓이 반환
        return width * height;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        Rectangle rect = new Rectangle(w, h); // TODO: 생성자 작성 후 주석 해제
        // TODO: rect.getArea() 출력
        System.out.println(rect.getArea());
        sc.close();
    }
}
