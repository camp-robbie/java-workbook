package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        //1. 실수 값 3개 입력받기
        System.out.print("실수 x를 입력해주세요: "); // 3.8
        double x = sc.nextDouble();
        System.out.print("실수 y를 입력해주세요: "); // 4.2
        double y = sc.nextDouble();
        System.out.print("실수 z를 입력해주세요: "); //5.9
        double z = sc.nextDouble();

        //2. 실수 값을 int로 정수형으로 강제 변환시키기
        int ix = (int) x; // 3
        int iy = (int) y; // 4
        int iz = (int) z; // 5

        //3. 변환된 정수 값의 평균 계산하기 (float 값으로)
        int sum = ix + iy + iz;  // 3 + 4 + 5
        float avg = (float) sum / 3;  // 12 / 3 = 4 (float 4.0)

        //4. 평균값을 float로 출력하기
        System.out.println("평균: " + avg); // 평균 : 4.0

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 사고흐름
//1. 실수 값 3개 입력받기
//2. 실수 값을 int로 정수형으로 강제 변환시키기
//3. 변환된 정수 값의 평균 계산하기
//4. 평균값을 float로 출력하기

