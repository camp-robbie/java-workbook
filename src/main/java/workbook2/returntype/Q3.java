package main.java.workbook2.returntype;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    // 깊은 복사(Deep Copy) : 원본 데이터의 값을 복제해서 완전히 새로운 메모리 공간에 저장하는 것

    public static int[] copyArray(int[] copy) {
        // 입력 배열이 null인 경우 null을 반환
        if (copy == null) {
            return null;
        }

        int[] result = new int[copy.length];

        // 원본 배열의 값을 복제해서 완전히 새로운 배열에 복사(깊은 복사)
        for (int i = 0; i < copy.length; i++) {
            result[i] = copy[i];
        }
        return result; // 배열의 복사본 반환
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
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

    }
}