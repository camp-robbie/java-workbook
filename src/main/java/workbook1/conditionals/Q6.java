package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력

        // BMI 계산
        double bmi = weight / Math.pow((heightCm / 100), 2);

        // if-else로 등급 출력
        if (bmi >= 30) {
            System.out.println("비만");
        } else if (bmi >= 25) {
            System.out.println("과체중");
        } else if (bmi >= 18.5) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }

        /*
        // solution
        double heightM = heightCm / 100.0;  // cm를 m으로 변환
        double bmi = weight / (heightM * heightM);

        if (bmi >= 30) {
            System.out.println("비만");
        } else {
            if (bmi >= 25) {
                System.out.println("과체중");
            } else {
                if (bmi >= 18.5) {
                    System.out.println("정상");
                } else {
                    System.out.println("저체중");
                }
            }
        }
        */

        sc.close();
    }
}
