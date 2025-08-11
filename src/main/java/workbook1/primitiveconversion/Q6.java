package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
        // 1. 문자열로 두 개의 정수를 입력 받기
        System.out.print("Enter the first number: ");
        String s1 = sc.next();
        System.out.print("Enter the second number: ");
        String s2 = sc.next();

        // 2. 문자열을 int 정수형으로 변환하기
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        // 3. 두 정수의 차이 계산하기
        int minus = num1 - num2;

        // 4. 그 차이 값을 byte로 강제 형변환하기
        // int > byte
        byte result = (byte) minus;

        // 5. 결과 출력
        System.out.println("결과: " + result);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 사고흐름과 같이 해보기
//1. String 문자열 숫자를 입력 받기
//2. 문자열을 int 정수형으로 변환하기
//3. 두 정수의 차이 계산하기
//4. 그 차이 값을 byte로 강제 형변환하기
//5. 결과 출력

/// 추가해볼 것
// byte 오버플로우 체크 로직