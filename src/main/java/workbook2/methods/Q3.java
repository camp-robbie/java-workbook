package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    // 메서드 이름은 addArrays, 매개변수는 두 개의 int[], 반환형은 int[]
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];       // 크기를 arr1 길이로 설정
        for(int i = 0; i < arr.length; i++) {   // 조건을 만족할 동안 반복 수행
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
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
        int[] resultArr = addArrays(arr1, arr2);    // addArrays 호출하여 resultArr에 저장함

        for (int i : resultArr) {   // 결과 출력
            System.out.print(i + " ");
        }
    }
}
