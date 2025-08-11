package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    private static void addHundred(int[] arr){          //배열은 참조 타입-> 메서드 안에서 수정하면 외부에도 반영됨. 리턴 안 해도 됨.
        arr[0] += 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        addHundred(arr);
        //  변경된 arr 출력
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}