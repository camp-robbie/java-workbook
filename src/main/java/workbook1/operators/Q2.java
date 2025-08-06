package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        // TODO: 전위 증가와 후위 증가 결과 출력

        // 초기값 보존을 위해 복사본 생성
        int preNum = num;
        int postNum = num;

        // 전위 증가
        System.out.println("\n[전위 증가]");
        System.out.println("입력받은 숫자: " + preNum);
        int preSum = ++preNum;  // 증가 → 대입
        System.out.println("전위 증가 실행 후: " + preSum);
        System.out.println("전위 증가 이후 preNum 값: " + preNum);

        // 후위 증가
        System.out.println("\n[후위 증가]");
        System.out.println("입력받은 숫자: " + postNum);
        int postSum = postNum++;  // 대입 → 증가
        System.out.println("후위 증가 실행 후: " + postSum);
        System.out.println("후위 증가 이후 postNum 값: " + postNum);

        sc.close();
    }
}
