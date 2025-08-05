package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // TODO: x > y 결과와 !(x < y) 결과 출력

        //첫 번째 값이 두 번째 값보다 큰지 비교
        boolean a = (x > y);
        //첫 번째 결과에 NOT 연산을 적용
        boolean b = !a;

        //두 결과 출력
        System.out.println(a + " " + b);

        sc.close();
    }
}