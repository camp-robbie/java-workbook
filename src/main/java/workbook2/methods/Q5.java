package main.java.workbook2.methods;

import java.util.Scanner;

public class  Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 몇 개의 문자열을 받을 건지 입력받는 구문
        int n = sc.nextInt();
        // 문자열이 들어가는 배열을 초기화하는 구문입니다.
        String[] words = new String[n];

        // 문자열을 입력받는 구문입니다.
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // 메서드를 호출하여 할당합니다.
        String[] resultArr = reverseStrings(words);

        // 출력합니다.
        for (String reversedWord : resultArr) {
            System.out.print(reversedWord + " ");
        }
    }
    static String[] reverseStrings(String[] arr) {
        // 메서드 내부에서 사용하고, return할 배열입니다.
        // 선언하고 입력받은 배열의 크기와 같도록 초기화합니다.
        String[] reverseArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // 문자를 뒤집은 결과를 이 메서드의 결과 배열에 할당합니다.
            reverseArr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return reverseArr;
    }
}