package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // sum 은 더하는 값이므로 0
        // mul 은 곱하는 값이므로 1을 넣습니다. (곱하고 할당)
        int sum = 0;
        int mul = 1;

        // n만큼 반복하는 반복문입니다.
        // i가 짝수일 때는 sum += i,
        // i가 홀수일 때는 mul *= i 를 합니다.
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                sum += i;
            }else {
                mul *= i;
            }
        }

        // 출력합니다.
        System.out.println(sum+" "+mul);
    }
}
