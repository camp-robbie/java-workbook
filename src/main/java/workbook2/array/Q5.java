package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        System.out.println(n + "개의 정수를 입력해주세요.");
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                sc.next(); // 잘못된 입력 버리기
            }
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; i++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\n정렬된 배열 : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}