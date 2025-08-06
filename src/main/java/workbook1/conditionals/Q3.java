package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        // 90점 이상 : A
        // 80점 이상 : B
        // 70점 이상 : C
        // 60점 이상 : D
        // 그 외 : F

        int average = (s1 + s2 + s3) / 3;

        // 평균이 90 이상일 때를 먼저 확인하는 if문 작성
        if (average >= 90) {
            System.out.println(average + " = A");
        } else if (average >= 80) {
            System.out.println(average + " = B");
        } else if (average >= 70) {
            System.out.println(average + " = C");
        } else if (average >= 60) {
            System.out.println(average + " = D");
        } else {
            System.out.println(average + " = F");
        }



    }
}