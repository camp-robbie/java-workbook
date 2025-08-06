package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        int average = (s1 + s2 + s3) / 3;

        if (average > 90) {
            System.out.println("A");
        } else if (average > 80) {
            System.out.println("B");
        } else if (average > 70) {
            System.out.println("C");
        } else if (average > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

// 중첩 else-if  구조도 연습해보자
        int average2 = (s1 + s2 + s3) / 3;
        if (average2 > 60) {
            if (average2 > 70) {
                if (average2 > 80) {
                    if (average2 > 90) {
                        System.out.println("A");
                    } else {
                        System.out.println("B");
                    }
                } else {
                    System.out.println("C");
                }
            } else {
                System.out.println("D");
            }
        } else {
            System.out.println("F");
        }
    }
}