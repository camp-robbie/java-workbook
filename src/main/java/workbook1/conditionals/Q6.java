package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        //BMI 계산
        double bmi = weight / ((heightCm/100)*(heightCm/100));
        //조건문으로 등급 출력
        if(bmi >= 30){
            System.out.println("BMI : "+ bmi +" : 비만");
        }else if(bmi >= 25) {
            System.out.println("BMI : "+ bmi +" : 과체중");
        }else if(bmi >= 18.5){
            System.out.println("BMI : "+ bmi +" : 정상");
        }else{
            System.out.println("BMI : "+ bmi +" : 저체중");
        }
    }
}
