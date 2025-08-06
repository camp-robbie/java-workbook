package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
        int n, pos=0, neg=0;
        for (int i = 0; i <count ; i++) {
            n = sc.nextInt();
            if(n ==0){
                continue;
            } else if (n > 0) {
                pos++;
            }else {
                neg+= n;
            }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}