package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력

        //BMI 식 입력
        double BMI = weight / ((heightCm / 100) * (heightCm / 100));

        //BMI 별 출력 문구 입력
        if (BMI >= 30) {
            System.out.println("비만");
        } else if (BMI >= 25) {
            System.out.println("과체중");
        } else if (BMI >= 18.5) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }
        sc.close();
    }
}
