package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    public static double average(int a, int b, int c){
        return ( a + b + c ) / 3.0;   // 정수 나눗셈 방지 위해 3.0 사용
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 세 정수 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: average 호출 후 결과 출력

        // double result = average(a, b, c); -> 여러번 사용/가공.비교 필요 시 변수저장하여 사용
        // 조건 변경없이 사용 시, 메서드 호출을 println 안에서 바로 실행
        System.out.println(average(a, b, c));

        sc.close();
    }
}
