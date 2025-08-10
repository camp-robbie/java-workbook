package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    // 메서드 이름은 reverseStrings, 반환형은 String[]
    // reverse() 메서드 쓸 수 있는 방법도 존재함
    public static String[] reverseStrings(String[] words) {
        String[] arr = new String[words.length];    // arr의 크기를 words의 길이로 설정

        for(int i = 0; i < words.length; i++) {     // 조건을 만족하는 동안 반복 수행
            String word = words[i];                 // words[i]를 word에 저장함
            String reverse = "";                    // 뒤집기 위한 변수 / for문 바깥쪽에 선언하면 기존 값들 초기화 안되니 주의!

            for(int j = word.length() - 1; j >= 0; j--) {   // 조건을 만족하는 동안 반복 수행
                reverse += word.charAt(j);                  // reverse에 word.charAt(j)을 저장함
            }
            arr[i] = reverse;       // arr[i]에 reverse를 저장함
        }
        return arr; // arr 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
        String[] results = reverseStrings(words);   // reverseStrings 호출
        for (String result : results) {             // 출력
            System.out.print(result + " ");
        }
    }
}