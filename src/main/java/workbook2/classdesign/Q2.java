package main.java.workbook2.classdesign;

import java.util.InputMismatchException;
import java.util.Scanner;

class Circle {
    double r;

    // TODO: 생성자 작성
    public Circle(double r) {
        this.r = r;
    }

    double getCircumference(double r) {
        // TODO: 둘레 반환
        return 2*Math.PI*r; // 원의 둘레 공식 2*3.14(파이)*반지름
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            double radius = sc.nextDouble();

            Circle c = new Circle(radius); // TODO: 생성자 작성 후 주석 해제

            // TODO: c.getCircumference() 출력
            System.out.println("c = " + c.getCircumference(radius));
        }catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } catch (IllegalArgumentException e) { // 1 미만의 값을 입력 시
            System.out.println("양의 정수만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
