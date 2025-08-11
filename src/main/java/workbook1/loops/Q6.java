package main.java.workbook1.loops;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        // j * i = (j*i) 한 행씩 출력
        for(int i=1;i<=9;i++){                            // i : 1 ~ 9 까지 출력 (곱해지는 수)
            for(int j=2;j<=9;j++){                        // j : 2 ~ 9 까지 출력 (단 -> 2단부터 출력)
                System.out.print(j+"*"+i+"="+(j*i)+" ");  // j * i = 결과(j*i) + " " 공백까지 출력
            }
            System.out.println();                         // 한 행 출력 후 줄바꿈
        }
    }
}