package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    public static void main(String[] args) {          // main 메서드  -> 실행시 필요한 메서드 호출은 여기서!
        Scanner sc = new Scanner(System.in);          // 입력받기 위한 Scanner 생성
        int a = sc.nextInt();                         // 첫 번째 정수 입력 받아 a에 저장
        int b = sc.nextInt();                         // 두 번째 정수 입력 받아 a에 저장

        // TODO: sum 메서드를 호출하여 결과 출력
        int result = sum(a, b);                       // result 라는 변수에 sum 호출 후 저장
        System.out.println(result);                   // result(sum) 출력

        sc.close();                                   // 입력 닫기
    }

    // sum 메서드 -> 두 정수의 합 반환
    private static int sum(int a, int b){             // sum 메서드 구현 -> 매개변수 a, b 받아 합계 계산
        return a + b;                                 // 호출 시, a + b 값 리턴
    }
}






