package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력

        int sum = 0;
        int mul = 1;

        // 첫 번째 시도 - 값이 맞지 않음
//        for(int i = 1; i <= n; i++) {
//            if (n % 2 == 0) {
//                sum += i;
//            } else if (n % 2 != 0) {
//                mul *= i;
//            }
//        }
//        System.out.println(sum + " " + mul);

        // 두 번째 시도 - 곱은 맞게 출력 됐지만 더하기가 틀림.
//        for (int i = 1; i <= n; i++) {
//            if (n % 2 == 0) {
//                sum += i;
//            } else if (n % 2 != 0) {
//                mul *= i;
//            }
//            i++;
//        }
//        System.out.println(sum + " " + mul);

        // 세 번째 시도 - n을 i로 바꿔서 성공
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else if (i % 2 != 0) {
                mul *= i;
            }
        }
        System.out.println(sum + " " + mul);

    }
}
