package main.java.workbook2.array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // TODO: arr에 5개 정수 저장 후 출력
        for(int i = 0; i < 5; i++) {    // i는 0이고, 5보다 작을 때까지 1씩 늘리며 반복함
            int num = sc.nextInt();     // 입력받음
            arr[i] = num;               // arr[i]에 num을 저장함
        }
        for(int element : arr) {        // 향상된 for문으로 arr 배열의 요소를 하나씩 꺼내옴
            System.out.print(element + " ");    // 요소들을 출력함
        }
    }
}
