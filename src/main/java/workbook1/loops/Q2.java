package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력
        int ob=0, od=0;
        for (int i = 1; i <= n; i++) {
            if(i%2 == 0){
                ob+= i;
            }else {
                od+=i;
            }
        }
        System.out.println(ob);
        System.out.println(od);
    }
}
