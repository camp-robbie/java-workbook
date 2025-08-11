package main.java.workbook2.array;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();                //배열arr의 행 갯수 입력
        int cols = sc.nextInt();                //배열arr의 열 갯수 입력
        int[][] arr = new int[rows][cols];

        for(int a = 1; a<= rows*cols; a++){             //배열의 값 1~(행*열)까지 1씩 증가
            for(int i = 0; i<rows; i++){                //0행부터 rows행까지
                if(i % 2 != 0){                         //홀수행이면
                    for(int j = cols-1; j>=0; j--){     //오 -> 왼 진행
                        arr[i][j] = a;
                        a++;
                    }
                }else {                                 //짝수행이면
                    for(int j =0; j<cols; j++){         //왼 -> 오 진행
                        arr[i][j] =a;
                        a++;
                    }
                }
            }
        }

        for(int i = 0; i<rows; i++){                    //배열 출력
            for(int j =0; j<cols; j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}