package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 과목의 점수 받기
        System.out.print("국어 과목의 점수: ");
        int s1 = sc.nextInt();
        System.out.print("영어 과목의 점수: ");
        int s2 = sc.nextInt();
        System.out.print("수학 과목의 점수: ");
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        ///  도전
        /// else if, switch, 삼항 연산자? 로도 가능하면 해보기

        // 세 과목의 평균 계산하기
        double avg = (s1 + s2 + s3) / 3;
        // double - 평균 계산할 때 소수점까지 계산하기.

        /// 중첩 if-else 활용
        // 학점 부여 방식
        if (avg >= 90) {    // 90 점 이상의 학점 A
            System.out.println("A");
        } else {
            if (avg >= 80) {    // 80 점 이상의 학점 B
                System.out.println("B");
            } else  {
                if (avg >= 70) {    // 70 점 이상의 학점 C
                    System.out.println("C");
                } else   {
                    if (avg >= 60) {    // 60 점 이상의 학점 D
                        System.out.println("D");
                    } else   {          // 60 점 이상의 학점 F
                        System.out.println("F");
                    }
                }
            }
        }
        sc.close();
    }
}