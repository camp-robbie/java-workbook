package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

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
        int[] sumArr = addArrays(arr1, arr2);
        for (int i = 0; i < n; i++) {
            System.out.print(sumArr[i] + (i < n - 1 ? " " : ""));

        }
    }
}
