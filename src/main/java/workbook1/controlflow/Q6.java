package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력.
        int sum=0, number=0;
        while (n != 0){
            sum += n%10;
            n = n/10;
            if(sum %5 ==0){
                //System.out.println(sum);
                number++;
            }
        }
        System.out.println(number);
    }
}