package main.java.workbook2.classdesign;

import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    // TODO: 생성자 작성
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // TODO: 넓이 반환
    int getArea(int width, int height) { // 두 개의 정수를 입력 값으로 전달 받는다.
        return width * height; // 넓이 구하는 공식
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w < 1 || h < 1) { // 입력 값 중 하나라도 1 미만의 값이 있다면..
                throw new IllegalArgumentException(); // 예외 생성
            }

            Rectangle rect = new Rectangle(w, h); // TODO: 생성자 작성 후 주석 해제

            // TODO: rect.getArea() 출력
            System.out.println("넓이는 : " + rect.getArea(w, h));
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } catch (IllegalArgumentException e) { // 1 미만의 값을 입력 시
            System.out.println("양의 정수만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
