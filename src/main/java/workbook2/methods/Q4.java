package main.java.workbook2.methods;

import java.util.Scanner;

public class Q4 {       // 세 정수 평균 average
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성

    /**
     * 메서드 이름: average
     * 매개변수: int a, int b, int c
     * 반환형: double (실수 평균)
     * 주의: 정수/정수의 나눗셈은 정수 나눗셈이므로 반드시 하나를 실수로 만들어야 한다.
     */

    public static double average(int a, int b, int c) {
        // 3.0으로 나누면 자동으로 실수 계산이 된다. (또는 (a + b + c) / 3.0)
        // 합이 매우 클 수 있다면 long으로 한 번 받아 오버플로 방지도 가능하지만, 여기선 단순 버전
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 예: "5 7 9"
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: average 호출 후 결과 출력

        double avg = average(a, b, c);
        System.out.println(avg); // 예시 출력: 7.0

        sc.close();
    }
}
