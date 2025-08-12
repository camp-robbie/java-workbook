package main.java.workbook2.classdesign;

import java.util.Scanner;

class Rectangle {
    // 필드
    // final로 설정한 이유 : 값을 변경하지 않음.
    private final int width;
    private final int height;

    // 생성자
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        // 객체를 만듭니다.
        Rectangle rect = new Rectangle(w, h);

        // 출력합니다.
        System.out.println(rect.getArea());
    }
}
