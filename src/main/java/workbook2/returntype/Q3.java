package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)\
    public static int[] copyArray(int[] original) {
        int[]copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
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
        for (int num : copy) {
            System.out.println(num + " ");
        }
    }
}