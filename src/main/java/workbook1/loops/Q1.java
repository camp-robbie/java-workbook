package main.java.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력

        // 첫 번째 시도 - 실패, , , ,
//        while (int i <= n) {
//            i++;
//        }

         // 두 번째 시도 - 출력은 됐지만 숫자들이 더해지는게 아니라 그대로 출력이 됨. (2,3,4,5,6)
//        int i = 1;
//        while (i <= n) {
//            i++;
//            System.out.println("sum = " + i);
//        }

        // 세 번째 시도 - 숫자를 더하긴 했지만 한개가 아닌 여러번 출력이 됨 (1, 3, 6, 10, 15)
//        int sum = 0;
//        int i = 1;
//        while(i <= n) {
//            sum += i;
//            i++;
//            System.out.println("sum = " + sum);
//        }

        // 네 번째 시도 - 출력하는 코드가 while문 안에 있어서!!!! 여러번 출력이 된 거였다. 그래서 출력문을 밖으로 빼니 성공.
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}




