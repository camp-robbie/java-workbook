package main.java.workbook2.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    // 두 개의 정수 배열을 입력받아 두 배열의 요소를 모두 더한 결과를 새로운 배열로 반환하는 메서드를 작성하시오. 배열 길이는 같다고 가정한다.
    // 메서드 이름은 addArrays, 매개변수는 두 개의 int[], 반환형은 int[] 입니다.
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int length = arr1.length; // 두 배열의 길이가 같다고 가정했기 때문에 result 배열의 길이는 arr1.length로 하면 됨
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
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
        int[] result = addArrays(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
