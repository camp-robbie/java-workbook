package main.java.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    // 두 정수의 합을 반환하는 sum 메서드를 작성하고, main 메서드에서 두 값을 입력받아 sum 메서드를 호출한 후 결과를 출력하는 프로그램을 작성하시오.
    public static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // TODO: sum 메서드를 호출하여 결과 출력
        //sum 메서드는 두 정수를 매개변수로 받고 정수형을 반환합니다.
        int sum = sum(a, b);

        System.out.println(sum);

        sc.close();
    }
}
