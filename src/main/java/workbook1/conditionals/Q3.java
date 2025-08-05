package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        // 평균 계산
        int avg = (s1 + s2 + s3) / 3;

        // 중첩 if-else로 학점 출력
        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 80) {
            System.out.println("B");
        } else if (avg >= 70) {
            System.out.println("C");
        } else if (avg >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}