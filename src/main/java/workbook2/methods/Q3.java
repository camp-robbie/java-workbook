package main.java.workbook2.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

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

        // addArrays 호출 후 결과 배열 출력
        int[] sumArray = addArrays(arr1,arr2);
        for (int i : sumArray) {
            System.out.print(i + " ");
        }

    }
    // addArrays 메서드 작성
    private static int[] addArrays(int[] arr1, int[] arr2){
        int[] sumArray = new int[arr1.length];
        for(int i = 0; i< arr1.length; i++){
                sumArray[i] = arr1[i] + arr2[i];
            }
        return sumArray;
    }
}
