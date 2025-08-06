package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력

        double heightM = heightCm / 100.0;
        double BMI = weight / (heightM * heightM);

        if (BMI < 18.5) {
            System.out.println("정상");
        } else if (BMI < 25) {
            System.out.println("과체중");
        } else if (BMI < 30) {
            System.out.println("비만");
        } else {
            System.out.println("저체중");
        }
    }
}

// 중첩 if-else 문으로 표현시
public static void main2(String[] args) {

    double heightM = heightCm / 100.0;
    double BMI = weight / (heightM * heightM);

    if (BMI < 18.5) {
        System.out.println("저체중");
    } else {
        if (BMI < 25) {
            System.out.println("정상");
        } else {
            if (BMI < 30) {
                System.out.println("과체중");
            } else {
                System.out.println("비만");
            }
        }
    }
}


