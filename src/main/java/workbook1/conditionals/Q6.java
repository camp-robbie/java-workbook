package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력
        // bmi 계산 = 몸무게(kg) / (키(Cm)/100)^2
        double bmi = weight / ((heightCm / 100) * (heightCm / 100));

        // BMI가 30이상이면 "비만" 출력
        if (bmi >= 30) {
            System.out.println("비만");

        } else {
            // BMI가 25이상이면 "과체중" 출력
            if (bmi >= 25) {
                System.out.println("과체중");

            } else {
                // BMI가 18.5이상이면 "정상" 출력
                if (bmi > 18.5) {
                    System.out.println("정상");

                // 그 외는 "저체중" 출력
                }  else {
                    System.out.println("저체중");
                }
            }
        }
    }
}
