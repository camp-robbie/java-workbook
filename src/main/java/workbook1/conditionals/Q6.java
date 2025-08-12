package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: BMI 계산 후 조건문으로 등급 출력
        // BMI 계산식 = weight / (height * height / 10000.0);

        // 사용자의 몸무게와 키를 입력 받는다
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight: ");
        double weight = sc.nextDouble();
        System.out.print("HeightCm: ");
        double heightCm = sc.nextDouble();

        // BMI를 계산 후 변수에 저장한다.
        double bmi = weight / (heightCm * heightCm / 10000.0);
        System.out.println("Your BMI is: " + bmi);

        // 조건식을 활용해 체질량에 맞는 결과을 출력한다.
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
