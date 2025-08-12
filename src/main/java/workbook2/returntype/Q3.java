package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static int[] copyArray(int[] original){
        int[] copy = new int[original.length];
        for(int i = 0; i<original.length; i++) copy[i] = original[i];
        return copy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 크기 입력");
        int n = sc.nextInt();
        int[] original = new int[n];

        System.out.println("원본 배열 값 입력");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        int[] copy = copyArray(original);

        // 원본 배열 변경
        System.out.println("배열값 변경");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        //copy 배열을 출력
        System.out.println("복사된 배열값 출력");
        for (int i : copy) {
            System.out.print( i + " ");
        }
    }
}