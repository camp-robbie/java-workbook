package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력

        // 공식 :  BMI = 몸무게 / (키/100)^2
        double BMI = weight / ((heightCm/100) * (heightCm/100));

        if (BMI >= 30) {
            System.out.println("비만");   // BMI가 30 이상이면 “비만"
        } else if (BMI >= 25) {
            System.out.println("과체중"); // BMI가 25 이상이면 “과체중”
        }  else if (BMI >= 18.5) {
            System.out.println("정상");   // BMI가 18.5 이상이면 “정상”
        } else {
            System.out.println("저체중");  // BMI가 그 외는 “저체중”
        }
        sc.close();
    }
}
