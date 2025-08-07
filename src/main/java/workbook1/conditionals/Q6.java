package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // TODO: BMI 계산 후 조건문으로 등급 출력
        // BMI(체질량지수)를 계산하는 프로그램을 작성하시오.
        // 몸무게(kg)와 키(cm)를 입력받아 BMI = 몸무게 / (키/100)^2 공식을 적용한다.
        // BMI가 30 이상이면 “비만”, 25 이상이면 “과체중”, 18.5 이상이면 “정상”, 그 외는 “저체중”을 출력한다.

        // cm -> m
        double heightM = heightCm / 100.0;

        // BMI = 몸무게 / (키)^2
        double bmi = weight / (heightM * heightM);

        // BMI가 30 이상이면 “비만”
        if (bmi >= 30) {
            System.out.println("비만");
        } else {
            // BMI < 30
            if (bmi >= 25) {
                System.out.println("과체중");
            } else {
                // BMI < 25
                if (bmi >= 18.5) {
                    System.out.println("정상");
                } else {
                    // BMI < 18.5
                    System.out.println("저체중");
                }
            }
        }
    }
}
