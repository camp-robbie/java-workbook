package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력

        //소수 : 1과 자신 만을 약수로 갖는 수

        for (int i = 2; i <= n; i++) {
            boolean rightPirme = true;      // 소수로 인정이 되면

            for  (int j = 2; j <= n; j++) {
                if (i % j == 0) {
                    rightPirme = false; break;
                }
            }
            if (rightPirme) {
                System.out.println(i + " ");
            }
        }
    }
}