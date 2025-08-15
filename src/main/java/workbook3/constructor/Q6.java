package main.java.workbook3.constructor;

import java.util.Scanner;

class Complex {
    int real;
    int imag;
    // TODO: 기본 생성자 생성
    Complex(){
        this.real = 0;
        this.imag = 0;
    }
    // TODO: 매개변수 생성자 생성
    Complex(int real, int imag){
        this.real=real;
        this.imag=imag;
    }
    Complex add(Complex other) {
        // TODO: Complex 각각의 실수부와 허수부끼리 덧셈 후 결과 값을 갖는 새로운 Complex 반환
        int newReal = this.real+other.real;
        int newImag = this.imag+other.imag;
        return new Complex(newReal, newImag);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        // TODO: 생성자 작성 후 아래 주석 해제
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.add(c2);
        // TODO: sum.real과 sum.imag 출력
        System.out.println(sum.real + " " + sum.imag);
    }
}
