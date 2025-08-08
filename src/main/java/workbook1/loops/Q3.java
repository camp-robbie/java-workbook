package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        // 첫 번째 시도 - sum이 출력이 안되고 입력 스캐너가 무한 반복됨.
        int sum = 0;
        int i = 1;

//        do {
//            if (i % 3 == 0) {
//                sum += i;
//                i++;
//            }
//        } while (i <= n);
//        System.out.println("sum = " + sum);

        // 두 번째 시도 - i++ 코드를 if문 밖으로 빼서 성공.
        do {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        } while (i <= n);
        System.out.println("sum = " + sum);
        // if문 안에 i++를 작성하면 첫 줄에서 조건이 맞지 않기 때문에 i++까지 오지 못한다.
        // 그렇기 때문에 if문 밖에 i++를 작성해서 조건이 맞지 않을 때도 조건문이 계속 돌아가게끔 할 수 있다.

    }
}
