package main.java.workbook1.controlflow;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < count; i++){ // count 수 만큼 정수 입력 받기
            int num = sc.nextInt();
            if(num > 0){
                pos++;
            }else{
                neg += num;
            }
        }

        System.out.println(pos + " " + neg);
    }
}