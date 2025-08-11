package main.java.workbook2.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    // 문자열 배열 받아 각 문자열을 뒤집어서 반환
    public static String[] reverseStrings(String[] arr){
        // 배열의 각 요소(문자열)를 뒤집어서 다시 저장
        for(int i=0; i < arr.length;i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        // 뒤집힌 문자열 배열 반환
        return  arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                     // 단어 개수 입력 받기
        String[] words = new String[n];           // 입력받은 개수만큼 문자열 배열 생성

        for (int i = 0; i < n; i++) {             // n번 반복하며 문자열 입력 받아
            words[i] = sc.next();                 // 배열(words)에 저장
        }

        // TODO: reverseStrings 호출 후 결과 출력

        // reverseStrings 메서드 호출 후, 반환된 배열의 각 요소 출력
        for (String word : reverseStrings(words)) {
            System.out.print(word + " ");
        }
        sc.close();
        }
    }
