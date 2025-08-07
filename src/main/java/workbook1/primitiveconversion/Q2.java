package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
        int dInt = (int) d;                      // d를 int형으로 강제 형변환하여 변수 dInt에 저장함
        System.out.println("dInt = " + dInt);    // 강제 형변환이 제대로 적용되었는지 확인하기 위해서 출력함

        // double형 d와 int형 dInt의 차이를 구하기 위해서 뺄셈을 수행하여 double형 sub에 저장함
        // double형으로 받아야하는 이유: 소수점을 출력하기 위함
        double sub = d - dInt;

        // 차이가 제대로 계산되었는지 확인하기 위해서 출력함
        // 출력 결과 소수점 2번째까지만 출력되기를 원하고 있기 때문에 prinf문을 사용하여 소수점 자리수를 지정하여 출력함
        System.out.printf("sub = %.2f", sub);
    }
}