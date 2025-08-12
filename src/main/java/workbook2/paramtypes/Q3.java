package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    public static String[] swapStrings(String[] arr) {
        String temp = arr[0];   // temp 변수에 arr[0]를 복사함
        arr[0] = arr[1];        // arr[0]에 arr[1]를 복사함
        arr[1] = temp;          // arr[1]에 temp를 복사함
        return arr;             // arr를 반환함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};
        swapStrings(arr); // TODO: swapStrings 메서드 작성 후 주석 해제

        // TODO: arr[0], arr[1] 출력
        for (String s : arr) {          // 향상된 for문
            System.out.print(s + " ");  // 결과를 출력함
        }

        sc.close(); // 스캐너 닫기
    }
}
