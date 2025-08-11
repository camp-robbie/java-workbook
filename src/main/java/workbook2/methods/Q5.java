package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    // 문자열 배열을 매개변수로 받아, 각 문자열을 거꾸로(reverse) 변환하여 새로운 배열로 반환하는 메서드를 작성하시오.
    // 메서드 이름은 reverseStrings, 반환형은 String[]입니다.
    public static String[] reverseStrings(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = new StringBuilder(arr[i]).reverse().toString();
            // StringBuilder : 가변(mutable) 객체로, 문자열을 직접 수정할 수 있음, sb.reverse(); : 문자열을 거꾸로 뒤집어주는 메서드
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
        String[] result = reverseStrings(words);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}