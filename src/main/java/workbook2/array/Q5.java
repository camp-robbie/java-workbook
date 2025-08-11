package main.java.workbook2.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           //배열 크기 입력
        int[] arr = new int[n];         //배열 선언
        for(int i =0; i<n; i++){        //배열 값 입력
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<n; j++){           //총 n번 반복
            for(int i =0; i < n-1; i++){    //arr[0] ~ arr[n-1]까지 크기 비교
                if (arr[i] > arr[i+1]) {    //arr[i] 값이 arr[i+1]보다 크다면
                    int temp = arr[i];      //arr[i](큰 수)값을 temp에 임시저장
                    arr[i] = arr[i+1];      //arr[1]에 작은수인 arr[i+1]값을 할당
                    arr[i+1] = temp;        //arr[i+1]에 임시저장했던 상대적큰 수 temp를 할당.
                }
            }
        }

        String s = Arrays.toString(arr);    //arr배열을 문자열로 변환
        System.out.println(s);              //출력
    }
}