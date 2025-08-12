package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static int[] copyArray(int[] original) {
        int[] copyArr = new int[original.length];   // int형 배열 copyArr를 만들고, 크기는 original.length로 지정함
        for(int i = 0; i < original.length; i++) {  // 조건을 만족하는 동안 반복 수행
            copyArr[i] = original[i];               // copyArr[i]에 original[i]를 저장함
        }
        return copyArr;                             // copyArr를 반환함
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();
        int[] copy = copyArray(original); // TODO: copyArray 메서드 작성 후 주석 해제
        // 원본 배열 변경
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        // TODO: copy 배열을 출력
        for (int i : copy) {            // 향상된 for문
            System.out.print(i + " ");  // 결과를 출력함
        }
    }
}