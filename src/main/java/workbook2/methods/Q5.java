package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {       // 문자열 배열 뒤집기 reverseStrings
    // TODO: reverseStrings 메서드 작성

    /**
     * 메서드 이름: reverseStrings
     * 매개변수: String[] words
     * 반환형: String[] (각 문자열을 뒤집은 결과를 같은 순서로 담은 새 배열)
     * 구현 요령: StringBuilder의 reverse()를 활용하면 간단하게 뒤집을 수 있다.
     */

    public static String[] reverseStrings(String[] words) {
        int n = words.length;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            // StringBuilder는 문자열을 다루는 가변 객체, reverse()로 손쉽게 뒤집기 가능
            result[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력:
        // 3
        // apple banana cherry

        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();           // 공백 기준 단어 단위 입력
        }
        // TODO: reverseStrings 호출 후 결과 출력

        String[] reversed = reverseStrings(words);

        // 출력: 공백으로 구분하여 한 줄에
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(reversed[i]);
        }
        System.out.println();

        sc.close();
    }
}