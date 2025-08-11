package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        // TODO: addArrays 호출 후 결과 배열 출력

        System.out.println("첫 번째 배열에 들어갈 정수 " + n + "개를 입력하세요.");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("두 번째 배열에 들어갈 정수 " + n + "개를 입력하세요.");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // addArrays 메서드 호출
        int[] resultArray = addArrays(arr1, arr2);

        // 결과 배열 출력
        System.out.println("두 배열의 합:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}
