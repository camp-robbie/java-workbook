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

        // 메서드를 호출해 return된 값을 새로운 배열에 담습니다.
        int[] resultArr = addArrays(arr1, arr2);

        // 출력합니다.
        for (int i :  resultArr) {
            System.out.print(i+" ");
        }
    }
    static int[] addArrays(int[] arr1, int[] arr2) {
        // 배열을 return 하는 구문이기 때문에, 새로운 배열을 선언합니다.
        int[] sumArr = new int[arr1.length];
        // arr1과 arr2의 요소를 더해 배열에 할당하는 구문입니다.
        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i] + arr2[i];
        }
        return sumArr;
    }
}
