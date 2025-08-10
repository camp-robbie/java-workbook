package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    public int[] addArrays(int[] array1, int[] array2) {
        int length = array1.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = array1[i] + array2[i];
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
        Q3 q3 = new Q3();

        int[] sumArr = q3.addArrays(arr1, arr2);

        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i]);
            if (i != sumArr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();

    }
}
