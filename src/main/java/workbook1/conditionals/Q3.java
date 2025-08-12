package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        Scanner sc = new Scanner(System.in);

        // 사용자에게 세 과목의 점수를 입력 받는다.
        System.out.print("Subject1: ");
        int s1 = sc.nextInt();
        System.out.print("Subject2: ");
        int s2 = sc.nextInt();
        System.out.print("Subject3: ");
        int s3 = sc.nextInt();

        // 평균값을 계산하는 조건문을 작성 후 평균점수 출력
        double avg = (s1 + s2 + s3) / 3.0;
        System.out.println("Your average: " + avg);

        // A: 90점 이상 / B: 80점 이상 / C: 70점 이상 / D: 60점 이상 / F: 그 외
        // if문으로 조건문 작성
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