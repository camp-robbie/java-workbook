package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // 몸무게(kg)와 키(cm)를 입력받아 BMI = 몸무게 / (키/100)^2 공식 적용
        // 주어진 공식을 적용하여 bmi 변수에 저장함
        double bmi = weight / ((heightCm / 100) * (heightCm / 100));

        if (bmi >= 30) { // bmi가 30 이상이면
            System.out.println("비만");
        } else if (bmi >= 25) { // bmi가 25이상 30 미만이면
            System.out.println("과체중");
        } else if (bmi >= 18.5) { // bmi가 18.5이상 25 미만이면
            System.out.println("정상");
        } else { // 그 이외면 (18.5 미만이면)
            System.out.println("저체중");
        }

        sc.close(); // 자원 누수 방지
    }
}
