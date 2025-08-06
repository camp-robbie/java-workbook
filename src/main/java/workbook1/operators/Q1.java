package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = {a+b, a-b, a*b, a/b, a%b};
        // 각 산술 연산의 결과를 배열에 배치

        // 배열의 값을 하나씩 넣기 위한 변수
        // StringBuilder : 자바에서 문자열을 효율적으로 조작하기 위한 가변 클래스
        StringBuilder arrStr = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                arrStr.append(arr[i]); // 첫 결과값 앞에 공백 없음
            } else {
                arrStr.append(" ").append(arr[i]);
            }
        }

        System.out.println(arrStr);
    }
}