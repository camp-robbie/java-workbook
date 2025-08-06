package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("체중을 입력하세요 : ");
        double weight = sc.nextDouble();
        System.out.println("키(cm)를 입력하세요 : ");
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력

        double BMI = weight / Math.pow(heightCm/100.0, 2);

        if (BMI >= 30) {
            System.out.println("비만입니다. 다이어트 같이 하실래요?");
        } else if (BMI >= 25) {
            System.out.println("과체중입니다. 다이어트 하세요.");
        } else if (BMI >= 18.5) {
            System.out.println("정상입니다. 유지어트 하세요");
        } else {
            System.out.println("저체중입니다. 증량하세요.");
        }
    }
}
