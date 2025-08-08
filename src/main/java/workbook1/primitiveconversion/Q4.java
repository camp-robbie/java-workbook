package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
        //입력 받기
        System.out.print("float 값을 입력해주세요: ");
        float f1 = sc.nextFloat();
        System.out.print("float 값을 입력해주세요: ");
        float f2 = sc.nextFloat();

        //1. 첫 번째 f1을 int 로 강제 형변환하여 소수점 제거
        int f1int = (int) f1;

        //2. 두 번째 f2을 int로 변환 후 double로 자동 형변환하기
        double f2double = (int) f2;

        //3. 그 결과를 합산해서 doulbe로 출력
        double sum = f1int + f2double;

        // 결과 출력
        System.out.printf("결과: %.1f\n", sum);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 사고흐름 (입력받기 안내는 생략)
//1. f1을 int 로 강제 형변환하여 소수점 제거
//2. f2을 double로 자동 형변환하기
//3. 그 결과를 합산해서 doulbe로 출력