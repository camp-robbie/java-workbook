package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    public static String[] reverseStrings(String[] words) {
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            reversedWords[i] = sb.reverse().toString();
        }

        return reversedWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
        int n = sc.nextInt();
        String[] words = new String[n];

        System.out.println(n + "개의 문자열을 입력하세요.");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // TODO: reverseStrings 호출 후 결과 출력
        String[] reversedArray = reverseStrings(words);

        System.out.println("거꾸로 변환된 배열:");
        for (String word : reversedArray) {
            System.out.println(word);
        }

        sc.close();
    }
}