package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        //평균 계산
        double avg = (double)(s1+s2+s3)/3;
        //double avg = (s1+s2+s3)/3; >> int 나누기 int = int값이라 앞에 double 의미가 없어짐
        //중첩 if-else로 학점 출력
        if (avg >= 90){
            System.out.println("학점 : A");
        } else if (avg >= 80){
            System.out.println("학점 : B");
        } else if (avg >= 70) {
            System.out.println("학점 : C");
        } else if (avg >= 60) {
            System.out.println("학점 : D");
        } else {
            System.out.println("학점 : F");
        }
    }
}