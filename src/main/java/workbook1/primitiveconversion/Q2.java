package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
        //1. Scanner 객체로 사용자로부터 double 실수형 입력을 받음
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요: ");
        double d = sc.nextDouble(); // 3.14

        //2. 변환된 실수 값을 int로 강제 형변환하여 소수점 이하를 버림
        int num = (int) d; // (int) 3.14 = 3

        //3. 본래 실수 값에서 정수 부분을 뺀 소수점 이하의 값을 계산 - 여기서는 차이를 계산
        double minus = num - d; // 3.14 - 3 = 0.14

        //4. 절대값으로 변환 (음수가 되어도 양수로 출력)
        minus = Math.abs(minus);

        //5. 결과 출력 (소수점 이하 출력) - 부동소수점
        //System.out.println("결과: " + minus); // 결과 : -0.14000000000000012

        //5. 결과 출력 (소수점 이하 출력) - 서식 포함된 문자열
        System.out.printf("결과: %.2f\n", minus);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 사고 흐름
//1. Scanner 객체로 사용자로부터 double 실수형 입력을 받음
//2. 변환된 실수 값을 int로 강제 형변환하여 소수점 이하를 버림
//3. 본래 실수 값에서 정수 부분을 뺀 소수점 이하의 값을 계산 - 여기서는 차이를 계산
//4. 결과 출력 (소수점 이하 출력)