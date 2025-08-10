package main.java.workbook2.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N을 입력받아 크기 N의 정수형 배열을 선언
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j = 0; j < n; j++){
            arr[j] = sc.nextInt();
        }

        // arr 역순으로 출력
        int[] reversedArr = new int[n];
        for(int i = 0; i < n; i++){
            reversedArr[i] = arr[n-1-i];
        }
        String s = Arrays.toString(reversedArr);
        System.out.println(s);
    }
}