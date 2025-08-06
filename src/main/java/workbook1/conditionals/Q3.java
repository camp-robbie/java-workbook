package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int sum = (s1 + s2 + s3) / 3;

        String result = sum >= 90 ? "A" : (sum >= 70 ? "B" : "C");

        System.out.println(result);
    }
}