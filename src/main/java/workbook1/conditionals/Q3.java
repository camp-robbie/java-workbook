package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력
        int result = (s1 + s2 + s3) / 3;    // 평균을 계산하여 저장하는 변수

        if(result >= 90) {              // 90 이상이면
            System.out.println("A");    // A를 출력함
        } else if(result >= 80) {       // 80 이상 90 미만이면
            System.out.println("B");    // B를 출력함
        } else if(result >= 70) {       // 70 이상 80 미만이면
            System.out.println("C");    // C를 출력함
        } else if(result >= 60) {       // 60 이상 70 미만이면
            System.out.println("D");    // D를 출력함
        } else {                        // 이외에는 (60미만이면)
            System.out.println("F");    // F를 출력함
        }
    }
}