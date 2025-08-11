package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // bmi를 구합니다. 몸무게 / (키/100)^2
        // Math.pow() 는 제곱을 구해주는 메서드입니다.
        double bmi = weight/Math.pow((heightCm/100.0),2);

        // 중첩 if-else 문을 사용하였습니다.
        // elseif 를 사용하지 않은 이유 => 최악의 경우 판단을 3번...
        // 아래의 코드는 최악의 경우 판단을 2번 합니다.
        // 이진 트리와 같은 형태라고 생각해주세요.
        if (bmi>=25){
            if (bmi>=30){
                System.out.println("비만");
            }else{
                System.out.println("과체중");
            }
        }else {
            if (bmi>=18.5){
                System.out.println("정상");
            }else{
                System.out.println("저체중");
            }
        }
    }
}
