package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 전위 증가와 후위 증가 결과 출력

        // 전위 증가
        int pre = ++num;
        // 후위 증가
        int post = num++;

        // 출력
        System.out.println(pre + " " + post);

        // 후위 증가 확인용
        // System.out.println(num);

        /*
        // solution
        int num1 = num;
        int num2 = num;

        int preIncrement = ++num1;  // 전위 증가: 먼저 증가한 후 값 변환
        int postIncrement = num2++; // 후휘 증가: 현재 값 반환 후 증가
        System.out.println(postIncrement);  // 5 출력

        int finalNum2 = num2;   // 후위 증가 후의 변수 값
        System.out.println(preIncrement + " " + finalNum2);
        */

        sc.close();

    }
}
