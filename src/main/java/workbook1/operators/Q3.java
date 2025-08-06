package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        //첫 번째 값이 두 번째 값보다 큰지 비교
        boolean result = (x > y);

        //두 결과 출력
        System.out.println(result + " " + !result);  //첫 번째 결과에 NOT 연산을 적용 후 출력
        sc.close(); // 자원 누수 방지
    }
}