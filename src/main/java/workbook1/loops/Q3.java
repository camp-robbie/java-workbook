package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력
        // 정수 N을 입력받아 1부터 N까지의 수 중 3의 배수의 합을 출력하는 프로그램을 do-while 문으로 작성하시오.
        // 최소 한 번은 실행되어야 하므로 do-while을 사용합니다.
        // do { 반복할 코드 } while (조건);

        int i = 1;
        int sum = 0;

        // 결과 22 나옴 -> 시작값이 1이기 떄문!
//        do {
//            sum += i;
//            i += 3; // i 값 3 증가시킴
//        } while (i <= n); // i 가 n보다 작거나 같을떄까지 반복

        do {
            if (i % 3 == 0) { // i 가 3 의 배수인지 확인
                sum += i;
            }
            i++;
        } while (i <= n);

        System.out.println(sum); // 출력
    }
}

