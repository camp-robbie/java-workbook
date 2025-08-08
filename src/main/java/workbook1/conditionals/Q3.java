package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int result = (s1 + s2 + s3) / 3;   // 평균을 계산하여 저장하는 변수

        // 중첩문을 사용하여 조건문 작성
        if (result >= 90) { // 90 이상이면
            System.out.println("A");
        } else {
            if (result >= 80) { // 80 이상 90미만
                System.out.println("B");
            } else {
                if (result >= 70) { // 70 이상 80미만
                    System.out.println("C");
                } else {
                    if (result >= 60) { // 60 이상 70미만
                        System.out.println("D");
                    } else { // 60 미만
                        System.out.println("F");
                    }
                }
            }
        }

        sc.close(); // 자원 누수 방지
    }
}