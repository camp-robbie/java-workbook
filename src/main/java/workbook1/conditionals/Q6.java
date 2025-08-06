package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: BMI 계산 후 조건문으로 등급 출력
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        int bmi = (int) (weight / ((heightCm/100) * 2));

        String result = bmi >= 30 ? "비만"
                : (bmi >= 25 ? "과체중"
                : (bmi >= 18.5 ? "정상" : "저체중"));

        System.out.println(result);
    }
}
