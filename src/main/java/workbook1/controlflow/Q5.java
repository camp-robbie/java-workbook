package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        // 중첩 반복문을 사용합니다.
        // 1. 숫자의 자릿수가 2자릿수를 넘어가는 동안 돌아가는 while 문입니다.
        while (num >= 10) {
            sum =0;
            // 입력값이 0이 될 때까지 반복하는 반복문입니다.
            // 숫자의 1의 자리수를 sum에 넣어 덧셈하고,
            // 10으로 나누어 한 자리 아래로 내립니다. (int 값이기 때문에 소숫점 아래는 탈락)
            while (num != 0){
                sum += num % 10;
                num /= 10;
            }
            // 더한 값의 수가 한 자릿수가 될 때까지 더해야 하는 프로그램이기 때문에,
            // sum을 num 에 할당하여 10 이상일 경우 다시 반복문이 돌아가게끔 합니다.
            // 이후, while 문을 시작하며 sum을 초기화합니다.
            num = sum;
        }

        // 출력합니다.
        System.out.println(sum);

    }
}