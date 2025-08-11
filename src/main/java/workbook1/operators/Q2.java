package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 전위 증가와 후위 증가 결과 출력
        // 전위 증가 ++i : 먼저 계산한 후 그 후에 사용, i를 먼저 증가 시킨 후 대입
        // 후위 증가 i++ : 먼저 사용하고 그 후에 계산, i를 먼저 대입하고 나중에 증가

        Scanner sc = new Scanner(System.in);

        // 사용자에게 숫자를 입력 받는다.
        System.out.print("num: ");
        int num = sc.nextInt();

        // 만약 5를 입력 받았을 경우 1을 더한 값인 6이 num에 저장된 후 그 값이 front 변수에 복사된다.
        // 그렇기 때문에 num도 6이고 front도 6이라는 결과를 출력한다.
        int front = ++num;

        // 출력한다.
        System.out.println(front);   // 6
        System.out.println(num);     // 6

        // 후위 연산자는 먼저 대입 하고 나중에 증가하기 때문에 back은 그대로 6이 출력된다.
        // 대입된 숫자가 6이므로 num은 1이 추가된 7이 출력된다.
        int back = num++;

        // 출력한다.
        System.out.println(back);    // 6
        System.out.println(num);     // 7





    }
}
