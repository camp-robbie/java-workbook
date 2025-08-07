package main.java.workbook2.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    public static String[] reverseStrings(String[] words){
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            stringBuilder.reverse();
            reversedWords[i] = stringBuilder.toString();
            }
        return reversedWords;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
        String[] result = Q5.reverseStrings(words);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
