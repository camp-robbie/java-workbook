package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 과목 점수를 입력하세요 : ");
        int s1 = sc.nextInt();
        System.out.println("두 번째 과목 점수를 입력하세요 : ");
        int s2 = sc.nextInt();
        System.out.println("세 번째 과목 점수를 입력하세요 : ");
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        int[] score = {s1 + s2 + s3};
        int sum = 0;

        for (int i : score) {
            sum += i;
        }

        double average = sum / score.length;

        if (average >= 90) {
            System.out.println("A학점입니다.");
        } else if (average >= 80) {
            System.out.println("B학점입니다.");
        } else if (average >= 70) {
            System.out.println("C학점입니다.");
        } else if (average >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }
    }
}