package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력

        double bmi = weight / (heightCm * heightCm / 10000.0);

        // bmi >= 30 비만
        // bmi >= 25 과체중
        // bmi >= 18.5 정상
        // 그 외 저체중

        if (bmi >= 30) {
            System.out.println("비만입니다.");
        } else if (bmi >= 25) {
            System.out.println("과체중입니다.");
        } else if (bmi >= 18.5) {
            System.out.println("정상입니다.");
        } else {
            System.out.println("저체중입니다.");
        }
    }
}
