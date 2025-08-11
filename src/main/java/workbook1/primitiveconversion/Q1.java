package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /// bug 이슈
        // Scanner 입력을 받아야 결과가 출력되는 것.
        // 콘솔에 아무것도 안 떠서 무슨 문제가 있나 봤더니 입력 대기 상태였던 것.
        // 사실 int a = sc.nextInt(); 에서 입력을 대기 했던 것

        Scanner sc = new Scanner(System.in);
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        /// 1. 사용자로부터 정수 a와 b를 입력받음
        System.out.print("첫 번째 숫자를 입력해주세요: "); // bug 이슈 예방
        int a = sc.nextInt(); // 5
        System.out.print("두 번째 숫자를 입력해주세요: "); // bug 이슈 예방
        int b = sc.nextInt(); // 10

        ///2. 정수 a와 b를 double로 자동 형변환하여 더함
        double sum = (double)a+(double)b ;

        ///3. 변환된 double 타입의 합을 (int)로 강제 형변환하여 출력
        int result = (int)sum;
        System.out.println("결과: " + result); // 15

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 사고흐름
///1. 사용자로부터 정수 a와 b를 입력받음
///2. 정수 a와 b를 double로 자동 형변환하여 더함
///3. 변환된 double 타입의 합을 (int)로 강제 형변환하여 출력