package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성.

        int n, sum=0;
        while (true){
            n = sc.nextInt();
            if(n == 0){
                System.out.println(sum);
                break;
            } else if (n > 0) {
                sum+=n;
            }
        }

    }
}