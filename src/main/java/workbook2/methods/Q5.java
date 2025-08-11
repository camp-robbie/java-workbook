package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    // 문자열을 뒤집어서 반환
    public String[] reverseStrings(String[] str) {
        String[] result = new String[str.length];// 결과를 담을 새로운 배열 생성

        for (int i = 0; i < str.length; i++) {
            // StringBuilder().reverse() 메서드를 호출하여 문자열의 문자 순서를 반대로 바꿔줌
            result[i] = new StringBuilder(str[i]).reverse().toString();
        }
        return result; // 결과를 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            String[] words = new String[n];

            // 배열의 크기만큼 반복해서 입력 값 받음
            for (int i = 0; i < n; i++) {
                words[i] = sc.next(); // 주소 값 0부터 하나씩 저장
            }

            // TODO: reverseStrings 호출 후 결과 출력
            Q5 q5 = new Q5(); // 객체 생성
            String[] result = q5.reverseStrings(words); // 메서드 호출

            for (int i = 0; i < result.length; i++) { // 출력 예시에 맞게 출력
                System.out.print(result[i]+" ");
            }
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}