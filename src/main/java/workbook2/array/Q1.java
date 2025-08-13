package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력
        // 배열 크기가 5인 정수 배열 생성하기!

        System.out.print("정수 5개를 입력해주세요(한 칸 띄어쓰기로 구분해주세요): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            // nextInt()로 입력 시 공백/줄바꿈 자동으로 구분됩니다.
        }

        // 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            // println() 사용하면 줄바꿈 발생 → print()로 출력해야 한 줄에 나옴
        }
    }
}
