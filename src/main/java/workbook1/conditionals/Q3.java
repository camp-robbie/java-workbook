package main.java.workbook1.conditionals;

import java.util.Scanner;
//세 과목의 점수를 입력받아 평균이 90 이상이면 “A”, 80 이상이면 “B”, 70 이상이면 “C”, 60 이상이면 “D”, 그 외는 “F”를 출력하는 프로그램을 작성하시오.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력

        double average = (s1 + s2 + s3) / 3.0;

        if (average >= 90) {
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}