package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
        
        int intF1 = (int)f1;    // float형에서 int형으로 강제 형변환을 수행하여 intF1 변수에 저장함
        
        double doubleF2 = f2;   // float형에서 double형으로 자동 형변환을 수행하여 doubleF2 변수에 저장함
        
        double sum = intF1 + doubleF2;           // 소수점을 출력해야하기 때문에 double형 sum에 합산 결과를 저장함

        // 소수점 첫번째 자리까지만 출력하기를 원하기 때문에 printf문을 사용하여 소수점 첫번째 자리까지 출력함
        System.out.printf("sum = %.1f", sum);
    }
}