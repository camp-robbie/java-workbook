package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    public static String[] reverseStrings(String[] arr) {
        int n = arr.length;
        String[] reversed = new String[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
        String[] reversedWords = reverseStrings(words);
        for (int i = 0; i < n; i++) {
            System.out.print(reversedWords[i] + (i < n - 1 ? " " : ""));
        }
    }
}