package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수형 배열 크기를 입력해주세요.");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        System.out.println(n + "개의 정수를 입력해주세요.");
        // arr에 n개의 정수 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열을 역순으로 출력
        System.out.println("배열을 거꾸로 출력합니다.");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}